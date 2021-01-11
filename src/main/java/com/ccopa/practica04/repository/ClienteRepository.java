package com.ccopa.practica04.repository;

import com.ccopa.practica04.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
