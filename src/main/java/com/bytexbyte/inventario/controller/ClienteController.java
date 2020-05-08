package com.bytexbyte.inventario.controller;

import java.net.URI;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bytexbyte.inventario.exception.ModeloNotFoundException;
import com.bytexbyte.inventario.model.Cliente;
import com.bytexbyte.inventario.service.IClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private IClienteService cliente;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listar() {
		List<Cliente> lista = cliente.listar();
		return new ResponseEntity<List<Cliente>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> listarPorId(@PathVariable("id") Integer id) {
		Cliente cli = cliente.leerPorId(id);
		if(cli.getIdcliente() == null) {
			throw new ModeloNotFoundException("id no encontrado " + id);
		}
		return new ResponseEntity<Cliente>(cli, HttpStatus.OK);
	}
	
	/*@PostMapping
	public ResponseEntity<Cliente> registrar(@Valid @RequestBody Cliente obj) {
		Cliente cli = cliente.registrar(obj);
		return new ResponseEntity<Cliente>(cli, HttpStatus.CREATED);
	}*/
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody Cliente obj) {
		Cliente cli = cliente.registrar(obj);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cli.getIdcliente()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<Cliente> modificar(@Valid @RequestBody Cliente obj) {
		Cliente cli = cliente.modificar(obj);
		return new ResponseEntity<Cliente>(cli, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id) {
		cliente.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

}
