package com.ericsson.alodiga.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the imagen database table.
 * 
 */
@Entity
@Table(name = "imagen")
@NamedQuery(name="Imagen.findAll", query="SELECT i FROM Imagen i")
public class Imagen implements Serializable {
 private static final long serialVersionUID = 1L;

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int imagenId;

 @Lob
 private byte[] imagen;

 private String nombre;

 //bi-directional many-to-one association to Usuario
 //@XmlTransient
 //@OneToMany(mappedBy="imagen")
 //private List<Usuario> usuarios;

 public Imagen() {
 }

 public int getImagenId() {
  return this.imagenId;
 }

 public void setImagenId(int imagenId) {
  this.imagenId = imagenId;
 }

 public byte[] getImagen() {
  return this.imagen;
 }

 public void setImagen(byte[] imagen) {
  this.imagen = imagen;
 }

 public String getNombre() {
  return this.nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

// public List<Usuario> getUsuarios() {
//  return this.usuarios;
// }

// public void setUsuarios(List<Usuario> usuarios) {
//  this.usuarios = usuarios;
// }

// public Usuario addUsuario(Usuario usuario) {
//  getUsuarios().add(usuario);
//  usuario.setImagen(this);
//
//  return usuario;
// }
//
// public Usuario removeUsuario(Usuario usuario) {
//  getUsuarios().remove(usuario);
//  usuario.setImagen(null);
//
//  return usuario;
// }

}