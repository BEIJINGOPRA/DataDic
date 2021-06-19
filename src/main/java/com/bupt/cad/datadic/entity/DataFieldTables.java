package com.bupt.cad.datadic.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-06-19
 */
public class DataFieldTables implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private Integer secondCategoryId;

    private String type;

    @TableField("portAndAPI_ID")
    private Integer portandapiId;

    @TableField("RealName")
    private String RealName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSecondCategoryId() {
        return secondCategoryId;
    }

    public void setSecondCategoryId(Integer secondCategoryId) {
        this.secondCategoryId = secondCategoryId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPortandapiId() {
        return portandapiId;
    }

    public void setPortandapiId(Integer portandapiId) {
        this.portandapiId = portandapiId;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    @Override
    public String toString() {
        return "DataFieldTables{" +
        "id=" + id +
        ", name=" + name +
        ", secondCategoryId=" + secondCategoryId +
        ", type=" + type +
        ", portandapiId=" + portandapiId +
        ", RealName=" + RealName +
        "}";
    }
}
