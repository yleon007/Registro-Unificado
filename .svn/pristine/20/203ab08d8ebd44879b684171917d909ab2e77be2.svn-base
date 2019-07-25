package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.PreguntaIdioma;

@XmlRootElement(name = "RespuestaPreguntasSecretas")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaPreguntasSecretas extends Respuesta implements
		Serializable {

	private static final long serialVersionUID = 1601814364389999262L;

	public List<PreguntaIdioma> datosRespuesta;

	public RespuestaPreguntasSecretas() {
		super();
	}

	public RespuestaPreguntasSecretas(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.datosRespuesta = null;
	}

	public RespuestaPreguntasSecretas(CodigoRespuesta codigo,
			String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = null;
	}

	public RespuestaPreguntasSecretas(CodigoRespuesta codigo,
			String mensajeRespuesta, List<PreguntaIdioma> lista) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = lista;
	}

}
