package com.bytexbyte.inventario.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytexbyte.inventario.model.Configuracion;

public interface IConfiguracionRepo extends JpaRepository<Configuracion, Integer>{

}
