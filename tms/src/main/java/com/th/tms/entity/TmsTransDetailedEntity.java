package com.th.tms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tms_trans_detailed", schema = "thtms", catalog = "")
public class TmsTransDetailedEntity {
    private String id;
    private String transId;
    private String goodsId;
    private BigDecimal goodsVol;
    private BigDecimal goodsWeight;
    private BigDecimal goodsNum;
    private BigDecimal goodsWeightfeeT;
    private String remarks;
    private String updName;
    private Timestamp updDate;
    private Timestamp addDate;
    private String addName;
    private String addUserid;
    private Timestamp uTime;
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
    @Column(name = "GOODS_ID")
    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "GOODS_VOL")
    public BigDecimal getGoodsVol() {
        return goodsVol;
    }

    public void setGoodsVol(BigDecimal goodsVol) {
        this.goodsVol = goodsVol;
    }

    @Basic
    @Column(name = "GOODS_WEIGHT")
    public BigDecimal getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(BigDecimal goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    @Basic
    @Column(name = "GOODS_NUM")
    public BigDecimal getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(BigDecimal goodsNum) {
        this.goodsNum = goodsNum;
    }

    @Basic
    @Column(name = "GOODS_WEIGHTFEE_T")
    public BigDecimal getGoodsWeightfeeT() {
        return goodsWeightfeeT;
    }

    public void setGoodsWeightfeeT(BigDecimal goodsWeightfeeT) {
        this.goodsWeightfeeT = goodsWeightfeeT;
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
    public Timestamp getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Timestamp updDate) {
        this.updDate = updDate;
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
    public Timestamp getuTime() {
        return uTime;
    }

    public void setuTime(Timestamp uTime) {
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
        TmsTransDetailedEntity that = (TmsTransDetailedEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(transId, that.transId) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(goodsVol, that.goodsVol) &&
                Objects.equals(goodsWeight, that.goodsWeight) &&
                Objects.equals(goodsNum, that.goodsNum) &&
                Objects.equals(goodsWeightfeeT, that.goodsWeightfeeT) &&
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
        return Objects.hash(id, transId, goodsId, goodsVol, goodsWeight, goodsNum, goodsWeightfeeT, remarks, updName, updDate, addDate, addName, addUserid, uTime, uDelete);
    }
}
