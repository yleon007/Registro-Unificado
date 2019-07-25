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

@Entity
@Table(name = "usuarioWS")
@NamedQueries({
		@NamedQuery(name = "UsuarioWS.findAll", query = "SELECT u FROM UsuarioWS u"),
		@NamedQuery(name = "UsuarioWS.findByUserAndPassword", query = "Select t from UsuarioWS t where t.usuario=:usuario AND t.password=:password"),
		@NamedQuery(name = "UsuarioWS.findUserAndPassword", query = "SELECT u FROM UsuarioWS u")})
public class UsuarioWS implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, length = 50)
	private String usuario;

	@Column(nullable = false, length = 50)
	private String password;

	public UsuarioWS() {
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}