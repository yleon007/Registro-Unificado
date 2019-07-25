package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "RespuestaToken")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaCodigoRandom extends Respuesta implements Serializable {

	private static final long serialVersionUID = 3824171095981479016L;

	public String datosRespuesta;

	public RespuestaCodigoRandom() {
		super();
	}

	public RespuestaCodigoRandom(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
	}

	public RespuestaCodigoRandom(CodigoRespuesta codigo, String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
	}

	public RespuestaCodigoRandom(CodigoRespuesta codigo, String mensajeRespuesta, String codigoGenerado) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = codigoGenerado;
	}
}
