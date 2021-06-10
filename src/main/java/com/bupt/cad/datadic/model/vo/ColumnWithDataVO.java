package com.bupt.cad.datadic.model.vo;

import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/20:04
 * @Description:
 */
@Data
public class ColumnWithDataVO {
    private String name;

    private List<Object> data;
}
