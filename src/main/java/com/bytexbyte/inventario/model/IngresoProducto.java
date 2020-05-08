package com.bytexbyte.inventario.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Informacion de Ingreso Producto")
@Entity
@Table(name = "tb_ingreso_productos")
public class IngresoProducto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer coding;
	
	@ApiModelProperty(notes = "El Campo codproducto no puede ser nulo")
	@NotNull(message = "Es necesario agregar un Producto")
	@OneToOne
	@JoinColumn(name = "codproducto", nullable = false, foreignKey = @ForeignKey(name = "FK_ingreso_producto"))
	private Producto codproducto;
	
	@ApiModelProperty(notes = "El Campo cantidad no puede ser nulo")
	@NotNull(message = "El campo cantidad no puede estar vacio")
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;
	
	@ApiModelProperty(notes = "El Campo preciocoold no puede ser nulo")
	@NotNull(message = "El campo preciocoold no puede estar vacio")
	@Column(name = "preciocoold", nullable = false, columnDefinition="numeric")
	private Float preciocoold;
	
	@ApiModelProperty(notes = "El Campo precioveold no puede ser nulo")
	@NotNull(message = "El campo precioveold no puede estar vacio")
	@Column(name = "precioveold", nullable = false, columnDefinition="numeric")
	private Float precioveold;
	
	@ApiModelProperty(notes = "El Campo precioconew no puede ser nulo")
	@NotNull(message = "El campo precioconew no puede estar vacio")
	@Column(name = "precioconew", nullable = false, columnDefinition="numeric")
	private Float precioconew;
	
	@ApiModelProperty(notes = "El Campo preciovenew no puede ser nulo")
	@NotNull(message = "El campo preciovenew no puede estar vacio")
	@Column(name = "preciovenew", nullable = false, columnDefinition="numeric")
	private Float preciovenew;
	
	@ApiModelProperty(notes = "El campo nombreusu Serie debe tener maximo 50 caracteres, no puede ser nulo")
	@NotEmpty(message = "El campo nombreusu no puede estar vacio")
	@Size(max = 50, message = "El campo nombreusu debe tener maximo 50 caracteres")
	@Column(name = "nombreusu", nullable = false, length = 50)
	private String nombreusu;
	
	@ApiModelProperty(notes = "El campo fecha ingreso no puede ser nulo")
	@NotNull(message = "El campo fecha ingreso no puede estar vacio")
	@Column(name = "fechaingreso", nullable = false)
	private Date fechaingreso;

	public Integer getCoding() {
		return coding;
	}

	public void setCoding(Integer coding) {
		this.coding = coding;
	}

	public Producto getCodproducto() {
		return codproducto;
	}

	public void setCodproducto(Producto codproducto) {
		this.codproducto = codproducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Float getPreciocoold() {
		return preciocoold;
	}

	public void setPreciocoold(Float preciocoold) {
		this.preciocoold = preciocoold;
	}

	public Float getPrecioveold() {
		return precioveold;
	}

	public void setPrecioveold(Float precioveold) {
		this.precioveold = precioveold;
	}

	public Float getPrecioconew() {
		return precioconew;
	}

	public void setPrecioconew(Float precioconew) {
		this.precioconew = precioconew;
	}

	public Float getPreciovenew() {
		return preciovenew;
	}

	public void setPreciovenew(Float preciovenew) {
		this.preciovenew = preciovenew;
	}

	public String getNombreusu() {
		return nombreusu;
	}

	public void setNombreusu(String nombreusu) {
		this.nombreusu = nombreusu;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

}
