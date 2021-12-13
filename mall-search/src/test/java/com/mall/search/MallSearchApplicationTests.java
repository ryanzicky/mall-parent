package com.mall.search;

import com.alibaba.fastjson.JSON;
import com.mall.search.config.ElasticsearchConfig;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class MallSearchApplicationTests {

	@Autowired
	private RestHighLevelClient client;

	@Test
	public void searchData() throws IOException {
		SearchRequest searchRequest = new SearchRequest();
		searchRequest.indices("users");
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchRequest.source(searchSourceBuilder);

		SearchResponse search = client.search(searchRequest, ElasticsearchConfig.COMMON_OPTIONS);

		System.out.println(search.toString());
	}

	@Test
	public void indexData() throws IOException {
		IndexRequest indexRequest = new IndexRequest("users");
		indexRequest.id("1");
		indexRequest.source(JSON.toJSONString(new User("zhangsan", "F", 18)), XContentType.JSON);

		IndexResponse index = client.index(indexRequest, ElasticsearchConfig.COMMON_OPTIONS);
		System.out.println(index);
	}

	@Data
	class User {
		private String userName;
		private String gender;
		private Integer age;

		public User(String userName, String gender, Integer age) {
			this.userName = userName;
			this.gender = gender;
			this.age = age;
		}
	}

	@Test
	public void contextLoads() {
		System.out.println(client);
	}

}
