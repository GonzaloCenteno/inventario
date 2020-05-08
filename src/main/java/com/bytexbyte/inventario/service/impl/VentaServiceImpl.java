package com.bytexbyte.inventario.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bytexbyte.inventario.model.Venta;
import com.bytexbyte.inventario.repo.IVentaRepo;
import com.bytexbyte.inventario.service.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService{
	
	@Autowired
	private IVentaRepo venta;
	
	@Transactional
	@Override
	public Venta registrar(Venta obj) {
		obj.getVentadetalle().forEach(detalle -> {
			detalle.setVenta(obj);
		});
		return venta.save(obj);
	}

	@Override
	public Venta modificar(Venta obj) {
		return venta.save(obj);
	}

	@Override
	public List<Venta> listar() {
		return venta.findAll();
	}

	@Override
	public Venta leerPorId(Integer id) {
		Optional<Venta> op = venta.findById(id);
		return op.isPresent() ? op.get() : new Venta();
	}

	@Override
	public boolean eliminar(Integer id) {
		venta.deleteById(id);
		return true;
	}

}
