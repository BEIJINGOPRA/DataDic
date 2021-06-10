package com.bupt.cad.datadic.http;

import com.google.api.client.http.GenericUrl;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/10/16:10
 * @Description:
 */
public class APIUrl extends GenericUrl {

    public APIUrl(String encodedUrl) {
        super(encodedUrl);
    }
}
