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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;


/**
 * The persistent class for the cuentaBancaria database table.
 * 
 */
@Entity
@Table(name="cuentaBancaria")
@XmlAccessorType(XmlAccessType.FIELD)
@NamedQueries({
@NamedQuery(name="CuentaBancaria.findAll", query="SELECT c FROM CuentaBancaria c"),
@NamedQuery(name="CuentaBancaria.findByUser", query="SELECT c FROM CuentaBancaria c WHERE c.usuario=:usuario")
})
public class CuentaBancaria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cuentaBancariaId;

	private String numeroCuenta;

	private String numeroRuta;
	
	//private Integer cuentaAlodiga;

	//bi-directional many-to-one association to Banco
	
	@ManyToOne
	@JoinColumn(name="BancoId")
	private Banco banco;

	//bi-directional many-to-one association to CuentaBancariaTipo
	@ManyToOne
	@JoinColumn(name="tipoCuentaId" )
	private CuentaBancariaTipo cuentaBancariaTipo;
	
	//Fecha creacion
	@Column(name="fecha_creacion")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	//bi-directional many-to-one association to Usuario
	@XmlTransient
	@ManyToOne
	@JoinColumn(name="usuarioId")
	private Usuario usuario;

	public CuentaBancaria() {
	}

	public int getCuentaBancariaId() {
		return this.cuentaBancariaId;
	}

	public void setCuentaBancariaId(int cuentaBancariaId) {
		this.cuentaBancariaId = cuentaBancariaId;
	}

	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNumeroRuta() {
		return this.numeroRuta;
	}

	public void setNumeroRuta(String numeroRuta) {
		this.numeroRuta = numeroRuta;
	}

	public Banco getBanco() {
		return this.banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public CuentaBancariaTipo getCuentaBancariaTipo() {
		return this.cuentaBancariaTipo;
	}

	public void setCuentaBancariaTipo(CuentaBancariaTipo cuentaBancariaTipo) {
		this.cuentaBancariaTipo = cuentaBancariaTipo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

//	public Integer getCuentaAlodiga() {
//		return cuentaAlodiga;
//	}
//
//	public void setCuentaAlodiga(Integer cuentaAlodiga) {
//		this.cuentaAlodiga = cuentaAlodiga;
//	}

}