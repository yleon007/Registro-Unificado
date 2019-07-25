package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the preguntaSecreta database table.
 * 
 */
@XmlRootElement(name = "PreguntaSecreta")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "preguntaSecreta")
@NamedQuery(name = "PreguntaSecreta.findAll", query = "SELECT p FROM PreguntaSecreta p")
public class PreguntaSecreta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int preguntaSecretaId;

	@Column(nullable = false)
	private int preguntaId;

	@Column(nullable = false, length = 50)
	private String respuesta;

	// @OneToMany(mappedBy="preguntaSecreta")
	// private List<PreguntaIdioma> preguntaIdiomas;

	@XmlTransient
	@ManyToOne
	@JoinColumn(name = "usuarioId", nullable = false)
	private Usuario usuario;

	public PreguntaSecreta() {
	}

	public int getPreguntaSecretaId() {
		return this.preguntaSecretaId;
	}

	public void setPreguntaSecretaId(int preguntaSecretaId) {
		this.preguntaSecretaId = preguntaSecretaId;
	}

	public int getPreguntaId() {
		return this.preguntaId;
	}

	public void setPreguntaId(int preguntaId) {
		this.preguntaId = preguntaId;
	}

	public String getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}