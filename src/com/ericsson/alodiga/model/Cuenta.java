package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
@NamedQueries({
		@NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c"),
		@NamedQuery(name = "Cuenta.findByNumeroCuenta", query = "Select c from Cuenta c where c.numeroCuenta=:numeroCuenta") })
public class Cuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int cuentaId;

	@Column(unique = true, nullable = false, length = 16)
	private String numeroCuenta;

	@Column(nullable = false, length = 16)
	private Double saldoAlocoins;

	@Column(nullable = false)
	private Double saldoHealthCareCoins;

	@Column(nullable = false)
	private Double saldoAlodiga;

	public int getCuentaId() {
		return cuentaId;
	}

	public void setCuentaId(int cuentaId) {
		this.cuentaId = cuentaId;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getSaldoAlocoins() {
		return saldoAlocoins;
	}

	public void setSaldoAlocoins(Double saldoAlocoins) {
		this.saldoAlocoins = saldoAlocoins;
	}

	public Double getSaldoHealthCareCoins() {
		return saldoHealthCareCoins;
	}

	public void setSaldoHealthCareCoins(Double saldoHealthCareCoins) {
		this.saldoHealthCareCoins = saldoHealthCareCoins;
	}

	public Double getSaldoAlodiga() {
		return saldoAlodiga;
	}

	public void setSaldoAlodiga(Double saldoAlodiga) {
		this.saldoAlodiga = saldoAlodiga;
	}

	public Cuenta() {
	}

	@Override
	public String toString() {
		return "Cuenta [cuentaId=" + cuentaId + ", numeroCuenta="
				+ numeroCuenta + ", saldoAlocoins=" + saldoAlocoins
				+ ", saldoHealthCareCoins=" + saldoHealthCareCoins
				+ ", saldoAlodiga=" + saldoAlodiga + "]";
	}

	public static Cuenta getCuentaporNumeroCuenta(EntityManager em,
			String numeroCuenta) {
		Query q = em
				.createNamedQuery("Cuenta.findByNumeroCuenta", Cuenta.class);
		q.setParameter("numeroCuenta", numeroCuenta);
		return (Cuenta) q.getSingleResult();
	}

}