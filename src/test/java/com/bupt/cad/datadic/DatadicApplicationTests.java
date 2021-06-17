package com.bupt.cad.datadic;

import com.bupt.cad.datadic.http.APIUrl;
import com.bupt.cad.datadic.http.HttpUtil;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class DatadicApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testHttp() throws IOException {
        APIUrl apiUrl = new APIUrl("https://api.github.com/users");
        HttpRequest request = HttpUtil.HTTP_REQUEST_FACTORY.buildGetRequest(apiUrl);
//        Type type = new TypeToken<List<IndustryData>>(){}.getType();
//        List<IndustryData> returnData = (List<IndustryData>) request.execute().parseAs(type);
        HttpResponse httpResponse = request.execute();
        String content = httpResponse.parseAsString();
        System.out.println(content);

    }

}
