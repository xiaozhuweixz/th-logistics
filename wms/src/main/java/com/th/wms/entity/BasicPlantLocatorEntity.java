package com.th.wms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "basic_plant_locator", schema = "thwms", catalog = "")
public class BasicPlantLocatorEntity {
    private String locId;
    private String locCode;
    private String locName;
    private String plantId;
    private String plantCode;
    private String plantName;
    private String areaId;
    private String areaCode;
    private String areaName;
    private BigDecimal locLength;
    private BigDecimal locWidth;
    private BigDecimal locHeight;
    private BigDecimal locSumVol;
    private BigDecimal locSurplusVol;
    private BigDecimal locWeight;
    private String locUse;
    private String locText;
    private Integer locState;
    private String locPriority;
    private String locType;
    private String locClass;
    private String locStorage;
    private String locInaction;
    private String locOutaction;
    private String locLine;
    private String comId;
    private String addUserid;
    private Timestamp addDate;
    private String addName;
    private String updUserid;
    private Timestamp updTime;
    private String updName;
    private Integer uDelete;
    private Timestamp uTime;

    @Id
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
    @Column(name = "LOC_LENGTH")
    public BigDecimal getLocLength() {
        return locLength;
    }

    public void setLocLength(BigDecimal locLength) {
        this.locLength = locLength;
    }

    @Basic
    @Column(name = "LOC_WIDTH")
    public BigDecimal getLocWidth() {
        return locWidth;
    }

    public void setLocWidth(BigDecimal locWidth) {
        this.locWidth = locWidth;
    }

    @Basic
    @Column(name = "LOC_HEIGHT")
    public BigDecimal getLocHeight() {
        return locHeight;
    }

    public void setLocHeight(BigDecimal locHeight) {
        this.locHeight = locHeight;
    }

    @Basic
    @Column(name = "LOC_SUM_VOL")
    public BigDecimal getLocSumVol() {
        return locSumVol;
    }

    public void setLocSumVol(BigDecimal locSumVol) {
        this.locSumVol = locSumVol;
    }

    @Basic
    @Column(name = "LOC_SURPLUS_VOL")
    public BigDecimal getLocSurplusVol() {
        return locSurplusVol;
    }

    public void setLocSurplusVol(BigDecimal locSurplusVol) {
        this.locSurplusVol = locSurplusVol;
    }

    @Basic
    @Column(name = "LOC_WEIGHT")
    public BigDecimal getLocWeight() {
        return locWeight;
    }

    public void setLocWeight(BigDecimal locWeight) {
        this.locWeight = locWeight;
    }

    @Basic
    @Column(name = "LOC_USE")
    public String getLocUse() {
        return locUse;
    }

    public void setLocUse(String locUse) {
        this.locUse = locUse;
    }

    @Basic
    @Column(name = "LOC_TEXT")
    public String getLocText() {
        return locText;
    }

    public void setLocText(String locText) {
        this.locText = locText;
    }

    @Basic
    @Column(name = "LOC_STATE")
    public Integer getLocState() {
        return locState;
    }

    public void setLocState(Integer locState) {
        this.locState = locState;
    }

    @Basic
    @Column(name = "LOC_PRIORITY")
    public String getLocPriority() {
        return locPriority;
    }

    public void setLocPriority(String locPriority) {
        this.locPriority = locPriority;
    }

    @Basic
    @Column(name = "LOC_TYPE")
    public String getLocType() {
        return locType;
    }

    public void setLocType(String locType) {
        this.locType = locType;
    }

    @Basic
    @Column(name = "LOC_CLASS")
    public String getLocClass() {
        return locClass;
    }

    public void setLocClass(String locClass) {
        this.locClass = locClass;
    }

    @Basic
    @Column(name = "LOC_STORAGE")
    public String getLocStorage() {
        return locStorage;
    }

    public void setLocStorage(String locStorage) {
        this.locStorage = locStorage;
    }

    @Basic
    @Column(name = "LOC_INACTION")
    public String getLocInaction() {
        return locInaction;
    }

    public void setLocInaction(String locInaction) {
        this.locInaction = locInaction;
    }

    @Basic
    @Column(name = "LOC_OUTACTION")
    public String getLocOutaction() {
        return locOutaction;
    }

    public void setLocOutaction(String locOutaction) {
        this.locOutaction = locOutaction;
    }

    @Basic
    @Column(name = "LOC_LINE")
    public String getLocLine() {
        return locLine;
    }

    public void setLocLine(String locLine) {
        this.locLine = locLine;
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
    @Column(name = "ADD_USERID")
    public String getAddUserid() {
        return addUserid;
    }

    public void setAddUserid(String addUserid) {
        this.addUserid = addUserid;
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
        BasicPlantLocatorEntity that = (BasicPlantLocatorEntity) o;
        return Objects.equals(locId, that.locId) &&
                Objects.equals(locCode, that.locCode) &&
                Objects.equals(locName, that.locName) &&
                Objects.equals(plantId, that.plantId) &&
                Objects.equals(plantCode, that.plantCode) &&
                Objects.equals(plantName, that.plantName) &&
                Objects.equals(areaId, that.areaId) &&
                Objects.equals(areaCode, that.areaCode) &&
                Objects.equals(areaName, that.areaName) &&
                Objects.equals(locLength, that.locLength) &&
                Objects.equals(locWidth, that.locWidth) &&
                Objects.equals(locHeight, that.locHeight) &&
                Objects.equals(locSumVol, that.locSumVol) &&
                Objects.equals(locSurplusVol, that.locSurplusVol) &&
                Objects.equals(locWeight, that.locWeight) &&
                Objects.equals(locUse, that.locUse) &&
                Objects.equals(locText, that.locText) &&
                Objects.equals(locState, that.locState) &&
                Objects.equals(locPriority, that.locPriority) &&
                Objects.equals(locType, that.locType) &&
                Objects.equals(locClass, that.locClass) &&
                Objects.equals(locStorage, that.locStorage) &&
                Objects.equals(locInaction, that.locInaction) &&
                Objects.equals(locOutaction, that.locOutaction) &&
                Objects.equals(locLine, that.locLine) &&
                Objects.equals(comId, that.comId) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(updUserid, that.updUserid) &&
                Objects.equals(updTime, that.updTime) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(uTime, that.uTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locId, locCode, locName, plantId, plantCode, plantName, areaId, areaCode, areaName, locLength, locWidth, locHeight, locSumVol, locSurplusVol, locWeight, locUse, locText, locState, locPriority, locType, locClass, locStorage, locInaction, locOutaction, locLine, comId, addUserid, addDate, addName, updUserid, updTime, updName, uDelete, uTime);
    }
}
