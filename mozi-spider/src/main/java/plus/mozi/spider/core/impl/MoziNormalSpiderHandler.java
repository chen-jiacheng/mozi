package plus.mozi.spider.core.impl;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.util.Strings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import plus.mozi.spider.core.MoziSpiderHandler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by chenjiacheng on 2024/4/21 23:03
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Service
public class MoziNormalSpiderHandler implements MoziSpiderHandler {

    private static OkHttpClient httpClient = new OkHttpClient();

    @Override
    public List<String> process(String domain) throws IOException {
        Call call = httpClient.newCall(
                new Request.Builder()
                        .url(domain)
                        .get()
                        .build()
        );
        Response response = call.execute();
        if (!response.isSuccessful()) {
            return Collections.emptyList();
        }
        try {
            assert response.body() != null;
            return this.parsing(response.body().string());
        } finally {
            response.close();
        }
    }

    private List<String> parsing(String response) {
        if (Strings.isEmpty(response)) {
            return Collections.emptyList();
        }
        //获取正则列表
        // return this.parsingByPattern(response);
        return this.parsingByJsoup(response);
    }

    private List<String> parsingByJsoup(String response) {
        if(StringUtils.isEmpty(response)){
            return Collections.emptyList();
        }
        List<String> domainNames = new ArrayList<>();
        Document doc = Jsoup.parse(response);
        Elements links = doc.select("a[href]");
        System.out.println("== links == ");
        for (Element link : links) {
            String href = link.attr("href");
            System.out.println("href = " + href);
            try {
                new URL(href);
                domainNames.add(href);
            } catch (MalformedURLException e) {
                // throw new RuntimeException(e);
            }
        }

        // 选择所有的<img>标签并获取src属性
        // Elements images = doc.select("img[src]");
        // System.out.println("== images == ");
        // for (Element image : images) {
        //     String src = image.attr("src");
        //     System.out.println("src = " + src);
        //     domainNames.add(src);
        //
        // }

        // 选择所有的<script>标签并获取src属性
        // Elements scripts = doc.select("script[src]");
        // System.out.println("== scripts == ");
        // for (Element script : scripts) {
        //     String src = script.attr("src");
        //     System.out.println("src = " + src);
        //     domainNames.add(src);
        // }

        return domainNames;
    }




}
