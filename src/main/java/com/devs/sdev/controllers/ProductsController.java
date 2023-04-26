package com.devs.sdev.controllers;

import com.devs.sdev.entity.Products;
import com.devs.sdev.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {

    @Autowired
    private ProductRepo repository;

    @GetMapping
    public List<Products> findAll(){
        List<Products> result = repository.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public Products findById(@PathVariable Long id){
        Products result = repository.findById(id).get();
        return result;
    }
    @PostMapping
    public Products insert(@RequestBody Products product){
        Products result = repository.save(product);
        return result;
    }
}
