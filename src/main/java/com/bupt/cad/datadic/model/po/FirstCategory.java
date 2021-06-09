package com.bupt.cad.datadic.model.po;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/9:18
 * @Description:
 */

@Data
public class FirstCategory implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private String description;
}
