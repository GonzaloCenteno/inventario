package com.bytexbyte.inventario.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytexbyte.inventario.model.Compra;
import com.bytexbyte.inventario.service.ICompraService;

@RestController
@RequestMapping("/compras")
public class CompraController {
	
	@Autowired
	private ICompraService compraService;
	
	@PostMapping
	public ResponseEntity<Compra> registrar(@Valid @RequestBody Compra compra) {
		Compra com = compraService.registrar(compra);
		return new ResponseEntity<Compra>(com, HttpStatus.CREATED);
	}

}
