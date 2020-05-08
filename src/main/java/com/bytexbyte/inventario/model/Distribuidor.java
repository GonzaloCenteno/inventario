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

@ApiModel(description = "Informacion de Distribuidor")
@Entity
@Table(name = "tb_distribuidores")
public class Distribuidor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddistrib;
	
	@ApiModelProperty(notes = "El Campo Tipo Documento debe tener maximo 30 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo Tipo Documento no puede estar vacio")
	@Size(max = 30, message = "El Campo Tipo Documento debe tener maximo 30 caracteres")
	@Column(name = "tipodoc", nullable = false, length = 30)
	private String tipodoc;
	
	@ApiModelProperty(notes = "El Campo nrodoc debe tener minimo 8 caracteres y maximo de 11, no puede ser nulo")
	@NotEmpty(message = "El Campo N° Documento no puede estar vacio")
	@Size(min = 8, max = 11, message = "El Campo N° Documento debe tener minimo 8 caracteres y un maximo de 11")
	@Column(name = "nrodoc", nullable = false, length = 11)
	private String nrodoc;
	
	@ApiModelProperty(notes = "El Campo nombre debe tener maximo 150 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo Nombre no puede estar vacio")
	@Size(max = 150, message = "El Campo Nombre debe tener maximo 150 caracteres")
	@Column(name = "nombre", nullable = false, length = 150)
	private String nombre;
	
	@ApiModelProperty(notes = "El Campo direccion debe tener maximo 150 caracteres")
	@Size(max = 150, message = "El Campo Direccion debe tener maximo 150 caracteres")
	@Column(name = "direccion", nullable = true, length = 150)
	private String direccion;
	
	@ApiModelProperty(notes = "El Campo perscontact debe tener maximo 150 caracteres, no puede ser nulo")
	@NotEmpty(message = "El Campo perscontact no puede estar vacio")
	@Size(max = 150, message = "El Campo perscontact debe tener maximo 150 caracteres")
	@Column(name = "perscontact", nullable = false, length = 150)
	private String perscontact;
	
	@ApiModelProperty(notes = "El Campo telefono debe tener maximo 15 caracteres")
	@Size(max = 15, message = "El Campo telefono debe tener maximo 15 caracteres")
	@Column(name = "telefono", nullable = true, length = 15)
	private String telefono;
	
	@ApiModelProperty(notes = "El Campo correo debe tener maximo 50 caracteres")
	@Size(max = 50, message = "El Campo correo debe tener maximo 50 caracteres")
	@Column(name = "correo", nullable = true, length = 50)
	private String correo;
	
	@ApiModelProperty(notes = "El Campo estado no puede ser nulo")
	@NotNull(message = "El Campo estado no puede estar vacio")
	@Column(name = "estado", nullable = false, length = 4)
	private Integer estado;

	public Integer getIddistrib() {
		return iddistrib;
	}

	public void setIddistrib(Integer iddistrib) {
		this.iddistrib = iddistrib;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}

	public String getNrodoc() {
		return nrodoc;
	}

	public void setNrodoc(String nrodoc) {
		this.nrodoc = nrodoc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPerscontact() {
		return perscontact;
	}

	public void setPerscontact(String perscontact) {
		this.perscontact = perscontact;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
