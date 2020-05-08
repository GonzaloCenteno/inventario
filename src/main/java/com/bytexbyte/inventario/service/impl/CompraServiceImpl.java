package com.bytexbyte.inventario.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bytexbyte.inventario.model.Compra;
import com.bytexbyte.inventario.repo.ICompraRepo;
import com.bytexbyte.inventario.service.ICompraService;

@Service
public class CompraServiceImpl implements ICompraService{
	
	@Autowired
	private ICompraRepo compra;
	
	@Transactional
	@Override
	public Compra registrar(Compra obj) {
		obj.getCompradetalle().forEach(detalle -> {
			detalle.setCompra(obj);
		});
		return compra.save(obj);
	}

	@Override
	public Compra modificar(Compra obj) {
		return compra.save(obj);
	}

	@Override
	public List<Compra> listar() {
		return compra.findAll();
	}

	@Override
	public Compra leerPorId(Integer id) {
		Optional<Compra> op = compra.findById(id);
		return op.isPresent() ? op.get() : new Compra();
	}

	@Override
	public boolean eliminar(Integer id) {
		compra.deleteById(id);
		return true;
	}

}
