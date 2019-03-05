package com.th.tms.entity;

import javax.persistence.*;

import java.util.Date;

import java.util.Objects;

@Entity
@Table(name = "tms_sign", schema = "thtms", catalog = "")
public class TmsSignEntity {
    private String id;
    private String transId;
    private String state;
    private String goodsId;
    private Double signVol;
    private Double signWeight;
    private Double signNum;
    private Double signWeightfeeT;
    private Double refuseSignNum;
    private String refuseReason;
    private Date signDate;
    private String remarks;
    private String updName;
    private Date updDate;
    private Date addDate;
    private String addName;
    private String addUserid;
    private Date uTime;
    private Integer uDelete;

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
    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "GOODS_ID")
    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "SIGN_VOL")
    public Double getSignVol() {
        return signVol;
    }

    public void setSignVol(Double signVol) {
        this.signVol = signVol;
    }

    @Basic
    @Column(name = "SIGN_WEIGHT")
    public Double getSignWeight() {
        return signWeight;
    }

    public void setSignWeight(Double signWeight) {
        this.signWeight = signWeight;
    }

    @Basic
    @Column(name = "SIGN_NUM")
    public Double getSignNum() {
        return signNum;
    }

    public void setSignNum(Double signNum) {
        this.signNum = signNum;
    }

    @Basic
    @Column(name = "SIGN_WEIGHTFEE_T")
    public Double getSignWeightfeeT() {
        return signWeightfeeT;
    }

    public void setSignWeightfeeT(Double signWeightfeeT) {
        this.signWeightfeeT = signWeightfeeT;
    }

    @Basic
    @Column(name = "REFUSE_SIGN_NUM")
    public Double getRefuseSignNum() {
        return refuseSignNum;
    }

    public void setRefuseSignNum(Double refuseSignNum) {
        this.refuseSignNum = refuseSignNum;
    }

    @Basic
    @Column(name = "REFUSE_REASON")
    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }

    @Basic
    @Column(name = "SIGN_DATE")
    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    @Basic
    @Column(name = "REMARKS")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "UPD_NAME")
    public String getUpdName() {
        return updName;
    }

    public void setUpdName(String updName) {
        this.updName = updName;
    }

    @Basic
    @Column(name = "UPD_DATE")
    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }

    @Basic
    @Column(name = "ADD_DATE")
    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
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
    @Column(name = "ADD_USERID")
    public String getAddUserid() {
        return addUserid;
    }

    public void setAddUserid(String addUserid) {
        this.addUserid = addUserid;
    }

    @Basic
    @Column(name = "U_TIME")
    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }

    @Basic
    @Column(name = "U_DELETE")
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
        TmsSignEntity that = (TmsSignEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(transId, that.transId) &&
                Objects.equals(state, that.state) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(signVol, that.signVol) &&
                Objects.equals(signWeight, that.signWeight) &&
                Objects.equals(signNum, that.signNum) &&
                Objects.equals(signWeightfeeT, that.signWeightfeeT) &&
                Objects.equals(refuseSignNum, that.refuseSignNum) &&
                Objects.equals(refuseReason, that.refuseReason) &&
                Objects.equals(signDate, that.signDate) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(updDate, that.updDate) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(uDelete, that.uDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transId, state, goodsId, signVol, signWeight, signNum, signWeightfeeT, refuseSignNum, refuseReason, signDate, remarks, updName, updDate, addDate, addName, addUserid, uTime, uDelete);
    }
}
