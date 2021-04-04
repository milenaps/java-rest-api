package com.avenue.blog.cms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avenue.blog.cms.model.Category;
import com.avenue.blog.cms.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;

	@RequestMapping(method = RequestMethod.GET)
	public List<Category> listAll() {
		return service.listAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Category read(@PathVariable String id) {
		return service.read(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Category create(@RequestBody Category c) {
		return service.create(c);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Category update(@RequestBody Category c) {
		return service.update(c);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
