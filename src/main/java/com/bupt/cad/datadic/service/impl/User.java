package com.bupt.cad.datadic.service.impl;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/10/14:56
 * @Description:
 */
public class User extends GenericJson {
    @Key
    private String login;
    @Key
    private long id;
    @Key("email")
    private String email;
}
