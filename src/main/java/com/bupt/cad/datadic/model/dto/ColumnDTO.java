package com.bupt.cad.datadic.model.dto;

import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/14:47
 * @Description:
 */
@Data
public class ColumnDTO {

    private Integer id;

    private String name;

    private String type;

    private Integer secondCategoryId;

    private List<String> realName;

    private List<String> portAndAPI;

    private String description;
}
