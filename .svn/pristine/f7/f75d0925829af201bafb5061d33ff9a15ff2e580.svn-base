package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.TipoDocumento;

@XmlRootElement(name = "RespuestaListadoTipoDocumento")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaListadoTipoDocumento extends Respuesta implements
		Serializable {

	private static final long serialVersionUID = 6163664204952591466L;
	public List<TipoDocumento> datosRespuesta = null;

	public RespuestaListadoTipoDocumento() {
		super();
	}

	public RespuestaListadoTipoDocumento(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.datosRespuesta = null;
	}

	public RespuestaListadoTipoDocumento(CodigoRespuesta codigo,
			String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = null;
	}

	public RespuestaListadoTipoDocumento(CodigoRespuesta codigo,
			String mensajeRespuesta, List<TipoDocumento> lista) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = lista;
	}

}
