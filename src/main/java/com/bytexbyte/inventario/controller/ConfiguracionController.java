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
import com.bytexbyte.inventario.model.Configuracion;
import com.bytexbyte.inventario.service.IConfiguracionService;

@RestController
@RequestMapping("/configuraciones")
public class ConfiguracionController {
	
	@Autowired
	private IConfiguracionService configuracion;
	
	@GetMapping
	public ResponseEntity<List<Configuracion>> listar() {
		List<Configuracion> lista = configuracion.listar();
		return new ResponseEntity<List<Configuracion>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Configuracion> listarPorId(@PathVariable("id") Integer id) {
		Configuracion con = configuracion.leerPorId(id);
		if(con.getIdconfig() == null) {
			throw new ModeloNotFoundException("id no encontrado " + id);
		}
		return new ResponseEntity<Configuracion>(con, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Configuracion> registrar(@Valid @RequestBody Configuracion obj) {
		Configuracion dis = configuracion.registrar(obj);
		return new ResponseEntity<Configuracion>(dis, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Configuracion> modificar(@Valid @RequestBody Configuracion obj) {
		Configuracion con = configuracion.modificar(obj);
		return new ResponseEntity<Configuracion>(con, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id) {
		configuracion.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

}
