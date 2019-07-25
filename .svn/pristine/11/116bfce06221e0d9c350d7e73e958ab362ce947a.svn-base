package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.CuentaBancariaTipo;;

@XmlRootElement(name = "RespuestaListadoTipoCuentaBancaria")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaListadoTipoCuentaBancaria extends Respuesta implements Serializable{

	private static final long serialVersionUID = 4743861059718541422L;
	private List<CuentaBancariaTipo> datosRespuesta = null;
	
	public RespuestaListadoTipoCuentaBancaria() {
		super();
	}
	
	public RespuestaListadoTipoCuentaBancaria(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.setDatosRespuesta(null);
	}

	public RespuestaListadoTipoCuentaBancaria(CodigoRespuesta codigo,
			String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.setDatosRespuesta(null);
	}

	public RespuestaListadoTipoCuentaBancaria(CodigoRespuesta codigo,
			String mensajeRespuesta, List<CuentaBancariaTipo> lista) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.setDatosRespuesta(lista);
	}

	public List<CuentaBancariaTipo> getDatosRespuesta() {
		return datosRespuesta;
	}

	public void setDatosRespuesta(List<CuentaBancariaTipo> datosRespuesta) {
		this.datosRespuesta = datosRespuesta;
	}

}
