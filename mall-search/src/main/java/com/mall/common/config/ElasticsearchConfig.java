package com.mall.common.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zhourui
 * @Date 2021/12/13 15:50
 */
@Configuration
public class ElasticsearchConfig {

    private static final String HOST = "47.105.171.231";
    private static final int PORT = 9200;
    private static final String SCHEME = "http";

    public static final RequestOptions COMMON_OPTIONS;
    static {
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
//        builder.addHeader("Authorization", "Bearer " + TOKEN);
//        builder.setHttpAsyncResponseConsumerFactory(
//                new HttpAsyncResponseConsumerFactory
//                        .HeapBufferedResponseConsumerFactory(30 * 1024 * 1024));
        COMMON_OPTIONS = builder.build();
    }

    @Bean
    public RestHighLevelClient esRestClien() {
        RestClientBuilder builder = RestClient.builder(new HttpHost(HOST, PORT, SCHEME));
        return new RestHighLevelClient(builder);
    }
}
