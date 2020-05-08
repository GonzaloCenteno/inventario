package com.bytexbyte.inventario.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytexbyte.inventario.model.Venta;

public interface IVentaRepo extends JpaRepository<Venta, Integer>{

}
