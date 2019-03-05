package com.th.tms.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "system_strdic_item", schema = "thtms", catalog = "")
@IdClass(SystemStrdicItemEntityPK.class)
public class SystemStrdicItemEntity {
    private String dictId;
    private String dictItemId;
    private String dictItemName;
    private String dictItemDesc;
    private Integer dictItemOrder;
    private String comId;
    private Date uTime;
    private Integer uDelete;

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
    @Column(name = "COM_ID")
    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    @Basic
    @Column(name = "U_TIME")
    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }

    public Integer getuDelete() {
        return uDelete;
    }

    public void setuDelete(Integer uDelete) {
        this.uDelete = uDelete;
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
                Objects.equals(comId, that.comId) &&
                Objects.equals(uTime, that.uTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictId, dictItemId, dictItemName, dictItemDesc, dictItemOrder, comId, uTime);
    }
}
