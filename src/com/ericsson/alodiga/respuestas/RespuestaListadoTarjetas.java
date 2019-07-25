package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.Tarjeta;

@XmlRootElement(name = "RespuestaListadoTarjetas")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaListadoTarjetas extends Respuesta implements
		Serializable {

	private static final long serialVersionUID = 6163664204952591466L;
	private List<Tarjeta> datosRespuesta = null;

	public RespuestaListadoTarjetas() {
		super();
	}

	public RespuestaListadoTarjetas(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.setDatosRespuesta(null);
	}

	public RespuestaListadoTarjetas(CodigoRespuesta codigo,
			String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.setDatosRespuesta(null);
	}

	public RespuestaListadoTarjetas(CodigoRespuesta codigo,
			String mensajeRespuesta, List<Tarjeta> lista) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.setDatosRespuesta(lista);
	}

	public List<Tarjeta> getDatosRespuesta() {
		return datosRespuesta;
	}

	public void setDatosRespuesta(List<Tarjeta> datosRespuesta) {
		this.datosRespuesta = datosRespuesta;
	}

}

