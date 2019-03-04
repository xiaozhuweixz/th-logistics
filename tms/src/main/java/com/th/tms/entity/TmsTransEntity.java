package com.th.tms.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tms_trans", schema = "thtms", catalog = "")
public class TmsTransEntity {
    private String id;
    private String transCustNo;
    private String transWaybillNo;
    private String transState;
    private String transType;
    private String custId;
    private String custName;
    private String shipperId;
    private String shipperName;
    private String recieverId;
    private String recieverName;
    private String carrierId;
    private String carrierName;
    private String truckCode;
    private String driverId;
    private String driverName;
    private String driverMobile;
    private String transBPro;
    private String transBCity;
    private String transBArea;
    private String transBZip;
    private String transBAddr;
    private String transBShipper;
    private String transBShipperPhone;
    private String transEPro;
    private String transECity;
    private String transEArea;
    private String transEZip;
    private String transEAddr;
    private String transEReciever;
    private String transERecieverPhone;
    private BigDecimal transDistance;
    private BigDecimal transVol;
    private BigDecimal transWeight;
    private BigDecimal transWeightfee;
    private BigDecimal transNum;
    private BigDecimal transCostExp;
    private BigDecimal transIncomeExp;
    private BigDecimal transCost;
    private BigDecimal transIncome;
    private BigDecimal transCostPre;
    private Timestamp transArrtimeExp;
    private Timestamp transDepartExp;
    private Timestamp transReachExp;
    private Timestamp transSignExp;
    private Timestamp transReceiptExp;
    private Timestamp transArrtime;
    private Timestamp transDepart;
    private Timestamp transReach;
    private Timestamp transSign;
    private Timestamp transReceipt;
    private String transSignMemo;
    private String transMemo;
    private String transWeightUnit;
    private BigDecimal transWeightT;
    private BigDecimal transWeightfeeT;
    private BigDecimal transIncomeTax;
    private BigDecimal transPayTax;
    private String fscId;
    private String fmscId;
    private Integer transIsPhoto;
    private Integer isException;
    private String exceptionText;
    private Integer exceptionState;
    private String relationNo;
    private String relationId;
    private String trailerCode;
    private String updName;
    private Timestamp updDate;
    private Integer uDelete;
    private Timestamp uTime;
    private Timestamp addDate;
    private String addName;
    private String addUserid;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TRANS_CUST_NO")
    public String getTransCustNo() {
        return transCustNo;
    }

    public void setTransCustNo(String transCustNo) {
        this.transCustNo = transCustNo;
    }

    @Basic
    @Column(name = "TRANS_WAYBILL_NO")
    public String getTransWaybillNo() {
        return transWaybillNo;
    }

    public void setTransWaybillNo(String transWaybillNo) {
        this.transWaybillNo = transWaybillNo;
    }

    @Basic
    @Column(name = "TRANS_STATE")
    public String getTransState() {
        return transState;
    }

    public void setTransState(String transState) {
        this.transState = transState;
    }

    @Basic
    @Column(name = "TRANS_TYPE")
    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    @Basic
    @Column(name = "CUST_ID")
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Basic
    @Column(name = "CUST_NAME")
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    @Basic
    @Column(name = "SHIPPER_ID")
    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    @Basic
    @Column(name = "SHIPPER_NAME")
    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    @Basic
    @Column(name = "RECIEVER_ID")
    public String getRecieverId() {
        return recieverId;
    }

    public void setRecieverId(String recieverId) {
        this.recieverId = recieverId;
    }

    @Basic
    @Column(name = "RECIEVER_NAME")
    public String getRecieverName() {
        return recieverName;
    }

    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName;
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
    @Column(name = "TRANS_B_PRO")
    public String getTransBPro() {
        return transBPro;
    }

    public void setTransBPro(String transBPro) {
        this.transBPro = transBPro;
    }

    @Basic
    @Column(name = "TRANS_B_CITY")
    public String getTransBCity() {
        return transBCity;
    }

    public void setTransBCity(String transBCity) {
        this.transBCity = transBCity;
    }

    @Basic
    @Column(name = "TRANS_B_AREA")
    public String getTransBArea() {
        return transBArea;
    }

