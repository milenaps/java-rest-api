package com.avenue.blog.cms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avenue.blog.cms.model.Product;
import com.avenue.blog.cms.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductResource {

	@Autowired
	private ProductService service;

	@RequestMapping(method = RequestMethod.GET)
	public List<Product> listAll() {
		return service.listAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Product read(@PathVariable String id) {
		return service.read(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Product create(@RequestBody Product p) {
		return service.create(p);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Product update(@RequestBody Product p) {
		return service.update(p);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
