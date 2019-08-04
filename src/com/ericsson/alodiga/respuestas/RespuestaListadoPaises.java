package com.ericsson.alodiga.respuestas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import com.ericsson.alodiga.model.Pais;

@XmlRootElement(name = "RespuestaListadoPaises")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaListadoPaises extends Respuesta implements
		Serializable {

	private static final long serialVersionUID = 6163664204952591466L;
	public List<Pais> datosRespuesta = null;

	public RespuestaListadoPaises() {
		super();
	}

	public RespuestaListadoPaises(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.datosRespuesta = null;
	}

	public RespuestaListadoPaises(CodigoRespuesta codigo,
			String mensajeRespuesta) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = null;
	}

	public RespuestaListadoPaises(CodigoRespuesta codigo,
			String mensajeRespuesta, List<Pais> lista) {
		super(new Date(), codigo.getCodigo(), mensajeRespuesta);
		this.datosRespuesta = lista;
	}

}
