package com.avenue.blog.cms.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.avenue.blog.cms.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

}
