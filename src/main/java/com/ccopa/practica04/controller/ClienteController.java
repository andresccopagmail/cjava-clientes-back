package com.ccopa.practica04.controller;

import com.ccopa.practica04.model.Cliente;
import com.ccopa.practica04.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente findById(@PathVariable("id") Integer id){
        return clienteService.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@Valid @RequestBody Cliente cliente){
        clienteService.save(cliente);
    }

    @PutMapping(path = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable("id") Integer id, @Valid @RequestBody Cliente cliente){
        cliente.setId(id);
        clienteService.save(cliente);
    }

    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Integer id){
        clienteService.delete(id);
    }

}
