package com.bytexbyte.inventario.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytexbyte.inventario.model.Producto;
import com.bytexbyte.inventario.repo.IProductoRepo;
import com.bytexbyte.inventario.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepo producto; 

	@Override
	public Producto registrar(Producto obj) {
		return producto.save(obj);
	}

	@Override
	public Producto modificar(Producto obj) {
		return producto.save(obj);
	}

	@Override
	public List<Producto> listar() {
		return producto.findAll();
	}

	@Override
	public Producto leerPorId(Integer id) {
		Optional<Producto> op = producto.findById(id);
		return op.isPresent() ? op.get() : new Producto();
	}

	@Override
	public boolean eliminar(Integer id) {
		producto.deleteById(id);
		return true;
	}

}
