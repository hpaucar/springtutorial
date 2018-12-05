package com.midominio.ua.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.midominio.ua.models.entity.Cliente;


public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
