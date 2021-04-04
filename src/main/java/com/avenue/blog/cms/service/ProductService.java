package com.avenue.blog.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.avenue.blog.cms.dao.ProductRepository;
import com.avenue.blog.cms.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly=true)
	public List<Product> listAll() {
		return repository.findAll();
	}

	@Transactional(readOnly = true)
	public Product read(String id) {
		return repository.findOne(id);
	}

	@Transactional
	public Product create(Product p) {
		if (p != null)
			return repository.insert(p);
		return null;
	}

	@Transactional
	public Product update(Product p) {
		if (p != null && repository.exists(p.getId()))
			return repository.save(p);
		return null;
	}

	@Transactional
	public void delete(String id) {
		if (repository.exists(id))
			repository.delete(id);
	}
}