    public void setTransBArea(String transBArea) {
        this.transBArea = transBArea;
    }

    @Basic
    @Column(name = "TRANS_B_ZIP")
    public String getTransBZip() {
        return transBZip;
    }

    public void setTransBZip(String transBZip) {
        this.transBZip = transBZip;
    }

    @Basic
    @Column(name = "TRANS_B_ADDR")
    public String getTransBAddr() {
        return transBAddr;
    }

    public void setTransBAddr(String transBAddr) {
        this.transBAddr = transBAddr;
    }

    @Basic
    @Column(name = "TRANS_B_SHIPPER")
    public String getTransBShipper() {
        return transBShipper;
    }

    public void setTransBShipper(String transBShipper) {
        this.transBShipper = transBShipper;
    }

    @Basic
    @Column(name = "TRANS_B_SHIPPER_PHONE")
    public String getTransBShipperPhone() {
        return transBShipperPhone;
    }

    public void setTransBShipperPhone(String transBShipperPhone) {
        this.transBShipperPhone = transBShipperPhone;
    }

    @Basic
    @Column(name = "TRANS_E_PRO")
    public String getTransEPro() {
        return transEPro;
    }

    public void setTransEPro(String transEPro) {
        this.transEPro = transEPro;
    }

    @Basic
    @Column(name = "TRANS_E_CITY")
    public String getTransECity() {
        return transECity;
    }

    public void setTransECity(String transECity) {
        this.transECity = transECity;
    }

    @Basic
    @Column(name = "TRANS_E_AREA")
    public String getTransEArea() {
        return transEArea;
    }

    public void setTransEArea(String transEArea) {
        this.transEArea = transEArea;
    }

    @Basic
    @Column(name = "TRANS_E_ZIP")
    public String getTransEZip() {
        return transEZip;
    }

    public void setTransEZip(String transEZip) {
        this.transEZip = transEZip;
    }

    @Basic
    @Column(name = "TRANS_E_ADDR")
    public String getTransEAddr() {
        return transEAddr;
    }

    public void setTransEAddr(String transEAddr) {
        this.transEAddr = transEAddr;
    }

    @Basic
    @Column(name = "TRANS_E_RECIEVER")
    public String getTransEReciever() {
        return transEReciever;
    }

    public void setTransEReciever(String transEReciever) {
        this.transEReciever = transEReciever;
    }

    @Basic
    @Column(name = "TRANS_E_RECIEVER_PHONE")
    public String getTransERecieverPhone() {
        return transERecieverPhone;
    }

    public void setTransERecieverPhone(String transERecieverPhone) {
        this.transERecieverPhone = transERecieverPhone;
    }

    @Basic
    @Column(name = "TRANS_DISTANCE")
    public BigDecimal getTransDistance() {
        return transDistance;
    }

    public void setTransDistance(BigDecimal transDistance) {
        this.transDistance = transDistance;
    }

    @Basic
    @Column(name = "TRANS_VOL")
    public BigDecimal getTransVol() {
        return transVol;
    }

    public void setTransVol(BigDecimal transVol) {
        this.transVol = transVol;
    }

    @Basic
    @Column(name = "TRANS_WEIGHT")
    public BigDecimal getTransWeight() {
        return transWeight;
    }

    public void setTransWeight(BigDecimal transWeight) {
        this.transWeight = transWeight;
    }

    @Basic
    @Column(name = "TRANS_WEIGHTFEE")
    public BigDecimal getTransWeightfee() {
        return transWeightfee;
    }

    public void setTransWeightfee(BigDecimal transWeightfee) {
        this.transWeightfee = transWeightfee;
    }

    @Basic
    @Column(name = "TRANS_NUM")
    public BigDecimal getTransNum() {
        return transNum;
    }

    public void setTransNum(BigDecimal transNum) {
        this.transNum = transNum;
    }

    @Basic
    @Column(name = "TRANS_COST_EXP")
    public BigDecimal getTransCostExp() {
        return transCostExp;
    }

    public void setTransCostExp(BigDecimal transCostExp) {
        this.transCostExp = transCostExp;
    }

