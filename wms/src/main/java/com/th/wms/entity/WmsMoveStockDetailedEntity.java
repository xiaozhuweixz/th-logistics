package com.th.wms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wms_move_stock_detailed", schema = "thwms", catalog = "")
public class WmsMoveStockDetailedEntity {
    private String id;
    private String plantId;
    private String plantName;
    private String areaId;
    private String areaName;
    private String locId;
    private String locName;
    private String lotId;
    private String goodsId;
    private String goodsCode;
    private String goodsCnName;
    private String goodsQuality;
    private String targetPlantId;
    private String targetPlantName;
    private String targetAreaId;
    private String targetAreaName;
    private String targetLocId;
    private String targetLocName;
    private String targetGoodsQuality;
    private BigDecimal stockNum;
    private BigDecimal moveNum;
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
    @Column(name = "GOODS_CN_NAME")
    public String getGoodsCnName() {
        return goodsCnName;
    }

    public void setGoodsCnName(String goodsCnName) {
        this.goodsCnName = goodsCnName;
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
    @Column(name = "TARGET_PLANT_ID")
    public String getTargetPlantId() {
        return targetPlantId;
    }

    public void setTargetPlantId(String targetPlantId) {
        this.targetPlantId = targetPlantId;
    }

    @Basic
    @Column(name = "TARGET_PLANT_NAME")
    public String getTargetPlantName() {
        return targetPlantName;
    }

    public void setTargetPlantName(String targetPlantName) {
        this.targetPlantName = targetPlantName;
    }

    @Basic
    @Column(name = "TARGET_AREA_ID")
    public String getTargetAreaId() {
        return targetAreaId;
    }

    public void setTargetAreaId(String targetAreaId) {
        this.targetAreaId = targetAreaId;
    }

    @Basic
    @Column(name = "TARGET_AREA_NAME")
    public String getTargetAreaName() {
        return targetAreaName;
    }

    public void setTargetAreaName(String targetAreaName) {
        this.targetAreaName = targetAreaName;
    }

    @Basic
    @Column(name = "TARGET_LOC_ID")
    public String getTargetLocId() {
        return targetLocId;
    }

    public void setTargetLocId(String targetLocId) {
        this.targetLocId = targetLocId;
    }

    @Basic
    @Column(name = "TARGET_LOC_NAME")
    public String getTargetLocName() {
        return targetLocName;
    }

    public void setTargetLocName(String targetLocName) {
        this.targetLocName = targetLocName;
    }

    @Basic
    @Column(name = "TARGET_GOODS_QUALITY")
    public String getTargetGoodsQuality() {
        return targetGoodsQuality;
    }

    public void setTargetGoodsQuality(String targetGoodsQuality) {
        this.targetGoodsQuality = targetGoodsQuality;
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
    @Column(name = "MOVE_NUM")
    public BigDecimal getMoveNum() {
        return moveNum;
    }

    public void setMoveNum(BigDecimal moveNum) {
        this.moveNum = moveNum;
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
        WmsMoveStockDetailedEntity that = (WmsMoveStockDetailedEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(plantId, that.plantId) &&
                Objects.equals(plantName, that.plantName) &&
                Objects.equals(areaId, that.areaId) &&
                Objects.equals(areaName, that.areaName) &&
                Objects.equals(locId, that.locId) &&
                Objects.equals(locName, that.locName) &&
                Objects.equals(lotId, that.lotId) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(goodsCode, that.goodsCode) &&
                Objects.equals(goodsCnName, that.goodsCnName) &&
                Objects.equals(goodsQuality, that.goodsQuality) &&
                Objects.equals(targetPlantId, that.targetPlantId) &&
                Objects.equals(targetPlantName, that.targetPlantName) &&
                Objects.equals(targetAreaId, that.targetAreaId) &&
                Objects.equals(targetAreaName, that.targetAreaName) &&
                Objects.equals(targetLocId, that.targetLocId) &&
                Objects.equals(targetLocName, that.targetLocName) &&
                Objects.equals(targetGoodsQuality, that.targetGoodsQuality) &&
                Objects.equals(stockNum, that.stockNum) &&
                Objects.equals(moveNum, that.moveNum) &&
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
        return Objects.hash(id, plantId, plantName, areaId, areaName, locId, locName, lotId, goodsId, goodsCode, goodsCnName, goodsQuality, targetPlantId, targetPlantName, targetAreaId, targetAreaName, targetLocId, targetLocName, targetGoodsQuality, stockNum, moveNum, addUserid, addTime, addName, updUserid, updTime, updName, uTime);
    }
}
