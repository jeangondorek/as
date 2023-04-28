package com.devs.sdev.controllers;

import com.devs.sdev.entity.Cliente;
import com.devs.sdev.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository2;

    @GetMapping
    public List<Cliente> findAll(){
        List<Cliente> result = repository2.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public Cliente findById(@PathVariable Long id){
        Cliente result = repository2.findById(id).get();
        return result;
    }
    @PostMapping
    public Cliente insert(@RequestBody Cliente cliente){
        Cliente result = repository2.save(cliente);
        return result;
    }
}
