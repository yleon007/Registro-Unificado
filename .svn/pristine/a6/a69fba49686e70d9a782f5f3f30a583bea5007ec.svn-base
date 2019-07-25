package com.ericsson.alodiga.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the CuentaBancariaTipo database table.
 * 
 */
@Entity
@Table(name="CuentaBancariaTipo")
@NamedQueries({
@NamedQuery(name="CuentaBancariaTipo.findAll", query="SELECT c FROM CuentaBancariaTipo c"),
@NamedQuery(name="CuentaBancariaTipo.findById", query="SELECT c FROM CuentaBancariaTipo c WHERE c.cuentaBancariaId=:cuentaBancariaId")
})
public class CuentaBancariaTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cuentaBancariaId;

	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private String editedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date editedDate;

	private String name;

	private BigInteger version;

//	//bi-directional many-to-one association to CuentaBancaria
//	@OneToMany(mappedBy="cuentaBancariaTipo")
//	private List<CuentaBancaria> cuentaBancarias;

	public CuentaBancariaTipo() {
	}

	public int getCuentaBancariaId() {
		return this.cuentaBancariaId;
	}

	public void setCuentaBancariaId(int cuentaBancariaId) {
		this.cuentaBancariaId = cuentaBancariaId;
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

//	public List<CuentaBancaria> getCuentaBancarias() {
//		return this.cuentaBancarias;
//	}

//	public void setCuentaBancarias(List<CuentaBancaria> cuentaBancarias) {
//		this.cuentaBancarias = cuentaBancarias;
//	}

//	public CuentaBancaria addCuentaBancaria(CuentaBancaria cuentaBancaria) {
//		getCuentaBancarias().add(cuentaBancaria);
//		cuentaBancaria.setCuentaBancariaTipo(this);
//
//		return cuentaBancaria;
//	}

//	public CuentaBancaria removeCuentaBancaria(CuentaBancaria cuentaBancaria) {
//		getCuentaBancarias().remove(cuentaBancaria);
//		cuentaBancaria.setCuentaBancariaTipo(null);
//
//		return cuentaBancaria;
//	}

}