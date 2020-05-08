package com.bytexbyte.inventario.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytexbyte.inventario.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer>{

}
