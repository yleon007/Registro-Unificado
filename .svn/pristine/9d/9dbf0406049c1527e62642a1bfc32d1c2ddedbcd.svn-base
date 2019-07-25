package com.ericsson.alodiga.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="bitacora")
public class Bitacora implements Serializable {
	private static final long serialVersionUID = 1L;

	public Bitacora() {}
	
	public Bitacora(String ip, Accion accion, Usuario usuario) {
		this.fecha = new Date();
		this.ip = ip;
		this.accion = accion;
		this.usuario = usuario;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int bitacoraId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date fecha;

	@Column(nullable=false, length=45)
	private String ip;

	@ManyToOne
	@JoinColumn(name="accionId", nullable=false)
	private Accion accion;

	@ManyToOne
	@JoinColumn(name="usuarioId", nullable=false)
	private Usuario usuario;

	public int getBitacoraId() {
		return this.bitacoraId;
	}

	public void setBitacoraId(int bitacoraId) {
		this.bitacoraId = bitacoraId;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Accion getAccion() {
		return this.accion;
	}

	public void setAccion(Accion accion) {
		this.accion = accion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}