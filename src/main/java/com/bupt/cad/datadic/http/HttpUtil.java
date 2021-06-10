package com.bupt.cad.datadic.http;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/10/15:59
 * @Description:
 */
public class HttpUtil {
    public static HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    public static JsonFactory JSON_FACTORY = new JacksonFactory();

    public static HttpRequestFactory HTTP_REQUEST_FACTORY = HTTP_TRANSPORT.createRequestFactory((HttpRequest request)->{
        request.setParser(new JsonObjectParser(JSON_FACTORY));
    });
}
