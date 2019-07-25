package com.ericsson.alodiga.respuestas;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ericsson.alodiga.model.Usuario;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaListadoUsuarios extends Respuesta {

	public List<Usuario> usuarios;
	
	public RespuestaListadoUsuarios() {
		super();
	}
	
	public RespuestaListadoUsuarios(CodigoRespuesta codigo) {
		super(new Date(), codigo.getCodigo(), codigo.name());
		this.usuarios = null;
	}
	
	public RespuestaListadoUsuarios(CodigoRespuesta codigo, String mensaje) {
		super(new Date(), codigo.getCodigo(), mensaje);
		this.usuarios = null;
	}

	public RespuestaListadoUsuarios(CodigoRespuesta codigo, String mensaje, List<Usuario> usuarios) {
		super(new Date(), codigo.getCodigo(), mensaje);
		this.usuarios = usuarios;
	}
	
}