    @Basic
    @Column(name = "TRANS_INCOME_EXP")
    public BigDecimal getTransIncomeExp() {
        return transIncomeExp;
    }

    public void setTransIncomeExp(BigDecimal transIncomeExp) {
        this.transIncomeExp = transIncomeExp;
    }

    @Basic
    @Column(name = "TRANS_COST")
    public BigDecimal getTransCost() {
        return transCost;
    }

    public void setTransCost(BigDecimal transCost) {
        this.transCost = transCost;
    }

    @Basic
    @Column(name = "TRANS_INCOME")
    public BigDecimal getTransIncome() {
        return transIncome;
    }

    public void setTransIncome(BigDecimal transIncome) {
        this.transIncome = transIncome;
    }

    @Basic
    @Column(name = "TRANS_COST_PRE")
    public BigDecimal getTransCostPre() {
        return transCostPre;
    }

    public void setTransCostPre(BigDecimal transCostPre) {
        this.transCostPre = transCostPre;
    }

    @Basic
    @Column(name = "TRANS_ARRTIME_EXP")
    public Timestamp getTransArrtimeExp() {
        return transArrtimeExp;
    }

    public void setTransArrtimeExp(Timestamp transArrtimeExp) {
        this.transArrtimeExp = transArrtimeExp;
    }

    @Basic
    @Column(name = "TRANS_DEPART_EXP")
    public Timestamp getTransDepartExp() {
        return transDepartExp;
    }

    public void setTransDepartExp(Timestamp transDepartExp) {
        this.transDepartExp = transDepartExp;
    }

    @Basic
    @Column(name = "TRANS_REACH_EXP")
    public Timestamp getTransReachExp() {
        return transReachExp;
    }

    public void setTransReachExp(Timestamp transReachExp) {
        this.transReachExp = transReachExp;
    }

    @Basic
    @Column(name = "TRANS_SIGN_EXP")
    public Timestamp getTransSignExp() {
        return transSignExp;
    }

    public void setTransSignExp(Timestamp transSignExp) {
        this.transSignExp = transSignExp;
    }

    @Basic
    @Column(name = "TRANS_RECEIPT_EXP")
    public Timestamp getTransReceiptExp() {
        return transReceiptExp;
    }

    public void setTransReceiptExp(Timestamp transReceiptExp) {
        this.transReceiptExp = transReceiptExp;
    }

    @Basic
    @Column(name = "TRANS_ARRTIME")
    public Timestamp getTransArrtime() {
        return transArrtime;
    }

    public void setTransArrtime(Timestamp transArrtime) {
        this.transArrtime = transArrtime;
    }

    @Basic
    @Column(name = "TRANS_DEPART")
    public Timestamp getTransDepart() {
        return transDepart;
    }

    public void setTransDepart(Timestamp transDepart) {
        this.transDepart = transDepart;
    }

    @Basic
    @Column(name = "TRANS_REACH")
    public Timestamp getTransReach() {
        return transReach;
    }

    public void setTransReach(Timestamp transReach) {
        this.transReach = transReach;
    }

    @Basic
    @Column(name = "TRANS_SIGN")
    public Timestamp getTransSign() {
        return transSign;
    }

    public void setTransSign(Timestamp transSign) {
        this.transSign = transSign;
    }

    @Basic
    @Column(name = "TRANS_RECEIPT")
    public Timestamp getTransReceipt() {
        return transReceipt;
    }

    public void setTransReceipt(Timestamp transReceipt) {
        this.transReceipt = transReceipt;
    }

    @Basic
    @Column(name = "TRANS_SIGN_MEMO")
    public String getTransSignMemo() {
        return transSignMemo;
    }

    public void setTransSignMemo(String transSignMemo) {
        this.transSignMemo = transSignMemo;
    }

    @Basic
    @Column(name = "TRANS_MEMO")
    public String getTransMemo() {
        return transMemo;
    }

    public void setTransMemo(String transMemo) {
        this.transMemo = transMemo;
    }

    @Basic
    @Column(name = "TRANS_WEIGHT_UNIT")
    public String getTransWeightUnit() {
        return transWeightUnit;
    }

