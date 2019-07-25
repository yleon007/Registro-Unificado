package com.ericsson.alodiga.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tipoDocumento")
@NamedQuery(name = "TipoDocumento.findAll", query = "SELECT t FROM TipoDocumento t")
public class TipoDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tipoDocumentoId;

	private String nombre;

	public TipoDocumento() {
	}

	public int getTipoDocumentoId() {
		return this.tipoDocumentoId;
	}

	public void setTipoDocumentoId(int tipoDocumentoId) {
		this.tipoDocumentoId = tipoDocumentoId;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}