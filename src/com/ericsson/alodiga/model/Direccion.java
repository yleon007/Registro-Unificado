package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the direccion database table.
 * 
 */
@Entity
@Table(name = "direccion")
@NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d")
public class Direccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int direccionId;

	private int ciudadId;

	@Column(length = 20)
	private String codigoPostal;

	@Column(length = 200)
	private String direccion;

	private int estadoId;

	private int paisId;

	private int condadoId;

	public Direccion() {
	}

	public int getDireccionId() {
		return this.direccionId;
	}

	public void setDireccionId(int direccionId) {
		this.direccionId = direccionId;
	}

	public int getCiudadId() {
		return this.ciudadId;
	}

	public void setCiudadId(int ciudadId) {
		this.ciudadId = ciudadId;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEstadoId() {
		return this.estadoId;
	}

	public void setEstadoId(int estadoId) {
		this.estadoId = estadoId;
	}

	public int getPaisId() {
		return this.paisId;
	}

	public void setPaisId(int paisId) {
		this.paisId = paisId;
	}

	@Override
	public String toString() {
		return "Direccion [direccionId=" + direccionId + ", ciudadId="
				+ ciudadId + ", condadoId=" + condadoId + ", codigoPostal="
				+ codigoPostal + ", direccion=" + direccion + ", estadoId="
				+ estadoId + ", paisId=" + paisId + "]";
	}

	public int getCondadoId() {
		return condadoId;
	}

	public void setCondadoId(int condadoId) {
		this.condadoId = condadoId;
	}

}