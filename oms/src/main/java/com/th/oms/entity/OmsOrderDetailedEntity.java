package com.th.oms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "oms_order_detailed", schema = "thoms", catalog = "")
public class OmsOrderDetailedEntity {
    private String id;
    private String orderId;
    private String goodsId;
    private String goodsName;
    private BigDecimal orderVol;
    private BigDecimal orderWeight;
    private BigDecimal orderWeightfee;
    private BigDecimal orderNum;
    private String updName;
    private Timestamp updDate;
    private Integer uDelete;
    private Timestamp uTime;
    private Timestamp addDate;
    private String addName;
    private String addUserid;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORDER_ID")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
    @Column(name = "GOODS_NAME")
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "ORDER_VOL")
    public BigDecimal getOrderVol() {
        return orderVol;
    }

    public void setOrderVol(BigDecimal orderVol) {
        this.orderVol = orderVol;
    }

    @Basic
    @Column(name = "ORDER_WEIGHT")
    public BigDecimal getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight(BigDecimal orderWeight) {
        this.orderWeight = orderWeight;
    }

    @Basic
    @Column(name = "ORDER_WEIGHTFEE")
    public BigDecimal getOrderWeightfee() {
        return orderWeightfee;
    }

    public void setOrderWeightfee(BigDecimal orderWeightfee) {
        this.orderWeightfee = orderWeightfee;
    }

    @Basic
    @Column(name = "ORDER_NUM")
    public BigDecimal getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(BigDecimal orderNum) {
        this.orderNum = orderNum;
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
    @Column(name = "U_DELETE")
    public Integer getuDelete() {
        return uDelete;
    }

    public void setuDelete(Integer uDelete) {
        this.uDelete = uDelete;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrderDetailedEntity that = (OmsOrderDetailedEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(orderVol, that.orderVol) &&
                Objects.equals(orderWeight, that.orderWeight) &&
                Objects.equals(orderWeightfee, that.orderWeightfee) &&
                Objects.equals(orderNum, that.orderNum) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(updDate, that.updDate) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(addUserid, that.addUserid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, goodsId, goodsName, orderVol, orderWeight, orderWeightfee, orderNum, updName, updDate, uDelete, uTime, addDate, addName, addUserid);
    }
}
