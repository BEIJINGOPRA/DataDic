package com.bupt.cad.datadic.service.impl;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/10/15:25
 * @Description:
 */
public class GitHubUrl extends GenericUrl {

    public GitHubUrl(String encodedUrl){
        super(encodedUrl);
    }
    @Key
    public int perPage;
}
