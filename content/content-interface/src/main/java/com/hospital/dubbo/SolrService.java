package com.hospital.dubbo;

import java.util.Map;

public interface SolrService {
    //将数据存入Solr服务器
    public Map<String,Object> Medicine2Solr();
    //从服务器取数据
    public  Map<String,Object> Solr2Medicine(String key,int page,int size);
}
