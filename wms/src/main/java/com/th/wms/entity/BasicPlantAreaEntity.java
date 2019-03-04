package com.th.wms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "basic_plant_area", schema = "thwms", catalog = "")
public class BasicPlantAreaEntity {
    private String areaId;
    private String plantId;
    private String plantCode;
    private String plantName;
    private String areaCode;
    private String areaName;
    private BigDecimal areaHeight;
    private BigDecimal areaLength;
    private BigDecimal areaSumVol;
    private BigDecimal areaSurplusVol;
    private BigDecimal areaWidth;
    private String areaType;
    private String areaText;
    private String areaClass;
    private Integer areaState;
    private String comId;
    private String addUserid;
    private Timestamp addTime;
    private String addName;
    private String updUserid;
    private Timestamp updTime;
    private String updName;
    private Integer uDelete;
    private Timestamp uTime;

    @Id
    @Column(name = "AREA_ID")
    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
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
    @Column(name = "AREA_HEIGHT")
    public BigDecimal getAreaHeight() {
        return areaHeight;
    }

    public void setAreaHeight(BigDecimal areaHeight) {
        this.areaHeight = areaHeight;
    }

    @Basic
    @Column(name = "AREA_LENGTH")
    public BigDecimal getAreaLength() {
        return areaLength;
    }

    public void setAreaLength(BigDecimal areaLength) {
        this.areaLength = areaLength;
    }

    @Basic
    @Column(name = "AREA_SUM_VOL")
    public BigDecimal getAreaSumVol() {
        return areaSumVol;
    }

    public void setAreaSumVol(BigDecimal areaSumVol) {
        this.areaSumVol = areaSumVol;
    }

    @Basic
    @Column(name = "AREA_SURPLUS_VOL")
    public BigDecimal getAreaSurplusVol() {
        return areaSurplusVol;
    }

    public void setAreaSurplusVol(BigDecimal areaSurplusVol) {
        this.areaSurplusVol = areaSurplusVol;
    }

    @Basic
    @Column(name = "AREA_WIDTH")
    public BigDecimal getAreaWidth() {
        return areaWidth;
    }

    public void setAreaWidth(BigDecimal areaWidth) {
        this.areaWidth = areaWidth;
    }

    @Basic
    @Column(name = "AREA_TYPE")
    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    @Basic
    @Column(name = "AREA_TEXT")
    public String getAreaText() {
        return areaText;
    }

    public void setAreaText(String areaText) {
        this.areaText = areaText;
    }

    @Basic
    @Column(name = "AREA_CLASS")
    public String getAreaClass() {
        return areaClass;
    }

    public void setAreaClass(String areaClass) {
        this.areaClass = areaClass;
    }

    @Basic
    @Column(name = "AREA_STATE")
    public Integer getAreaState() {
        return areaState;
    }

    public void setAreaState(Integer areaState) {
        this.areaState = areaState;
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
        BasicPlantAreaEntity that = (BasicPlantAreaEntity) o;
        return Objects.equals(areaId, that.areaId) &&
                Objects.equals(plantId, that.plantId) &&
                Objects.equals(plantCode, that.plantCode) &&
                Objects.equals(plantName, that.plantName) &&
                Objects.equals(areaCode, that.areaCode) &&
                Objects.equals(areaName, that.areaName) &&
                Objects.equals(areaHeight, that.areaHeight) &&
                Objects.equals(areaLength, that.areaLength) &&
                Objects.equals(areaSumVol, that.areaSumVol) &&
                Objects.equals(areaSurplusVol, that.areaSurplusVol) &&
                Objects.equals(areaWidth, that.areaWidth) &&
                Objects.equals(areaType, that.areaType) &&
                Objects.equals(areaText, that.areaText) &&
                Objects.equals(areaClass, that.areaClass) &&
                Objects.equals(areaState, that.areaState) &&
                Objects.equals(comId, that.comId) &&
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
        return Objects.hash(areaId, plantId, plantCode, plantName, areaCode, areaName, areaHeight, areaLength, areaSumVol, areaSurplusVol, areaWidth, areaType, areaText, areaClass, areaState, comId, addUserid, addTime, addName, updUserid, updTime, updName, uDelete, uTime);
    }
}
