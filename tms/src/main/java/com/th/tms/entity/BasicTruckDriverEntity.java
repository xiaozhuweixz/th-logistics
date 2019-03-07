package com.th.tms.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "basic_truck_driver", schema = "thtms")
public class BasicTruckDriverEntity {
    private String id;
    private String truckId;
    private String driverId;
    private String truckCode;
    private String addName;
    private Date addDate;
    private String addUserid;
    private Date uTime;
    private Integer uDelete;
    private String comId;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TRUCK_ID")
    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
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
    @Column(name = "TRUCK_CODE")
    public String getTruckCode() {
        return truckCode;
    }

    public void setTruckCode(String truckCode) {
        this.truckCode = truckCode;
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
    @Column(name = "COM_ID")
    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicTruckDriverEntity that = (BasicTruckDriverEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(truckId, that.truckId) &&
                Objects.equals(driverId, that.driverId) &&
                Objects.equals(truckCode, that.truckCode) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(comId, that.comId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, truckId, driverId, truckCode, addName, addDate, addUserid, uTime, uDelete, comId);
    }
}
