package com.bytexbyte.inventario.model;

import java.sql.Date;

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

@ApiModel(description = "Informacion de Producto")
@Entity
@Table(name = "tb_productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codproducto;
	
	@ApiModelProperty(notes = "El Campo codbarra debe tener maximo 100 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo codbarra no puede estar vacio")
	@Size(max = 100, message = "El Campo codbarra debe tener maximo 100 caracteres")
	@Column(name = "codbarra", nullable = false, length = 100)
	private String codbarra;
	
	@ApiModelProperty(notes = "El Campo producto debe tener maximo 200 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo producto no puede estar vacio")
	@Size(max = 200, message = "El Campo producto debe tener maximo 200 caracteres")
	@Column(name = "producto", nullable = false, length = 200)
	private String producto;
	
	@ApiModelProperty(notes = "El Campo detalles debe tener maximo 200 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo detalles no puede estar vacio")
	@Size(max = 200, message = "El Campo detalles debe tener maximo 200 caracteres")
	@Column(name = "detalles", nullable = false, length = 200)
	private String detalles;
	
	@ApiModelProperty(notes = "El Campo marca debe tener maximo 30 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo marca no puede estar vacio")
	@Size(max = 30, message = "El Campo marca debe tener maximo 30 caracteres")
	@Column(name = "marca", nullable = false, length = 30)
	private String marca;
	
	@ApiModelProperty(notes = "El Campo color debe tener maximo 30 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo color no puede estar vacio")
	@Size(max = 30, message = "El Campo color debe tener maximo 30 caracteres")
	@Column(name = "color", nullable = false, length = 30)
	private String color;
	
	@ApiModelProperty(notes = "El Campo lote debe tener maximo 50 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo lote no puede estar vacio")
	@Size(max = 50, message = "El Campo lote debe tener maximo 50 caracteres")
	@Column(name = "lote", nullable = false, length = 50)
	private String lote;
	
	@ApiModelProperty(notes = "El Campo laboratorio debe tener maximo 50 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo laboratorio no puede estar vacio")
	@Size(max = 50, message = "El Campo laboratorio debe tener maximo 50 caracteres")
	@Column(name = "laboratorio", nullable = false, length = 50)
	private String laboratorio;
	
	@ApiModelProperty(notes = "El Campo unimedida debe tener maximo 30 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo unimedida no puede estar vacio")
	@Size(max = 30, message = "El Campo unimedida debe tener maximo 30 caracteres")
	@Column(name = "unimedida", nullable = false, length = 30)
	private String unimedida;
	
	@ApiModelProperty(notes = "El campo fecha vencimiento no puede ser nulo")
	@NotNull(message = "El campo fecha vencimiento no puede estar vacio")
	@Column(name = "fechavenc", nullable = false)
	private Date fechavenc;
	
	@ApiModelProperty(notes = "El Campo categoria debe tener maximo 30 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo categoria no puede estar vacio")
	@Size(max = 30, message = "El Campo categoria debe tener maximo 30 caracteres")
	@Column(name = "categoria", nullable = false, length = 30)
	private String categoria;
	
	@ApiModelProperty(notes = "El Campo almacen debe tener maximo 50 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo almacen no puede estar vacio")
	@Size(max = 50, message = "El Campo almacen debe tener maximo 50 caracteres")
	@Column(name = "almacen", nullable = false, length = 50)
	private String almacen;
	
	@ApiModelProperty(notes = "El Campo iddistrib no puede ser nulo")
	@NotNull(message = "El Campo iddistrib no puede estar vacio")
	@Column(name = "iddistrib", nullable = false)
	private Integer iddistrib;
	
	@ApiModelProperty(notes = "El Campo cantidad no puede ser nulo")
	@NotNull(message = "El Campo cantidad no puede estar vacio")
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;
	
	@ApiModelProperty(notes = "El Campo cantmin no puede ser nulo")
	@NotNull(message = "El Campo cantmin no puede estar vacio")
	@Column(name = "cantmin", nullable = false)
	private Integer cantmin;
	
	@ApiModelProperty(notes = "El Campo precioco no puede ser nulo")
	@NotNull(message = "El Campo precioco no puede estar vacio")
	@Column(name = "precioco", nullable = false, columnDefinition="numeric")
	private Float precioco;
	
	@ApiModelProperty(notes = "El Campo preciove no puede ser nulo")
	@NotNull(message = "El Campo preciove no puede estar vacio")
	@Column(name = "preciove", nullable = false, columnDefinition="numeric")
	private Float preciove;
	
	@ApiModelProperty(notes = "El Campo ptjganancia no puede ser nulo")
	@NotNull(message = "El Campo ptjganancia no puede estar vacio")
	@Column(name = "ptjganancia", nullable = false, columnDefinition="numeric")
	private Float ptjganancia;
	
	@ApiModelProperty(notes = "El Campo estado no puede ser nulo")
	@NotNull(message = "El Campo estado no puede estar vacio")
	@Column(name = "estado", nullable = false)
	private Integer estado;
	
	@ApiModelProperty(notes = "El Campo promo1 debe tener maximo 30 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo promo1 no puede estar vacio")
	@Size(max = 30, message = "El Campo promo1 debe tener maximo 30 caracteres")
	@Column(name = "promo1", nullable = false, length = 30)
	private String promo1;
	
	@ApiModelProperty(notes = "El Campo cantp1 no puede ser nulo")
	@NotNull(message = "El Campo cantp1 no puede estar vacio")
	@Column(name = "cantp1", nullable = false, columnDefinition="numeric")
	private Float cantp1;
	
	@ApiModelProperty(notes = "El Campo prep1 no puede ser nulo")
	@NotNull(message = "El Campo prep1 no puede estar vacio")
	@Column(name = "prep1", nullable = false, columnDefinition="numeric")
	private Float prep1;
	
	@ApiModelProperty(notes = "El Campo promo2 debe tener maximo 30 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo promo2 no puede estar vacio")
	@Size(max = 30, message = "El Campo promo2 debe tener maximo 30 caracteres")
	@Column(name = "promo2", nullable = false, length = 30)
	private String promo2;
	
	@ApiModelProperty(notes = "El Campo cantp2 no puede ser nulo")
	@NotNull(message = "El Campo cantp2 no puede estar vacio")
	@Column(name = "cantp2", nullable = false, columnDefinition="numeric")
	private Float cantp2;
	
	@ApiModelProperty(notes = "El Campo prep2 no puede ser nulo")
	@NotNull(message = "El Campo prep2 no puede estar vacio")
	@Column(name = "prep2", nullable = false, columnDefinition="numeric")
	private Float prep2;

	public Integer getCodproducto() {
		return codproducto;
	}

	public void setCodproducto(Integer codproducto) {
		this.codproducto = codproducto;
	}

	public String getCodbarra() {
		return codbarra;
	}

	public void setCodbarra(String codbarra) {
		this.codbarra = codbarra;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getUnimedida() {
		return unimedida;
	}

	public void setUnimedida(String unimedida) {
		this.unimedida = unimedida;
	}

	public Date getFechavenc() {
		return fechavenc;
	}

	public void setFechavenc(Date fechavenc) {
		this.fechavenc = fechavenc;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getAlmacen() {
		return almacen;
	}

	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}

	public Integer getIddistrib() {
		return iddistrib;
	}

	public void setIddistrib(Integer iddistrib) {
		this.iddistrib = iddistrib;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getCantmin() {
		return cantmin;
	}

	public void setCantmin(Integer cantmin) {
		this.cantmin = cantmin;
	}

	public Float getPrecioco() {
		return precioco;
	}

	public void setPrecioco(Float precioco) {
		this.precioco = precioco;
	}

	public Float getPreciove() {
		return preciove;
	}

	public void setPreciove(Float preciove) {
		this.preciove = preciove;
	}

	public Float getPtjganancia() {
		return ptjganancia;
	}

	public void setPtjganancia(Float ptjganancia) {
		this.ptjganancia = ptjganancia;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getPromo1() {
		return promo1;
	}

	public void setPromo1(String promo1) {
		this.promo1 = promo1;
	}

	public Float getCantp1() {
		return cantp1;
	}

	public void setCantp1(Float cantp1) {
		this.cantp1 = cantp1;
	}

	public Float getPrep1() {
		return prep1;
	}

	public void setPrep1(Float prep1) {
		this.prep1 = prep1;
	}

	public String getPromo2() {
		return promo2;
	}

	public void setPromo2(String promo2) {
		this.promo2 = promo2;
	}

	public Float getCantp2() {
		return cantp2;
	}

	public void setCantp2(Float cantp2) {
		this.cantp2 = cantp2;
	}

	public Float getPrep2() {
		return prep2;
	}

	public void setPrep2(Float prep2) {
		this.prep2 = prep2;
	}

}
