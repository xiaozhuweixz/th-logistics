package com.th.wms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wms_check_manage", schema = "thwms", catalog = "")
public class WmsCheckManageEntity {
    private String id;
    private String ownerId;
    private String ownerName;
    private String plantId;
    private String plantName;
    private String areaId;
    private String areaName;
    private String locId;
    private String locName;
    private String lotId;
    private String goodsId;
    private String goodsCode;
    private BigDecimal checkNum;
    private BigDecimal stockNum;
    private Date handleDate;
    private String handleTxt;
    private String differenceTxt;
    private String addUserid;
    private Timestamp addTime;
    private String addName;
    private String updUserid;
    private Timestamp updTime;
    private String updName;
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
    @Column(name = "PLANT_ID")
    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId;
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
    @Column(name = "LOC_NAME")
    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    @Basic
    @Column(name = "LOT_ID")
    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
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
    @Column(name = "GOODS_CODE")
    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    @Basic
    @Column(name = "CHECK_NUM")
    public BigDecimal getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(BigDecimal checkNum) {
        this.checkNum = checkNum;
    }

    @Basic
    @Column(name = "STOCK_NUM")
    public BigDecimal getStockNum() {
        return stockNum;
    }

    public void setStockNum(BigDecimal stockNum) {
        this.stockNum = stockNum;
    }

    @Basic
    @Column(name = "HANDLE_DATE")
    public Date getHandleDate() {
        return handleDate;
    }

    public void setHandleDate(Date handleDate) {
        this.handleDate = handleDate;
    }

    @Basic
    @Column(name = "HANDLE_TXT")
    public String getHandleTxt() {
        return handleTxt;
    }

    public void setHandleTxt(String handleTxt) {
        this.handleTxt = handleTxt;
    }

    @Basic
    @Column(name = "DIFFERENCE_TXT")
    public String getDifferenceTxt() {
        return differenceTxt;
    }

    public void setDifferenceTxt(String differenceTxt) {
        this.differenceTxt = differenceTxt;
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
        WmsCheckManageEntity that = (WmsCheckManageEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(ownerName, that.ownerName) &&
                Objects.equals(plantId, that.plantId) &&
                Objects.equals(plantName, that.plantName) &&
                Objects.equals(areaId, that.areaId) &&
                Objects.equals(areaName, that.areaName) &&
                Objects.equals(locId, that.locId) &&
                Objects.equals(locName, that.locName) &&
                Objects.equals(lotId, that.lotId) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(goodsCode, that.goodsCode) &&
                Objects.equals(checkNum, that.checkNum) &&
                Objects.equals(stockNum, that.stockNum) &&
                Objects.equals(handleDate, that.handleDate) &&
                Objects.equals(handleTxt, that.handleTxt) &&
                Objects.equals(differenceTxt, that.differenceTxt) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(addTime, that.addTime) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(updUserid, that.updUserid) &&
                Objects.equals(updTime, that.updTime) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(uTime, that.uTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ownerId, ownerName, plantId, plantName, areaId, areaName, locId, locName, lotId, goodsId, goodsCode, checkNum, stockNum, handleDate, handleTxt, differenceTxt, addUserid, addTime, addName, updUserid, updTime, updName, uTime);
    }
}
