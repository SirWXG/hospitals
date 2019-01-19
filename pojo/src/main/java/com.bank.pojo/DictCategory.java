package com.bank.pojo;

import java.io.Serializable;

public class DictCategory  implements Serializable {
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