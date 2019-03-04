package com.th.wms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wms_stock", schema = "thwms", catalog = "")
public class WmsStockEntity {
    private String stockId;
    private String ownerId;
    private String ownerName;
    private String plantId;
    private String plantName;
    private String areaId;
    private String areaName;
    private String locId;
    private String locName;
    private String lotId;
    private Date recDate;
    private String goodsId;
    private String goodsCode;
    private String goodsCnName;
    private String goodsEnName;
    private String goodsShortName;
    private String goodsQuality;
    private String goodsGrade;
    private String goodsProperty;
    private BigDecimal goodsQuantity;
    private BigDecimal inLocatedNum;
    private BigDecimal outLocatedNum;
    private Long moveLocatedNum;
    private String coDetPlace;
    private Date coDetProduct;
    private Date coDetLeave;
    private String stockText;
    private String addUserid;
    private Timestamp addTime;
    private String addName;
    private String updUserid;
    private Timestamp updTime;
    private String updName;
    private Timestamp uTime;

    @Id
    @Column(name = "STOCK_ID")
    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
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
    @Column(name = "REC_DATE")
    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
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
    @Column(name = "GOODS_EN_NAME")
    public String getGoodsEnName() {
        return goodsEnName;
    }

    public void setGoodsEnName(String goodsEnName) {
        this.goodsEnName = goodsEnName;
    }

    @Basic
    @Column(name = "GOODS_SHORT_NAME")
    public String getGoodsShortName() {
        return goodsShortName;
    }

    public void setGoodsShortName(String goodsShortName) {
        this.goodsShortName = goodsShortName;
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
    @Column(name = "GOODS_GRADE")
    public String getGoodsGrade() {
        return goodsGrade;
    }

    public void setGoodsGrade(String goodsGrade) {
        this.goodsGrade = goodsGrade;
    }

    @Basic
    @Column(name = "GOODS_PROPERTY")
    public String getGoodsProperty() {
        return goodsProperty;
    }

    public void setGoodsProperty(String goodsProperty) {
        this.goodsProperty = goodsProperty;
    }

    @Basic
    @Column(name = "GOODS_QUANTITY")
    public BigDecimal getGoodsQuantity() {
        return goodsQuantity;
    }

    public void setGoodsQuantity(BigDecimal goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    @Basic
    @Column(name = "IN_LOCATED_NUM")
    public BigDecimal getInLocatedNum() {
        return inLocatedNum;
    }

    public void setInLocatedNum(BigDecimal inLocatedNum) {
        this.inLocatedNum = inLocatedNum;
    }

    @Basic
    @Column(name = "OUT_LOCATED_NUM")
    public BigDecimal getOutLocatedNum() {
        return outLocatedNum;
    }

    public void setOutLocatedNum(BigDecimal outLocatedNum) {
        this.outLocatedNum = outLocatedNum;
    }

    @Basic
    @Column(name = "MOVE_LOCATED_NUM")
    public Long getMoveLocatedNum() {
        return moveLocatedNum;
    }

    public void setMoveLocatedNum(Long moveLocatedNum) {
        this.moveLocatedNum = moveLocatedNum;
    }

    @Basic
    @Column(name = "CO_DET_PLACE")
    public String getCoDetPlace() {
        return coDetPlace;
    }

    public void setCoDetPlace(String coDetPlace) {
        this.coDetPlace = coDetPlace;
    }

    @Basic
    @Column(name = "CO_DET_PRODUCT")
    public Date getCoDetProduct() {
        return coDetProduct;
    }

    public void setCoDetProduct(Date coDetProduct) {
        this.coDetProduct = coDetProduct;
    }

    @Basic
    @Column(name = "CO_DET_LEAVE")
    public Date getCoDetLeave() {
        return coDetLeave;
    }

    public void setCoDetLeave(Date coDetLeave) {
        this.coDetLeave = coDetLeave;
    }

    @Basic
    @Column(name = "STOCK_TEXT")
    public String getStockText() {
        return stockText;
    }

    public void setStockText(String stockText) {
        this.stockText = stockText;
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
        WmsStockEntity that = (WmsStockEntity) o;
        return Objects.equals(stockId, that.stockId) &&
                Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(ownerName, that.ownerName) &&
                Objects.equals(plantId, that.plantId) &&
                Objects.equals(plantName, that.plantName) &&
                Objects.equals(areaId, that.areaId) &&
                Objects.equals(areaName, that.areaName) &&
                Objects.equals(locId, that.locId) &&
                Objects.equals(locName, that.locName) &&
                Objects.equals(lotId, that.lotId) &&
                Objects.equals(recDate, that.recDate) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(goodsCode, that.goodsCode) &&
                Objects.equals(goodsCnName, that.goodsCnName) &&
                Objects.equals(goodsEnName, that.goodsEnName) &&
                Objects.equals(goodsShortName, that.goodsShortName) &&
                Objects.equals(goodsQuality, that.goodsQuality) &&
                Objects.equals(goodsGrade, that.goodsGrade) &&
                Objects.equals(goodsProperty, that.goodsProperty) &&
                Objects.equals(goodsQuantity, that.goodsQuantity) &&
                Objects.equals(inLocatedNum, that.inLocatedNum) &&
                Objects.equals(outLocatedNum, that.outLocatedNum) &&
                Objects.equals(moveLocatedNum, that.moveLocatedNum) &&
                Objects.equals(coDetPlace, that.coDetPlace) &&
                Objects.equals(coDetProduct, that.coDetProduct) &&
                Objects.equals(coDetLeave, that.coDetLeave) &&
                Objects.equals(stockText, that.stockText) &&
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
        return Objects.hash(stockId, ownerId, ownerName, plantId, plantName, areaId, areaName, locId, locName, lotId, recDate, goodsId, goodsCode, goodsCnName, goodsEnName, goodsShortName, goodsQuality, goodsGrade, goodsProperty, goodsQuantity, inLocatedNum, outLocatedNum, moveLocatedNum, coDetPlace, coDetProduct, coDetLeave, stockText, addUserid, addTime, addName, updUserid, updTime, updName, uTime);
    }
}
