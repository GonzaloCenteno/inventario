package com.bytexbyte.inventario.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytexbyte.inventario.model.Cliente;
import com.bytexbyte.inventario.repo.IClienteRepo;
import com.bytexbyte.inventario.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteRepo cliente;

	@Override
	public Cliente registrar(Cliente obj) {
		return cliente.save(obj);
	}

	@Override
	public Cliente modificar(Cliente obj) {
		return cliente.save(obj);
	}

	@Override
	public List<Cliente> listar() {
		return cliente.findAll();
	}

	@Override
	public Cliente leerPorId(Integer id) {
		Optional<Cliente> op = cliente.findById(id);
		return op.isPresent() ? op.get() : new Cliente();
	}

	@Override
	public boolean eliminar(Integer id) {
		cliente.deleteById(id);
		return true;
	}

}
