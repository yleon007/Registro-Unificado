package com.ericsson.alodiga.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ocupacion database table.
 * 
 */
@Entity
@Table(name = "ocupacion")
@NamedQuery(name = "Ocupacion.findAll", query = "SELECT o FROM Ocupacion o")
public class Ocupacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ocupacionId;

	private String nombreAlternativo;

	private String nombre;

	public Ocupacion() {
	}

	public int getOcupacionId() {
		return this.ocupacionId;
	}

	public void setOcupacionId(int ocupacionId) {
		this.ocupacionId = ocupacionId;
	}

	public String getNombreAlternativo() {
		return nombreAlternativo;
	}

	public void setNombreAlternativo(String nombreAlternativo) {
		this.nombreAlternativo = nombreAlternativo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}