package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "perfilAloESP")
@NamedQuery(name = "PerfilAloESP.findAll", query = "SELECT p FROM PerfilAloESP p")
public class PerfilAloESP implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public PerfilAloESP() {}
	
	
	
	public PerfilAloESP(String einTienda, String idiomaEnvio, 
			double montoMaximoTransacciones, String nombreTienda, 
			String razonSocial, String taxTienda,
			String telefonoEstablecimiento, String tipoCuenta) {
		this.einTienda = einTienda;
		this.idiomaEnvio = idiomaEnvio;
		this.montoMaximoTransacciones = montoMaximoTransacciones;
		this.nombreTienda = nombreTienda;
		this.razonSocial = razonSocial;
		this.taxTienda = taxTienda;
		this.telefonoEstablecimiento = telefonoEstablecimiento;
		this.tipoCuenta = tipoCuenta;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int perfilAloESPId;

	private String einTienda;

	private String idiomaEnvio;

	private double montoMaximoTransacciones;

	private String nombreTienda;

	private String razonSocial;

	private String taxTienda;

	private String telefonoEstablecimiento;

	private String tipoCuenta;

	public int getPerfilAloESPId() {
		return this.perfilAloESPId;
	}

	public void setPerfilAloESPId(int perfilAloESPId) {
		this.perfilAloESPId = perfilAloESPId;
	}

	public String getEinTienda() {
		return this.einTienda;
	}

	public void setEinTienda(String einTienda) {
		this.einTienda = einTienda;
	}

	public String getIdiomaEnvio() {
		return this.idiomaEnvio;
	}

	public void setIdiomaEnvio(String idiomaEnvio) {
		this.idiomaEnvio = idiomaEnvio;
	}

	public double getMontoMaximoTransacciones() {
		return this.montoMaximoTransacciones;
	}

	public void setMontoMaximoTransacciones(double montoMaximoTransacciones) {
		this.montoMaximoTransacciones = montoMaximoTransacciones;
	}

	public String getNombreTienda() {
		return this.nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getTaxTienda() {
		return this.taxTienda;
	}

	public void setTaxTienda(String taxTienda) {
		this.taxTienda = taxTienda;
	}

	public String getTelefonoEstablecimiento() {
		return this.telefonoEstablecimiento;
	}

	public void setTelefonoEstablecimiento(String telefonoEstablecimiento) {
		this.telefonoEstablecimiento = telefonoEstablecimiento;
	}

	public String getTipoCuenta() {
		return this.tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	public void setPerfilAloESP(String einTienda, String idiomaEnvio, 
			double montoMaximoTransacciones, String nombreTienda, 
			String razonSocial, String taxTienda,
			String telefonoEstablecimiento, String tipoCuenta) {
		this.einTienda = einTienda;
		this.idiomaEnvio = idiomaEnvio;
		this.montoMaximoTransacciones = montoMaximoTransacciones;
		this.nombreTienda = nombreTienda;
		this.razonSocial = razonSocial;
		this.taxTienda = taxTienda;
		this.telefonoEstablecimiento = telefonoEstablecimiento;
		this.tipoCuenta = tipoCuenta;
	}

}