    public void setTransWeightUnit(String transWeightUnit) {
        this.transWeightUnit = transWeightUnit;
    }

    @Basic
    @Column(name = "TRANS_WEIGHT_T")
    public BigDecimal getTransWeightT() {
        return transWeightT;
    }

    public void setTransWeightT(BigDecimal transWeightT) {
        this.transWeightT = transWeightT;
    }

    @Basic
    @Column(name = "TRANS_WEIGHTFEE_T")
    public BigDecimal getTransWeightfeeT() {
        return transWeightfeeT;
    }

    public void setTransWeightfeeT(BigDecimal transWeightfeeT) {
        this.transWeightfeeT = transWeightfeeT;
    }

    @Basic
    @Column(name = "TRANS_INCOME_TAX")
    public BigDecimal getTransIncomeTax() {
        return transIncomeTax;
    }

    public void setTransIncomeTax(BigDecimal transIncomeTax) {
        this.transIncomeTax = transIncomeTax;
    }

    @Basic
    @Column(name = "TRANS_PAY_TAX")
    public BigDecimal getTransPayTax() {
        return transPayTax;
    }

    public void setTransPayTax(BigDecimal transPayTax) {
        this.transPayTax = transPayTax;
    }

    @Basic
    @Column(name = "FSC_ID")
    public String getFscId() {
        return fscId;
    }

    public void setFscId(String fscId) {
        this.fscId = fscId;
    }

    @Basic
    @Column(name = "FMSC_ID")
    public String getFmscId() {
        return fmscId;
    }

    public void setFmscId(String fmscId) {
        this.fmscId = fmscId;
    }

    @Basic
    @Column(name = "TRANS_IS_PHOTO")
    public Integer getTransIsPhoto() {
        return transIsPhoto;
    }

    public void setTransIsPhoto(Integer transIsPhoto) {
        this.transIsPhoto = transIsPhoto;
    }

    @Basic
    @Column(name = "IS_EXCEPTION")
    public Integer getIsException() {
        return isException;
    }

    public void setIsException(Integer isException) {
        this.isException = isException;
    }

    @Basic
    @Column(name = "EXCEPTION_TEXT")
    public String getExceptionText() {
        return exceptionText;
    }

    public void setExceptionText(String exceptionText) {
        this.exceptionText = exceptionText;
    }

    @Basic
    @Column(name = "EXCEPTION_STATE")
    public Integer getExceptionState() {
        return exceptionState;
    }

    public void setExceptionState(Integer exceptionState) {
        this.exceptionState = exceptionState;
    }

    @Basic
    @Column(name = "RELATION_NO")
    public String getRelationNo() {
        return relationNo;
    }

    public void setRelationNo(String relationNo) {
        this.relationNo = relationNo;
    }

    @Basic
    @Column(name = "RELATION_ID")
    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
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
    @Column(name = "UPD_NAME")
    public String getUpdName() {
        return updName;
    }

