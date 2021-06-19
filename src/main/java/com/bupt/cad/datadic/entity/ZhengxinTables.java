package com.bupt.cad.datadic.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-06-19
 */
public class ZhengxinTables implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private Integer firstCategoryId;

    private String description;


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

    public Integer getFirstCategoryId() {
        return firstCategoryId;
    }

    public void setFirstCategoryId(Integer firstCategoryId) {
        this.firstCategoryId = firstCategoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ZhengxinTables{" +
        "id=" + id +
        ", name=" + name +
        ", firstCategoryId=" + firstCategoryId +
        ", description=" + description +
        "}";
    }
}
