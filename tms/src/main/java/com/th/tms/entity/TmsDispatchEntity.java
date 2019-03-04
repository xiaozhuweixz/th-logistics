package com.th.tms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tms_dispatch", schema = "thtms", catalog = "")
public class TmsDispatchEntity {
    private String id;
    private String dispatchNo;
    private String dispatchMan;
    private String dispatchState;
    private String sourceNo;
    private String sourceSystem;
    private String carrierId;
    private String carrierName;
    private String truckCode;
    private String trailerCode;
    private String driverId;
    private String driverName;
    private String driverMobile;
    private String dispatchMemo;
    private String dispatchBPro;
    private String dispatchBCity;
    private String dispatchBArea;
    private String dispatchBZip;
    private String dispatchBAddr;
    private String dispatchEPro;
    private String dispatchECity;
    private String dispatchEArea;
    private String dispatchEZip;
    private String dispatchEAddr;
    private BigDecimal dispatchDistance;
    private Timestamp uTime;
    private String addUserid;
    private String addName;
    private Timestamp addDate;
    private Integer uDelete;
    private Timestamp updDate;
    private String updName;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DISPATCH_NO")
    public String getDispatchNo() {
        return dispatchNo;
    }

    public void setDispatchNo(String dispatchNo) {
        this.dispatchNo = dispatchNo;
    }

    @Basic
    @Column(name = "DISPATCH_MAN")
    public String getDispatchMan() {
        return dispatchMan;
    }

    public void setDispatchMan(String dispatchMan) {
        this.dispatchMan = dispatchMan;
    }

    @Basic
    @Column(name = "DISPATCH_STATE")
    public String getDispatchState() {
        return dispatchState;
    }

    public void setDispatchState(String dispatchState) {
        this.dispatchState = dispatchState;
    }

    @Basic
    @Column(name = "SOURCE_NO")
    public String getSourceNo() {
        return sourceNo;
    }

    public void setSourceNo(String sourceNo) {
        this.sourceNo = sourceNo;
    }

    @Basic
    @Column(name = "SOURCE_SYSTEM")
    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
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
    @Column(name = "CARRIER_NAME")
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
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
    @Column(name = "TRAILER_CODE")
    public String getTrailerCode() {
        return trailerCode;
    }

    public void setTrailerCode(String trailerCode) {
        this.trailerCode = trailerCode;
    }

    @Basic
    @Column(name = "DRIVER_ID")
    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    @Basic
    @Column(name = "DRIVER_NAME")
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Basic
    @Column(name = "DRIVER_MOBILE")
    public String getDriverMobile() {
        return driverMobile;
    }

    public void setDriverMobile(String driverMobile) {
        this.driverMobile = driverMobile;
    }

    @Basic
    @Column(name = "DISPATCH_MEMO")
    public String getDispatchMemo() {
        return dispatchMemo;
    }

    public void setDispatchMemo(String dispatchMemo) {
        this.dispatchMemo = dispatchMemo;
    }

    @Basic
    @Column(name = "DISPATCH_B_PRO")
    public String getDispatchBPro() {
        return dispatchBPro;
    }

    public void setDispatchBPro(String dispatchBPro) {
        this.dispatchBPro = dispatchBPro;
    }

    @Basic
    @Column(name = "DISPATCH_B_CITY")
    public String getDispatchBCity() {
        return dispatchBCity;
    }

    public void setDispatchBCity(String dispatchBCity) {
        this.dispatchBCity = dispatchBCity;
    }

    @Basic
    @Column(name = "DISPATCH_B_AREA")
    public String getDispatchBArea() {
        return dispatchBArea;
    }

    public void setDispatchBArea(String dispatchBArea) {
        this.dispatchBArea = dispatchBArea;
    }

    @Basic
    @Column(name = "DISPATCH_B_ZIP")
    public String getDispatchBZip() {
        return dispatchBZip;
    }

    public void setDispatchBZip(String dispatchBZip) {
        this.dispatchBZip = dispatchBZip;
    }

    @Basic
    @Column(name = "DISPATCH_B_ADDR")
    public String getDispatchBAddr() {
        return dispatchBAddr;
    }

    public void setDispatchBAddr(String dispatchBAddr) {
        this.dispatchBAddr = dispatchBAddr;
    }

    @Basic
    @Column(name = "DISPATCH_E_PRO")
    public String getDispatchEPro() {
        return dispatchEPro;
    }

