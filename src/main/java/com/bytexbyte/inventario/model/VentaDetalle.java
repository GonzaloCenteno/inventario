package com.bytexbyte.inventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "tb_ventas_detalle")
public class VentaDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idventadetalle;
	
	@ApiModelProperty(notes = "El Campo Codigo Producto no puede ser nulo")
	@NotNull(message = "El campo Codigo Producto no puede estar vacio")
	@OneToOne
	@JoinColumn(name = "codproducto", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_detalle"))
	private Producto codproducto;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "codventa", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_detalle"))
	private Venta venta;
	
	@ApiModelProperty(notes = "El Campo cantidad no puede ser nulo")
	@NotNull(message = "El campo cantidad no puede estar vacio")
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;
	
	@ApiModelProperty(notes = "El Campo prevesdind no puede ser nulo")
	@NotNull(message = "El campo prevesdind no puede estar vacio")
	@Column(name = "prevesdind", nullable = false, columnDefinition="numeric")
	private Float prevesdind;
	
	@ApiModelProperty(notes = "El Campo prevesdtot no puede ser nulo")
	@NotNull(message = "El campo prevesdtot no puede estar vacio")
	@Column(name = "prevesdtot", nullable = false, columnDefinition="numeric")
	private Float prevesdtot;
	
	@ApiModelProperty(notes = "El Campo descindiv no puede ser nulo")
	@NotNull(message = "El campo descindiv no puede estar vacio")
	@Column(name = "descindiv", nullable = false, columnDefinition="numeric")
	private Float descindiv;
	
	@ApiModelProperty(notes = "El Campo desctotal no puede ser nulo")
	@NotNull(message = "El campo desctotal no puede estar vacio")
	@Column(name = "desctotal", nullable = false, columnDefinition="numeric")
	private Float desctotal;
	
	@ApiModelProperty(notes = "El Campo subtotal no puede ser nulo")
	@NotNull(message = "El campo subtotal no puede estar vacio")
	@Column(name = "subtotal", nullable = false, columnDefinition="numeric")
	private Float subtotal;
	
	@ApiModelProperty(notes = "El Campo ganancia no puede ser nulo")
	@NotNull(message = "El campo ganancia no puede estar vacio")
	@Column(name = "ganancia", nullable = false, columnDefinition="numeric")
	private Float ganancia;
	
	@ApiModelProperty(notes = "El Campo nota debe tener maximo 30 caracteres, no puede ser nulo")
	@NotEmpty(message = "El campo nota no puede estar vacio")
	@Size(max = 30, message = "El campo nota debe tener maximo 30 caracteres")
	@Column(name = "nota", nullable = false, length = 30)
	private String umedidausada;

	public Integer getIdventadetalle() {
		return idventadetalle;
	}

	public void setIdventadetalle(Integer idventadetalle) {
		this.idventadetalle = idventadetalle;
	}

	public Producto getCodproducto() {
		return codproducto;
	}

	public void setCodproducto(Producto codproducto) {
		this.codproducto = codproducto;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Float getPrevesdind() {
		return prevesdind;
	}

	public void setPrevesdind(Float prevesdind) {
		this.prevesdind = prevesdind;
	}

	public Float getPrevesdtot() {
		return prevesdtot;
	}

	public void setPrevesdtot(Float prevesdtot) {
		this.prevesdtot = prevesdtot;
	}

	public Float getDescindiv() {
		return descindiv;
	}

	public void setDescindiv(Float descindiv) {
		this.descindiv = descindiv;
	}

	public Float getDesctotal() {
		return desctotal;
	}

	public void setDesctotal(Float desctotal) {
		this.desctotal = desctotal;
	}

	public Float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}

	public Float getGanancia() {
		return ganancia;
	}

	public void setGanancia(Float ganancia) {
		this.ganancia = ganancia;
	}

	public String getUmedidausada() {
		return umedidausada;
	}

	public void setUmedidausada(String umedidausada) {
		this.umedidausada = umedidausada;
	}

}
