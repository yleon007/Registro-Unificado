package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "accion")
@NamedQuery(name = "Accion.byDescripcion", query = "SELECT a FROM Accion a where a.descripcion = :descripcion")
public class Accion implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String LOGIN = "LOGIN";
	public static final String LOGOUT = "LOGOUT";
	public static final String INTENTO_FALLIDO = "INTENTO_FALLIDO";

	public Accion() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int accionId;

	@Column(nullable = false, length = 50)
	private String descripcion;

	public int getAccionId() {
		return this.accionId;
	}

	public void setAccionId(int accionId) {
		this.accionId = accionId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}