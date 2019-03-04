package com.th.wms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wms_godow_entry_detailed", schema = "thwms", catalog = "")
public class WmsGodowEntryDetailedEntity {
    private String id;
    private String goodsId;
    private String goodsName;
    private String goodsCode;
    private int godowDetNum;
    private BigDecimal godowDetVol;
    private BigDecimal godowDetWeight;
    private String goodsQuality;
    private String depositCompany;
    private String plantId;
    private String plantCode;
    private String plantName;
    private String areaId;
    private String areaCode;
    private String areaName;
    private String locId;
    private String locCode;
    private String locName;
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
    @Column(name = "GOODS_CODE")
    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    @Basic
    @Column(name = "GODOW_DET_NUM")
    public int getGodowDetNum() {
        return godowDetNum;
    }

    public void setGodowDetNum(int godowDetNum) {
        this.godowDetNum = godowDetNum;
    }

    @Basic
    @Column(name = "GODOW_DET_VOL")
    public BigDecimal getGodowDetVol() {
        return godowDetVol;
    }

    public void setGodowDetVol(BigDecimal godowDetVol) {
        this.godowDetVol = godowDetVol;
    }

    @Basic
    @Column(name = "GODOW_DET_WEIGHT")
    public BigDecimal getGodowDetWeight() {
        return godowDetWeight;
    }

    public void setGodowDetWeight(BigDecimal godowDetWeight) {
        this.godowDetWeight = godowDetWeight;
    }

    @Basic
    @Column(name = "GOODS_QUALITY")
    public String getGoodsQuality() {
        return goodsQuality;
    }

    public void setGoodsQuality(String goodsQuality) {
        this.goodsQuality = goodsQuality;
    }

    @Basic
    @Column(name = "DEPOSIT_COMPANY")
    public String getDepositCompany() {
        return depositCompany;
    }

    public void setDepositCompany(String depositCompany) {
        this.depositCompany = depositCompany;
    }

    @Basic
    @Column(name = "PLANT_ID")
    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId;
    }

    @Basic
    @Column(name = "PLANT_CODE")
    public String getPlantCode() {
        return plantCode;
    }

    public void setPlantCode(String plantCode) {
        this.plantCode = plantCode;
    }

    @Basic
    @Column(name = "PLANT_NAME")
    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    @Basic
    @Column(name = "AREA_ID")
    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "AREA_CODE")
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Basic
    @Column(name = "AREA_NAME")
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Basic
    @Column(name = "LOC_ID")
    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    @Basic
    @Column(name = "LOC_CODE")
    public String getLocCode() {
        return locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }

    @Basic
    @Column(name = "LOC_NAME")
    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
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
        WmsGodowEntryDetailedEntity that = (WmsGodowEntryDetailedEntity) o;
        return godowDetNum == that.godowDetNum &&
                Objects.equals(id, that.id) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(goodsCode, that.goodsCode) &&
                Objects.equals(godowDetVol, that.godowDetVol) &&
                Objects.equals(godowDetWeight, that.godowDetWeight) &&
                Objects.equals(goodsQuality, that.goodsQuality) &&
                Objects.equals(depositCompany, that.depositCompany) &&
                Objects.equals(plantId, that.plantId) &&
                Objects.equals(plantCode, that.plantCode) &&
                Objects.equals(plantName, that.plantName) &&
                Objects.equals(areaId, that.areaId) &&
                Objects.equals(areaCode, that.areaCode) &&
                Objects.equals(areaName, that.areaName) &&
                Objects.equals(locId, that.locId) &&
                Objects.equals(locCode, that.locCode) &&
                Objects.equals(locName, that.locName) &&
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
        return Objects.hash(id, goodsId, goodsName, goodsCode, godowDetNum, godowDetVol, godowDetWeight, goodsQuality, depositCompany, plantId, plantCode, plantName, areaId, areaCode, areaName, locId, locCode, locName, addUserid, addTime, addName, updUserid, updTime, updName, uDelete, uTime);
    }
}
