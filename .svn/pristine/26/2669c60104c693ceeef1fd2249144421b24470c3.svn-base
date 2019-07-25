package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.PreguntaSecreta;

@XmlRootElement(name = "RespuestaPreguntasSecretas")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaPreguntasSecretasUsuario extends Respuesta implements
		Serializable {

	private static final long serialVersionUID = 1601814364389999262L;

	public List<PreguntaSecreta> datosRespuesta;

	public RespuestaPreguntasSecretasUsuario() {
		super();
	}

	public RespuestaPreguntasSecretasUsuario(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.datosRespuesta = null;
	}

	public RespuestaPreguntasSecretasUsuario(CodigoRespuesta codigo,
			String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = null;
	}

	public RespuestaPreguntasSecretasUsuario(CodigoRespuesta codigo,
			String mensajeRespuesta, List<PreguntaSecreta> lista) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = lista;
	}

}
