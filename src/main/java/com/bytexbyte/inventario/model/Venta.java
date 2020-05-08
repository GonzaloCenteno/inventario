package com.bytexbyte.inventario.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Informacion de Venta")
@Entity
@Table(name = "tb_ventas")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codventa;
	
	@ApiModelProperty(notes = "El Campo detalle no puede ser nulo")
	@NotNull(message = "El campo detalle no puede estar vacio")
	@OneToMany(mappedBy = "venta", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<VentaDetalle> ventadetalle;
	
	@ApiModelProperty(notes = "El Campo idcliente no puede ser nulo")
	@NotNull(message = "El campo idcliente no puede estar vacio")
	@Column(name = "idcliente", nullable = false)
	private Integer idcliente;
	
	@ApiModelProperty(notes = "El Campo fecha no puede ser nulo")
	@NotNull(message = "El campo fecha no puede estar vacio")
	@Column(name = "fecha", nullable = false)
	private Date fecha;
	
	@ApiModelProperty(notes = "El Campo idusuario no puede ser nulo")
	@NotNull(message = "El campo idusuario no puede estar vacio")
	@Column(name = "idusuario", nullable = false)
	private Integer idusuario;
	
	@ApiModelProperty(notes = "El Campo totcompra no puede ser nulo")
	@NotNull(message = "El Campo totcompra no puede estar vacio")
	@Column(name = "totcompra", nullable = false, columnDefinition="numeric")
	private Float totcompra;
	
	@ApiModelProperty(notes = "El Campo totventa no puede ser nulo")
	@NotNull(message = "El Campo totventa no puede estar vacio")
	@Column(name = "totventa", nullable = false, columnDefinition="numeric")
	private Float totventa;
	
	@ApiModelProperty(notes = "El Campo ganancia no puede ser nulo")
	@NotNull(message = "El Campo ganancia no puede estar vacio")
	@Column(name = "ganancia", nullable = false, columnDefinition="numeric")
	private Float ganancia;
	
	@ApiModelProperty(notes = "El Campo descuento no puede ser nulo")
	@NotNull(message = "El Campo descuento no puede estar vacio")
	@Column(name = "descuento", nullable = false, columnDefinition="numeric")
	private Float descuento;
	
	@ApiModelProperty(notes = "El Campo saldo no puede ser nulo")
	@NotNull(message = "El Campo saldo no puede estar vacio")
	@Column(name = "saldo", nullable = false, columnDefinition="numeric")
	private Float saldo;
	
	@ApiModelProperty(notes = "El campo nota Serie debe tener maximo 200 caracteres, no puede ser nulo")
	@NotEmpty(message = "El campo nota no puede estar vacio")
	@Size(max = 200, message = "El campo nota debe tener maximo 200 caracteres")
	@Column(name = "nota", nullable = false, length = 200)
	private String nota;
	
	@ApiModelProperty(notes = "El Campo metpago1 no puede ser nulo")
	@NotNull(message = "El Campo metpago1 no puede estar vacio")
	@Column(name = "metpago1", nullable = false)
	private Integer metpago1;
	
	@ApiModelProperty(notes = "El Campo montpago1 no puede ser nulo")
	@NotNull(message = "El Campo montpago1 no puede estar vacio")
	@Column(name = "montpago1", nullable = false, columnDefinition="numeric")
	private Float montpago1;
	
	@ApiModelProperty(notes = "El Campo metpago2 no puede ser nulo")
	@NotNull(message = "El Campo metpago2 no puede estar vacio")
	@Column(name = "metpago2", nullable = false)
	private Integer metpago2;
	
	@ApiModelProperty(notes = "El Campo montpago2 no puede ser nulo")
	@NotNull(message = "El Campo montpago2 no puede estar vacio")
	@Column(name = "montpago2", nullable = false, columnDefinition="numeric")
	private Float montpago2;
	
	@ApiModelProperty(notes = "El Campo estado no puede ser nulo")
	@NotNull(message = "El Campo estado no puede estar vacio")
	@Column(name = "estado", nullable = false)
	private Integer estado;

	public Integer getCodventa() {
		return codventa;
	}

	public void setCodventa(Integer codventa) {
		this.codventa = codventa;
	}

	public List<VentaDetalle> getVentadetalle() {
		return ventadetalle;
	}

	public void setVentadetalle(List<VentaDetalle> ventadetalle) {
		this.ventadetalle = ventadetalle;
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public Float getTotcompra() {
		return totcompra;
	}

	public void setTotcompra(Float totcompra) {
		this.totcompra = totcompra;
	}

	public Float getTotventa() {
		return totventa;
	}

	public void setTotventa(Float totventa) {
		this.totventa = totventa;
	}

	public Float getGanancia() {
		return ganancia;
	}

	public void setGanancia(Float ganancia) {
		this.ganancia = ganancia;
	}

	public Float getDescuento() {
		return descuento;
	}

	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public Integer getMetpago1() {
		return metpago1;
	}

	public void setMetpago1(Integer metpago1) {
		this.metpago1 = metpago1;
	}

	public Float getMontpago1() {
		return montpago1;
	}

	public void setMontpago1(Float montpago1) {
		this.montpago1 = montpago1;
	}

	public Integer getMetpago2() {
		return metpago2;
	}

	public void setMetpago2(Integer metpago2) {
		this.metpago2 = metpago2;
	}

	public Float getMontpago2() {
		return montpago2;
	}

	public void setMontpago2(Float montpago2) {
		this.montpago2 = montpago2;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
}
