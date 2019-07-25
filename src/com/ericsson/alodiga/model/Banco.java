package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Bancos database table.
 * 
 */
@Entity
@Table(name="Bancos")
@NamedQueries({
@NamedQuery(name="Banco.findAll", query="SELECT b FROM Banco b"),
@NamedQuery(name="Banco.findById", query="SELECT b FROM Banco b WHERE b.bancoId=:bancoId")
})
public class Banco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bancoId;

	private int countryId;

	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private String editedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date editedDate;

	private String name;

	private BigInteger version;

	//bi-directional many-to-one association to CuentaBancaria
	@OneToMany(mappedBy="banco")
	private List<CuentaBancaria> cuentaBancarias;

	public Banco() {
	}

	public int getBancoId() {
		return this.bancoId;
	}

	public void setBancoId(int bancoId) {
		this.bancoId = bancoId;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEditedBy() {
		return this.editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	public Date getEditedDate() {
		return this.editedDate;
	}

	public void setEditedDate(Date editedDate) {
		this.editedDate = editedDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getVersion() {
		return this.version;
	}

	public void setVersion(BigInteger version) {
		this.version = version;
	}
/*
	public List<CuentaBancaria> getCuentaBancarias() {
		return this.cuentaBancarias;
	}

	public void setCuentaBancarias(List<CuentaBancaria> cuentaBancarias) {
		this.cuentaBancarias = cuentaBancarias;
	}

	public CuentaBancaria addCuentaBancaria(CuentaBancaria cuentaBancaria) {
		getCuentaBancarias().add(cuentaBancaria);
		cuentaBancaria.setBanco(this);

		return cuentaBancaria;
	}

	public CuentaBancaria removeCuentaBancaria(CuentaBancaria cuentaBancaria) {
		getCuentaBancarias().remove(cuentaBancaria);
		cuentaBancaria.setBanco(null);

		return cuentaBancaria;
	}*/

}