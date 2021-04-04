package com.avenue.blog.cms.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.avenue.blog.cms.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
