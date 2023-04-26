package com.devs.sdev.repositories;

import com.devs.sdev.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Products, Long> {
}
