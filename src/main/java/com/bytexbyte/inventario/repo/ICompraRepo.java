package com.bytexbyte.inventario.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytexbyte.inventario.model.Compra;

public interface ICompraRepo extends JpaRepository<Compra, Integer>{

}
