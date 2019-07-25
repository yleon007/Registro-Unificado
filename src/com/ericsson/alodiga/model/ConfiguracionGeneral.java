package com.ericsson.alodiga.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the ConfiguracionGeneral database table.
 * 
 */
@XmlRootElement(name = "ConfiguracionGeneral")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "configuracion_general")
@NamedQueries({ @NamedQuery(name = "configuracionGeneral.findAll", query = "SELECT cg FROM ConfiguracionGeneral cg"),
		@NamedQuery(name = "getConfiguracionGeneralByNombre", query = "SELECT cg FROM ConfiguracionGeneral cg WHERE cg.nombreConfiguracion = :nombreConfiguracion") })
public class ConfiguracionGeneral implements Serializable {

	private static final long serialVersionUID = 5968862638445930460L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlElement(name = "configuracionGeneralId")
	@Column(name = "configuracion_general_id", unique = true, nullable = false)
	private int configuracionGeneralId;

	@XmlElement(name = "nombreConfiguracion")
	@Column(name = "nombre_configuracion")
	private String nombreConfiguracion;

	@XmlElement(name = "valorConfiguracion")
	@Column(name = "valor_configuracion")
	private String valorConfiguracion;

	@XmlElement(name = "creadoEl")
	@Column(name = "creado_el")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creadoEl;

	@XmlElement(name = "creadoPor")
	@Column(name = "creado_por")
	private String creadoPor;

	@XmlElement(name = "modifadoEl")
	@Column(name = "modificado_el")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificadoEl;

	@XmlElement(name = "modificadoPor")
	@Column(name = "modificado_por")
	private String modificadoPor;

	public ConfiguracionGeneral() {
	}

	public String getNombreConfiguracion() {
		return nombreConfiguracion;
	}

	public void setNombreConfiguracion(String nombreConfiguracion) {
		this.nombreConfiguracion = nombreConfiguracion;
	}

	public String getValorConfiguracion() {
		return valorConfiguracion;
	}

	public void setValorConfiguracion(String valorConfiguracion) {
		this.valorConfiguracion = valorConfiguracion;
	}

	public Date getCreadoEl() {
		return creadoEl;
	}

	public void setCreadoEl(Date creadoEl) {
		this.creadoEl = creadoEl;
	}

	public String getCreadoPor() {
		return creadoPor;
	}

	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	public Date getModificadoEl() {
		return modificadoEl;
	}

	public void setModificadoEl(Date modificadoEl) {
		this.modificadoEl = modificadoEl;
	}

	public String getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

}