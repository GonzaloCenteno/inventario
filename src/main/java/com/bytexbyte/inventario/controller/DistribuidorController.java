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
import com.bytexbyte.inventario.model.Distribuidor;
import com.bytexbyte.inventario.service.IDistribuidorService;

@RestController
@RequestMapping("/distribuidores")
public class DistribuidorController {
	
	@Autowired
	private IDistribuidorService distribuidor;
	
	@GetMapping
	public ResponseEntity<List<Distribuidor>> listar() {
		List<Distribuidor> lista = distribuidor.listar();
		return new ResponseEntity<List<Distribuidor>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Distribuidor> listarPorId(@PathVariable("id") Integer id) {
		Distribuidor dis = distribuidor.leerPorId(id);
		if(dis.getIddistrib() == null) {
			throw new ModeloNotFoundException("id no encontrado " + id);
		}
		return new ResponseEntity<Distribuidor>(dis, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Distribuidor> registrar(@Valid @RequestBody Distribuidor obj) {
		Distribuidor dis = distribuidor.registrar(obj);
		return new ResponseEntity<Distribuidor>(dis, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Distribuidor> modificar(@Valid @RequestBody Distribuidor obj) {
		Distribuidor con = distribuidor.modificar(obj);
		return new ResponseEntity<Distribuidor>(con, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id) {
		distribuidor.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

}
