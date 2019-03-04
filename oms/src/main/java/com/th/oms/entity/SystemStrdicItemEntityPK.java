package com.th.oms.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SystemStrdicItemEntityPK implements Serializable {
    private String dictId;
    private String dictItemId;

    @Column(name = "DICT_ID")
    @Id
    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    @Column(name = "DICT_ITEM_ID")
    @Id
    public String getDictItemId() {
        return dictItemId;
    }

    public void setDictItemId(String dictItemId) {
        this.dictItemId = dictItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemStrdicItemEntityPK that = (SystemStrdicItemEntityPK) o;
        return Objects.equals(dictId, that.dictId) &&
                Objects.equals(dictItemId, that.dictItemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictId, dictItemId);
    }
}
