package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the idioma database table.
 * 
 */
@XmlRootElement(name = "Idioma")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "idioma")
@NamedQuery(name = "Idioma.findAll", query = "SELECT i FROM Idioma i")
public class Idioma implements Serializable {

	private static final long serialVersionUID = 5968862638445930460L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlElement(name = "idiomaId")
	@Column(unique = true, nullable = false)
	private int idiomaId;

	@XmlElement(name = "descripcion")
	@Column(nullable = false, length = 2)
	private String descripcion;

	/*
	 * //bi-directional many-to-one association to PreguntaIdioma
	 * 
	 * @OneToMany(mappedBy="idioma") private List<PreguntaIdioma>
	 * preguntaIdiomas;
	 */

	public Idioma() {
	}

	public int getIdiomaId() {
		return this.idiomaId;
	}

	public void setIdiomaId(int idiomaId) {
		this.idiomaId = idiomaId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/*
	 * public List<PreguntaIdioma> getPreguntaIdiomas() { return
	 * this.preguntaIdiomas; }
	 * 
	 * public void setPreguntaIdiomas(List<PreguntaIdioma> preguntaIdiomas) {
	 * this.preguntaIdiomas = preguntaIdiomas; }
	 * 
	 * 
	 * public PreguntaIdioma addPreguntaIdioma(PreguntaIdioma preguntaIdioma) {
	 * getPreguntaIdiomas().add(preguntaIdioma); preguntaIdioma.setIdioma(this);
	 * 
	 * return preguntaIdioma; }
	 * 
	 * public PreguntaIdioma removePreguntaIdioma(PreguntaIdioma preguntaIdioma)
	 * { getPreguntaIdiomas().remove(preguntaIdioma);
	 * preguntaIdioma.setIdioma(null);
	 * 
	 * return preguntaIdioma; }
	 */

}