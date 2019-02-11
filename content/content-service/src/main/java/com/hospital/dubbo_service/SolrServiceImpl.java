package com.hospital.dubbo_service;

import com.alibaba.druid.util.StringUtils;
import com.hospital.dao.MedicineMapper;
import com.hospital.dubbo.SolrService;
import com.hospital.pojo.Medicine;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class SolrServiceImpl implements SolrService {
    @Autowired
    private MedicineMapper mm;
    @Value("${solrurl}")
    private String url;
    @Override
    public Map<String, Object> Medicine2Solr() {
        Map<String, Object> map= new HashMap<>();
        List<Medicine> list=mm.selectByCond(map);
        HttpSolrServer solrServer=new HttpSolrServer(url);
        SolrInputDocument sidoc = null;
        try {

            for(Medicine s : list){
                System.out.println(s);
                sidoc = new SolrInputDocument();
                sidoc.setField("id", s.getMedicineId());
                sidoc.setField("medicineId", s.getMedicineId());
                sidoc.setField("company", s.getCompany());
                sidoc.setField("name", s.getName());
                sidoc.setField("usefor", s.getUsefor());
                sidoc.setField("price", s.getPrice());
                sidoc.setField("guige", s.getGuige());
                sidoc.setField("howToUse", s.getHowToUse());
                sidoc.setField("createDate", s.getCreateDate());
                sidoc.setField("deadDate", s.getDeadDate());
                sidoc.setField("remark", s.getRemark());
                sidoc.setField("img", s.getImg());
                solrServer.add(sidoc);
            }
            solrServer.commit();
            map.put("msg","success");
            map.put("status",200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public Map<String, Object> Solr2Medicine(String key,int page,int size) {
        Map<String, Object> map= new HashMap<>();
        HttpSolrServer solrServer=new HttpSolrServer(url);
        SolrQuery query =new SolrQuery();
        if(StringUtils.isEmpty(key)){
            query.setQuery("*:*");
        }else
            query.setQuery(key);
       // query.set("df", "name");
        try {
            QueryResponse response = solrServer.query(query);
            SolrDocumentList list= response.getResults();
            map.put("count",list.getNumFound());
            List<Medicine> list2 =new ArrayList<>();
            Medicine medicine=null;
            for (SolrDocument data : list) {
                medicine=new Medicine();
                medicine.setMedicineId((String)data.getFieldValue("medicineId"));
                medicine.setCompany((String) data.getFieldValue("company"));
                medicine.setName((String) data.getFieldValue("name"));
                medicine.setUsefor((String) data.getFieldValue("usefor"));
                medicine.setGuige((String) data.getFieldValue("guige"));
                medicine.setHowToUse((String) data.getFieldValue("howToUse"));
                medicine.setPrice((float) data.getFieldValue("howToUse"));

                medicine.setCreateDate((Date) data.getFieldValue("createDate"));
                medicine.setDeadDate((String) data.getFieldValue("deadDate"));
                medicine.setRemark((String) data.getFieldValue("remark"));
                medicine.setImg((String) data.getFieldValue("img"));
                list2.add(medicine);
            }
            map.put("mes","success");
            map.put("result",list2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
