package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
@NamedQueries({
		@NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e"),
		@NamedQuery(name = "Estado.findByDescription", query = "Select e from Estado e where e.descripcion=:descripcion") })
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String ACTIVO = "ACTIVO";
	public static final String PENDIENTE = "PENDIENTE";
	public static final String BLOQUEADO = "BLOQUEADO";
	public static final String INACTIVO = "INACTIVO";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int estadoId;

	@Column(nullable = false, length = 50)
	private String descripcion;

	public Estado() {
	}

	public int getEstadoId() {
		return this.estadoId;
	}

	public void setEstadoId(int estadoId) {
		this.estadoId = estadoId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Estado [estadoId=" + estadoId + ", descripcion=" + descripcion + "]";
	}
}