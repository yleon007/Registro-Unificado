package com.ericsson.alodiga.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


/**
 * The persistent class for the tarjeta database table.
 * 
 */
@Entity
@Table(name="tarjeta")
@XmlAccessorType(XmlAccessType.PROPERTY)
@NamedQueries({
@NamedQuery(name="Tarjeta.findAll", query="SELECT t FROM Tarjeta t"),
@NamedQuery(name="Tarjeta.findAvailable", query="SELECT t from Tarjeta t  WHERE  t.estadoTarjetaId =:estado")
})

public class Tarjeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tarjeta_id")
	private int tarjetaId;

	//private String ciudad;

	@Column(name="codigo_seguridad")
	private int codigoSeguridad;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "direccionId", nullable = false)
	private Direccion direccion;
	//private String direccion;

	//private String estado;

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Column(name="estado_tarjeta_id")
	private int estadoTarjetaId;

	@Column(name="fecha_vencimiento")
	private String fechaVencimiento;

	@Column(name="fecha_creacion")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;

	@Column(name="nombre_tarjeta_habiente")
	private String nombreTarjetaHabiente;

	@Column(name="numero_tarjeta")
	private String numeroTarjeta;

	@Column(name="telefono_contacto")
	private String telefonoContacto;

	@Column(name="direccion_contacto")
	private String direccionContacto;

	@Column(name="email_contacto")
	private String emailContacto;

	//private String pais;

	@Column(name="tipo_tarjeta")
	private String tipoTarjeta;

	//private String zip;

	//bi-directional many-to-one association to TarjetaUsuario
	@OneToMany(mappedBy="tarjeta")
	private List<TarjetaUsuario> tarjetaUsuarios;

	public Tarjeta() {
	}

	public int getTarjetaId() {
		return this.tarjetaId;
	}

	public void setTarjetaId(int tarjetaId) {
		this.tarjetaId = tarjetaId;
	}

	/*public String getCiudad() {
		return this.ciudad;
	}*/

	/*public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}*/

	public int getCodigoSeguridad() {
		return this.codigoSeguridad;
	}

	public void setCodigoSeguridad(int codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	/*public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}*/

	public int getEstadoTarjetaId() {
		return this.estadoTarjetaId;
	}

	public void setEstadoTarjetaId(int estadoTarjetaId) {
		this.estadoTarjetaId = estadoTarjetaId;
	}

	public String getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getNombreTarjetaHabiente() {
		return this.nombreTarjetaHabiente;
	}

	public void setNombreTarjetaHabiente(String nombreTarjetaHabiente) {
		this.nombreTarjetaHabiente = nombreTarjetaHabiente;
	}

	public String getNumeroTarjeta() {
		return this.numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/*public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}*/

	public String getTipoTarjeta() {
		return this.tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	/*public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}*/

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getDireccionContacto() {
		return direccionContacto;
	}

	public void setDireccionContacto(String direccionContacto) {
		this.direccionContacto = direccionContacto;
	}

	public String getEmailContacto() {
		return emailContacto;
	}

	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
/*
	public List<TarjetaUsuario> getTarjetaUsuarios() {
		return this.tarjetaUsuarios;
	}

	public void setTarjetaUsuarios(List<TarjetaUsuario> tarjetaUsuarios) {
		this.tarjetaUsuarios = tarjetaUsuarios;
	}

	public TarjetaUsuario addTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
		getTarjetaUsuarios().add(tarjetaUsuario);
		tarjetaUsuario.setTarjeta(this);

		return tarjetaUsuario;
	}

	public TarjetaUsuario removeTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
		getTarjetaUsuarios().remove(tarjetaUsuario);
		tarjetaUsuario.setTarjeta(null);

		return tarjetaUsuario;
	}
*/
	
	
}