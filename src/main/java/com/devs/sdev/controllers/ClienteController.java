package com.devs.sdev.controllers;

import com.devs.sdev.entity.Cliente;
import com.devs.sdev.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

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
    public Cliente inserirCliente(@RequestBody Cliente cliente) {
        Cliente novoCliente = repository2.save(cliente);
        return novoCliente;
    }
    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
        Optional<Cliente> clienteExistente = repository2.findById(id);
        if(clienteExistente.isPresent()) {
            Cliente cliente = clienteExistente.get();
            cliente.setName(clienteAtualizado.getName());
            cliente.setCpf(clienteAtualizado.getCpf());
            cliente.setId(clienteAtualizado.getId());
            repository2.save(cliente);
            return cliente;
        }
        throw new RuntimeException("Cliente não encontrado com o ID: " + id);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        Optional<Cliente> clienteExistente = repository2.findById(id);
        if(clienteExistente.isPresent()) {
            repository2.deleteById(id);
        }
        else {
            throw new RuntimeException("Cliente não encontrado com o ID: " + id);
        }
    }
}
