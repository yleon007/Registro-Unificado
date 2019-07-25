package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.Empresa;

@XmlRootElement(name = "RespuestaListadoTipoEmpresa")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaListadoEmpresa extends Respuesta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<Empresa> datosRespuesta = null;

	public RespuestaListadoEmpresa() {
		super();
	}

	public RespuestaListadoEmpresa(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.datosRespuesta = null;
	}

	public RespuestaListadoEmpresa(CodigoRespuesta codigo, String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = null;
	}

	public RespuestaListadoEmpresa(CodigoRespuesta codigo, String mensajeRespuesta, List<Empresa> lista) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = lista;
	}

}