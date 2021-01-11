package com.ccopa.practica04.service;

import com.ccopa.practica04.model.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> findAll();

    Cliente findById(Integer id);

    void save(Cliente cliente);

    void delete(Integer id);

}
