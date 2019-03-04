package com.th.tms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tms_trans_dispatch", schema = "thtms", catalog = "")
public class TmsTransDispatchEntity {
    private String id;
    private String transId;
    private String dispatchId;
    private Timestamp uTime;
    private String addUserid;
    private String addName;
    private Timestamp addDate;
    private Integer uDelete;
    private Timestamp updDate;
    private String updName;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TRANS_ID")
    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    @Basic
    @Column(name = "DISPATCH_ID")
    public String getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(String dispatchId) {
        this.dispatchId = dispatchId;
    }

    @Basic
    @Column(name = "U_TIME")
    public Timestamp getuTime() {
        return uTime;
    }

    public void setuTime(Timestamp uTime) {
        this.uTime = uTime;
    }

    @Basic
    @Column(name = "ADD_USERID")
    public String getAddUserid() {
        return addUserid;
    }

    public void setAddUserid(String addUserid) {
        this.addUserid = addUserid;
    }

    @Basic
    @Column(name = "ADD_NAME")
    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }

    @Basic
    @Column(name = "ADD_DATE")
    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
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
    @Column(name = "UPD_DATE")
    public Timestamp getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Timestamp updDate) {
        this.updDate = updDate;
    }

    @Basic
    @Column(name = "UPD_NAME")
    public String getUpdName() {
        return updName;
    }

    public void setUpdName(String updName) {
        this.updName = updName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TmsTransDispatchEntity that = (TmsTransDispatchEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(transId, that.transId) &&
                Objects.equals(dispatchId, that.dispatchId) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(updDate, that.updDate) &&
                Objects.equals(updName, that.updName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transId, dispatchId, uTime, addUserid, addName, addDate, uDelete, updDate, updName);
    }
}
