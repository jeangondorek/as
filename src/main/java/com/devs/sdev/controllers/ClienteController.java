package com.devs.sdev.controllers;

import com.devs.sdev.entity.Cliente;
import com.devs.sdev.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> findAll(){
        List<Cliente> result = repository.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public Cliente findById(@PathVariable String id){
        Cliente result = repository.findById(id).get();
        return result;
    }
    @PostMapping
    public Cliente inserirCliente(@RequestBody Cliente cliente) {
        Cliente novoCliente = repository.save(cliente);
        return novoCliente;
    }
    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable String id, @RequestBody Cliente clienteAtualizado) {
        Optional<Cliente> clienteExistente = repository.findById(id);
        if(clienteExistente.isPresent()) {
            Cliente cliente = clienteExistente.get();
            cliente.setNome(clienteAtualizado.getNome());
            cliente.setEmail(clienteAtualizado.getEmail());
            cliente.setId(clienteAtualizado.getId());
            repository.save(cliente);
            return cliente;
        }
        throw new RuntimeException("Cliente não encontrado com o ID: " + id);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable String id) {
        Optional<Cliente> clienteExistente = repository.findById(id);
        if(clienteExistente.isPresent()) {
            repository.deleteById(id);
        }
        else {
            throw new RuntimeException("Cliente não encontrado com o ID: " + id);
        }
    }
}
