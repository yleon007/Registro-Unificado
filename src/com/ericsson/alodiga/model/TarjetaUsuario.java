package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;


/**
 * The persistent class for the tarjetaUsuario database table.
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@Table(name="tarjetaUsuario")
@NamedQueries({
@NamedQuery(name="TarjetaUsuario.findAll", query="SELECT t FROM TarjetaUsuario t"),
@NamedQuery(name="TarjetaUsuario.findByUser", query="SELECT t FROM TarjetaUsuario t WHERE t.usuario=:usuario"),
@NamedQuery(name="TarjetaUsuario.findByUserState", query="SELECT t FROM TarjetaUsuario t WHERE t.usuario=:usuario and t.estado=:estado"),
@NamedQuery(name="TarjetaUsuario.findByUserExistence", query="SELECT t FROM TarjetaUsuario t WHERE t.usuario=:usuario and t.estado<>:estado"),
})
public class TarjetaUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TarjetaUsuarioPK id;

	private String estado;

	//bi-directional many-to-one association to Tarjeta
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="tarjeta_id")
	private Tarjeta tarjeta;

	//bi-directional many-to-one association to Usuario
	@XmlTransient
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="usuarioId")
	private Usuario usuario;

	public TarjetaUsuario() {
	}

	public TarjetaUsuarioPK getId() {
		return this.id;
	}

	public void setId(TarjetaUsuarioPK id) {
		this.id = id;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}