    public void setDispatchEPro(String dispatchEPro) {
        this.dispatchEPro = dispatchEPro;
    }

    @Basic
    @Column(name = "DISPATCH_E_CITY")
    public String getDispatchECity() {
        return dispatchECity;
    }

    public void setDispatchECity(String dispatchECity) {
        this.dispatchECity = dispatchECity;
    }

    @Basic
    @Column(name = "DISPATCH_E_AREA")
    public String getDispatchEArea() {
        return dispatchEArea;
    }

    public void setDispatchEArea(String dispatchEArea) {
        this.dispatchEArea = dispatchEArea;
    }

    @Basic
    @Column(name = "DISPATCH_E_ZIP")
    public String getDispatchEZip() {
        return dispatchEZip;
    }

    public void setDispatchEZip(String dispatchEZip) {
        this.dispatchEZip = dispatchEZip;
    }

    @Basic
    @Column(name = "DISPATCH_E_ADDR")
    public String getDispatchEAddr() {
        return dispatchEAddr;
    }

    public void setDispatchEAddr(String dispatchEAddr) {
        this.dispatchEAddr = dispatchEAddr;
    }

    @Basic
    @Column(name = "DISPATCH_DISTANCE")
    public BigDecimal getDispatchDistance() {
        return dispatchDistance;
    }

    public void setDispatchDistance(BigDecimal dispatchDistance) {
        this.dispatchDistance = dispatchDistance;
    }

    @Basic
    @Column(name = "U_TIME")
    public Timestamp getuTime() {
        return uTime;
    }

    public void setuTime(Timestamp uTime) {
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
    @Column(name = "ADD_NAME")
    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
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
    @Column(name = "U_DELETE")
    public Integer getuDelete() {
        return uDelete;
    }

    public void setuDelete(Integer uDelete) {
        this.uDelete = uDelete;
    }

    @Basic
    @Column(name = "UPD_DATE")
    public Timestamp getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Timestamp updDate) {
        this.updDate = updDate;
    }

    @Basic
    @Column(name = "UPD_NAME")
    public String getUpdName() {
        return updName;
    }

    public void setUpdName(String updName) {
        this.updName = updName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TmsDispatchEntity that = (TmsDispatchEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dispatchNo, that.dispatchNo) &&
                Objects.equals(dispatchMan, that.dispatchMan) &&
                Objects.equals(dispatchState, that.dispatchState) &&
                Objects.equals(sourceNo, that.sourceNo) &&
                Objects.equals(sourceSystem, that.sourceSystem) &&
                Objects.equals(carrierId, that.carrierId) &&
                Objects.equals(carrierName, that.carrierName) &&
                Objects.equals(truckCode, that.truckCode) &&
                Objects.equals(trailerCode, that.trailerCode) &&
                Objects.equals(driverId, that.driverId) &&
                Objects.equals(driverName, that.driverName) &&
                Objects.equals(driverMobile, that.driverMobile) &&
                Objects.equals(dispatchMemo, that.dispatchMemo) &&
                Objects.equals(dispatchBPro, that.dispatchBPro) &&
                Objects.equals(dispatchBCity, that.dispatchBCity) &&
                Objects.equals(dispatchBArea, that.dispatchBArea) &&
                Objects.equals(dispatchBZip, that.dispatchBZip) &&
                Objects.equals(dispatchBAddr, that.dispatchBAddr) &&
                Objects.equals(dispatchEPro, that.dispatchEPro) &&
                Objects.equals(dispatchECity, that.dispatchECity) &&
                Objects.equals(dispatchEArea, that.dispatchEArea) &&
                Objects.equals(dispatchEZip, that.dispatchEZip) &&
                Objects.equals(dispatchEAddr, that.dispatchEAddr) &&
                Objects.equals(dispatchDistance, that.dispatchDistance) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(updDate, that.updDate) &&
                Objects.equals(updName, that.updName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dispatchNo, dispatchMan, dispatchState, sourceNo, sourceSystem, carrierId, carrierName, truckCode, trailerCode, driverId, driverName, driverMobile, dispatchMemo, dispatchBPro, dispatchBCity, dispatchBArea, dispatchBZip, dispatchBAddr, dispatchEPro, dispatchECity, dispatchEArea, dispatchEZip, dispatchEAddr, dispatchDistance, uTime, addUserid, addName, addDate, uDelete, updDate, updName);
    }
}
