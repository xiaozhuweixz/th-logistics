package com.th.wms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "basic_plant", schema = "thwms", catalog = "")
public class BasicPlantEntity {
    private String plantId;
    private String plantCode;
    private String plantShortName;
    private String plantName;
    private String plantManager;
    private String plantMobile;
    private BigDecimal plantArea;
    private BigDecimal plantLength;
    private BigDecimal plantWidth;
    private BigDecimal plantSumVol;
    private BigDecimal plantSurplusVol;
    private BigDecimal plantStorageNum;
    private String plantType;
    private Integer plantState;
    private String plantDesc;
    private String plantText;
    private String plantOwner;
    private String lessorId;
    private String contractId;
    private String comId;
    private int plantFeeFlag;
    private String plantFax;
    private String plantEmail;
    private String addUserid;
    private Timestamp addDate;
    private String addName;
    private String updUserid;
    private Timestamp updTime;
    private String updName;
    private Integer uDelete;
    private Timestamp uTime;

    @Id
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
    @Column(name = "PLANT_SHORT_NAME")
    public String getPlantShortName() {
        return plantShortName;
    }

    public void setPlantShortName(String plantShortName) {
        this.plantShortName = plantShortName;
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
    @Column(name = "PLANT_MANAGER")
    public String getPlantManager() {
        return plantManager;
    }

    public void setPlantManager(String plantManager) {
        this.plantManager = plantManager;
    }

    @Basic
    @Column(name = "PLANT_MOBILE")
    public String getPlantMobile() {
        return plantMobile;
    }

    public void setPlantMobile(String plantMobile) {
        this.plantMobile = plantMobile;
    }

    @Basic
    @Column(name = "PLANT_AREA")
    public BigDecimal getPlantArea() {
        return plantArea;
    }

    public void setPlantArea(BigDecimal plantArea) {
        this.plantArea = plantArea;
    }

    @Basic
    @Column(name = "PLANT_LENGTH")
    public BigDecimal getPlantLength() {
        return plantLength;
    }

    public void setPlantLength(BigDecimal plantLength) {
        this.plantLength = plantLength;
    }

    @Basic
    @Column(name = "PLANT_WIDTH")
    public BigDecimal getPlantWidth() {
        return plantWidth;
    }

    public void setPlantWidth(BigDecimal plantWidth) {
        this.plantWidth = plantWidth;
    }

    @Basic
    @Column(name = "PLANT_SUM_VOL")
    public BigDecimal getPlantSumVol() {
        return plantSumVol;
    }

    public void setPlantSumVol(BigDecimal plantSumVol) {
        this.plantSumVol = plantSumVol;
    }

    @Basic
    @Column(name = "PLANT_SURPLUS_VOL")
    public BigDecimal getPlantSurplusVol() {
        return plantSurplusVol;
    }

    public void setPlantSurplusVol(BigDecimal plantSurplusVol) {
        this.plantSurplusVol = plantSurplusVol;
    }

    @Basic
    @Column(name = "PLANT_STORAGE_NUM")
    public BigDecimal getPlantStorageNum() {
        return plantStorageNum;
    }

    public void setPlantStorageNum(BigDecimal plantStorageNum) {
        this.plantStorageNum = plantStorageNum;
    }

    @Basic
    @Column(name = "PLANT_TYPE")
    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    @Basic
    @Column(name = "PLANT_STATE")
    public Integer getPlantState() {
        return plantState;
    }

    public void setPlantState(Integer plantState) {
        this.plantState = plantState;
    }

    @Basic
    @Column(name = "PLANT_DESC")
    public String getPlantDesc() {
        return plantDesc;
    }

    public void setPlantDesc(String plantDesc) {
        this.plantDesc = plantDesc;
    }

    @Basic
    @Column(name = "PLANT_TEXT")
    public String getPlantText() {
        return plantText;
    }

    public void setPlantText(String plantText) {
        this.plantText = plantText;
    }

    @Basic
    @Column(name = "PLANT_OWNER")
    public String getPlantOwner() {
        return plantOwner;
    }

    public void setPlantOwner(String plantOwner) {
        this.plantOwner = plantOwner;
    }

    @Basic
    @Column(name = "LESSOR_ID")
    public String getLessorId() {
        return lessorId;
    }

    public void setLessorId(String lessorId) {
        this.lessorId = lessorId;
    }

    @Basic
    @Column(name = "CONTRACT_ID")
    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
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
    @Column(name = "PLANT_FEE_FLAG")
    public int getPlantFeeFlag() {
        return plantFeeFlag;
    }

    public void setPlantFeeFlag(int plantFeeFlag) {
        this.plantFeeFlag = plantFeeFlag;
    }

    @Basic
    @Column(name = "PLANT_FAX")
    public String getPlantFax() {
        return plantFax;
    }

    public void setPlantFax(String plantFax) {
        this.plantFax = plantFax;
    }

    @Basic
    @Column(name = "PLANT_EMAIL")
    public String getPlantEmail() {
        return plantEmail;
    }

    public void setPlantEmail(String plantEmail) {
        this.plantEmail = plantEmail;
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
        BasicPlantEntity that = (BasicPlantEntity) o;
        return plantFeeFlag == that.plantFeeFlag &&
                Objects.equals(plantId, that.plantId) &&
                Objects.equals(plantCode, that.plantCode) &&
                Objects.equals(plantShortName, that.plantShortName) &&
                Objects.equals(plantName, that.plantName) &&
                Objects.equals(plantManager, that.plantManager) &&
                Objects.equals(plantMobile, that.plantMobile) &&
                Objects.equals(plantArea, that.plantArea) &&
                Objects.equals(plantLength, that.plantLength) &&
                Objects.equals(plantWidth, that.plantWidth) &&
                Objects.equals(plantSumVol, that.plantSumVol) &&
                Objects.equals(plantSurplusVol, that.plantSurplusVol) &&
                Objects.equals(plantStorageNum, that.plantStorageNum) &&
                Objects.equals(plantType, that.plantType) &&
                Objects.equals(plantState, that.plantState) &&
                Objects.equals(plantDesc, that.plantDesc) &&
                Objects.equals(plantText, that.plantText) &&
                Objects.equals(plantOwner, that.plantOwner) &&
                Objects.equals(lessorId, that.lessorId) &&
                Objects.equals(contractId, that.contractId) &&
                Objects.equals(comId, that.comId) &&
                Objects.equals(plantFax, that.plantFax) &&
                Objects.equals(plantEmail, that.plantEmail) &&
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
        return Objects.hash(plantId, plantCode, plantShortName, plantName, plantManager, plantMobile, plantArea, plantLength, plantWidth, plantSumVol, plantSurplusVol, plantStorageNum, plantType, plantState, plantDesc, plantText, plantOwner, lessorId, contractId, comId, plantFeeFlag, plantFax, plantEmail, addUserid, addDate, addName, updUserid, updTime, updName, uDelete, uTime);
    }
}
