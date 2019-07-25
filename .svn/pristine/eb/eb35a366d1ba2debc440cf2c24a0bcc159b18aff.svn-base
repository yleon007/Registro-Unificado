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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sesionUsuario")
@NamedQueries({
		@NamedQuery(name = "SesionUsuario.findAll", query = "SELECT s FROM SesionUsuario s"),
		@NamedQuery(name = "getEstadoByToken", query = "SELECT s FROM SesionUsuario s WHERE s.token = :token") })
public class SesionUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int sesionUsuarioId;

	@Column(nullable = false)
	private boolean activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date fechaActividad;

	@Column(nullable = false, length = 100)
	private String token;

	@ManyToOne
	@JoinColumn(name = "usuarioId", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "direccionConfianzaId", nullable = false)
	private DireccionConfianza direccionConfianza;

	public SesionUsuario() {
	}

	public int getSesionUsuarioId() {
		return this.sesionUsuarioId;
	}

	public void setSesionUsuarioId(int sesionUsuarioId) {
		this.sesionUsuarioId = sesionUsuarioId;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getFechaActividad() {
		return this.fechaActividad;
	}

	public void setFechaActividad(Date fechaActividad) {
		this.fechaActividad = fechaActividad;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public DireccionConfianza getDireccionConfianza() {
		return this.direccionConfianza;
	}

	public void setDireccionConfianza(DireccionConfianza direccionConfianza) {
		this.direccionConfianza = direccionConfianza;
	}

}