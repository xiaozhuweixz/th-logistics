package com.th.tms.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "basic_truck_backup", schema = "thtms")
public class BasicTruckBackupEntity {
    private String truckId;
    private String originalId;
    private String carrierId;
    private String truckType;
    private Double truckTonnage;
    private Double truckLoad;
    private Double truckLength;
    private Double truckVolume;
    private Double truckWidth;
    private Double truckHeight;
    private String truckPhoto;
    private String truckBody;
    private String truCkInsurance;
    private String truckOwner;
    private String truckOwnerType;
    private String truckDescription;
    private Integer truckState;
    private String truckEngine;
    private String addName;
    private Date addDate;
    private String updName;
    private String comId;
    private String comPf;
    private String addUserid;
    private Date uTime;
    private Integer uDelete;
    private String truckCode;
    private Date updDate;
    private Integer truckNum;
    private String carrierName;
    private String truckFuelType;
    private String truckBrand;
    private String truckTaxiLicense;
    private String truckFrameCode;
    private String truckCheck;
    private String truckSource;
    private String truckEngineCode;

    @Id
    @Column(name = "TRUCK_ID")
    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    @Basic
    @Column(name = "ORIGINAL_ID")
    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId;
    }

    @Basic
    @Column(name = "CARRIER_ID")
    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    @Basic
    @Column(name = "TRUCK_TYPE")
    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    @Basic
    @Column(name = "TRUCK_TONNAGE")
    public Double getTruckTonnage() {
        return truckTonnage;
    }

    public void setTruckTonnage(Double truckTonnage) {
        this.truckTonnage = truckTonnage;
    }

    @Basic
    @Column(name = "TRUCK_LOAD")
    public Double getTruckLoad() {
        return truckLoad;
    }

    public void setTruckLoad(Double truckLoad) {
        this.truckLoad = truckLoad;
    }

    @Basic
    @Column(name = "TRUCK_LENGTH")
    public Double getTruckLength() {
        return truckLength;
    }

    public void setTruckLength(Double truckLength) {
        this.truckLength = truckLength;
    }

    @Basic
    @Column(name = "TRUCK_VOLUME")
    public Double getTruckVolume() {
        return truckVolume;
    }

    public void setTruckVolume(Double truckVolume) {
        this.truckVolume = truckVolume;
    }

    @Basic
    @Column(name = "TRUCK_WIDTH")
    public Double getTruckWidth() {
        return truckWidth;
    }

    public void setTruckWidth(Double truckWidth) {
        this.truckWidth = truckWidth;
    }

    @Basic
    @Column(name = "TRUCK_HEIGHT")
    public Double getTruckHeight() {
        return truckHeight;
    }

    public void setTruckHeight(Double truckHeight) {
        this.truckHeight = truckHeight;
    }

    @Basic
    @Column(name = "TRUCK_PHOTO")
    public String getTruckPhoto() {
        return truckPhoto;
    }

    public void setTruckPhoto(String truckPhoto) {
        this.truckPhoto = truckPhoto;
    }

    @Basic
    @Column(name = "TRUCK_BODY")
    public String getTruckBody() {
        return truckBody;
    }

    public void setTruckBody(String truckBody) {
        this.truckBody = truckBody;
    }

    @Basic
    @Column(name = "TRUCk_INSURANCE")
    public String getTruCkInsurance() {
        return truCkInsurance;
    }

    public void setTruCkInsurance(String truCkInsurance) {
        this.truCkInsurance = truCkInsurance;
    }

    @Basic
    @Column(name = "TRUCK_OWNER")
    public String getTruckOwner() {
        return truckOwner;
    }

    public void setTruckOwner(String truckOwner) {
        this.truckOwner = truckOwner;
    }

    @Basic
    @Column(name = "TRUCK_OWNER_TYPE")
    public String getTruckOwnerType() {
        return truckOwnerType;
    }

    public void setTruckOwnerType(String truckOwnerType) {
        this.truckOwnerType = truckOwnerType;
    }

    @Basic
    @Column(name = "TRUCK_DESCRIPTION")
    public String getTruckDescription() {
        return truckDescription;
    }

    public void setTruckDescription(String truckDescription) {
        this.truckDescription = truckDescription;
    }

    @Basic
    @Column(name = "TRUCK_STATE")
    public Integer getTruckState() {
        return truckState;
    }

    public void setTruckState(Integer truckState) {
        this.truckState = truckState;
    }

    @Basic
    @Column(name = "TRUCK_ENGINE")
    public String getTruckEngine() {
        return truckEngine;
    }

    public void setTruckEngine(String truckEngine) {
        this.truckEngine = truckEngine;
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
    @Column(name = "ADD_DATE")
    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
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
    @Column(name = "COM_PF")
    public String getComPf() {
        return comPf;
    }

    public void setComPf(String comPf) {
        this.comPf = comPf;
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
    @Column(name = "U_TIME")
    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
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
    @Column(name = "TRUCK_CODE")
    public String getTruckCode() {
        return truckCode;
    }

    public void setTruckCode(String truckCode) {
        this.truckCode = truckCode;
    }

    @Basic
    @Column(name = "UPD_DATE")
    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }

    @Basic
    @Column(name = "TRUCK_NUM")
    public Integer getTruckNum() {
        return truckNum;
    }

    public void setTruckNum(Integer truckNum) {
        this.truckNum = truckNum;
    }

    @Basic
    @Column(name = "CARRIER_NAME")
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    @Basic
    @Column(name = "TRUCK_FUEL_TYPE")
    public String getTruckFuelType() {
        return truckFuelType;
    }

    public void setTruckFuelType(String truckFuelType) {
        this.truckFuelType = truckFuelType;
    }

    @Basic
    @Column(name = "TRUCK_BRAND")
    public String getTruckBrand() {
        return truckBrand;
    }

    public void setTruckBrand(String truckBrand) {
        this.truckBrand = truckBrand;
    }

    @Basic
    @Column(name = "TRUCK_TAXI_LICENSE")
    public String getTruckTaxiLicense() {
        return truckTaxiLicense;
    }

    public void setTruckTaxiLicense(String truckTaxiLicense) {
        this.truckTaxiLicense = truckTaxiLicense;
    }

    @Basic
    @Column(name = "TRUCK_FRAME_CODE")
    public String getTruckFrameCode() {
        return truckFrameCode;
    }

    public void setTruckFrameCode(String truckFrameCode) {
        this.truckFrameCode = truckFrameCode;
    }

    @Basic
    @Column(name = "TRUCK_CHECK")
    public String getTruckCheck() {
        return truckCheck;
    }

    public void setTruckCheck(String truckCheck) {
        this.truckCheck = truckCheck;
    }

    @Basic
    @Column(name = "TRUCK_SOURCE")
    public String getTruckSource() {
        return truckSource;
    }

    public void setTruckSource(String truckSource) {
        this.truckSource = truckSource;
    }

    @Basic
    @Column(name = "TRUCK_ENGINE_CODE")
    public String getTruckEngineCode() {
        return truckEngineCode;
    }

    public void setTruckEngineCode(String truckEngineCode) {
        this.truckEngineCode = truckEngineCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicTruckBackupEntity that = (BasicTruckBackupEntity) o;
        return Objects.equals(truckId, that.truckId) &&
                Objects.equals(originalId, that.originalId) &&
                Objects.equals(carrierId, that.carrierId) &&
                Objects.equals(truckType, that.truckType) &&
                Objects.equals(truckTonnage, that.truckTonnage) &&
                Objects.equals(truckLoad, that.truckLoad) &&
                Objects.equals(truckLength, that.truckLength) &&
                Objects.equals(truckVolume, that.truckVolume) &&
                Objects.equals(truckWidth, that.truckWidth) &&
                Objects.equals(truckHeight, that.truckHeight) &&
                Objects.equals(truckPhoto, that.truckPhoto) &&
                Objects.equals(truckBody, that.truckBody) &&
                Objects.equals(truCkInsurance, that.truCkInsurance) &&
                Objects.equals(truckOwner, that.truckOwner) &&
                Objects.equals(truckOwnerType, that.truckOwnerType) &&
                Objects.equals(truckDescription, that.truckDescription) &&
                Objects.equals(truckState, that.truckState) &&
                Objects.equals(truckEngine, that.truckEngine) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(comId, that.comId) &&
                Objects.equals(comPf, that.comPf) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(truckCode, that.truckCode) &&
                Objects.equals(updDate, that.updDate) &&
                Objects.equals(truckNum, that.truckNum) &&
                Objects.equals(carrierName, that.carrierName) &&
                Objects.equals(truckFuelType, that.truckFuelType) &&
                Objects.equals(truckBrand, that.truckBrand) &&
                Objects.equals(truckTaxiLicense, that.truckTaxiLicense) &&
                Objects.equals(truckFrameCode, that.truckFrameCode) &&
                Objects.equals(truckCheck, that.truckCheck) &&
                Objects.equals(truckSource, that.truckSource) &&
                Objects.equals(truckEngineCode, that.truckEngineCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(truckId, originalId, carrierId, truckType, truckTonnage, truckLoad, truckLength, truckVolume, truckWidth, truckHeight, truckPhoto, truckBody, truCkInsurance, truckOwner, truckOwnerType, truckDescription, truckState, truckEngine, addName, addDate, updName, comId, comPf, addUserid, uTime, uDelete, truckCode, updDate, truckNum, carrierName, truckFuelType, truckBrand, truckTaxiLicense, truckFrameCode, truckCheck, truckSource, truckEngineCode);
    }
}
