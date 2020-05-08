package com.bytexbyte.inventario.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytexbyte.inventario.model.Configuracion;
import com.bytexbyte.inventario.repo.IConfiguracionRepo;
import com.bytexbyte.inventario.service.IConfiguracionService;

@Service
public class ConfiguracionServiceImpl implements IConfiguracionService{
	
	@Autowired
	private IConfiguracionRepo repo;

	@Override
	public Configuracion registrar(Configuracion obj) {
		return repo.save(obj);
	}

	@Override
	public Configuracion modificar(Configuracion obj) {
		return repo.save(obj);
	}

	@Override
	public List<Configuracion> listar() {
		return repo.findAll();
	}

	@Override
	public Configuracion leerPorId(Integer id) {
		Optional<Configuracion> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Configuracion();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
