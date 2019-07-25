package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.Banco;

@XmlRootElement(name = "RespuestaListadoEstados")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaListadoBancos extends Respuesta implements Serializable {
	
	private static final long serialVersionUID = -252932454627430458L;
	private List<Banco> datosRespuesta = null;
	
	public RespuestaListadoBancos() {
		super();
	}
	
	public RespuestaListadoBancos(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.setDatosRespuesta(null);
	}

	public RespuestaListadoBancos(CodigoRespuesta codigo,
			String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.setDatosRespuesta(null);
	}

	public RespuestaListadoBancos(CodigoRespuesta codigo,
			String mensajeRespuesta, List<Banco> lista) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.setDatosRespuesta(lista);
	}

	public List<Banco> getDatosRespuesta() {
		return datosRespuesta;
	}

	public void setDatosRespuesta(List<Banco> datosRespuesta) {
		this.datosRespuesta = datosRespuesta;
	}
}
