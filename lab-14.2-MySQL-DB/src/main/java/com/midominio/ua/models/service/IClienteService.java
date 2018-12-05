package com.midominio.ua.models.service;

import java.util.List;

import com.midominio.ua.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);
}
