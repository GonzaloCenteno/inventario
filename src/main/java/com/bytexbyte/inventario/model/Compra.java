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

@ApiModel(description = "Informacion de Compra")
@Entity
@Table(name = "tb_compras")
public class Compra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcompra;
	
	@ApiModelProperty(notes = "El Detalle no puede ser nulo")
	@NotNull(message = "El Detalle no puede estar vacio")
	@OneToMany(mappedBy = "compra", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<CompraDetalle> compradetalle;
	
	@ApiModelProperty(notes = "El Campo Tipo Comprobante debe tener maximo 50 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo Tipo Comprobante no puede estar vacio")
	@Size(max = 50, message = "El Campo Tipo Comprobante debe tener maximo 50 caracteres")
	@Column(name = "tipcomprobante", nullable = false, length = 50)
	private String tipcomprobante;
	
	@ApiModelProperty(notes = "El Campo serie debe tener maximo 15 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo Serie no puede estar vacio")
	@Size(max = 15, message = "El Campo Serie debe tener maximo 15 caracteres")
	@Column(name = "serie", nullable = false, length = 15)
	private String serie;
	
	@ApiModelProperty(notes = "El Campo N° Serie debe tener maximo 20 caracteres, no puede ser nulo")
	@NotEmpty(message = "El campo N° Serie no puede estar vacio")
	@Size(max = 20, message = "El campo N° Serie debe tener maximo 20 caracteres")
	@Column(name = "nroserie", nullable = false, length = 20)
	private String nroserie;
	
	@ApiModelProperty(notes = "El Campo iddistrib no puede ser nulo")
	@NotNull(message = "El campo iddistrib no puede estar vacio")
	@Column(name = "iddistrib", nullable = false)
	private Integer iddistrib;
	
	@ApiModelProperty(notes = "El campo Moneda Serie debe tener maximo 20 caracteres, no puede ser nulo")
	@NotEmpty(message = "El campo Moneda no puede estar vacio")
	@Size(max = 20, message = "El campo Moneda debe tener maximo 20 caracteres")
	@Column(name = "moneda", nullable = false, length = 20)
	private String moneda;
	
	@ApiModelProperty(notes = "El campo tc debe tener maximo 20 caracteres, no puede ser nulo")
	@NotEmpty(message = "El campo tc no puede estar vacio")
	@Size(max = 20, message = "El campo tc debe tener maximo 20 caracteres")
	@Column(name = "tc", nullable = false, length = 20)
	private String tc;
	
	@ApiModelProperty(notes = "El campo Nota debe tener maximo 200 caracteres, no puede ser nulo")
	@NotEmpty(message = "El campo Nota no puede estar vacio")
	@Size(max = 200, message = "El campo Nota debe tener maximo 200 caracteres")
	@Column(name = "nota", nullable = false, length = 200)
	private String nota;
	
	@ApiModelProperty(notes = "El campo Metodo Pago debe tener maximo 50 caracteres, no puede ser nulo")
	@NotEmpty(message = "El campo Metodo Pago no puede estar vacio")
	@Size(max = 50, message = "El campo Metodo Pago debe tener maximo 50 caracteres")
	@Column(name = "metpago", nullable = false, length = 50)
	private String metpago;
	
	@ApiModelProperty(notes = "El campo fecha emision no puede ser nulo")
	@NotNull(message = "El campo fecha emision no puede estar vacio")
	@Column(name = "fechaemision", nullable = false)
	private Date fechaemision;
	
	@ApiModelProperty(notes = "El campo fecha vencimiento no puede ser nulo")
	@NotNull(message = "El campo fecha vencimiento no puede estar vacio")
	@Column(name = "fechavencimiento", nullable = false)
	private Date fechavencimiento;
	
	@ApiModelProperty(notes = "El campo idusuario no puede ser nulo")
	@NotNull(message = "El campo idusuario no puede estar vacio")
	@Column(name = "idusuario", nullable = false)
	private Integer idusuario;
	
	@ApiModelProperty(notes = "El campo tot no puede ser nulo")
	@NotNull(message = "El campo tot no puede estar vacio")
	@Column(name = "tot", nullable = false, columnDefinition="numeric")
	private Float tot;
	
	@ApiModelProperty(notes = "El campo pagado no puede ser nulo")
	@NotNull(message = "El campo pagado no puede estar vacio")
	@Column(name = "pagado", nullable = false, columnDefinition="numeric")
	private Float pagado;
	
	@ApiModelProperty(notes = "El campo saldo no puede ser nulo")
	@NotNull(message = "El campo saldo no puede estar vacio")
	@Column(name = "saldo", nullable = false, columnDefinition="numeric")
	private Float saldo;

	public Integer getIdcompra() {
		return idcompra;
	}

	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}

	public List<CompraDetalle> getCompradetalle() {
		return compradetalle;
	}

	public void setCompradetalle(List<CompraDetalle> compradetalle) {
		this.compradetalle = compradetalle;
	}

	public String getTipcomprobante() {
		return tipcomprobante;
	}

	public void setTipcomprobante(String tipcomprobante) {
		this.tipcomprobante = tipcomprobante;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNroserie() {
		return nroserie;
	}

	public void setNroserie(String nroserie) {
		this.nroserie = nroserie;
	}

	public Integer getIddistrib() {
		return iddistrib;
	}

	public void setIddistrib(Integer iddistrib) {
		this.iddistrib = iddistrib;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getMetpago() {
		return metpago;
	}

	public void setMetpago(String metpago) {
		this.metpago = metpago;
	}

	public Date getFechaemision() {
		return fechaemision;
	}

	public void setFechaemision(Date fechaemision) {
		this.fechaemision = fechaemision;
	}

	public Date getFechavencimiento() {
		return fechavencimiento;
	}

	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public Float getTot() {
		return tot;
	}

	public void setTot(Float tot) {
		this.tot = tot;
	}

	public Float getPagado() {
		return pagado;
	}

	public void setPagado(Float pagado) {
		this.pagado = pagado;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	
}
