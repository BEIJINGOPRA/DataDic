package com.bupt.cad.datadic.service.impl;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.common.reflect.TypeToken;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/10/10:50
 * @Description:
 */
public class HttpTest {
    static HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    static JsonFactory JSON_FACTORY = new JacksonFactory();
    public static void main(String[] args) throws IOException {
        HttpRequestFactory httpRequestFactory = HTTP_TRANSPORT.createRequestFactory((HttpRequest request)->{
            request.setParser(new JsonObjectParser(JSON_FACTORY));
        });
        GitHubUrl url = new GitHubUrl("https://api.github.com/users");
        url.perPage = 10;
        HttpRequest request = httpRequestFactory.buildGetRequest(url);
        Type type = new TypeToken<List<User>>(){}.getType();
        List<User> users = (List<User>) request.execute().parseAs(type);
        User user = users.get(0);
        user.set("email","123456");
        System.out.println(user.get("email"));
    }

}