    public void setUpdName(String updName) {
        this.updName = updName;
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
    @Column(name = "ADD_USERID")
    public String getAddUserid() {
        return addUserid;
    }

    public void setAddUserid(String addUserid) {
        this.addUserid = addUserid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TmsTransEntity that = (TmsTransEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(transCustNo, that.transCustNo) &&
                Objects.equals(transWaybillNo, that.transWaybillNo) &&
                Objects.equals(transState, that.transState) &&
                Objects.equals(transType, that.transType) &&
                Objects.equals(custId, that.custId) &&
                Objects.equals(custName, that.custName) &&
                Objects.equals(shipperId, that.shipperId) &&
                Objects.equals(shipperName, that.shipperName) &&
                Objects.equals(recieverId, that.recieverId) &&
                Objects.equals(recieverName, that.recieverName) &&
                Objects.equals(carrierId, that.carrierId) &&
                Objects.equals(carrierName, that.carrierName) &&
                Objects.equals(truckCode, that.truckCode) &&
                Objects.equals(driverId, that.driverId) &&
                Objects.equals(driverName, that.driverName) &&
                Objects.equals(driverMobile, that.driverMobile) &&
                Objects.equals(transBPro, that.transBPro) &&
                Objects.equals(transBCity, that.transBCity) &&
                Objects.equals(transBArea, that.transBArea) &&
                Objects.equals(transBZip, that.transBZip) &&
                Objects.equals(transBAddr, that.transBAddr) &&
                Objects.equals(transBShipper, that.transBShipper) &&
                Objects.equals(transBShipperPhone, that.transBShipperPhone) &&
                Objects.equals(transEPro, that.transEPro) &&
                Objects.equals(transECity, that.transECity) &&
                Objects.equals(transEArea, that.transEArea) &&
                Objects.equals(transEZip, that.transEZip) &&
                Objects.equals(transEAddr, that.transEAddr) &&
                Objects.equals(transEReciever, that.transEReciever) &&
                Objects.equals(transERecieverPhone, that.transERecieverPhone) &&
                Objects.equals(transDistance, that.transDistance) &&
                Objects.equals(transVol, that.transVol) &&
                Objects.equals(transWeight, that.transWeight) &&
                Objects.equals(transWeightfee, that.transWeightfee) &&
                Objects.equals(transNum, that.transNum) &&
                Objects.equals(transCostExp, that.transCostExp) &&
                Objects.equals(transIncomeExp, that.transIncomeExp) &&
                Objects.equals(transCost, that.transCost) &&
                Objects.equals(transIncome, that.transIncome) &&
                Objects.equals(transCostPre, that.transCostPre) &&
                Objects.equals(transArrtimeExp, that.transArrtimeExp) &&
                Objects.equals(transDepartExp, that.transDepartExp) &&
                Objects.equals(transReachExp, that.transReachExp) &&
                Objects.equals(transSignExp, that.transSignExp) &&
                Objects.equals(transReceiptExp, that.transReceiptExp) &&
                Objects.equals(transArrtime, that.transArrtime) &&
                Objects.equals(transDepart, that.transDepart) &&
                Objects.equals(transReach, that.transReach) &&
                Objects.equals(transSign, that.transSign) &&
                Objects.equals(transReceipt, that.transReceipt) &&
                Objects.equals(transSignMemo, that.transSignMemo) &&
                Objects.equals(transMemo, that.transMemo) &&
                Objects.equals(transWeightUnit, that.transWeightUnit) &&
                Objects.equals(transWeightT, that.transWeightT) &&
                Objects.equals(transWeightfeeT, that.transWeightfeeT) &&
                Objects.equals(transIncomeTax, that.transIncomeTax) &&
                Objects.equals(transPayTax, that.transPayTax) &&
                Objects.equals(fscId, that.fscId) &&
                Objects.equals(fmscId, that.fmscId) &&
                Objects.equals(transIsPhoto, that.transIsPhoto) &&
                Objects.equals(isException, that.isException) &&
                Objects.equals(exceptionText, that.exceptionText) &&
                Objects.equals(exceptionState, that.exceptionState) &&
                Objects.equals(relationNo, that.relationNo) &&
                Objects.equals(relationId, that.relationId) &&
                Objects.equals(trailerCode, that.trailerCode) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(updDate, that.updDate) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(addUserid, that.addUserid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transCustNo, transWaybillNo, transState, transType, custId, custName, shipperId, shipperName, recieverId, recieverName, carrierId, carrierName, truckCode, driverId, driverName, driverMobile, transBPro, transBCity, transBArea, transBZip, transBAddr, transBShipper, transBShipperPhone, transEPro, transECity, transEArea, transEZip, transEAddr, transEReciever, transERecieverPhone, transDistance, transVol, transWeight, transWeightfee, transNum, transCostExp, transIncomeExp, transCost, transIncome, transCostPre, transArrtimeExp, transDepartExp, transReachExp, transSignExp, transReceiptExp, transArrtime, transDepart, transReach, transSign, transReceipt, transSignMemo, transMemo, transWeightUnit, transWeightT, transWeightfeeT, transIncomeTax, transPayTax, fscId, fmscId, transIsPhoto, isException, exceptionText, exceptionState, relationNo, relationId, trailerCode, updName, updDate, uDelete, uTime, addDate, addName, addUserid);
    }
}
