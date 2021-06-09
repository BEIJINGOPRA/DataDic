package com.bupt.cad.datadic.model.dto;

import lombok.Data;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/10:46
 * @Description:
 */
@Data
public class DataSourceDTO {

    private Integer id;

    private String name;

    private String type;

    private String description;

    private Map<String, String> detail_info;
}
