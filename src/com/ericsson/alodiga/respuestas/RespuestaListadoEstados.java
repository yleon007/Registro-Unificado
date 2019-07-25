package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.Estado;



@XmlRootElement(name = "RespuestaListadoEstados")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaListadoEstados extends Respuesta implements
		Serializable {

	private static final long serialVersionUID = 616366420495291466L;
	private List<Estado> datosRespuesta = null;

	public RespuestaListadoEstados() {
		super();
	}

	public RespuestaListadoEstados(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.setDatosRespuesta(null);
	}

	public RespuestaListadoEstados(CodigoRespuesta codigo,
			String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.setDatosRespuesta(null);
	}

	public RespuestaListadoEstados(CodigoRespuesta codigo,
			String mensajeRespuesta, List<Estado> lista) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.setDatosRespuesta(lista);
	}

	public List<Estado> getDatosRespuesta() {
		return datosRespuesta;
	}

	public void setDatosRespuesta(List<Estado> datosRespuesta) {
		this.datosRespuesta = datosRespuesta;
	}

}

