package com.avenue.blog.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.avenue.blog.cms.dao.CategoryRepository;
import com.avenue.blog.cms.model.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	@Transactional(readOnly = true)
	public List<Category> listAll() {
		return repository.findAll();
	}

	@Transactional(readOnly = true)
	public Category read(String id) {
		return repository.findOne(id);
	}

	@Transactional
	public Category create(Category c) {
		if (c != null)
			return repository.insert(c);
		return null;
	}

	@Transactional
	public Category update(Category c) {
		if (c != null && repository.exists(c.getId()))
			return repository.save(c);
		return null;
	}

	@Transactional
	public void delete(String id) {
		if (repository.exists(id))
			repository.delete(id);
	}
}
