package com.devs.sdev.controllers;

import com.devs.sdev.entity.User;
import com.devs.sdev.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable String id){
        User result = repository.findById(id).orElse(null);
        return result;
    }

    @PostMapping
    public User insert(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }

    @PutMapping(value = "/{id}")
    public User update(@PathVariable String id, @RequestBody User user){
        User result = repository.save(user);
        return result;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable String id){
        repository.deleteById(id);
    }
}
