package com.bank.pojo;

public class DictCategory {
    private Integer dictCategoryId;

    private String dictCategoryName;

    public Integer getDictCategoryId() {
        return dictCategoryId;
    }

    public void setDictCategoryId(Integer dictCategoryId) {
        this.dictCategoryId = dictCategoryId;
    }

    public String getDictCategoryName() {
        return dictCategoryName;
    }

    public void setDictCategoryName(String dictCategoryName) {
        this.dictCategoryName = dictCategoryName == null ? null : dictCategoryName.trim();
    }
}