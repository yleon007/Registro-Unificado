package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "RespuestaToken")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaToken extends Respuesta implements Serializable {

	private static final long serialVersionUID = 3824171095981479016L;

	public boolean datosRespuesta;

	public RespuestaToken() {
		super();
	}

	public RespuestaToken(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
	}

	public RespuestaToken(CodigoRespuesta codigo, String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
	}

	public RespuestaToken(CodigoRespuesta codigo, String mensajeRespuesta, boolean estadousuario) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = estadousuario;
	}
}
