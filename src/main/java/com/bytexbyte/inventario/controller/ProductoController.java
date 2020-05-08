package com.bytexbyte.inventario.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytexbyte.inventario.exception.ModeloNotFoundException;
import com.bytexbyte.inventario.model.Producto;
import com.bytexbyte.inventario.service.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService producto;
	
	@GetMapping
	public ResponseEntity<List<Producto>> listar() {
		List<Producto> lista = producto.listar();
		return new ResponseEntity<List<Producto>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Producto> listarPorId(@PathVariable("id") Integer id) {
		Producto pro = producto.leerPorId(id);
		if(pro.getCodproducto() == null) {
			throw new ModeloNotFoundException("id no encontrado " + id);
		}
		return new ResponseEntity<Producto>(pro, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Producto> registrar(@Valid @RequestBody Producto obj) {
		Producto dis = producto.registrar(obj);
		return new ResponseEntity<Producto>(dis, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Producto> modificar(@Valid @RequestBody Producto obj) {
		Producto con = producto.modificar(obj);
		return new ResponseEntity<Producto>(con, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id) {
		producto.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

}
