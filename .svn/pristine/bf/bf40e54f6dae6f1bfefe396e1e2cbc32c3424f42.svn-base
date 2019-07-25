package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "PreguntaIdioma")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "preguntaIdioma")
@NamedQueries({
		@NamedQuery(name = "PregIdiom.findAll", query = "SELECT p FROM PreguntaIdioma p"),
		@NamedQuery(name = "PregPorIdioma", query = "SELECT i FROM PreguntaIdioma i WHERE i.idioma = :Idioma") })
public class PreguntaIdioma implements Serializable {

	private static final long serialVersionUID = -4127692489357055058L;

	@Id
	@XmlElement(name = "preguntaIdiomaId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int preguntaIdiomaId;

	@Column(nullable = false, length = 75)
	@XmlElement(name = "pregunta")
	private String pregunta;

	// bi-directional many-to-one association to PreguntaSecreta
	// @XmlTransient
	// @ManyToOne
	// @JoinColumn(name = "preguntaId", nullable = false)
	// private PreguntaSecreta preguntaSecreta;

	@Column
	@XmlElement(name = "preguntaId")
	private int preguntaId;

	// bi-directional many-to-one association to Idioma
	@XmlTransient
	@ManyToOne
	@JoinColumn(name = "idiomaId", nullable = false)
	private Idioma idioma;

	public PreguntaIdioma() {
	}

	public int getPreguntaIdiomaId() {
		return this.preguntaIdiomaId;
	}

	public void setPreguntaIdiomaId(int preguntaIdiomaId) {
		this.preguntaIdiomaId = preguntaIdiomaId;
	}

	public String getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public int getPreguntaId() {
		return this.preguntaId;
	}

	public void setPreguntaId(int preguntaId) {
		this.preguntaId = preguntaId;
	}

	// public PreguntaSecreta getPreguntaSecreta() {
	// return this.preguntaSecreta;
	// }
	//
	// public void setPreguntaSecreta(PreguntaSecreta preguntaSecreta) {
	// this.preguntaSecreta = preguntaSecreta;
	// }

	public Idioma getIdioma() {
		return this.idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
}