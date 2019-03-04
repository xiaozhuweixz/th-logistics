package com.th.wms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wms_outbound delivery order", schema = "thwms", catalog = "")
public class WmsOutboundDeliveryOrderEntity {
    private String id;
    private String deliveryDetId;
    private String deliveryNo;
    private String ownerId;
    private String ownerName;
    private String entrustNo;
    private int deliveryNum;
    private BigDecimal deliveryVol;
    private BigDecimal deliveryWeight;
    private String deliveryType;
    private String deliveryLevel;
    private Date outDate;
    private Date subOutDate;
    private String state;
    private String systemSource;
    private String systemSourceNo;
    private String remark;
    private String addUserid;
    private Timestamp addTime;
    private String addName;
    private String updUserid;
    private Timestamp updTime;
    private String updName;
    private Integer uDelete;
    private Timestamp uTime;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DELIVERY_DET_ID")
    public String getDeliveryDetId() {
        return deliveryDetId;
    }

    public void setDeliveryDetId(String deliveryDetId) {
        this.deliveryDetId = deliveryDetId;
    }

    @Basic
    @Column(name = "DELIVERY_NO")
    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    @Basic
    @Column(name = "OWNER_ID")
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "OWNER_NAME")
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Basic
    @Column(name = "ENTRUST_NO")
    public String getEntrustNo() {
        return entrustNo;
    }

    public void setEntrustNo(String entrustNo) {
        this.entrustNo = entrustNo;
    }

    @Basic
    @Column(name = "DELIVERY_NUM")
    public int getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(int deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    @Basic
    @Column(name = "DELIVERY_VOL")
    public BigDecimal getDeliveryVol() {
        return deliveryVol;
    }

    public void setDeliveryVol(BigDecimal deliveryVol) {
        this.deliveryVol = deliveryVol;
    }

    @Basic
    @Column(name = "DELIVERY_WEIGHT")
    public BigDecimal getDeliveryWeight() {
        return deliveryWeight;
    }

    public void setDeliveryWeight(BigDecimal deliveryWeight) {
        this.deliveryWeight = deliveryWeight;
    }

    @Basic
    @Column(name = "DELIVERY_TYPE")
    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Basic
    @Column(name = "DELIVERY_LEVEL")
    public String getDeliveryLevel() {
        return deliveryLevel;
    }

    public void setDeliveryLevel(String deliveryLevel) {
        this.deliveryLevel = deliveryLevel;
    }

    @Basic
    @Column(name = "OUT_DATE")
    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    @Basic
    @Column(name = "SUB_OUT_DATE")
    public Date getSubOutDate() {
        return subOutDate;
    }

    public void setSubOutDate(Date subOutDate) {
        this.subOutDate = subOutDate;
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
    @Column(name = "SYSTEM_SOURCE")
    public String getSystemSource() {
        return systemSource;
    }

    public void setSystemSource(String systemSource) {
        this.systemSource = systemSource;
    }

    @Basic
    @Column(name = "SYSTEM_SOURCE_NO")
    public String getSystemSourceNo() {
        return systemSourceNo;
    }

    public void setSystemSourceNo(String systemSourceNo) {
        this.systemSourceNo = systemSourceNo;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
    @Column(name = "ADD_TIME")
    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
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
    @Column(name = "UPD_USERID")
    public String getUpdUserid() {
        return updUserid;
    }

    public void setUpdUserid(String updUserid) {
        this.updUserid = updUserid;
    }

    @Basic
    @Column(name = "UPD_TIME")
    public Timestamp getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Timestamp updTime) {
        this.updTime = updTime;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WmsOutboundDeliveryOrderEntity that = (WmsOutboundDeliveryOrderEntity) o;
        return deliveryNum == that.deliveryNum &&
                Objects.equals(id, that.id) &&
                Objects.equals(deliveryDetId, that.deliveryDetId) &&
                Objects.equals(deliveryNo, that.deliveryNo) &&
                Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(ownerName, that.ownerName) &&
                Objects.equals(entrustNo, that.entrustNo) &&
                Objects.equals(deliveryVol, that.deliveryVol) &&
                Objects.equals(deliveryWeight, that.deliveryWeight) &&
                Objects.equals(deliveryType, that.deliveryType) &&
                Objects.equals(deliveryLevel, that.deliveryLevel) &&
                Objects.equals(outDate, that.outDate) &&
                Objects.equals(subOutDate, that.subOutDate) &&
                Objects.equals(state, that.state) &&
                Objects.equals(systemSource, that.systemSource) &&
                Objects.equals(systemSourceNo, that.systemSourceNo) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(addTime, that.addTime) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(updUserid, that.updUserid) &&
                Objects.equals(updTime, that.updTime) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(uTime, that.uTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deliveryDetId, deliveryNo, ownerId, ownerName, entrustNo, deliveryNum, deliveryVol, deliveryWeight, deliveryType, deliveryLevel, outDate, subOutDate, state, systemSource, systemSourceNo, remark, addUserid, addTime, addName, updUserid, updTime, updName, uDelete, uTime);
    }
}
