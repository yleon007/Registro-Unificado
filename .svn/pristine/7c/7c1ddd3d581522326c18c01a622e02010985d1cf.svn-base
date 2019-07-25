package com.ericsson.alodiga.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "perfilAloPos")
@NamedQuery(name = "PerfilAloPos.findAll", query = "SELECT p FROM PerfilAloPos p")
public class PerfilAloPos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int perfilAloPosId;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "empresaId")
	private Empresa empresa;
	
	@Column
	private String tipoPersona;
	
	//@XmlElement(name = "fechaVencimientoDocumento")
	@Temporal(TemporalType.DATE)
	private Date fechaVencimientoDocumento;

	public Date getFechaVencimientoDocumento() {
		return fechaVencimientoDocumento;
	}

	public void setFechaVencimientoDocumento(Date fechaVencimientoDocumento) {
		this.fechaVencimientoDocumento = fechaVencimientoDocumento;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public PerfilAloPos() {
	}

	public int getPerfilAloPosId() {
		return this.perfilAloPosId;
	}

	public void setPerfilAloPosId(int perfilAloPosId) {
		this.perfilAloPosId = perfilAloPosId;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	

}