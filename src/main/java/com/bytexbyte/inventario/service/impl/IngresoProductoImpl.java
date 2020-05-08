package com.bytexbyte.inventario.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytexbyte.inventario.model.IngresoProducto;
import com.bytexbyte.inventario.repo.IIngresoProductoRepo;
import com.bytexbyte.inventario.service.IIngresoProductoService;

@Service
public class IngresoProductoImpl implements IIngresoProductoService{
	
	@Autowired
	private IIngresoProductoRepo IngresoProducto;

	@Override
	public IngresoProducto registrar(IngresoProducto obj) {
		return IngresoProducto.save(obj);
	}

	@Override
	public IngresoProducto modificar(IngresoProducto obj) {
		return IngresoProducto.save(obj);
	}

	@Override
	public List<IngresoProducto> listar() {
		return IngresoProducto.findAll();
	}

	@Override
	public IngresoProducto leerPorId(Integer id) {
		Optional<IngresoProducto> op = IngresoProducto.findById(id);
		return op.isPresent() ? op.get() : new IngresoProducto();
	}

	@Override
	public boolean eliminar(Integer id) {
		IngresoProducto.deleteById(id);
		return true;
	}

}
