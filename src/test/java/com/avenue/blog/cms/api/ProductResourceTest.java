package com.avenue.blog.cms.api;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class ProductResourceTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void shouldListAllProducts() {
		assertNotNull(restTemplate.getForObject("/api/products", List.class));
	}
}
