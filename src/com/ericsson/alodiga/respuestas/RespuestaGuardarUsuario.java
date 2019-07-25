package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.Usuario;

@XmlRootElement(name = "RespuestaGuardarUsuario")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaGuardarUsuario extends Respuesta implements Serializable {

	private static final long serialVersionUID = -5826822375335798732L;

	public Usuario datosRespuesta;

	public RespuestaGuardarUsuario() {
		super();
	}

	public RespuestaGuardarUsuario(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.datosRespuesta = null;
	}

	public RespuestaGuardarUsuario(CodigoRespuesta codigo,
			String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = null;
	}

	public RespuestaGuardarUsuario(CodigoRespuesta codigo,
			String mensajeRespuesta, Usuario usuarioId) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = usuarioId;
	}

}
