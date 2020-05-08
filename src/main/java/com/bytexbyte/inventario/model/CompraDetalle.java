package com.bytexbyte.inventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Informacion de Compra Detalle")
@Entity
@Table(name = "tb_compras_detalle")
public class CompraDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcompradetalle;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "idcompra", nullable = false, foreignKey = @ForeignKey(name = "FK_compra_detalle"))
	private Compra compra;
	
	@ApiModelProperty(notes = "El Campo idprod no puede ser nulo")
	@NotNull(message = "El Campo idprod no puede estar vacio")
	@Column(name = "idprod", nullable = false)
	private Integer idprod;
	
	@ApiModelProperty(notes = "El Campo cantidad no puede ser nulo")
	@NotNull(message = "El Campo cantidad no puede estar vacio")
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;
	
	@ApiModelProperty(notes = "El Campo Precio Unitario no puede ser nulo")
	@NotNull(message = "El Campo Precio Unitario no puede estar vacio")
	@Column(name = "preuni", nullable = false, columnDefinition="numeric")
	private Float preuni;
	
	//@Column(name = "presubt", nullable = false,columnDefinition="Decimal(10,2) default '100.00'")
	//@Column(precision = 5, scale = 4)
	//@Type(type = "big_decimal")
	@ApiModelProperty(notes = "El Campo presubt no puede ser nulo")
	@NotNull(message = "El Campo presubt no puede estar vacio")
	@Column(name = "presubt", nullable = false, columnDefinition="numeric")
	private Float presubt;

	public Integer getIdcompradetalle() {
		return idcompradetalle;
	}

	public void setIdcompradetalle(Integer idcompradetalle) {
		this.idcompradetalle = idcompradetalle;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Integer getIdprod() {
		return idprod;
	}

	public void setIdprod(Integer idprod) {
		this.idprod = idprod;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Float getPreuni() {
		return preuni;
	}

	public void setPreuni(Float preuni) {
		this.preuni = preuni;
	}

	public Float getPresubt() {
		return presubt;
	}

	public void setPresubt(Float presubt) {
		this.presubt = presubt;
	}

}
