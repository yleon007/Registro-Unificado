package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RespuestaGuardarDireccionConfianza")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaGuardarDireccionConfianza extends Respuesta implements
		Serializable {

	private static final long serialVersionUID = -3702946707370840151L;

	public String datosRespuesta;

	public RespuestaGuardarDireccionConfianza() {
		super();
	}

	public RespuestaGuardarDireccionConfianza(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.datosRespuesta = null;
	}

	public RespuestaGuardarDireccionConfianza(CodigoRespuesta codigo,
			String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = null;
	}

}
