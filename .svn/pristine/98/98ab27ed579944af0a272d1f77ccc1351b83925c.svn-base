package com.ericsson.alodiga.ws;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.ericcson.alodiga.bean.APIOperations;
import com.ericsson.alodiga.respuestas.Respuesta;

@Path("/registroUnificado")
public class APIRegistroUnificadoRest {

	// private static final Logger logger = Logger.getLogger(Aload.class);

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/guardarPerfilAlocash")
	public String guardarPerfilAlocash(
			@QueryParam("usuarioApi") String usuarioApi,
			@QueryParam("passwordApi") String passwordApi,
			@QueryParam("usuarioId") Integer usuarioId,
			@QueryParam("genero") String genero,
			@QueryParam("telefonoResidencial") String telefonoResidencial,
			@QueryParam("ocupacionId") String ocupacionId,
			@QueryParam("tipoDocumentoId") String tipoDocumentoId,
			@QueryParam("numeroDocumento") String numeroDocumento)
			throws Exception {
		APIOperations ao = new APIOperations();
		Respuesta respuesta = ao.guardarPerfilAloCash(usuarioApi, passwordApi,
				usuarioId, genero, telefonoResidencial, ocupacionId,
				tipoDocumentoId, numeroDocumento);
		return Respuesta.toJson(respuesta);
	}

}
