package com.devs.sdev.repositories;

import com.devs.sdev.entity.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Products, String> {
}
