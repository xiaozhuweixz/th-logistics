package com.th.wms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "system_strdic", schema = "thwms", catalog = "")
public class SystemStrdicEntity {
    private String dictId;
    private String dictName;
    private Integer dictIssys;
    private String dictDesc;
    private Integer dictOrder;
    private Integer uDelete;
    private String comId;
    private Timestamp uTime;

    @Id
    @Column(name = "DICT_ID")
    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    @Basic
    @Column(name = "DICT_NAME")
    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    @Basic
    @Column(name = "DICT_ISSYS")
    public Integer getDictIssys() {
        return dictIssys;
    }

    public void setDictIssys(Integer dictIssys) {
        this.dictIssys = dictIssys;
    }

    @Basic
    @Column(name = "DICT_DESC")
    public String getDictDesc() {
        return dictDesc;
    }

    public void setDictDesc(String dictDesc) {
        this.dictDesc = dictDesc;
    }

    @Basic
    @Column(name = "DICT_ORDER")
    public Integer getDictOrder() {
        return dictOrder;
    }

    public void setDictOrder(Integer dictOrder) {
        this.dictOrder = dictOrder;
    }

    @Basic
    @Column(name = "U_DELETE")
    public Integer getuDelete() {
        return uDelete;
    }

    public void setuDelete(Integer uDelete) {
        this.uDelete = uDelete;
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
        SystemStrdicEntity that = (SystemStrdicEntity) o;
        return Objects.equals(dictId, that.dictId) &&
                Objects.equals(dictName, that.dictName) &&
                Objects.equals(dictIssys, that.dictIssys) &&
                Objects.equals(dictDesc, that.dictDesc) &&
                Objects.equals(dictOrder, that.dictOrder) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(comId, that.comId) &&
                Objects.equals(uTime, that.uTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictId, dictName, dictIssys, dictDesc, dictOrder, uDelete, comId, uTime);
    }
}
