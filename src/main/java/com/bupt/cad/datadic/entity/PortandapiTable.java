package com.bupt.cad.datadic.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
public class PortandapiTable implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("portAndAPI_ID")
    private Integer portandapiId;

    @TableField("DataSource")
    private String DataSource;

    private String description;

    @TableField("API_detail")
    private String apiDetail;


    public Integer getPortandapiId() {
        return portandapiId;
    }

    public void setPortandapiId(Integer portandapiId) {
        this.portandapiId = portandapiId;
    }

    public String getDataSource() {
        return DataSource;
    }

    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApiDetail() {
        return apiDetail;
    }

    public void setApiDetail(String apiDetail) {
        this.apiDetail = apiDetail;
    }

    @Override
    public String toString() {
        return "PortandapiTable{" +
        "portandapiId=" + portandapiId +
        ", DataSource=" + DataSource +
        ", description=" + description +
        ", apiDetail=" + apiDetail +
        "}";
    }
}
