package com.bupt.cad.datadic.model.datasource;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/10:34
 * @Description:
 */

@Data
public class MySQLDataSourceDetailInfo {

    private String username;

    private String password;

    private String database;

    private String url;


}
