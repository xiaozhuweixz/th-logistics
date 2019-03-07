package com.th.tms.entity;

import javax.persistence.*;

import java.util.Date;

import java.util.Objects;

@Entity
@Table(name = "basic_goods", schema = "thtms", catalog = "")
public class BasicGoodsEntity {
    private String id;
    private String goodsCode;
    private String goodsQr;
    private String goodsBar;
    private String goodsRfid;
    private String goodsModel;
    private String goodsCnName;
    private String goodsEnName;
    private String goodsShortName;
    private String goodsBrand;
    private Double goodsWeight;
    private Double goodsVolume;
    private Double goodsLength;
    private Double goodsWidth;
    private Double goodsHeight;
    private Integer goodsLevel;
    private String goodsUnit;
    private String ownerId;
    private String ownerName;
    private String goodsFirm;
    private Double goodsPeriod;
    private Double goodsInventory;
    private String goodsQuality;
    private String goodsClass;
    private String goodsVal;
    private Integer temCotrol2;
    private String chemicals;
    private Date msdsEffectivedate;
    private Double goodsArea;
    private String goodsText;
    private Integer goodsState;
    private String goodsPriority;
    private String goodsPackage;
    private String qcpercent;
    private String putLoc;
    private String goodsCost;
    private String putZone;
    private Integer goodsOrder;
    private String putStrategy;
    private Integer onqc;
    private String rotation1;
    private String skurotation2;
    private String rotation2;
    private String skurotation3;
    private String rotation3;
    private Integer temCotrol;
    private Integer bond;
    private String packId;
    private Integer temCotrol1;
    private Date msdsExpirydate;
    private String skurotation1;
    private Integer goodsLimitNum;
    private String outStrategy;
    private Date uTime;
    private String addUserid;
    private Date addTime;
    private String addName;
    private String updUserid;
    private Date updTime;
    private String updName;
    private String comId;
    private String lot01;
    private String lot02;
    private String lot03;
    private String lot04;
    private String lot05;
    private String lot06;
    private String lot07;
    private String lot08;
    private String lot09;
    private String lot10;
    private Integer uDelete;
    private String lot01Type;
    private String lot02Type;
    private String lot03Type;
    private String lot04Type;
    private String lot05Type;
    private String lot06Type;
    private String lot07Type;
    private String lot08Type;
    private String lot09Type;
    private String lot10Type;
    private String goodsProperty;
    private String goodsInstraName;
    private String goodsInstraId;
    private String goodsOutstraId;
    private String goodsOutstraName;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "GOODS_QR")
    public String getGoodsQr() {
        return goodsQr;
    }

    public void setGoodsQr(String goodsQr) {
        this.goodsQr = goodsQr;
    }

    @Basic
    @Column(name = "GOODS_BAR")
    public String getGoodsBar() {
        return goodsBar;
    }

    public void setGoodsBar(String goodsBar) {
        this.goodsBar = goodsBar;
    }

    @Basic
    @Column(name = "GOODS_RFID")
    public String getGoodsRfid() {
        return goodsRfid;
    }

    public void setGoodsRfid(String goodsRfid) {
        this.goodsRfid = goodsRfid;
    }

    @Basic
    @Column(name = "GOODS_MODEL")
    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel;
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
    @Column(name = "GOODS_BRAND")
    public String getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    @Basic
    @Column(name = "GOODS_WEIGHT")
    public Double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    @Basic
    @Column(name = "GOODS_VOLUME")
    public Double getGoodsVolume() {
        return goodsVolume;
    }

    public void setGoodsVolume(Double goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    @Basic
    @Column(name = "GOODS_LENGTH")
    public Double getGoodsLength() {
        return goodsLength;
    }

    public void setGoodsLength(Double goodsLength) {
        this.goodsLength = goodsLength;
    }

    @Basic
    @Column(name = "GOODS_WIDTH")
    public Double getGoodsWidth() {
        return goodsWidth;
    }

    public void setGoodsWidth(Double goodsWidth) {
        this.goodsWidth = goodsWidth;
    }

    @Basic
    @Column(name = "GOODS_HEIGHT")
    public Double getGoodsHeight() {
        return goodsHeight;
    }

    public void setGoodsHeight(Double goodsHeight) {
        this.goodsHeight = goodsHeight;
    }

    @Basic
    @Column(name = "GOODS_LEVEL")
    public Integer getGoodsLevel() {
        return goodsLevel;
    }

    public void setGoodsLevel(Integer goodsLevel) {
        this.goodsLevel = goodsLevel;
    }

    @Basic
    @Column(name = "GOODS_UNIT")
    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
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
    @Column(name = "GOODS_FIRM")
    public String getGoodsFirm() {
        return goodsFirm;
    }

    public void setGoodsFirm(String goodsFirm) {
        this.goodsFirm = goodsFirm;
    }

    @Basic
    @Column(name = "GOODS_PERIOD")
    public Double getGoodsPeriod() {
        return goodsPeriod;
    }

    public void setGoodsPeriod(Double goodsPeriod) {
        this.goodsPeriod = goodsPeriod;
    }

    @Basic
    @Column(name = "GOODS_INVENTORY")
    public Double getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(Double goodsInventory) {
        this.goodsInventory = goodsInventory;
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
    @Column(name = "GOODS_CLASS")
    public String getGoodsClass() {
        return goodsClass;
    }

    public void setGoodsClass(String goodsClass) {
        this.goodsClass = goodsClass;
    }

    @Basic
    @Column(name = "GOODS_VAL")
    public String getGoodsVal() {
        return goodsVal;
    }

    public void setGoodsVal(String goodsVal) {
        this.goodsVal = goodsVal;
    }

    @Basic
    @Column(name = "TEM_COTROL2")
    public Integer getTemCotrol2() {
        return temCotrol2;
    }

    public void setTemCotrol2(Integer temCotrol2) {
        this.temCotrol2 = temCotrol2;
    }

    @Basic
    @Column(name = "CHEMICALS")
    public String getChemicals() {
        return chemicals;
    }

    public void setChemicals(String chemicals) {
        this.chemicals = chemicals;
    }

    @Basic
    @Column(name = "MSDS_EFFECTIVEDATE")
    public Date getMsdsEffectivedate() {
        return msdsEffectivedate;
    }

    public void setMsdsEffectivedate(Date msdsEffectivedate) {
        this.msdsEffectivedate = msdsEffectivedate;
    }

    @Basic
    @Column(name = "GOODS_AREA")
    public Double getGoodsArea() {
        return goodsArea;
    }

    public void setGoodsArea(Double goodsArea) {
        this.goodsArea = goodsArea;
    }

    @Basic
    @Column(name = "GOODS_TEXT")
    public String getGoodsText() {
        return goodsText;
    }

    public void setGoodsText(String goodsText) {
        this.goodsText = goodsText;
    }

    @Basic
    @Column(name = "GOODS_STATE")
    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    @Basic
    @Column(name = "GOODS_PRIORITY")
    public String getGoodsPriority() {
        return goodsPriority;
    }

    public void setGoodsPriority(String goodsPriority) {
        this.goodsPriority = goodsPriority;
    }

    @Basic
    @Column(name = "GOODS_PACKAGE")
    public String getGoodsPackage() {
        return goodsPackage;
    }

    public void setGoodsPackage(String goodsPackage) {
        this.goodsPackage = goodsPackage;
    }

    @Basic
    @Column(name = "QCPERCENT")
    public String getQcpercent() {
        return qcpercent;
    }

    public void setQcpercent(String qcpercent) {
        this.qcpercent = qcpercent;
    }

    @Basic
    @Column(name = "PUT_LOC")
    public String getPutLoc() {
        return putLoc;
    }

    public void setPutLoc(String putLoc) {
        this.putLoc = putLoc;
    }

    @Basic
    @Column(name = "GOODS_COST")
    public String getGoodsCost() {
        return goodsCost;
    }

    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost;
    }

    @Basic
    @Column(name = "PUT_ZONE")
    public String getPutZone() {
        return putZone;
    }

    public void setPutZone(String putZone) {
        this.putZone = putZone;
    }

    @Basic
    @Column(name = "GOODS_ORDER")
    public Integer getGoodsOrder() {
        return goodsOrder;
    }

    public void setGoodsOrder(Integer goodsOrder) {
        this.goodsOrder = goodsOrder;
    }

    @Basic
    @Column(name = "PUT_STRATEGY")
    public String getPutStrategy() {
        return putStrategy;
    }

    public void setPutStrategy(String putStrategy) {
        this.putStrategy = putStrategy;
    }

    @Basic
    @Column(name = "ONQC")
    public Integer getOnqc() {
        return onqc;
    }

    public void setOnqc(Integer onqc) {
        this.onqc = onqc;
    }

    @Basic
    @Column(name = "ROTATION1")
    public String getRotation1() {
        return rotation1;
    }

    public void setRotation1(String rotation1) {
        this.rotation1 = rotation1;
    }

    @Basic
    @Column(name = "SKUROTATION2")
    public String getSkurotation2() {
        return skurotation2;
    }

    public void setSkurotation2(String skurotation2) {
        this.skurotation2 = skurotation2;
    }

    @Basic
    @Column(name = "ROTATION2")
    public String getRotation2() {
        return rotation2;
    }

    public void setRotation2(String rotation2) {
        this.rotation2 = rotation2;
    }

    @Basic
    @Column(name = "SKUROTATION3")
    public String getSkurotation3() {
        return skurotation3;
    }

    public void setSkurotation3(String skurotation3) {
        this.skurotation3 = skurotation3;
    }

    @Basic
    @Column(name = "ROTATION3")
    public String getRotation3() {
        return rotation3;
    }

    public void setRotation3(String rotation3) {
        this.rotation3 = rotation3;
    }

    @Basic
    @Column(name = "TEM_COTROL")
    public Integer getTemCotrol() {
        return temCotrol;
    }

    public void setTemCotrol(Integer temCotrol) {
        this.temCotrol = temCotrol;
    }

    @Basic
    @Column(name = "BOND")
    public Integer getBond() {
        return bond;
    }

    public void setBond(Integer bond) {
        this.bond = bond;
    }

    @Basic
    @Column(name = "PACK_ID")
    public String getPackId() {
        return packId;
    }

    public void setPackId(String packId) {
        this.packId = packId;
    }

    @Basic
    @Column(name = "TEM_COTROL1")
    public Integer getTemCotrol1() {
        return temCotrol1;
    }

    public void setTemCotrol1(Integer temCotrol1) {
        this.temCotrol1 = temCotrol1;
    }

    @Basic
    @Column(name = "MSDS_EXPIRYDATE")
    public Date getMsdsExpirydate() {
        return msdsExpirydate;
    }

    public void setMsdsExpirydate(Date msdsExpirydate) {
        this.msdsExpirydate = msdsExpirydate;
    }

    @Basic
    @Column(name = "SKUROTATION1")
    public String getSkurotation1() {
        return skurotation1;
    }

    public void setSkurotation1(String skurotation1) {
        this.skurotation1 = skurotation1;
    }

    @Basic
    @Column(name = "GOODS_LIMIT_NUM")
    public Integer getGoodsLimitNum() {
        return goodsLimitNum;
    }

    public void setGoodsLimitNum(Integer goodsLimitNum) {
        this.goodsLimitNum = goodsLimitNum;
    }

    @Basic
    @Column(name = "OUT_STRATEGY")
    public String getOutStrategy() {
        return outStrategy;
    }

    public void setOutStrategy(String outStrategy) {
        this.outStrategy = outStrategy;
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
    @Column(name = "ADD_USERID")
    public String getAddUserid() {
        return addUserid;
    }

    public void setAddUserid(String addUserid) {
        this.addUserid = addUserid;
    }

    @Basic
    @Column(name = "ADD_TIME")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
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
    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
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
    @Column(name = "COM_ID")
    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    @Basic
    @Column(name = "LOT01")
    public String getLot01() {
        return lot01;
    }

    public void setLot01(String lot01) {
        this.lot01 = lot01;
    }

    @Basic
    @Column(name = "LOT02")
    public String getLot02() {
        return lot02;
    }

    public void setLot02(String lot02) {
        this.lot02 = lot02;
    }

    @Basic
    @Column(name = "LOT03")
    public String getLot03() {
        return lot03;
    }

    public void setLot03(String lot03) {
        this.lot03 = lot03;
    }

    @Basic
    @Column(name = "LOT04")
    public String getLot04() {
        return lot04;
    }

    public void setLot04(String lot04) {
        this.lot04 = lot04;
    }

    @Basic
    @Column(name = "LOT05")
    public String getLot05() {
        return lot05;
    }

    public void setLot05(String lot05) {
        this.lot05 = lot05;
    }

    @Basic
    @Column(name = "LOT06")
    public String getLot06() {
        return lot06;
    }

    public void setLot06(String lot06) {
        this.lot06 = lot06;
    }

    @Basic
    @Column(name = "LOT07")
    public String getLot07() {
        return lot07;
    }

    public void setLot07(String lot07) {
        this.lot07 = lot07;
    }

    @Basic
    @Column(name = "LOT08")
    public String getLot08() {
        return lot08;
    }

    public void setLot08(String lot08) {
        this.lot08 = lot08;
    }

    @Basic
    @Column(name = "LOT09")
    public String getLot09() {
        return lot09;
    }

    public void setLot09(String lot09) {
        this.lot09 = lot09;
    }

    @Basic
    @Column(name = "LOT10")
    public String getLot10() {
        return lot10;
    }

    public void setLot10(String lot10) {
        this.lot10 = lot10;
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
    @Column(name = "LOT01_TYPE")
    public String getLot01Type() {
        return lot01Type;
    }

    public void setLot01Type(String lot01Type) {
        this.lot01Type = lot01Type;
    }

    @Basic
    @Column(name = "LOT02_TYPE")
    public String getLot02Type() {
        return lot02Type;
    }

    public void setLot02Type(String lot02Type) {
        this.lot02Type = lot02Type;
    }

    @Basic
    @Column(name = "LOT03_TYPE")
    public String getLot03Type() {
        return lot03Type;
    }

    public void setLot03Type(String lot03Type) {
        this.lot03Type = lot03Type;
    }

    @Basic
    @Column(name = "LOT04_TYPE")
    public String getLot04Type() {
        return lot04Type;
    }

    public void setLot04Type(String lot04Type) {
        this.lot04Type = lot04Type;
    }

    @Basic
    @Column(name = "LOT05_TYPE")
    public String getLot05Type() {
        return lot05Type;
    }

    public void setLot05Type(String lot05Type) {
        this.lot05Type = lot05Type;
    }

    @Basic
    @Column(name = "LOT06_TYPE")
    public String getLot06Type() {
        return lot06Type;
    }

    public void setLot06Type(String lot06Type) {
        this.lot06Type = lot06Type;
    }

    @Basic
    @Column(name = "LOT07_TYPE")
    public String getLot07Type() {
        return lot07Type;
    }

    public void setLot07Type(String lot07Type) {
        this.lot07Type = lot07Type;
    }

    @Basic
    @Column(name = "LOT08_TYPE")
    public String getLot08Type() {
        return lot08Type;
    }

    public void setLot08Type(String lot08Type) {
        this.lot08Type = lot08Type;
    }

    @Basic
    @Column(name = "LOT09_TYPE")
    public String getLot09Type() {
        return lot09Type;
    }

    public void setLot09Type(String lot09Type) {
        this.lot09Type = lot09Type;
    }

    @Basic
    @Column(name = "LOT10_TYPE")
    public String getLot10Type() {
        return lot10Type;
    }

    public void setLot10Type(String lot10Type) {
        this.lot10Type = lot10Type;
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
    @Column(name = "GOODS_INSTRA_Name")
    public String getGoodsInstraName() {
        return goodsInstraName;
    }

    public void setGoodsInstraName(String goodsInstraName) {
        this.goodsInstraName = goodsInstraName;
    }

    @Basic
    @Column(name = "GOODS_INSTRA_ID")
    public String getGoodsInstraId() {
        return goodsInstraId;
    }

    public void setGoodsInstraId(String goodsInstraId) {
        this.goodsInstraId = goodsInstraId;
    }

    @Basic
    @Column(name = "GOODS_OUTSTRA_ID")
    public String getGoodsOutstraId() {
        return goodsOutstraId;
    }

    public void setGoodsOutstraId(String goodsOutstraId) {
        this.goodsOutstraId = goodsOutstraId;
    }

    @Basic
    @Column(name = "GOODS_OUTSTRA_NAME")
    public String getGoodsOutstraName() {
        return goodsOutstraName;
    }

    public void setGoodsOutstraName(String goodsOutstraName) {
        this.goodsOutstraName = goodsOutstraName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicGoodsEntity that = (BasicGoodsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(goodsCode, that.goodsCode) &&
                Objects.equals(goodsQr, that.goodsQr) &&
                Objects.equals(goodsBar, that.goodsBar) &&
                Objects.equals(goodsRfid, that.goodsRfid) &&
                Objects.equals(goodsModel, that.goodsModel) &&
                Objects.equals(goodsCnName, that.goodsCnName) &&
                Objects.equals(goodsEnName, that.goodsEnName) &&
                Objects.equals(goodsShortName, that.goodsShortName) &&
                Objects.equals(goodsBrand, that.goodsBrand) &&
                Objects.equals(goodsWeight, that.goodsWeight) &&
                Objects.equals(goodsVolume, that.goodsVolume) &&
                Objects.equals(goodsLength, that.goodsLength) &&
                Objects.equals(goodsWidth, that.goodsWidth) &&
                Objects.equals(goodsHeight, that.goodsHeight) &&
                Objects.equals(goodsLevel, that.goodsLevel) &&
                Objects.equals(goodsUnit, that.goodsUnit) &&
                Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(ownerName, that.ownerName) &&
                Objects.equals(goodsFirm, that.goodsFirm) &&
                Objects.equals(goodsPeriod, that.goodsPeriod) &&
                Objects.equals(goodsInventory, that.goodsInventory) &&
                Objects.equals(goodsQuality, that.goodsQuality) &&
                Objects.equals(goodsClass, that.goodsClass) &&
                Objects.equals(goodsVal, that.goodsVal) &&
                Objects.equals(temCotrol2, that.temCotrol2) &&
                Objects.equals(chemicals, that.chemicals) &&
                Objects.equals(msdsEffectivedate, that.msdsEffectivedate) &&
                Objects.equals(goodsArea, that.goodsArea) &&
                Objects.equals(goodsText, that.goodsText) &&
                Objects.equals(goodsState, that.goodsState) &&
                Objects.equals(goodsPriority, that.goodsPriority) &&
                Objects.equals(goodsPackage, that.goodsPackage) &&
                Objects.equals(qcpercent, that.qcpercent) &&
                Objects.equals(putLoc, that.putLoc) &&
                Objects.equals(goodsCost, that.goodsCost) &&
                Objects.equals(putZone, that.putZone) &&
                Objects.equals(goodsOrder, that.goodsOrder) &&
                Objects.equals(putStrategy, that.putStrategy) &&
                Objects.equals(onqc, that.onqc) &&
                Objects.equals(rotation1, that.rotation1) &&
                Objects.equals(skurotation2, that.skurotation2) &&
                Objects.equals(rotation2, that.rotation2) &&
                Objects.equals(skurotation3, that.skurotation3) &&
                Objects.equals(rotation3, that.rotation3) &&
                Objects.equals(temCotrol, that.temCotrol) &&
                Objects.equals(bond, that.bond) &&
                Objects.equals(packId, that.packId) &&
                Objects.equals(temCotrol1, that.temCotrol1) &&
                Objects.equals(msdsExpirydate, that.msdsExpirydate) &&
                Objects.equals(skurotation1, that.skurotation1) &&
                Objects.equals(goodsLimitNum, that.goodsLimitNum) &&
                Objects.equals(outStrategy, that.outStrategy) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(addTime, that.addTime) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(updUserid, that.updUserid) &&
                Objects.equals(updTime, that.updTime) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(comId, that.comId) &&
                Objects.equals(lot01, that.lot01) &&
                Objects.equals(lot02, that.lot02) &&
                Objects.equals(lot03, that.lot03) &&
                Objects.equals(lot04, that.lot04) &&
                Objects.equals(lot05, that.lot05) &&
                Objects.equals(lot06, that.lot06) &&
                Objects.equals(lot07, that.lot07) &&
                Objects.equals(lot08, that.lot08) &&
                Objects.equals(lot09, that.lot09) &&
                Objects.equals(lot10, that.lot10) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(lot01Type, that.lot01Type) &&
                Objects.equals(lot02Type, that.lot02Type) &&
                Objects.equals(lot03Type, that.lot03Type) &&
                Objects.equals(lot04Type, that.lot04Type) &&
                Objects.equals(lot05Type, that.lot05Type) &&
                Objects.equals(lot06Type, that.lot06Type) &&
                Objects.equals(lot07Type, that.lot07Type) &&
                Objects.equals(lot08Type, that.lot08Type) &&
                Objects.equals(lot09Type, that.lot09Type) &&
                Objects.equals(lot10Type, that.lot10Type) &&
                Objects.equals(goodsProperty, that.goodsProperty) &&
                Objects.equals(goodsInstraName, that.goodsInstraName) &&
                Objects.equals(goodsInstraId, that.goodsInstraId) &&
                Objects.equals(goodsOutstraId, that.goodsOutstraId) &&
                Objects.equals(goodsOutstraName, that.goodsOutstraName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, goodsCode, goodsQr, goodsBar, goodsRfid, goodsModel, goodsCnName, goodsEnName, goodsShortName, goodsBrand, goodsWeight, goodsVolume, goodsLength, goodsWidth, goodsHeight, goodsLevel, goodsUnit, ownerId, ownerName, goodsFirm, goodsPeriod, goodsInventory, goodsQuality, goodsClass, goodsVal, temCotrol2, chemicals, msdsEffectivedate, goodsArea, goodsText, goodsState, goodsPriority, goodsPackage, qcpercent, putLoc, goodsCost, putZone, goodsOrder, putStrategy, onqc, rotation1, skurotation2, rotation2, skurotation3, rotation3, temCotrol, bond, packId, temCotrol1, msdsExpirydate, skurotation1, goodsLimitNum, outStrategy, uTime, addUserid, addTime, addName, updUserid, updTime, updName, comId, lot01, lot02, lot03, lot04, lot05, lot06, lot07, lot08, lot09, lot10, uDelete, lot01Type, lot02Type, lot03Type, lot04Type, lot05Type, lot06Type, lot07Type, lot08Type, lot09Type, lot10Type, goodsProperty, goodsInstraName, goodsInstraId, goodsOutstraId, goodsOutstraName);
    }
}
