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
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "movilCodigo")
@NamedQueries({
		@NamedQuery(name = "MovilCodigo.findAll", query = "SELECT e FROM MovilCodigo e"),
		@NamedQuery(name = "MovilCodigo.findByMovil", query = "Select e from MovilCodigo e where e.movil=:movil order by e.movilCodigoId desc" ) })
public class MovilCodigo implements Serializable {
	private static final long serialVersionUID = 4116642353810791321L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlElement(name = "movilCodigoId")
	@Column(unique = true, nullable = false)
	private int movilCodigoId;
	
	@Column(length = 16)
	@Pattern(regexp = "\\d{10,16}", message = "{invalid.phonenumber}")
	private String movil;

	@Column(length = 6)
	private String codigo;

	public int getMovilCodigoId(){
		return movilCodigoId;
	}
	
	public void setMovilCodigoId(int movilCodigoId){
		this.movilCodigoId = movilCodigoId;
	}
	
	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public MovilCodigo() {
	}

	public MovilCodigo(String movil, String codigo) {
		super();
		this.movil = movil;
		this.codigo = codigo;
	}

}