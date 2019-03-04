package com.th.wms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wms_godown_entry", schema = "thwms", catalog = "")
public class WmsGodownEntryEntity {
    private String id;
    private String godowDetId;
    private String godowNo;
    private String ownerId;
    private String ownerName;
    private String entrustNo;
    private int godowNum;
    private BigDecimal godowVol;
    private BigDecimal godowWeight;
    private String godowType;
    private String state;
    private Date recDate;
    private Date subRecDate;
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
    @Column(name = "GODOW_DET_ID")
    public String getGodowDetId() {
        return godowDetId;
    }

    public void setGodowDetId(String godowDetId) {
        this.godowDetId = godowDetId;
    }

    @Basic
    @Column(name = "GODOW_NO")
    public String getGodowNo() {
        return godowNo;
    }

    public void setGodowNo(String godowNo) {
        this.godowNo = godowNo;
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
    @Column(name = "GODOW_NUM")
    public int getGodowNum() {
        return godowNum;
    }

    public void setGodowNum(int godowNum) {
        this.godowNum = godowNum;
    }

    @Basic
    @Column(name = "GODOW_VOL")
    public BigDecimal getGodowVol() {
        return godowVol;
    }

    public void setGodowVol(BigDecimal godowVol) {
        this.godowVol = godowVol;
    }

    @Basic
    @Column(name = "GODOW_WEIGHT")
    public BigDecimal getGodowWeight() {
        return godowWeight;
    }

    public void setGodowWeight(BigDecimal godowWeight) {
        this.godowWeight = godowWeight;
    }

    @Basic
    @Column(name = "GODOW_TYPE")
    public String getGodowType() {
        return godowType;
    }

    public void setGodowType(String godowType) {
        this.godowType = godowType;
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
    @Column(name = "REC_DATE")
    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    @Basic
    @Column(name = "SUB_REC_DATE")
    public Date getSubRecDate() {
        return subRecDate;
    }

    public void setSubRecDate(Date subRecDate) {
        this.subRecDate = subRecDate;
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
        WmsGodownEntryEntity that = (WmsGodownEntryEntity) o;
        return godowNum == that.godowNum &&
                Objects.equals(id, that.id) &&
                Objects.equals(godowDetId, that.godowDetId) &&
                Objects.equals(godowNo, that.godowNo) &&
                Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(ownerName, that.ownerName) &&
                Objects.equals(entrustNo, that.entrustNo) &&
                Objects.equals(godowVol, that.godowVol) &&
                Objects.equals(godowWeight, that.godowWeight) &&
                Objects.equals(godowType, that.godowType) &&
                Objects.equals(state, that.state) &&
                Objects.equals(recDate, that.recDate) &&
                Objects.equals(subRecDate, that.subRecDate) &&
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
        return Objects.hash(id, godowDetId, godowNo, ownerId, ownerName, entrustNo, godowNum, godowVol, godowWeight, godowType, state, recDate, subRecDate, systemSource, systemSourceNo, remark, addUserid, addTime, addName, updUserid, updTime, updName, uDelete, uTime);
    }
}
