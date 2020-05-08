package com.bytexbyte.inventario.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytexbyte.inventario.model.Distribuidor;
import com.bytexbyte.inventario.repo.IDistribuidorRepo;
import com.bytexbyte.inventario.service.IDistribuidorService;

@Service
public class DistribuidorServiceImpl implements IDistribuidorService{
	
	@Autowired
	private IDistribuidorRepo distribuidor;

	@Override
	public Distribuidor registrar(Distribuidor obj) {
		return distribuidor.save(obj);
	}

	@Override
	public Distribuidor modificar(Distribuidor obj) {
		return distribuidor.save(obj);
	}

	@Override
	public List<Distribuidor> listar() {
		return distribuidor.findAll();
	}

	@Override
	public Distribuidor leerPorId(Integer id) {
		Optional<Distribuidor> op = distribuidor.findById(id);
		return op.isPresent() ? op.get() : new Distribuidor();
	}

	@Override
	public boolean eliminar(Integer id) {
		distribuidor.deleteById(id);
		return true;
	}

}
