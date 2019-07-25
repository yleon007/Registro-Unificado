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
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="direccionConfianza")
@NamedQuery(name="DireccionConfianza.findByUserAndIp", query="SELECT d FROM DireccionConfianza d where d.usuario = :usuario and d.ip = :ip")
public class DireccionConfianza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int direccionConfianzaId;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date fecha;

	@Column(nullable=false, length=45)
	@Pattern(regexp = "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])", message = "{invalid.ip}")
	private String ip;

	@ManyToOne
	@JoinColumn(name="usuarioId", nullable=false)
	private Usuario usuario;

	public DireccionConfianza() {
	}

	public int getDireccionConfianzaId() {
		return this.direccionConfianzaId;
	}

	public void setDireccionConfianzaId(int direccionConfianzaId) {
		this.direccionConfianzaId = direccionConfianzaId;
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

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}