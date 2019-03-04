package com.th.oms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "oms_order", schema = "thoms", catalog = "")
public class OmsOrderEntity {
    private String id;
    private String systemSource;
    private String sourceNo;
    private String custId;
    private String custName;
    private String shipperId;
    private String shipperName;
    private String recieverId;
    private String recieverName;
    private String carrierId;
    private String carrierName;
    private BigDecimal orderVol;
    private BigDecimal orderWeight;
    private BigDecimal orderWeightfee;
    private BigDecimal orderNum;
    private String state;
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
    @Column(name = "SYSTEM_SOURCE")
    public String getSystemSource() {
        return systemSource;
    }

    public void setSystemSource(String systemSource) {
        this.systemSource = systemSource;
    }

    @Basic
    @Column(name = "SOURCE_NO")
    public String getSourceNo() {
        return sourceNo;
    }

    public void setSourceNo(String sourceNo) {
        this.sourceNo = sourceNo;
    }

    @Basic
    @Column(name = "CUST_ID")
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Basic
    @Column(name = "CUST_NAME")
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    @Basic
    @Column(name = "SHIPPER_ID")
    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    @Basic
    @Column(name = "SHIPPER_NAME")
    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    @Basic
    @Column(name = "RECIEVER_ID")
    public String getRecieverId() {
        return recieverId;
    }

    public void setRecieverId(String recieverId) {
        this.recieverId = recieverId;
    }

    @Basic
    @Column(name = "RECIEVER_NAME")
    public String getRecieverName() {
        return recieverName;
    }

    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName;
    }

    @Basic
    @Column(name = "CARRIER_ID")
    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    @Basic
    @Column(name = "CARRIER_NAME")
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
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
    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        OmsOrderEntity that = (OmsOrderEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(systemSource, that.systemSource) &&
                Objects.equals(sourceNo, that.sourceNo) &&
                Objects.equals(custId, that.custId) &&
                Objects.equals(custName, that.custName) &&
                Objects.equals(shipperId, that.shipperId) &&
                Objects.equals(shipperName, that.shipperName) &&
                Objects.equals(recieverId, that.recieverId) &&
                Objects.equals(recieverName, that.recieverName) &&
                Objects.equals(carrierId, that.carrierId) &&
                Objects.equals(carrierName, that.carrierName) &&
                Objects.equals(orderVol, that.orderVol) &&
                Objects.equals(orderWeight, that.orderWeight) &&
                Objects.equals(orderWeightfee, that.orderWeightfee) &&
                Objects.equals(orderNum, that.orderNum) &&
                Objects.equals(state, that.state) &&
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
        return Objects.hash(id, systemSource, sourceNo, custId, custName, shipperId, shipperName, recieverId, recieverName, carrierId, carrierName, orderVol, orderWeight, orderWeightfee, orderNum, state, updName, updDate, uDelete, uTime, addDate, addName, addUserid);
    }
}
