package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
@NamedQueries({
	@NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
	@NamedQuery(name = "Empresa.findByEin", query = "SELECT e FROM Empresa e where e.ein=:ein")})

public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empresaId;

	private String ein;

	private String email;

	private double ingresosEstimados;

	private String nombre;

	private String telefono;

	// uni-directional many-to-one association to CuentaBancaria
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "cuentaBancariaId")
	private CuentaBancaria cuentaBancaria;

	// uni-directional many-to-one association to Direccion
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "direccionId")
	private Direccion direccion;

	// uni-directional many-to-one association to TipoEmpresa
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "tipoEmpresaId")
	private TipoEmpresa tipoEmpresa;

	public Empresa() {
	}

	public int getEmpresaId() {
		return this.empresaId;
	}

	public void setEmpresaId(int empresaId) {
		this.empresaId = empresaId;
	}

	public String getEin() {
		return this.ein;
	}

	public void setEin(String ein) {
		this.ein = ein;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getIngresosEstimados() {
		return this.ingresosEstimados;
	}

	public void setIngresosEstimados(double ingresosEstimados) {
		this.ingresosEstimados = ingresosEstimados;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public CuentaBancaria getCuentaBancaria() {
		return this.cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public Direccion getDireccion() {
		return this.direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public TipoEmpresa getTipoEmpresa() {
		return this.tipoEmpresa;
	}

	public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

}