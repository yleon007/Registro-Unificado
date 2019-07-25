package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.Usuario;

@XmlRootElement(name = "RespuestaUsuario")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaUsuario extends Respuesta implements Serializable {

	private static final long serialVersionUID = -4678921246061451710L;
	public Usuario datosRespuesta;
	
	public RespuestaUsuario() {
		super();
	}
	
	public RespuestaUsuario (CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.datosRespuesta = null;
	}
	
	public RespuestaUsuario(CodigoRespuesta codigo, String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = null;
	}

	public RespuestaUsuario(CodigoRespuesta codigo, String mensajeRespuesta, Usuario user) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = user;
	}
	
	

}
