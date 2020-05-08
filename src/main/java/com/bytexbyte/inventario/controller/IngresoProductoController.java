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
import com.bytexbyte.inventario.model.IngresoProducto;
import com.bytexbyte.inventario.service.IIngresoProductoService;

@RestController
@RequestMapping("/ingreso_producto")
public class IngresoProductoController {
	
	@Autowired
	private IIngresoProductoService ingreso;
	
	@GetMapping
	public ResponseEntity<List<IngresoProducto>> listar() {
		List<IngresoProducto> lista = ingreso.listar();
		return new ResponseEntity<List<IngresoProducto>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<IngresoProducto> listarPorId(@PathVariable("id") Integer id) {
		IngresoProducto ing = ingreso.leerPorId(id);
		if(ing.getCoding() == null) {
			throw new ModeloNotFoundException("id no encontrado " + id);
		}
		return new ResponseEntity<IngresoProducto>(ing, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<IngresoProducto> registrar(@Valid @RequestBody IngresoProducto obj) {
		IngresoProducto dis = ingreso.registrar(obj);
		return new ResponseEntity<IngresoProducto>(dis, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<IngresoProducto> modificar(@Valid @RequestBody IngresoProducto obj) {
		IngresoProducto con = ingreso.modificar(obj);
		return new ResponseEntity<IngresoProducto>(con, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id) {
		ingreso.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

}
