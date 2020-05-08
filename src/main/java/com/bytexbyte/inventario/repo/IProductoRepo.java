package com.bytexbyte.inventario.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytexbyte.inventario.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer>{

}
