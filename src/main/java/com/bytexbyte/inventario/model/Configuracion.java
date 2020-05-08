package com.bytexbyte.inventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Informacion de Configuracion")
@Entity
@Table(name = "tb_configuraciones")
public class Configuracion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idconfig;
	
	@ApiModelProperty(notes = "El Campo atributosprod debe tener maximo 200 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo atributosprod no puede estar vacio")
	@Size(max = 200, message = "El Campo atributosprod debe tener maximo 200 caracteres")
	@Column(name = "atributosprod", nullable = false, length = 200)
	private String atributosprod;
	
	@ApiModelProperty(notes = "El Campo venta sin stock no puede ser nulo")
	@NotNull(message = "El Campo venta sin stock no puede estar vacio")
	@Column(name = "ventasinstock", nullable = false, length = 4)
	private Integer ventasinstock;
	
	@ApiModelProperty(notes = "El Campo reducir stock no puede ser nulo")
	@NotNull(message = "El Campo reducir stock no puede estar vacio")
	@Column(name = "reducirstock", nullable = false, length = 4)
	private Integer reducirstock;
	
	@ApiModelProperty(notes = "El Campo fechavauto no puede ser nulo")
	@NotNull(message = "El Campo fechavauto no puede estar vacio")
	@Column(name = "fechavauto", nullable = false, length = 4)
	private Integer fechavauto;

	public Integer getIdconfig() {
		return idconfig;
	}

	public void setIdconfig(Integer idconfig) {
		this.idconfig = idconfig;
	}

	public String getAtributosprod() {
		return atributosprod;
	}

	public void setAtributosprod(String atributosprod) {
		this.atributosprod = atributosprod;
	}

	public Integer getVentasinstock() {
		return ventasinstock;
	}

	public void setVentasinstock(Integer ventasinstock) {
		this.ventasinstock = ventasinstock;
	}

	public Integer getReducirstock() {
		return reducirstock;
	}

	public void setReducirstock(Integer reducirstock) {
		this.reducirstock = reducirstock;
	}

	public Integer getFechavauto() {
		return fechavauto;
	}

	public void setFechavauto(Integer fechavauto) {
		this.fechavauto = fechavauto;
	}

}
