package com.th.wms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "system_strdic_item", schema = "thwms", catalog = "")
@IdClass(SystemStrdicItemEntityPK.class)
public class SystemStrdicItemEntity {
    private String dictId;
    private String dictItemId;
    private String dictItemName;
    private String dictItemDesc;
    private Integer dictItemOrder;
    private Timestamp uTime;

    @Id
    @Column(name = "DICT_ID")
    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    @Id
    @Column(name = "DICT_ITEM_ID")
    public String getDictItemId() {
        return dictItemId;
    }

    public void setDictItemId(String dictItemId) {
        this.dictItemId = dictItemId;
    }

    @Basic
    @Column(name = "DICT_ITEM_NAME")
    public String getDictItemName() {
        return dictItemName;
    }

    public void setDictItemName(String dictItemName) {
        this.dictItemName = dictItemName;
    }

    @Basic
    @Column(name = "DICT_ITEM_DESC")
    public String getDictItemDesc() {
        return dictItemDesc;
    }

    public void setDictItemDesc(String dictItemDesc) {
        this.dictItemDesc = dictItemDesc;
    }

    @Basic
    @Column(name = "DICT_ITEM_ORDER")
    public Integer getDictItemOrder() {
        return dictItemOrder;
    }

    public void setDictItemOrder(Integer dictItemOrder) {
        this.dictItemOrder = dictItemOrder;
    }

    @Basic
    @Column(name = "U_TIME")
    public Timestamp getuTime() {
        return uTime;
    }

    public void setuTime(Timestamp uTime) {
        this.uTime = uTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemStrdicItemEntity that = (SystemStrdicItemEntity) o;
        return Objects.equals(dictId, that.dictId) &&
                Objects.equals(dictItemId, that.dictItemId) &&
                Objects.equals(dictItemName, that.dictItemName) &&
                Objects.equals(dictItemDesc, that.dictItemDesc) &&
                Objects.equals(dictItemOrder, that.dictItemOrder) &&
                Objects.equals(uTime, that.uTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictId, dictItemId, dictItemName, dictItemDesc, dictItemOrder, uTime);
    }
}
