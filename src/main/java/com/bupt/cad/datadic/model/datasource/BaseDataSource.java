package com.bupt.cad.datadic.model.datasource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/10:32
 * @Description:
 */
public interface BaseDataSource{

    Integer getId();

    void setId(Integer id);

    String getName();

    void setName(String name);

    String getType();

    void setType(String type);

    String getDescription();

    void setDescription(String description);

    Object getDetailInfo();

    String getCreateTime();

    void setCreateTime(String createTime);

    String getUpdateTime();

    void setUpdateTime(String updateTime);


    boolean testConnection();
}
