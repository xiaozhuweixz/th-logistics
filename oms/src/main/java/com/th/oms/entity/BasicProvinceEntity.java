package com.th.oms.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "basic_province", schema = "thoms", catalog = "")
public class BasicProvinceEntity {
    private String proId;
    private String province;
    private Integer uDelete;
    private String comId;

    @Id
    @Column(name = "PRO_ID")
    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    @Basic
    @Column(name = "PROVINCE")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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
        BasicProvinceEntity that = (BasicProvinceEntity) o;
        return Objects.equals(proId, that.proId) &&
                Objects.equals(province, that.province) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(comId, that.comId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proId, province, uDelete, comId);
    }
}
