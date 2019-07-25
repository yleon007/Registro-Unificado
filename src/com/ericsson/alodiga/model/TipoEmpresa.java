package com.ericsson.alodiga.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tipoEmpresa")
@NamedQuery(name = "TipoEmpresa.findAll", query = "SELECT t FROM TipoEmpresa t")
public class TipoEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tipoEmpresaId;

	private String idioma;

	private String nombre;

	public TipoEmpresa() {
	}

	public int getTipoEmpresaId() {
		return this.tipoEmpresaId;
	}

	public void setTipoEmpresaId(int tipoEmpresaId) {
		this.tipoEmpresaId = tipoEmpresaId;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}