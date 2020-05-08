package com.bytexbyte.inventario.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytexbyte.inventario.model.IngresoProducto;

public interface IIngresoProductoRepo extends JpaRepository<IngresoProducto, Integer>{

}
