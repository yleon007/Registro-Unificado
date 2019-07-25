package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.TipoEmpresa;

@XmlRootElement(name = "RespuestaListadoTipoEmpresa")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaListadoTipoEmpresa extends Respuesta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<TipoEmpresa> datosRespuesta = null;

	public RespuestaListadoTipoEmpresa() {
		super();
	}

	public RespuestaListadoTipoEmpresa(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.datosRespuesta = null;
	}

	public RespuestaListadoTipoEmpresa(CodigoRespuesta codigo, String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = null;
	}

	public RespuestaListadoTipoEmpresa(CodigoRespuesta codigo, String mensajeRespuesta, List<TipoEmpresa> lista) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = lista;
	}

}
