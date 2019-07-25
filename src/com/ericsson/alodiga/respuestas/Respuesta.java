package com.ericsson.alodiga.respuestas;

import java.io.IOException;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

@XmlRootElement(name = "Respuesta")
@XmlAccessorType(XmlAccessType.FIELD)
public class Respuesta {

	@XmlElement(name = "fechaHora")
	private Date fechaHora;
	@XmlElement(name = "codigoRespuesta")
	private String codigoRespuesta;
	@XmlElement(name = "mensajeRespuesta")
	private String mensajeRespuesta;

	public Respuesta(Date fechaHora, String codigoRespuesta,
			String mensajeRespuesta) {
		this.fechaHora = fechaHora;
		this.codigoRespuesta = codigoRespuesta;
		this.mensajeRespuesta = mensajeRespuesta;
	}

	public Respuesta(CodigoRespuesta codigo) {
		this.fechaHora = new Date();
		this.codigoRespuesta = codigo.getCodigo();
		this.mensajeRespuesta = codigo.name();
	}

	public Respuesta() {
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}

	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}

	@Override
	public String toString() {
		return "Respuesta [fechaHora=" + fechaHora + ", codigoRespuesta="
				+ codigoRespuesta + ", mensajeRespuesta=" + mensajeRespuesta
				+ "]";
	}

	public static String toJson(Object o) throws JsonParseException,
			JsonMappingException, JsonGenerationException, IOException {
		ObjectMapper om = new ObjectMapper();
		Object json = om.readValue(om.writeValueAsString(o), Object.class);
		String result = om.writerWithDefaultPrettyPrinter().writeValueAsString(
				json);
		return new String(result.getBytes(), "UTF-8");
	}
}
