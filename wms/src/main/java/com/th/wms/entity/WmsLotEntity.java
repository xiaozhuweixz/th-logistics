package com.th.wms.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wms_lot", schema = "thwms", catalog = "")
public class WmsLotEntity {
    private String id;
    private String plantId;
    private String areaId;
    private String locId;
    private String goodsId;
    private String ownerId;
    private Date recDate;
    private String goodsQuality;
    private String lotKey01;
    private String lotValue01;
    private String lotKey02;
    private String lotValue02;
    private String lotKey03;
    private String lotValue03;
    private String lotKey04;
    private String lotValue04;
    private String lotKey05;
    private String lotValue05;
    private String lotKey06;
    private String lotValue06;
    private String lotKey07;
    private Date lotValue07;
    private String lotKey08;
    private Date lotValue08;
    private String lotKey09;
    private Date lotValue09;
    private String lotKey10;
    private Date lotValue10;
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
    @Column(name = "AREA_ID")
    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
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
    @Column(name = "GOODS_ID")
    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
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
    @Column(name = "REC_DATE")
    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
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
    @Column(name = "LOT_KEY01")
    public String getLotKey01() {
        return lotKey01;
    }

    public void setLotKey01(String lotKey01) {
        this.lotKey01 = lotKey01;
    }

    @Basic
    @Column(name = "LOT_VALUE01")
    public String getLotValue01() {
        return lotValue01;
    }

    public void setLotValue01(String lotValue01) {
        this.lotValue01 = lotValue01;
    }

    @Basic
    @Column(name = "LOT_KEY02")
    public String getLotKey02() {
        return lotKey02;
    }

    public void setLotKey02(String lotKey02) {
        this.lotKey02 = lotKey02;
    }

    @Basic
    @Column(name = "LOT_VALUE02")
    public String getLotValue02() {
        return lotValue02;
    }

    public void setLotValue02(String lotValue02) {
        this.lotValue02 = lotValue02;
    }

    @Basic
    @Column(name = "LOT_KEY03")
    public String getLotKey03() {
        return lotKey03;
    }

    public void setLotKey03(String lotKey03) {
        this.lotKey03 = lotKey03;
    }

    @Basic
    @Column(name = "LOT_VALUE03")
    public String getLotValue03() {
        return lotValue03;
    }

    public void setLotValue03(String lotValue03) {
        this.lotValue03 = lotValue03;
    }

    @Basic
    @Column(name = "LOT_KEY04")
    public String getLotKey04() {
        return lotKey04;
    }

    public void setLotKey04(String lotKey04) {
        this.lotKey04 = lotKey04;
    }

    @Basic
    @Column(name = "LOT_VALUE04")
    public String getLotValue04() {
        return lotValue04;
    }

    public void setLotValue04(String lotValue04) {
        this.lotValue04 = lotValue04;
    }

    @Basic
    @Column(name = "LOT_KEY05")
    public String getLotKey05() {
        return lotKey05;
    }

    public void setLotKey05(String lotKey05) {
        this.lotKey05 = lotKey05;
    }

    @Basic
    @Column(name = "LOT_VALUE05")
    public String getLotValue05() {
        return lotValue05;
    }

    public void setLotValue05(String lotValue05) {
        this.lotValue05 = lotValue05;
    }

    @Basic
    @Column(name = "LOT_KEY06")
    public String getLotKey06() {
        return lotKey06;
    }

    public void setLotKey06(String lotKey06) {
        this.lotKey06 = lotKey06;
    }

    @Basic
    @Column(name = "LOT_VALUE06")
    public String getLotValue06() {
        return lotValue06;
    }

    public void setLotValue06(String lotValue06) {
        this.lotValue06 = lotValue06;
    }

    @Basic
    @Column(name = "LOT_KEY07")
    public String getLotKey07() {
        return lotKey07;
    }

    public void setLotKey07(String lotKey07) {
        this.lotKey07 = lotKey07;
    }

    @Basic
    @Column(name = "LOT_VALUE07")
    public Date getLotValue07() {
        return lotValue07;
    }

    public void setLotValue07(Date lotValue07) {
        this.lotValue07 = lotValue07;
    }

    @Basic
    @Column(name = "LOT_KEY08")
    public String getLotKey08() {
        return lotKey08;
    }

    public void setLotKey08(String lotKey08) {
        this.lotKey08 = lotKey08;
    }

    @Basic
    @Column(name = "LOT_VALUE08")
    public Date getLotValue08() {
        return lotValue08;
    }

    public void setLotValue08(Date lotValue08) {
        this.lotValue08 = lotValue08;
    }

    @Basic
    @Column(name = "LOT_KEY09")
    public String getLotKey09() {
        return lotKey09;
    }

    public void setLotKey09(String lotKey09) {
        this.lotKey09 = lotKey09;
    }

    @Basic
    @Column(name = "LOT_VALUE09")
    public Date getLotValue09() {
        return lotValue09;
    }

    public void setLotValue09(Date lotValue09) {
        this.lotValue09 = lotValue09;
    }

    @Basic
    @Column(name = "LOT_KEY10")
    public String getLotKey10() {
        return lotKey10;
    }

    public void setLotKey10(String lotKey10) {
        this.lotKey10 = lotKey10;
    }

    @Basic
    @Column(name = "LOT_VALUE10")
    public Date getLotValue10() {
        return lotValue10;
    }

    public void setLotValue10(Date lotValue10) {
        this.lotValue10 = lotValue10;
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
        WmsLotEntity that = (WmsLotEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(plantId, that.plantId) &&
                Objects.equals(areaId, that.areaId) &&
                Objects.equals(locId, that.locId) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(recDate, that.recDate) &&
                Objects.equals(goodsQuality, that.goodsQuality) &&
                Objects.equals(lotKey01, that.lotKey01) &&
                Objects.equals(lotValue01, that.lotValue01) &&
                Objects.equals(lotKey02, that.lotKey02) &&
                Objects.equals(lotValue02, that.lotValue02) &&
                Objects.equals(lotKey03, that.lotKey03) &&
                Objects.equals(lotValue03, that.lotValue03) &&
                Objects.equals(lotKey04, that.lotKey04) &&
                Objects.equals(lotValue04, that.lotValue04) &&
                Objects.equals(lotKey05, that.lotKey05) &&
                Objects.equals(lotValue05, that.lotValue05) &&
                Objects.equals(lotKey06, that.lotKey06) &&
                Objects.equals(lotValue06, that.lotValue06) &&
                Objects.equals(lotKey07, that.lotKey07) &&
                Objects.equals(lotValue07, that.lotValue07) &&
                Objects.equals(lotKey08, that.lotKey08) &&
                Objects.equals(lotValue08, that.lotValue08) &&
                Objects.equals(lotKey09, that.lotKey09) &&
                Objects.equals(lotValue09, that.lotValue09) &&
                Objects.equals(lotKey10, that.lotKey10) &&
                Objects.equals(lotValue10, that.lotValue10) &&
                Objects.equals(uTime, that.uTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plantId, areaId, locId, goodsId, ownerId, recDate, goodsQuality, lotKey01, lotValue01, lotKey02, lotValue02, lotKey03, lotValue03, lotKey04, lotValue04, lotKey05, lotValue05, lotKey06, lotValue06, lotKey07, lotValue07, lotKey08, lotValue08, lotKey09, lotValue09, lotKey10, lotValue10, uTime);
    }
}
