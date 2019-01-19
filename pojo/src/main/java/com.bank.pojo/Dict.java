package com.bank.pojo;

import java.io.Serializable;

public class Dict implements Serializable {
    private Integer dictId;

    private Integer dictCategoryId;

    private String dictInfo;

    private String dictValue;

    private String dictOther;

    private DictCategory dictCategory;

    public DictCategory getDictCategory() {
        return dictCategory;
    }

    public void setDictCategory(DictCategory dictCategory) {
        this.dictCategory = dictCategory;
    }

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public Integer getDictCategoryId() {
        return dictCategoryId;
    }

    public void setDictCategoryId(Integer dictCategoryId) {
        this.dictCategoryId = dictCategoryId;
    }

    public String getDictInfo() {
        return dictInfo;
    }

    public void setDictInfo(String dictInfo) {
        this.dictInfo = dictInfo == null ? null : dictInfo.trim();
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    public String getDictOther() {
        return dictOther;
    }

    public void setDictOther(String dictOther) {
        this.dictOther = dictOther == null ? null : dictOther.trim();
    }
}