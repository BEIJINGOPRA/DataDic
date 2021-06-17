package com.bupt.cad.datadic.model.po;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/16/18:28
 * @Description:接口信息
 */
@Data
public class DataAPI implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer secondCategoryId;

    private String ApiName;

    private String apiUrl;

}
