package com.ericcson.alodiga.bean;

import java.sql.Connection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolationException;

import org.apache.axis.utils.StringUtils;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.log4j.Logger;
import org.hibernate.validator.internal.engine.ConstraintViolationImpl;
import org.joda.time.DateTime;

import com.ericsson.alodiga.model.Accion;
import com.ericsson.alodiga.model.Aplicacion;
import com.ericsson.alodiga.model.Banco;
import com.ericsson.alodiga.model.Bitacora;
import com.ericsson.alodiga.model.ConfiguracionGeneral;
import com.ericsson.alodiga.model.Cuenta;
import com.ericsson.alodiga.model.CuentaBancaria;
import com.ericsson.alodiga.model.CuentaBancariaTipo;
import com.ericsson.alodiga.model.Direccion;
import com.ericsson.alodiga.model.DireccionConfianza;
import com.ericsson.alodiga.model.Empresa;
import com.ericsson.alodiga.model.Estado;
import com.ericsson.alodiga.model.Idioma;
import com.ericsson.alodiga.model.Imagen;
import com.ericsson.alodiga.model.MovilCodigo;
import com.ericsson.alodiga.model.Ocupacion;
import com.ericsson.alodiga.model.PerfilAloESP;
import com.ericsson.alodiga.model.PerfilAloPos;
import com.ericsson.alodiga.model.PerfilAloRRP;
import com.ericsson.alodiga.model.PreguntaIdioma;
import com.ericsson.alodiga.model.PreguntaSecreta;
import com.ericsson.alodiga.model.SesionUsuario;
import com.ericsson.alodiga.model.Tarjeta;
import com.ericsson.alodiga.model.TarjetaUsuario;
import com.ericsson.alodiga.model.TarjetaUsuarioPK;
import com.ericsson.alodiga.model.TipoDocumento;
import com.ericsson.alodiga.model.TipoEmpresa;
import com.ericsson.alodiga.model.Usuario;
import com.ericsson.alodiga.model.UsuarioWS;
import com.ericsson.alodiga.respuestas.CodigoRespuesta;
import com.ericsson.alodiga.respuestas.Respuesta;
import com.ericsson.alodiga.respuestas.RespuestaCodigoRandom;
import com.ericsson.alodiga.respuestas.RespuestaGuardarDireccionConfianza;
import com.ericsson.alodiga.respuestas.RespuestaGuardarUsuario;
import com.ericsson.alodiga.respuestas.RespuestaListadoAplicaciones;
import com.ericsson.alodiga.respuestas.RespuestaListadoBancos;
import com.ericsson.alodiga.respuestas.RespuestaListadoEmpresa;
import com.ericsson.alodiga.respuestas.RespuestaListadoEstados;
import com.ericsson.alodiga.respuestas.RespuestaListadoOcupaciones;
import com.ericsson.alodiga.respuestas.RespuestaListadoTarjetas;
import com.ericsson.alodiga.respuestas.RespuestaListadoTipoCuentaBancaria;
import com.ericsson.alodiga.respuestas.RespuestaListadoTipoDocumento;
import com.ericsson.alodiga.respuestas.RespuestaListadoTipoEmpresa;
import com.ericsson.alodiga.respuestas.RespuestaListadoUsuarios;
import com.ericsson.alodiga.respuestas.RespuestaNuevoToken;
import com.ericsson.alodiga.respuestas.RespuestaPreguntasSecretas;
import com.ericsson.alodiga.respuestas.RespuestaPreguntasSecretasUsuario;
import com.ericsson.alodiga.respuestas.RespuestaToken;
import com.ericsson.alodiga.respuestas.RespuestaUsuario;
import com.ericsson.alodiga.utils.Conexion;
import com.ericsson.alodiga.utils.Constante;
import com.ericsson.alodiga.utils.Encryptor;
import com.ericsson.alodiga.utils.SendCallRegister;
import com.ericsson.alodiga.utils.Utils;


@Stateless(name = "FsProcessor", mappedName = "ejb/FsProcessor")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class APIOperations {

	@PersistenceContext(unitName = "aloDiga")
	private EntityManager entityManager;

	@PersistenceContext(unitName = "saat")
	private EntityManager entityManagerSaat;

	private static final Logger logger = Logger.getLogger(APIOperations.class);

	private boolean validarUsuario(String usuario, String password) {
		UsuarioWS usuarioWS = entityManager
				.createNamedQuery("UsuarioWS.findUserAndPassword",
						UsuarioWS.class).setMaxResults(1).getSingleResult();
		return (usuarioWS.getUsuario().equals(usuario) && usuarioWS
				.getPassword().equals(password));
	}

	public RespuestaListadoAplicaciones getAplicaciones(String usuarioApi,
			String passwordApi) {
		try {
			if (validarUsuario(usuarioApi, passwordApi)) {
				List<Aplicacion> lista = getAplicaciones();
				return new RespuestaListadoAplicaciones(CodigoRespuesta.EXITO,
						null, lista);
			} else {
				return new RespuestaListadoAplicaciones(
						CodigoRespuesta.ERROR_CREDENCIALES);
			}
		} catch (Exception e) {
			logger.error(e);
			return new RespuestaListadoAplicaciones(
					CodigoRespuesta.ERROR_INTERNO, e.getMessage());
		}
	}

	public RespuestaListadoOcupaciones getOcupaciones(String usuarioApi,
			String passwordApi) {
		try {
			if (validarUsuario(usuarioApi, passwordApi)) {
				List<Ocupacion> lista = getOcupaciones();
				return new RespuestaListadoOcupaciones(CodigoRespuesta.EXITO,
						null, lista);
			} else {
				return new RespuestaListadoOcupaciones(
						CodigoRespuesta.ERROR_CREDENCIALES);
			}
		} catch (Exception e) {
			logger.error(e);
			return new RespuestaListadoOcupaciones(
					CodigoRespuesta.ERROR_INTERNO, e.getMessage());
		}
	}

	public RespuestaListadoTipoDocumento getTiposDocumento(String usuarioApi,
			String passwordApi) {
		try {
			if (validarUsuario(usuarioApi, passwordApi)) {
				List<TipoDocumento> lista = getTipoDocumento();
				return new RespuestaListadoTipoDocumento(CodigoRespuesta.EXITO,
						null, lista);
			} else {
				return new RespuestaListadoTipoDocumento(
						CodigoRespuesta.ERROR_CREDENCIALES);
			}
		} catch (Exception e) {
			logger.error(e);
			return new RespuestaListadoTipoDocumento(
					CodigoRespuesta.ERROR_INTERNO, e.getMessage());
		}
	}

	public RespuestaListadoTipoEmpresa getTiposEmpresa(String usuarioApi,
			String passwordApi) {
		try {
			if (validarUsuario(usuarioApi, passwordApi)) {
				List<TipoEmpresa> lista = getTipoEmpresa();
				return new RespuestaListadoTipoEmpresa(CodigoRespuesta.EXITO,
						null, lista);
			} else {
				return new RespuestaListadoTipoEmpresa(
						CodigoRespuesta.ERROR_CREDENCIALES);
			}
		} catch (Exception e) {
			logger.error(e);
			return new RespuestaListadoTipoEmpresa(
					CodigoRespuesta.ERROR_INTERNO, e.getMessage());
		}
	}

	
	public RespuestaListadoEmpresa getListaEmpresaPorPosTipoPersona(
			String usuarioApi, String passwordApi, String descripcion,
			String tipoPersona) {

		try {
			if (validarUsuario(usuarioApi, passwordApi)) {

				List<Empresa> lista = getListaEmpresaPorPosTipoPersona(
						descripcion, tipoPersona);
				return new RespuestaListadoEmpresa(CodigoRespuesta.EXITO, null,
						lista);
			} else {

				return new RespuestaListadoEmpresa(
						CodigoRespuesta.ERROR_CREDENCIALES);
			}
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
			return new RespuestaListadoEmpresa(CodigoRespuesta.ERROR_INTERNO,
					e.getMessage());
		}
	}

	public RespuestaGuardarUsuario guardarUsuario(String usuarioApi,
			String passwordApi, String usuarioId, String nombre,
			String apellido, String credencial, String email, String movil,
			String fechaNacimiento, String direccion, String paisId,
			String estadoId, String ciudadId, String condadoId,
			String codigoPostal, String codigoValidacionMovil,
			String nombreImagen, byte[] imagenBytes, String link,boolean isSocialNetwork) {
                         link = "http://llamadas.alodiga.com/site/welcome";
		try {
			if (validarUsuario(usuarioApi, passwordApi)) {
				String codigoGenerado = "";
				Usuario usuario;
				Direccion direccion1;
				Imagen imagen1;
				if (nombre == null || nombre.trim().equals("")) {
					return new RespuestaGuardarUsuario(
							CodigoRespuesta.DATOS_INVALIDOS,
							Utils.obtieneMensaje("null.name"));
                               }
				 else {
					if (!nombre.matches(Utils
							.obtienePropiedad("REGEX_ENCOUDING_UTF-8"))) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.DATOS_INVALIDOS,
								Utils.obtieneMensaje("invalid.name"));
					}
				}
				if (apellido == null || apellido.trim().equals("")) {
					return new RespuestaGuardarUsuario(
							CodigoRespuesta.DATOS_INVALIDOS,
							Utils.obtieneMensaje("null.lastname"));
				} 
                                else {
					if (!apellido.matches(Utils
							.obtienePropiedad("REGEX_ENCOUDING_UTF-8"))) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.DATOS_INVALIDOS,
								Utils.obtieneMensaje("invalid.lastname"));
					}
				}
				if (usuarioId == null || usuarioId.equals("")) {
					usuario = new Usuario();
					direccion1 = new Direccion();
					imagen1 = new Imagen();
					Estado estado1 = isSocialNetwork?getEstadoPorDescripcion(Estado.ACTIVO):getEstadoPorDescripcion(Estado.PENDIENTE)  ;
					usuario.setEstado(estado1);
					usuario.setIntentosFallidos(0);
					if (!isEmailUnique(email)) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.CORREO_YA_EXISTE);
					}
					if (!isMovilUnique(movil)) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.NUMERO_TELEFONO_YA_EXISTE);
					}
					try {
						codigoGenerado = getMovilCodigoPorMovil(movil)
								.getCodigo();
					} catch (NoResultException e) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.GENERAR_CODIGO);
					}
					if (!codigoValidacionMovil.equals(codigoGenerado)) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.CODIGO_VALIDACION_INVALIDO);
					}
				} else {
					usuario = entityManager.find(Usuario.class,
							Integer.parseInt(usuarioId));
					if (credencial == null || credencial.trim().equals("")) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.DATOS_INVALIDOS,
								Utils.obtieneMensaje("null.password"));
					}
					if (email == null || email.trim().equals("")) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.DATOS_INVALIDOS,
								Utils.obtieneMensaje("null.email"));
					}
					if (movil == null || movil.trim().equals("")) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.DATOS_INVALIDOS,
								Utils.obtieneMensaje("null.phonenumber"));
					}
					if (!isEmailUnique(email)) {
						if (!email.equalsIgnoreCase(usuario.getEmail())) {
							return new RespuestaGuardarUsuario(
									CodigoRespuesta.CORREO_YA_EXISTE);
						}
					}
					if (isMovilUnique(movil)) {
						try {
							codigoGenerado = getMovilCodigoPorMovil(movil)
									.getCodigo();
						} catch (NoResultException e) {
							return new RespuestaGuardarUsuario(
									CodigoRespuesta.GENERAR_CODIGO);
						}
						if (!codigoValidacionMovil.equals(codigoGenerado)) {
							return new RespuestaGuardarUsuario(
									CodigoRespuesta.CODIGO_VALIDACION_INVALIDO);
						}
					} else {
						if (!movil.equalsIgnoreCase(usuario.getMovil())) {
							return new RespuestaGuardarUsuario(
									CodigoRespuesta.NUMERO_TELEFONO_YA_EXISTE);
						}
					}
					if (usuario == null) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.USUARIO_NO_EXISTE);
					}
					direccion1 = usuario.getDireccion();
					imagen1 = usuario.getImagen();
					if (imagen1 == null && imagenBytes != null) {
						imagen1 = new Imagen();
					}
				}
				if (paisId == null || paisId.equals("")
						|| Integer.parseInt(paisId) == 0) {
					return new RespuestaGuardarUsuario(
							CodigoRespuesta.DATOS_INVALIDOS, "PAIS_NULO");
				}
				logger.debug("saving user " + usuario.getNombre());
				usuario.setApellido(apellido);
				direccion1.setCiudadId(!StringUtils.isEmpty(ciudadId) ? Integer
						.parseInt(ciudadId) : 0);
				direccion1
						.setCondadoId(!StringUtils.isEmpty(condadoId) ? Integer
								.parseInt(condadoId) : 0);
				direccion1.setCodigoPostal(codigoPostal);
				direccion1.setDireccion(direccion);
				direccion1.setEstadoId(!StringUtils.isEmpty(estadoId) ? Integer
						.parseInt(estadoId) : 0);
				direccion1.setPaisId(!StringUtils.isEmpty(paisId) ? Integer
						.parseInt(paisId) : 0);
				usuario.setDireccion(direccion1);
				if (nombreImagen != null)
					imagen1.setNombre(nombreImagen);
				if (imagenBytes != null)
					imagen1.setImagen(imagenBytes);
				usuario.setImagen(imagen1);
				usuario.setEmail(email);
                             
				Cuenta cuenta = new Cuenta();
				cuenta.setNumeroCuenta(Utils.generarNumeroDeCuenta());
				cuenta.setSaldoAlocoins(0d);
				cuenta.setSaldoAlodiga(0d);
				cuenta.setSaldoHealthCareCoins(0d);
				usuario.setCuenta(cuenta);
                                if (null != fechaNacimiento) {
                                        DateFormat format = new SimpleDateFormat("dd-MM-yyyy",
                                        Locale.ENGLISH);
                                        Date date = format.parse(fechaNacimiento);
                                        usuario.setFechaNacimiento(date);
                                }
                                usuario.setMovil(movil);
				usuario.setNombre(nombre);
				usuario.setCredencial(credencial);
				usuario.setCredencialFecha(new Date());

				logger.debug("usuario: --->" + usuario);
				logger.debug("direccion1: --->" + direccion1);
				logger.debug("cuenta: --->" + cuenta);

				if (usuarioId == null) {
					entityManager.persist(usuario);
					logger.info("**************Sending email to user ********************"
							+ usuario.getNombre());

					Utils.enviarCorreUsuarioNuevo("ES", usuario, link);
                                        usuario.setEmail(email);
				} else {
					entityManager.merge(usuario);
				}
				return new RespuestaGuardarUsuario(CodigoRespuesta.EXITO,
						CodigoRespuesta.EXITO.name(), usuario);
			}
			return new RespuestaGuardarUsuario(
					CodigoRespuesta.ERROR_CREDENCIALES);
		} catch (ConstraintViolationException e) {
			ConstraintViolationImpl<?> cv = (ConstraintViolationImpl<?>) e
					.getConstraintViolations().toArray()[0];
			return new RespuestaGuardarUsuario(CodigoRespuesta.DATOS_INVALIDOS,
					cv.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			return new RespuestaGuardarUsuario(CodigoRespuesta.ERROR_INTERNO,
					"Error - " + e.getMessage() + e.getLocalizedMessage()
							+ e.getCause() + e.getStackTrace());
		}
	}

	private boolean isEmailUnique(String email) {
		try {
			entityManager
					.createNamedQuery("Usuario.findByEmail", Usuario.class)
					.setParameter("email", email).getSingleResult();
		} catch (NoResultException e) {
			return true;
		}
		return false;
	}

	private boolean isMovilUnique(String movil) {
		try {
			entityManager
					.createNamedQuery("Usuario.findByMovil", Usuario.class)
					.setParameter("movil", movil).getSingleResult();
		} catch (NoResultException e) {
			return true;
		}
		return false;
	}

	private boolean isEinUnique(String ein) {
		try {
			entityManager.createNamedQuery("Empresa.findByEin", Empresa.class)
					.setParameter("ein", ein).getSingleResult();
		} catch (NoResultException e) {
			return true;
		}
		return false;
	}

	public RespuestaGuardarDireccionConfianza guardarDireccionConfianza(
			String usuarioApi, String passwordApi, Integer usuarioId, String ip) {
		if (!validarUsuario(usuarioApi, passwordApi)) {
			return new RespuestaGuardarDireccionConfianza(
					CodigoRespuesta.ERROR_CREDENCIALES);
		}
		try {
			DireccionConfianza direccion = new DireccionConfianza();
			direccion.setIp(ip);
			direccion.setUsuario(entityManager.find(Usuario.class, usuarioId));
			direccion.setFecha(new Date());
			entityManager.persist(direccion);
		} catch (NoResultException e) {
			return new RespuestaGuardarDireccionConfianza(
					CodigoRespuesta.USUARIO_NO_EXISTE);
		} catch (Exception e) {
			return new RespuestaGuardarDireccionConfianza(
					CodigoRespuesta.ERROR_INTERNO, e.getLocalizedMessage());
		}
		return new RespuestaGuardarDireccionConfianza(CodigoRespuesta.EXITO);
	}

	public RespuestaPreguntasSecretas getPreguntaIdioma(String usuarioApi,
			String passwordApi, Integer IdIdioma) {
		if (validarUsuario(usuarioApi, passwordApi)) {
			List<PreguntaIdioma> lista = getPreguntaIdioma(IdIdioma);
			return new RespuestaPreguntasSecretas(CodigoRespuesta.EXITO, null,
					lista);
		} else {
			return new RespuestaPreguntasSecretas(
					CodigoRespuesta.DATOS_INVALIDOS);
		}
	}

	public RespuestaPreguntasSecretasUsuario getPreguntasSecretasUsuario(
			String usuarioApi, String passwordApi, Integer usuarioId) {
		if (validarUsuario(usuarioApi, passwordApi)) {
			Usuario usuario = entityManager.find(Usuario.class, usuarioId);
			if (usuario == null) {
				return new RespuestaPreguntasSecretasUsuario(
						CodigoRespuesta.USUARIO_NO_EXISTE);
			}
			if (usuario.getPreguntaSecretas() == null
					|| usuario.getPreguntaSecretas().isEmpty()) {
				return new RespuestaPreguntasSecretasUsuario(
						CodigoRespuesta.PRIMER_INGRESO);
			}
			return new RespuestaPreguntasSecretasUsuario(CodigoRespuesta.EXITO,
					null, usuario.getPreguntaSecretas());
		} else {
			return new RespuestaPreguntasSecretasUsuario(
					CodigoRespuesta.DATOS_INVALIDOS);
		}
	}

	public RespuestaUsuario getUsuarioporemail(String usuarioApi,
			String passwordApi, String email) {
		try {
			if (validarUsuario(usuarioApi, passwordApi)) {
				Usuario usuario = getUsuarioporemail(email);
				if (usuario == null) {
					return new RespuestaUsuario(
							CodigoRespuesta.USUARIO_NO_EXISTE,
							CodigoRespuesta.USUARIO_NO_EXISTE.name(), null);
				}
				return new RespuestaUsuario(CodigoRespuesta.EXITO, null,
						usuario);
			} else {
				return new RespuestaUsuario(CodigoRespuesta.ERROR_CREDENCIALES);
			}
		} catch (NoResultException e) {
			return new RespuestaUsuario(CodigoRespuesta.USUARIO_NO_EXISTE);
		} catch (Exception e) {
			return new RespuestaUsuario(CodigoRespuesta.ERROR_INTERNO,
					e.getMessage());
		}
	}

	public RespuestaUsuario getUsuariopormovil(String usuarioApi,
			String passwordApi, String movil) {
		try {
			if (validarUsuario(usuarioApi, passwordApi)) {
				Usuario usuario = getUsuariopormovil(movil);
				if (usuario == null) {
					return new RespuestaUsuario(
							CodigoRespuesta.USUARIO_NO_EXISTE,
							CodigoRespuesta.USUARIO_NO_EXISTE.name(), null);
				}
				return new RespuestaUsuario(CodigoRespuesta.EXITO, null,
						usuario);
			} else {
				return new RespuestaUsuario(CodigoRespuesta.ERROR_CREDENCIALES);
			}
		} catch (NoResultException e) {
			return new RespuestaUsuario(CodigoRespuesta.USUARIO_NO_EXISTE);
		} catch (Exception e) {
			return new RespuestaUsuario(CodigoRespuesta.ERROR_INTERNO,
					e.getMessage());
		}
	}

	public RespuestaUsuario getUsuarioporId(String usuarioApi,
			String passwordApi, String usuarioId) {
		try {
			if (validarUsuario(usuarioApi, passwordApi)) {
				Usuario usuario = entityManager.find(Usuario.class,
						Integer.parseInt(usuarioId));
				return new RespuestaUsuario(CodigoRespuesta.EXITO,
						CodigoRespuesta.EXITO.name(), usuario);
			} else {
				return new RespuestaUsuario(CodigoRespuesta.ERROR_CREDENCIALES);
			}
		} catch (NoResultException e) {
			return new RespuestaUsuario(CodigoRespuesta.USUARIO_NO_EXISTE);
		} catch (Exception e) {
			return new RespuestaUsuario(CodigoRespuesta.ERROR_INTERNO,
					e.getMessage());
		}
	}
	//compraAlocoins
	public Respuesta compraAlocoins(String usuarioId, Double cantidad) throws Exception{
		Respuesta resultado=null;
		logger.debug(usuarioId);
		logger.debug(cantidad);
		try{
			Usuario usuario = entityManager.find(Usuario.class,
						Integer.parseInt(usuarioId));
			Cuenta cuenta = usuario.getCuenta();
			cuenta.setSaldoAlocoins(cantidad);
			usuario.setCuenta(cuenta);
			entityManager.merge(usuario);
			resultado=new Respuesta(null,Constante.sERR_COD_00,"Acreditado");		
		}catch(Exception e){
			logger.error(e);
			resultado=new Respuesta(null,Constante.sERR_COD_99,e.getMessage());
			throw e;
		}
		return resultado;
	}

	public RespuestaListadoUsuarios getAplicacionUsuario(String usuarioApi,
			String passwordApi, Integer IdAplicaciones) {
		if (validarUsuario(usuarioApi, passwordApi)) {
			// List<AplicacionUsuario> lista =
			// getAplicacionUsuario(IdAplicaciones);
			return null;
			// return new RespuestaListadoUsuarios(
			// CodigoRespuesta.EXITO, null, lista);
		} else {
			return new RespuestaListadoUsuarios(CodigoRespuesta.DATOS_INVALIDOS);
		}
	}

	public Respuesta activarUsuarioPorCorreo(String usuarioApi,
			String passwordApi, String correo) {
		if (validarUsuario(usuarioApi, passwordApi)) {
			if (correo == null || correo.equals("")) {
				return new Respuesta(CodigoRespuesta.DATOS_NULOS);
			}
			Usuario usuario = null;
			try {

				usuario = getUsuarioporemail(Encryptor.decrypt(
						Utils.obtienePropiedad("ENC_KEY"),
						Utils.obtienePropiedad("ENC_INIT_VALUE"), correo));

			} catch (Exception e) {
				logger.debug("Error al obtener usuario: " + e);
				return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
			}
			if (usuario == null) {
				return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
			}
			usuario.setEstado(getEstadoPorDescripcion(Estado.ACTIVO));
			entityManager.merge(usuario);
			return new Respuesta(CodigoRespuesta.EXITO);
		} else {
			return new Respuesta(CodigoRespuesta.ERROR_CREDENCIALES);
		}
	}

	public Respuesta activarUsuario(String usuarioApi, String passwordApi,
			Integer usuarioId) {
		if (validarUsuario(usuarioApi, passwordApi)) {
			Usuario usuario = null;
			if (usuarioId == null || usuarioId == 0) {
				return new RespuestaPreguntasSecretasUsuario(
						CodigoRespuesta.USUARIO_NO_EXISTE);
			} else {
				usuario = entityManager.find(Usuario.class, usuarioId);
				if (usuario == null) {
					return new RespuestaPreguntasSecretasUsuario(
							CodigoRespuesta.USUARIO_NO_EXISTE);
				}
			}
			usuario.setEstado(getEstadoPorDescripcion(Estado.ACTIVO));
			entityManager.merge(usuario);
			return new Respuesta(CodigoRespuesta.EXITO);
		} else {
			return new Respuesta(CodigoRespuesta.DATOS_INVALIDOS);
		}
	}

	public RespuestaListadoUsuarios getUsuarios(String usuarioApi,
			String passwordApi) {
		if (validarUsuario(usuarioApi, passwordApi)) {
			List<Usuario> usuarios = findAllUsers();
			return new RespuestaListadoUsuarios(CodigoRespuesta.EXITO, null,
					usuarios);
		} else {
			return new RespuestaListadoUsuarios(
					CodigoRespuesta.ERROR_CREDENCIALES);
		}
	}

	public RespuestaGuardarUsuario guardarPerfilAloPos(String usuarioApi,
			String passwordApi, Integer usuarioId, String genero,
			String telefonoResidencial, Integer ocupacionId,
			String tipoDocumentoId, String numeroDocumento,
			String nombreEmpresa, String emailEmpresa, Integer tipoEmpresaId,
			String einEmpresa, String telefonoEmpresa, String tipoPersona,
			String fechaVencimientoDocumento, String ingresosEstimadosEmpresa,
			String direccionEmpresa, Integer paisEmpresaId,
			Integer estadoEmpresaId, Integer ciudadEmpresaId,
			String codigoPostalEmpresa, Integer tipoCuentaBancariaId,
			String numeroRutaBancaria, String numeroCuentaBancaria,
			Integer bancoId) {
		if (!validarUsuario(usuarioApi, passwordApi)) {
			return new RespuestaGuardarUsuario(
					CodigoRespuesta.ERROR_CREDENCIALES);
		}
		Usuario usuario = null;
		try {

			if (usuarioId == null || genero == null
					|| telefonoResidencial == null || ocupacionId == null
					|| tipoDocumentoId == null || numeroDocumento == null
					|| nombreEmpresa == null || emailEmpresa == null
					|| tipoEmpresaId == null || einEmpresa == null
					|| telefonoEmpresa == null || tipoPersona == null
					|| ingresosEstimadosEmpresa == null
					|| direccionEmpresa == null || paisEmpresaId == null
					|| estadoEmpresaId == null || ciudadEmpresaId == null
					|| codigoPostalEmpresa == null
					|| tipoCuentaBancariaId == null
					|| numeroRutaBancaria == null
					|| numeroCuentaBancaria == null || usuarioId == 0
					|| genero == "" || telefonoResidencial == ""
					|| ocupacionId == 0 || tipoDocumentoId == ""
					|| numeroDocumento == "" || nombreEmpresa == ""
					|| emailEmpresa == "" || tipoEmpresaId == 0
					|| einEmpresa == "" || telefonoEmpresa == ""
					|| ingresosEstimadosEmpresa == "" || direccionEmpresa == ""
					|| paisEmpresaId == 0 || estadoEmpresaId == 0
					|| ciudadEmpresaId == 0 || codigoPostalEmpresa == ""
					|| numeroRutaBancaria == "" || numeroCuentaBancaria == "") {
				return new RespuestaGuardarUsuario(CodigoRespuesta.DATOS_NULOS);
			}
			if (genero != null) {
				if (!(genero.equalsIgnoreCase("M") || genero
						.equalsIgnoreCase("F"))) {
					return new RespuestaGuardarUsuario(
							CodigoRespuesta.DATOS_INVALIDOS);
				}
			}
			if (telefonoResidencial != null) {
				if (!(telefonoResidencial.length() > 11)
						&& !(telefonoResidencial.length() <= 16)) {
					return new RespuestaGuardarUsuario(
							CodigoRespuesta.DATOS_INVALIDOS);
				}
			}
			usuario = entityManager.find(Usuario.class, usuarioId);
			if (!isEinUnique(einEmpresa)) {
				try {
					if (!usuario.getPerfilAloPos().getEmpresa().getEin()
							.equalsIgnoreCase(einEmpresa)) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.EIN_YA_EXISTE);
					}
				} catch (Exception e) {
					return new RespuestaGuardarUsuario(
							CodigoRespuesta.EIN_YA_EXISTE);
				}
			}
			if (!existeAplicacion(usuario.getAplicaciones(), "ALOPOS")) {
				Aplicacion aplicacion = getAplicacionporNombre("ALOPOS");
				usuario.getAplicaciones().add(aplicacion);
			}

			if (genero == null || genero == "") {
				usuario.getGenero();
			} else {
				usuario.setGenero(genero);
			}
			if (telefonoResidencial == null || telefonoResidencial == "") {
				usuario.getTelefonoResidencial();
			} else {
				usuario.setTelefonoResidencial(telefonoResidencial);
			}
			if (ocupacionId == null) {
				usuario.getOcupacion();
			} else {
				Ocupacion ocupacion = entityManager.find(Ocupacion.class,
						ocupacionId);
				usuario.setOcupacion(ocupacion);
			}
			TipoDocumento tipoDocumento = entityManager.find(
					TipoDocumento.class, Integer.parseInt(tipoDocumentoId));
			usuario.setTipoDocumento(tipoDocumento);
			usuario.setNumeroDocumento(numeroDocumento);
			Empresa empresa = null;
			CuentaBancaria cuentaBancaria = null;
			Direccion direccion = null;
			PerfilAloPos perfil = null;
			if (usuario.getPerfilAloPos() == null) {
				empresa = new Empresa();
				cuentaBancaria = new CuentaBancaria();
				direccion = new Direccion();
				perfil = new PerfilAloPos();
			} else {
				empresa = usuario.getPerfilAloPos().getEmpresa();
				cuentaBancaria = usuario.getPerfilAloPos().getEmpresa()
						.getCuentaBancaria();
				direccion = usuario.getPerfilAloPos().getEmpresa()
						.getDireccion();
				perfil = usuario.getPerfilAloPos();
			}
			Banco banco = entityManager.find(Banco.class, bancoId);
			cuentaBancaria.setBanco(banco);
			cuentaBancaria.setNumeroCuenta(numeroCuentaBancaria);
			cuentaBancaria.setNumeroRuta(numeroRutaBancaria);
			CuentaBancariaTipo cbt = entityManager.find(
					CuentaBancariaTipo.class, tipoCuentaBancariaId);
			cuentaBancaria.setCuentaBancariaTipo(cbt);

			direccion.setCiudadId(ciudadEmpresaId);
			direccion.setCodigoPostal(codigoPostalEmpresa);
			direccion.setDireccion(direccionEmpresa);
			direccion.setEstadoId(estadoEmpresaId);
			direccion.setPaisId(paisEmpresaId);

			empresa.setCuentaBancaria(cuentaBancaria);
			empresa.setDireccion(direccion);
			empresa.setEin(einEmpresa);

			empresa.setEmail(emailEmpresa);
			if (ingresosEstimadosEmpresa == null
					|| ingresosEstimadosEmpresa == "") {
				empresa.getIngresosEstimados();
			} else {
				empresa.setIngresosEstimados(Double
						.parseDouble(ingresosEstimadosEmpresa));
			}
			empresa.setNombre(nombreEmpresa);
			empresa.setTelefono(telefonoEmpresa);
			TipoEmpresa tipoEmpresa = entityManager.find(TipoEmpresa.class,
					tipoEmpresaId);
			empresa.setTipoEmpresa(tipoEmpresa);

			perfil.setEmpresa(empresa);
			perfil.setTipoPersona(tipoPersona);
			if (tipoPersona == "NATURAL"){
				if (fechaVencimientoDocumento == null
						|| fechaVencimientoDocumento == "") {
					perfil.getFechaVencimientoDocumento();
				} else {
					DateFormat format = new SimpleDateFormat("dd-MM-yyyy",
							Locale.ENGLISH);
					Date date = format.parse(fechaVencimientoDocumento);
					perfil.setFechaVencimientoDocumento(date);
				}
			}
			
			usuario.setPerfilAloPos(perfil);
			// TODO deshabilitado hasta tener el certificado
			/*
			 * try { logger.debug("Verificando usuario en Lexis nexis."); if
			 * (Utils.esUsuarioFraudulento(usuario)) { return new
			 * RespuestaGuardarUsuario(CodigoRespuesta.USUARIO_SOSPECHOSO); }
			 * else { logger.debug("Usuario no es sospechoso."); } } catch
			 * (Exception e) { logger.error("Error LexisNexis ", e); return new
			 * RespuestaGuardarUsuario(CodigoRespuesta.ERROR_INTERNO,
			 * "Error revisando usuario en LexisNexis"); }
			 */
			entityManager.merge(usuario);
			Utils.enviarCorreoConfirmacion("ES", usuario, "ALOPOS");
		} catch (ConstraintViolationException e) {
			return new RespuestaGuardarUsuario(CodigoRespuesta.DATOS_INVALIDOS,
					e.getLocalizedMessage());
		} catch (Exception e) {

			System.out.println(e);
			return new RespuestaGuardarUsuario(CodigoRespuesta.ERROR_INTERNO,
					"Error - " + e.getMessage() + e.getLocalizedMessage()
							+ e.getCause() + e.getStackTrace());
		}
		return new RespuestaGuardarUsuario(CodigoRespuesta.EXITO, null, usuario);
	}

	public RespuestaUsuario getUsuarioporAplicacion(String usuarioApi,
			String passwordApi, Integer usuarioId, Integer aplicacionId) {
		try {
			if (validarUsuario(usuarioApi, passwordApi)) {
				if (usuarioId == null || aplicacionId == null) {
					return new RespuestaUsuario(CodigoRespuesta.DATOS_NULOS);
				}
				Usuario usuario = entityManager.find(Usuario.class, usuarioId);
				if (usuario == null) {
					return new RespuestaUsuario(
							CodigoRespuesta.USUARIO_NO_EXISTE);
				}
				try {
					Aplicacion aplicacion = entityManager.find(
							Aplicacion.class, aplicacionId);
					if (aplicacion == null) {
						return new RespuestaUsuario(
								CodigoRespuesta.APLICACION_NO_EXISTE);
					}
				} catch (NoResultException e) {
					return new RespuestaUsuario(
							CodigoRespuesta.APLICACION_NO_EXISTE);
				}

				return new RespuestaUsuario(CodigoRespuesta.EXITO, null,
						usuario);
			} else {
				return new RespuestaUsuario(CodigoRespuesta.ERROR_CREDENCIALES);
			}
		} catch (NoResultException e) {
			return new RespuestaUsuario(CodigoRespuesta.USUARIO_NO_EXISTE);
		} catch (Exception e) {
			return new RespuestaUsuario(CodigoRespuesta.ERROR_INTERNO,
					e.getMessage());
		}
	}

	public RespuestaGuardarUsuario guardarPerfilAloCash(String usuarioApi,
			String passwordApi, Integer usuarioId, String genero,
			String telefonoResidencial, String ocupacionId,
			String tipoDocumentoId, String numeroDocumento) {
		if (!validarUsuario(usuarioApi, passwordApi)) {
			return new RespuestaGuardarUsuario(
					CodigoRespuesta.ERROR_CREDENCIALES);
		}
		Usuario usuario = null;
		try {

			if ((usuarioId == null || genero == null
					|| telefonoResidencial == null || ocupacionId == null
					|| tipoDocumentoId == null || numeroDocumento == null)
					|| (usuarioId == 0 || genero == ""
							|| telefonoResidencial == "" || ocupacionId == "0"
							|| tipoDocumentoId == "" || numeroDocumento == "")) {
				return new RespuestaGuardarUsuario(
						CodigoRespuesta.DATOS_INVALIDOS);
			}

			if (!(genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("F"))) {
				return new RespuestaGuardarUsuario(
						CodigoRespuesta.DATOS_INVALIDOS);
			}

			if (!(Utils.isNumeroValido(ocupacionId))
					|| !(Utils.isNumeroValido(tipoDocumentoId))) {
				return new RespuestaGuardarUsuario(
						CodigoRespuesta.DATOS_INVALIDOS);
			}

			if (!(telefonoResidencial.length() >= 11)
					|| !(telefonoResidencial.length() <= 16)
					|| !(Utils.isNumeroValido(telefonoResidencial))) {
				return new RespuestaGuardarUsuario(
						CodigoRespuesta.DATOS_INVALIDOS);
			}
			usuario = entityManager.find(Usuario.class, usuarioId);
			usuario.setGenero(genero);
			usuario.setNumeroDocumento(numeroDocumento);
			Ocupacion ocupacion = entityManager.find(Ocupacion.class,
					Integer.parseInt(ocupacionId));
			usuario.setOcupacion(ocupacion);
			TipoDocumento tipoDocumento = entityManager.find(
					TipoDocumento.class, Integer.parseInt(tipoDocumentoId));
			usuario.setTipoDocumento(tipoDocumento);
			usuario.setTelefonoResidencial(telefonoResidencial);

			if (!existeAplicacion(usuario.getAplicaciones(), "ALOCASH")) {
				Aplicacion aplicacion = getAplicacionporNombre("ALOCASH");
				usuario.getAplicaciones().add(aplicacion);
			}
			// TODO deshabilitado hasta tener el certificado
			// try {
			// logger.debug("Verificando usuario en Lexis nexis.");
			// if (Utils.esUsuarioFraudulento(usuario)) {
			// return new RespuestaGuardarUsuario(
			// CodigoRespuesta.USUARIO_SOSPECHOSO);
			// } else {
			// logger.debug("Usuario no es sospechoso.");
			// }
			// } catch (Exception e) {
			// logger.error("Error LexisNexis ", e);
			// return new RespuestaGuardarUsuario(
			// CodigoRespuesta.ERROR_INTERNO,
			// "Error revisando usuario en LexisNexis");
			// }
			entityManager.merge(usuario);
			Utils.enviarCorreoConfirmacion("ES", usuario, "ALOCASH");
		} catch (ConstraintViolationException e) {
			return new RespuestaGuardarUsuario(CodigoRespuesta.DATOS_INVALIDOS,
					e.getLocalizedMessage());
		}
		return new RespuestaGuardarUsuario(CodigoRespuesta.EXITO, null, usuario);
	}

	public RespuestaGuardarUsuario guardarPerfilAloEsp(String usuarioApi,
			String passwordApi, Integer usuarioId, String tipoCuenta,
			String nombreTienda, double montoMaximo, String einTienda,
			String taxTienda, String razonSocial,
			String telefonoEstablecimiento, String idiomaEnvio) {

		if (!Utils.isStringValido(tipoCuenta)
				|| !Utils.isStringValido(nombreTienda)
				|| !Utils.isStringValido(einTienda)
				|| !Utils.isStringValido(taxTienda)
				|| !Utils.isStringValido(razonSocial)
				|| !Utils.isNumeroValido(telefonoEstablecimiento)
				|| !Utils.isStringValido(idiomaEnvio)) {
			return new RespuestaGuardarUsuario(CodigoRespuesta.DATOS_INVALIDOS);
		}

		if (!validarUsuario(usuarioApi, passwordApi)) {
			return new RespuestaGuardarUsuario(
					CodigoRespuesta.ERROR_CREDENCIALES);
		}

		Usuario usuario = entityManager.find(Usuario.class, usuarioId);
		if (usuario.getPerfilAloEsp() == null) {
			Aplicacion aplicacion = getAplicacionporNombre("ALOESP");
			usuario.getAplicaciones().add(aplicacion);
			usuario.setPerfilAloEsp(new PerfilAloESP(einTienda, idiomaEnvio,
					montoMaximo, nombreTienda, razonSocial, taxTienda,
					telefonoEstablecimiento, tipoCuenta));
		} else {
			usuario.getPerfilAloEsp().setPerfilAloESP(einTienda, idiomaEnvio,
					montoMaximo, nombreTienda, razonSocial, taxTienda,
					telefonoEstablecimiento, tipoCuenta);
		}
		// TODO deshabilitado hasta tener el certificado
		try {
			logger.debug("Verificando usuario en Lexis nexis.");
			if (Utils.esUsuarioFraudulento(usuario)) {
				return new RespuestaGuardarUsuario(
						CodigoRespuesta.USUARIO_SOSPECHOSO);
			} else {
				logger.debug("Usuario no es sospechoso.");
			}
		} catch (Exception e) {
			logger.error("Error LexisNexis ", e);
			return new RespuestaGuardarUsuario(CodigoRespuesta.ERROR_INTERNO,
					"Error revisando usuario en LexisNexis");
		}
		entityManager.merge(usuario);
		Utils.enviarCorreoConfirmacion("ES", usuario, "ALOESP");
		return new RespuestaGuardarUsuario(CodigoRespuesta.EXITO, null, usuario);
	}

	public RespuestaGuardarUsuario guardarPerfilAloRRP(String usuarioApi,
			String passwordApi, Integer usuarioId, boolean kitAfiliacion,
			String empresaId, String distribuidorPadreId) {
		if (!validarUsuario(usuarioApi, passwordApi)) {
			return new RespuestaGuardarUsuario(
					CodigoRespuesta.ERROR_CREDENCIALES);
		}
		Usuario usuario = null;
		try {
			if ((usuarioId == null || empresaId == null)
					|| (usuarioId == 0 || empresaId == "0")) {
				return new RespuestaGuardarUsuario(
						CodigoRespuesta.DATOS_INVALIDOS);
			}

			if (!(Utils.isNumeroValido(empresaId))
					|| (distribuidorPadreId != null && !(Utils
							.isNumeroValido(distribuidorPadreId)))) {
				return new RespuestaGuardarUsuario(
						CodigoRespuesta.DATOS_INVALIDOS);
			}

			usuario = entityManager.find(Usuario.class, usuarioId);

			PerfilAloRRP perfil = usuario.getPerfilAloRrp();
			if (perfil == null) {
				perfil = new PerfilAloRRP();
			}
			if (distribuidorPadreId != null)
				perfil.setDistribuidorPadreId(Integer
						.parseInt(distribuidorPadreId));
			perfil.setEmpresaId(Integer.parseInt(empresaId));
			perfil.setIsAffiliatedKit(kitAfiliacion);
			usuario.setPerfilAloRrp(perfil);

			if (!existeAplicacion(usuario.getAplicaciones(), "ALORRP")) {
				Aplicacion aplicacion = getAplicacionporNombre("ALORRP");
				usuario.getAplicaciones().add(aplicacion);
			}
			entityManager.merge(usuario);
			Utils.enviarCorreoConfirmacion("ES", usuario, "ALORRP");
		} catch (ConstraintViolationException e) {
			return new RespuestaGuardarUsuario(CodigoRespuesta.DATOS_INVALIDOS,
					e.getLocalizedMessage());
		}
		return new RespuestaGuardarUsuario(CodigoRespuesta.EXITO, null, usuario);
	}

	public RespuestaGuardarUsuario guardarPerfilAloBenefit(String usuarioApi,
			String passwordApi, Integer usuarioId) {
		if (!validarUsuario(usuarioApi, passwordApi)) {
			return new RespuestaGuardarUsuario(
					CodigoRespuesta.ERROR_CREDENCIALES);
		}
		Usuario usuario = entityManager.find(Usuario.class, usuarioId);
		if (!existeAplicacion(usuario.getAplicaciones(), "ALOBENEFIT")) {
			Utils.enviarCorreoConfirmacion("ES", usuario, "ALOBENEFIT");
			Aplicacion aplicacion = getAplicacionporNombre("ALOBENEFIT");
			usuario.getAplicaciones().add(aplicacion);
			// entityManager.merge(usuario);
		}
		return new RespuestaGuardarUsuario(CodigoRespuesta.EXITO, null, usuario);
	}

	public Respuesta guardarBitacora(Integer usuarioId, String ip, String accion) {

		Usuario usuario = entityManager.find(Usuario.class, usuarioId);
		try {
			Accion action = entityManager
					.createNamedQuery("Accion.byDescripcion", Accion.class)
					.setParameter("descripcion", accion.toUpperCase())
					.getSingleResult();
			entityManager.persist(new Bitacora(ip, action, usuario));
		} catch (Exception e) {
			return new Respuesta(CodigoRespuesta.DATOS_INVALIDOS);
		}

		return new Respuesta(CodigoRespuesta.EXITO);
	}

	public Respuesta logout(String usuarioApi, String passwordApi, String token) {
		try {
			if (!validarUsuario(usuarioApi, passwordApi)) {
				return new Respuesta(CodigoRespuesta.ERROR_CREDENCIALES);
			}
			if (token == null || token.equals("")) {
				return new Respuesta(CodigoRespuesta.DATOS_NULOS);
			}
			SesionUsuario sesion = entityManager
					.createNamedQuery("getEstadoByToken", SesionUsuario.class)
					.setParameter("token", token).getSingleResult();
			if (sesion.isActivo()) {
				sesion.setActivo(false);
			} else {
				return new Respuesta(CodigoRespuesta.TOKEN_EXPIRADO);
			}

			Accion action = entityManager
					.createNamedQuery("Accion.byDescripcion", Accion.class)
					.setParameter("descripcion", Accion.LOGOUT)
					.getSingleResult();
			entityManager.persist(new Bitacora(null, action, sesion
					.getUsuario()));
			entityManager.merge(sesion);
		} catch (NoResultException e) {
			return new Respuesta(CodigoRespuesta.DATOS_INVALIDOS);
		} catch (Exception e) {
			return new Respuesta(CodigoRespuesta.ERROR_INTERNO);
		}
		return new Respuesta(CodigoRespuesta.EXITO);
	}

	public Respuesta desbloquearUsuario(String usuarioApi, String passwordApi,
			Integer usuarioId, List<PreguntaSecreta> preguntasSecretasEnviadas) {
		Usuario usuario = null;
		if (preguntasSecretasEnviadas == null
				|| preguntasSecretasEnviadas.isEmpty()
				|| preguntasSecretasEnviadas.size() < 2) {
			return new Respuesta(CodigoRespuesta.DATOS_NULOS);
		} else {
			try {
				if (!validarUsuario(usuarioApi, passwordApi)) {
					return new Respuesta(CodigoRespuesta.ERROR_CREDENCIALES);
				}
				usuario = entityManager.find(Usuario.class, usuarioId);
				List<PreguntaSecreta> preguntasSecretasGuardadas = usuario
						.getPreguntaSecretas();
				for (PreguntaSecreta preguntaSecretaEnviada : preguntasSecretasEnviadas) {
					if (!(preguntaSecretaEnviada.getRespuesta()
							.equals(obtenerPreguntaSecreta(
									preguntaSecretaEnviada.getPreguntaId(),
									preguntasSecretasGuardadas).getRespuesta()))) {
						return new Respuesta(CodigoRespuesta.DATOS_INVALIDOS);
					}
				}
			} catch (NoResultException e) {
				return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
			} catch (Exception e) {
				return new Respuesta(CodigoRespuesta.ERROR_INTERNO);
			}
			Estado estado = entityManager
					.createNamedQuery("Estado.findByDescription", Estado.class)
					.setParameter("descripcion", Estado.ACTIVO)
					.getSingleResult();
			usuario.setEstado(estado);
			usuario.setIntentosFallidos(0);
			entityManager.merge(usuario);
			return new Respuesta(CodigoRespuesta.EXITO);
		}
	}

	private PreguntaSecreta obtenerPreguntaSecreta(Integer preguntaSecretaId,
			List<PreguntaSecreta> preguntasSecretas) {
		for (PreguntaSecreta preguntaSecreta : preguntasSecretas) {
			if (preguntaSecreta.getPreguntaId() == preguntaSecretaId) {
				return preguntaSecreta;
			}
		}
		return null;
	}

	public Respuesta setPreguntasSecretasUsuario(Integer usuarioId,
			List<PreguntaSecreta> preguntasSecretas) {
		try {
			if (preguntasSecretas == null || preguntasSecretas.isEmpty()
					|| preguntasSecretas.size() < 2) {
				return new Respuesta(CodigoRespuesta.DATOS_NULOS);
			}
			if (preguntasSecretas.size() > 3) {
				return new Respuesta(CodigoRespuesta.DATOS_INVALIDOS);
			}
			Usuario usuario = entityManager.find(Usuario.class, usuarioId);
			for (PreguntaSecreta preguntaSecreta : preguntasSecretas) {
				preguntaSecreta.setUsuario(usuario);
			}
			usuario.setPreguntaSecretas(preguntasSecretas);
			entityManager.merge(usuario);
		} catch (NoResultException e) {
			return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
		} catch (Exception e) {
			return new Respuesta(CodigoRespuesta.ERROR_INTERNO);
		}
		return new Respuesta(CodigoRespuesta.EXITO);
	}

	public RespuestaNuevoToken login(String usuarioApi, String passwordApi,
			String email, String movil, String credencial, String ip) {

		if (!validarUsuario(usuarioApi, passwordApi)) {
			return new RespuestaNuevoToken(CodigoRespuesta.ERROR_CREDENCIALES);
		}

		if (!Utils.isStringValido(movil) && !Utils.isStringValido(email)) {
			return new RespuestaNuevoToken(CodigoRespuesta.DATOS_NULOS);
		}
		
//		ConfiguracionGeneral diasValidezCredencial = entityManagerSaat
//				.createNamedQuery("getConfiguracionGeneralByNombre",
//						ConfiguracionGeneral.class)
//				.setParameter("nombreConfiguracion", "DIAS_MAXIMO_CREDENCIAL")
//				.getSingleResult();

		Usuario usuario = getLoginUsuario(email, movil);
		
		
		if (usuario == null) {
			return new RespuestaNuevoToken(CodigoRespuesta.USUARIO_NO_EXISTE);
		}
		DateTime fechaActual = new DateTime();
		DateTime fechaCredencial = new DateTime(usuario.getCredencialFecha());
//		fechaCredencial = fechaCredencial.plusDays(Integer
//				.parseInt(diasValidezCredencial.getValorConfiguracion()));
		if (usuario.getEstado().getDescripcion().equals(Estado.BLOQUEADO)) {
			return new RespuestaNuevoToken(CodigoRespuesta.USUARIO_BLOQUEADO);
		} /*else if (fechaCredencial.isBefore(fechaActual)) {
			return new RespuestaNuevoToken(CodigoRespuesta.CONTRASENIA_EXPIRADA);
		}*/ else if (!usuario.getCredencial().equals(credencial)) {
			usuario.setIntentosFallidos(usuario.getIntentosFallidos() + 1);
			Accion action = entityManager
					.createNamedQuery("Accion.byDescripcion", Accion.class)
					.setParameter("descripcion", Accion.INTENTO_FALLIDO)
					.getSingleResult();
			entityManager.persist(new Bitacora(ip, action, usuario));
			entityManager.merge(usuario);
			if (usuario.getIntentosFallidos() == 3) {
				usuario.setEstado(getEstadoPorDescripcion(Estado.BLOQUEADO));
				Utils.enviarCorreoBloqueo("ES", usuario);
			}
			return new RespuestaNuevoToken(
					CodigoRespuesta.CREDENCIALES_INVALIDAS);
		} else if (usuario.getEstado().getDescripcion()
				.equals(Estado.PENDIENTE)) {
			return new RespuestaNuevoToken(CodigoRespuesta.USUARIO_PENDIENTE);
		}

		// Comentado para pruebas de Alodiga

		/*
		 * DireccionConfianza direccion = null; try { direccion =
		 * getDireccionConfianza(usuario, ip); } catch (NoResultException e) {
		 * return new RespuestaNuevoToken(CodigoRespuesta.IP_NO_CONFIANZA); }
		 */

		// Agregado unicamente para pruebas de Alodiga

		DireccionConfianza direccion = entityManager.find(
				DireccionConfianza.class, 2);

		if (usuario.getPreguntaSecretas() == null
				|| usuario.getPreguntaSecretas().isEmpty()) {
			return new RespuestaNuevoToken(CodigoRespuesta.PRIMER_INGRESO);
		}

		
		usuario.setIntentosFallidos(0);
		SesionUsuario sesion = new SesionUsuario();
		sesion.setActivo(true);
		sesion.setDireccionConfianza(direccion);
		sesion.setFechaActividad(new Date());
		sesion.setUsuario(usuario);
		String token = UUID.randomUUID().toString();
		sesion.setToken(token);
		System.out.println("token: " + token);
		Accion action = entityManager
				.createNamedQuery("Accion.byDescripcion", Accion.class)
				.setParameter("descripcion", Accion.LOGIN).getSingleResult();
		
		entityManager.persist(new Bitacora(ip, action, usuario));
		entityManager.persist(sesion);
		entityManager.merge(usuario);
		
		return new RespuestaNuevoToken(CodigoRespuesta.EXITO,
				CodigoRespuesta.EXITO.name(), token);
		
	}
	
	public RespuestaUsuario loginp(String usuarioApi, String passwordApi,
			String email, String movil, String credencial, String ip) {

		if (!validarUsuario(usuarioApi, passwordApi)) {
			return new RespuestaUsuario(CodigoRespuesta.ERROR_CREDENCIALES);
		}

		if (!Utils.isStringValido(movil) && !Utils.isStringValido(email)) {
			return new RespuestaUsuario(CodigoRespuesta.DATOS_NULOS);
		}
		
		ConfiguracionGeneral diasValidezCredencial = entityManagerSaat
				.createNamedQuery("getConfiguracionGeneralByNombre",
						ConfiguracionGeneral.class)
				.setParameter("nombreConfiguracion", "DIAS_MAXIMO_CREDENCIAL")
				.getSingleResult();

		Usuario usuario = getLoginUsuarioTemp(email, movil);
		
		
		if (usuario == null) {
			return new RespuestaUsuario(CodigoRespuesta.USUARIO_NO_EXISTE);
		}
		
		if (!usuario.getCredencial().equals(credencial)) {
			usuario.setIntentosFallidos(usuario.getIntentosFallidos() + 1);
			Accion action = entityManager
					.createNamedQuery("Accion.byDescripcion", Accion.class)
					.setParameter("descripcion", Accion.INTENTO_FALLIDO)
					.getSingleResult();
			//entityManager.persist(new Bitacora(ip, action, usuario));
			entityManager.merge(usuario);
			/*if (usuario.getIntentosFallidos() == 3) {
				usuario.setEstado(getEstadoPorDescripcion(Estado.BLOQUEADO));
				Utils.enviarCorreoBloqueo("ES", usuario);
			}*/
			return new RespuestaUsuario(
					CodigoRespuesta.CREDENCIALES_INVALIDAS);
		} /*else if (usuario.getEstado().getDescripcion()
				.equals(Estado.PENDIENTE)) {
			return new RespuestaUsuario(CodigoRespuesta.USUARIO_PENDIENTE);
		}*/

		// Comentado para pruebas de Alodiga

		/*
		 * DireccionConfianza direccion = null; try { direccion =
		 * getDireccionConfianza(usuario, ip); } catch (NoResultException e) {
		 * return new RespuestaNuevoToken(CodigoRespuesta.IP_NO_CONFIANZA); }
		 */

		// Agregado unicamente para pruebas de Alodiga

		DireccionConfianza direccion = entityManager.find(
				DireccionConfianza.class, 2);

		//
/**
		if (usuario.getPreguntaSecretas() == null
				|| usuario.getPreguntaSecretas().isEmpty()) {
			return new RespuestaUsuario(CodigoRespuesta.PRIMER_INGRESO);
		}
**/
		
		usuario.setIntentosFallidos(0);
		SesionUsuario sesion = new SesionUsuario();
		sesion.setActivo(true);
		sesion.setDireccionConfianza(direccion);
		sesion.setFechaActividad(new Date());
		sesion.setUsuario(usuario);
		String token = UUID.randomUUID().toString();
		sesion.setToken(token);
		System.out.println("token: " + token);
		Accion action = entityManager
				.createNamedQuery("Accion.byDescripcion", Accion.class)
				.setParameter("descripcion", Accion.LOGIN).getSingleResult();
		
		/*entityManager.persist(new Bitacora(ip, action, usuario));
		entityManager.persist(sesion);
		*/entityManager.merge(usuario);
		
		return new RespuestaUsuario(CodigoRespuesta.EXITO,CodigoRespuesta.EXITO.name(),usuario);
		
		/*
		return new RespuestaNuevoToken(CodigoRespuesta.EXITO,
				CodigoRespuesta.EXITO.name(), token);*/
		
	}

	private boolean existeAplicacion(List<Aplicacion> aplicaciones,
			String nombre) {
		for (Aplicacion aplicacion : aplicaciones) {
			if (aplicacion.getNombre().equals(nombre)) {
				return true;
			}
		}
		return false;
	}

	private Usuario getLoginUsuario(String email, String movil) {
		if (Utils.isStringValido(email)) {
			return getUsuarioporemail(email);
		}
		if (Utils.isStringValido(movil)) {
			return getUsuariopormovil(movil);
		}
		return null;
	}

	private Usuario getLoginUsuarioTemp(String email, String movil) {
		Usuario usuario = null;
		if (Utils.isStringValido(email)) {
			usuario = getUsuarioporemail(email);
			if(usuario== null)
				return getUsuariopormovil(movil);
			else
				return usuario;
		}
		return usuario;
	}
	private DireccionConfianza getDireccionConfianza(Usuario usuario, String ip) {
		return entityManager
				.createNamedQuery("DireccionConfianza.findByUserAndIp",
						DireccionConfianza.class).setParameter("ip", ip)
				.setParameter("usuario", usuario).getSingleResult();
	}

	private List<PreguntaIdioma> getPreguntaIdioma(Integer idIdioma) {
		Idioma idioma = entityManager.find(Idioma.class, idIdioma);

		return entityManager
				.createNamedQuery("PregPorIdioma", PreguntaIdioma.class)
				.setParameter("Idioma", idioma).getResultList();
	}

	private Estado getEstadoPorDescripcion(String descripcionEstado) {
		return entityManager
				.createNamedQuery("Estado.findByDescription", Estado.class)
				.setParameter("descripcion", descripcionEstado)
				.getSingleResult();
	}

	private List<Usuario> findAllUsers() {
		return entityManager.createNamedQuery("Usuario.findAll", Usuario.class)
				.getResultList();
	}

	private Usuario getUsuarioporemail(String email) {
		Usuario usuario = null;
		try {
			usuario = entityManager
					.createNamedQuery("Usuario.findByEmail", Usuario.class)
					.setParameter("email", email).getSingleResult();
		} catch (Exception e) {
			logger.debug("Usuario no encontrado" + email);
		}
		return usuario;
	}

	private Usuario getUsuarioporcuenta(String cuenta) {
		Usuario usuario = null;
		try {
			System.out.println(cuenta);
			usuario = entityManager
					.createNamedQuery("Usuario.findByCuenta", Usuario.class)
					.setParameter("nCuenta", cuenta).getSingleResult();
		} catch (Exception e) {
			logger.debug("Usuario no encontrado" + cuenta);
		}
		return usuario;
	}
	private Usuario getUsuarioportarjeta(String tarjeta) {
		Usuario usuario = null;
		try {
			System.out.println(tarjeta);
			usuario = entityManager
					.createNamedQuery("Usuario.findByTarjeta", Usuario.class)
					.setParameter("nTarjeta", tarjeta).getSingleResult();
		} catch (Exception e) {
			logger.debug("Usuario no encontrado" + tarjeta);
		}
		return usuario;
	}
	
	private Usuario getUsuarioporId(String id) {
		Usuario usuario = null;
		try {
			usuario = entityManager.find(Usuario.class, Integer.parseInt(id));
		} catch (Exception e) {
			logger.debug("Usuario no encontrado" + id);
		}
		return usuario;
	}

	private Usuario getUsuariopormovil(String movil) {
		Usuario usuario = null;
		try {
			usuario = entityManager
					.createNamedQuery("Usuario.findByMovil", Usuario.class)
					.setParameter("movil", movil).getSingleResult();
		} catch (Exception e) {
			logger.debug("Usuario no encontrado" + movil);
		}
		return usuario;
	}

	private List<Aplicacion> getAplicaciones() {
		return entityManager.createNamedQuery("Aplicacion.findAll",
				Aplicacion.class).getResultList();
	}

	private List<Ocupacion> getOcupaciones() {
		return entityManager.createNamedQuery("Ocupacion.findAll",
				Ocupacion.class).getResultList();
	}

	private List<TipoDocumento> getTipoDocumento() {
		return entityManager.createNamedQuery("TipoDocumento.findAll",
				TipoDocumento.class).getResultList();
	}

	private List<TipoEmpresa> getTipoEmpresa() {
		return entityManager.createNamedQuery("TipoEmpresa.findAll",
				TipoEmpresa.class).getResultList();
	}

	private List<Empresa> getListaEmpresaPorPosTipoPersona(String descripcion,
			String tipoPersona) throws Exception {
		String queryCompleto = Constante.SQL_LISTA_EMPRESAS;

		List<Object> strList = new ArrayList<Object>();
		if (descripcion!=null || tipoPersona!=null) {
			queryCompleto += " where ";
			if (descripcion!=null) {
				queryCompleto +=  " tp.descripcion = UPPER(?) ";
				strList.add(descripcion);
			}
			if (tipoPersona!=null) {
				queryCompleto = (strList.size() > 0) ? queryCompleto + " AND "
						: queryCompleto;
				queryCompleto  += " pa.tipoPersona = UPPER(?) ";
				strList.add(tipoPersona);
			}

		}

		Connection connSaat = Conexion.obtenerConexion(Constante.sNombreSAAT);
		List<Empresa> listadoEmpresa = null;
		try {
			QueryRunner qr = new QueryRunner();
			listadoEmpresa = qr.query(connSaat, queryCompleto,
					new BeanListHandler<Empresa>(Empresa.class),
					strList.toArray());

		} catch (Exception e) {
			logger.error(e);
			throw e;
		} finally {
			DbUtils.closeQuietly(connSaat);
		}

		return listadoEmpresa;

	}
    
	
	
	
	private Aplicacion getAplicacionporNombre(String nombre) {
		return entityManager
				.createNamedQuery("Aplicacion.findByNombre", Aplicacion.class)
				.setParameter("nombre", nombre).getSingleResult();
	}

	private MovilCodigo getMovilCodigoPorMovil(String movil) {
		return entityManager
				.createNamedQuery("MovilCodigo.findByMovil", MovilCodigo.class)
				.setParameter("movil", movil).setMaxResults(1)
				.getSingleResult();
	}

	public RespuestaToken getEstadoToken(String usuarioApi, String passwordApi,
			String Token) {

		if (validarUsuario(usuarioApi, passwordApi)) {
			SesionUsuario sesion = null;
			try {
				sesion = entityManager
						.createNamedQuery("getEstadoByToken",
								SesionUsuario.class)
						.setParameter("token", Token).getSingleResult();
				if (sesion == null) {
					return new RespuestaToken(CodigoRespuesta.DATOS_INVALIDOS);
				}
			} catch (Exception e) {
				return new RespuestaToken(CodigoRespuesta.DATOS_INVALIDOS);
			}

			boolean activo = sesion.isActivo();
			if (activo) {
				Date fechaExpiracion = new Date();
				ConfiguracionGeneral tiempoExpiracionToken = entityManagerSaat
						.createNamedQuery("getConfiguracionGeneralByNombre",
								ConfiguracionGeneral.class)
						.setParameter("nombreConfiguracion",
								"TIEMPO_EXPIRACION_TOKEN").getSingleResult();
				if ((fechaExpiracion.getTime() - sesion.getFechaActividad()
						.getTime()) > ((Long.parseLong(tiempoExpiracionToken
						.getValorConfiguracion()) * 60 * 1000))) {
					activo = false;
					sesion.setActivo(activo);
					entityManager.merge(sesion);
					return new RespuestaToken(CodigoRespuesta.TOKEN_EXPIRADO,
							CodigoRespuesta.TOKEN_EXPIRADO.name(), activo);
				} else {
					activo = true;
					sesion.setFechaActividad(new Date());
					entityManager.merge(sesion);
					return new RespuestaToken(CodigoRespuesta.EXITO, null,
							activo);
				}
			} else {
				sesion.setActivo(activo);
				entityManager.merge(sesion);
				return new RespuestaToken(CodigoRespuesta.TOKEN_EXPIRADO, null,
						activo);
			}

		} else {
			return new RespuestaToken(CodigoRespuesta.ERROR_CREDENCIALES);
		}
	}

	public RespuestaCodigoRandom generarCodigoMovil(String movil) {
		String codigo = "";
		try {
			Random r = new Random();
			int i = 0;
			while (i < 6) {
				codigo += "" + r.nextInt(10);
				i++;
			}
			MovilCodigo mc = new MovilCodigo(movil, codigo);
                        
                        SendCallRegister c = new SendCallRegister(movil, codigo);
                        c.start();
                        System.out.println("................mc   "+mc.getCodigo()+"   ..................");
                        
//			Utils.getWsaPort().realizarLlamadaRegistro(
//					Utils.obtienePropiedad("usuarioWSA"),
//					Utils.obtienePropiedad("passwordWSA"), "1", movil, codigo);
			entityManager.persist(mc);
		} catch (Exception e) {
			e.printStackTrace();
			return new RespuestaCodigoRandom(CodigoRespuesta.ERROR_INTERNO,
					e.getLocalizedMessage());
		}
		return new RespuestaCodigoRandom(CodigoRespuesta.EXITO, "", codigo);
	}

	public RespuestaCodigoRandom generarCodigoMovilSMS(String usuarioApi,
			String passwordApi, String movil) {
		if (validarUsuario(usuarioApi, passwordApi)) {
			String codigo = "";
			try {
				Random r = new Random();
				int i = 0;
				while (i < 6) {
					codigo += "" + r.nextInt(10);
					i++;
				}
				MovilCodigo mc = new MovilCodigo(movil, codigo);
				Utils.getWsaPort().enviarSMS(
						Utils.obtienePropiedad("usuarioWSA"),
						Utils.obtienePropiedad("passwordWSA"),
						Utils.obtienePropiedad("NUMERO_ENVIO_SMS"), movil,
						null, codigo, null);
				entityManager.persist(mc);
			} catch (Exception e) {
				e.printStackTrace();
				return new RespuestaCodigoRandom(CodigoRespuesta.ERROR_INTERNO,
						e.getLocalizedMessage());
			}
			return new RespuestaCodigoRandom(CodigoRespuesta.EXITO, "", codigo);
		} else {
			return new RespuestaCodigoRandom(CodigoRespuesta.ERROR_CREDENCIALES);
		}
	}

	public Respuesta cambiarCredencial(String usuarioApi, String passwordApi,
			Integer usuarioId, String credencial) {
		if (validarUsuario(usuarioApi, passwordApi)) {
			if (usuarioId == null || usuarioId == 0) {
				return new Respuesta(CodigoRespuesta.DATOS_NULOS);
			}
			Usuario usuario = entityManager.find(Usuario.class, usuarioId);
			if (usuario == null) {
				return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
			}
			if (!credencial.matches("(?=.*[a-zA-Z])(?=.*[0-9]).{5,}")) {
				return new Respuesta(new Date(), "97", "CONTRASENIA_INVALIDA");
			}
			usuario.setCredencial(credencial);
			usuario.setCredencialFecha(new Date());
			entityManager.merge(usuario);
			return new Respuesta(CodigoRespuesta.EXITO);
		} else {
			return new Respuesta(CodigoRespuesta.ERROR_CREDENCIALES);
		}
	}
	
	public RespuestaListadoTipoCuentaBancaria getTipoCuentasBancarias(String usuarioApi, String passwordApi){
		RespuestaListadoTipoCuentaBancaria respuesta=null;
		if(validarUsuario(usuarioApi,passwordApi)){
			List<CuentaBancariaTipo> listaTipos = entityManager.createNamedQuery(
					"CuentaBancariaTipo.findAll", CuentaBancariaTipo.class).getResultList();
			respuesta = new RespuestaListadoTipoCuentaBancaria(CodigoRespuesta.EXITO,null,listaTipos);
		}else{
			respuesta= new RespuestaListadoTipoCuentaBancaria(CodigoRespuesta.ERROR_INTERNO);
		}
		return respuesta;
	}
	
	public RespuestaListadoBancos getBancosDisponibles(String usuarioApi, String passwordApi){
		RespuestaListadoBancos respuesta=null;
		
		if(validarUsuario(usuarioApi,passwordApi)){
			List<Banco> listaBancos = entityManager.createNamedQuery(
					"Banco.findAll", Banco.class).getResultList();
			respuesta = new RespuestaListadoBancos(CodigoRespuesta.EXITO,null,listaBancos);
		}else{
			respuesta = new RespuestaListadoBancos(CodigoRespuesta.ERROR_INTERNO);
		}
		return respuesta;
	}
	
	public RespuestaListadoTarjetas getTarjetasDisponibles(String usuarioApi,
			String passwordApi){
		RespuestaListadoTarjetas respuesta= null;
		
		if (validarUsuario(usuarioApi, passwordApi)) {
		Estado estado = this.getEstadoPorDescripcion(Estado.INACTIVO);
		List<Tarjeta> listaDisponible= entityManager
					.createNamedQuery("Tarjeta.findAvailable", Tarjeta.class)
					.setParameter("estado",estado.getEstadoId()).getResultList();
		respuesta = new RespuestaListadoTarjetas(CodigoRespuesta.EXITO,null,listaDisponible);
		} 
		else{
			respuesta = new RespuestaListadoTarjetas(CodigoRespuesta.ERROR_INTERNO);
		}
		return respuesta;
		
		
	}
	
	public Respuesta solicitarTarjeta(String usuarioApi, String passwordApi, String usuarioId, String emailContacto, String direccionContacto, String telefonoContacto){
		
		if (validarUsuario(usuarioApi, passwordApi)) {
			if(usuarioId==null||usuarioId.equals("")||telefonoContacto==null||telefonoContacto.equals("")||direccionContacto==null
					||direccionContacto.equals("")||emailContacto==null||emailContacto.equals("")){
				
				return new Respuesta(CodigoRespuesta.DATOS_NULOS);
			}
			
			Usuario usuario = entityManager.find(Usuario.class, Integer.parseInt(usuarioId));
			
			RespuestaListadoTarjetas tarjetas = getTarjetasDisponibles(usuarioApi, passwordApi);
			
			if(tarjetas!=null&&tarjetas.getDatosRespuesta()!=null&&tarjetas.getDatosRespuesta().size()>0){
				
				
				List<TarjetaUsuario> tarjetasusuario= entityManager.createNamedQuery("TarjetaUsuario.findByUserExistence",TarjetaUsuario.class).setParameter("usuario",usuario).setParameter("estado",Estado.INACTIVO).getResultList();
				
				if(tarjetasusuario!=null&&tarjetasusuario.size()>0){
					return new Respuesta(CodigoRespuesta.SOLICITUD_TARJETA_ACTIVA);
				}
				
				
				Tarjeta tarjeta = tarjetas.getDatosRespuesta().get(0);
			
				Estado estado = this.getEstadoPorDescripcion(Estado.PENDIENTE);
				tarjeta.setEstadoTarjetaId(estado.getEstadoId());
				tarjeta.setEmailContacto(emailContacto);
				tarjeta.setDireccionContacto(direccionContacto);
				tarjeta.setTelefonoContacto(telefonoContacto);
				System.out.println("tarjeta Id: "+tarjeta.getTarjetaId());
				
				TarjetaUsuario asignacion =  new TarjetaUsuario();
				asignacion.setEstado(Estado.PENDIENTE);
				asignacion.setTarjeta(tarjeta);
				asignacion.setUsuario(usuario);
				
				
				TarjetaUsuarioPK llave = new TarjetaUsuarioPK();
				llave.setTarjetaId(tarjeta.getTarjetaId());
				llave.setUsuarioId(usuario.getUsuarioId());
								
				
				asignacion.setId(llave);
				
				entityManager.merge(tarjeta);
				
				entityManager.persist(asignacion);
				
				Utils.enviarCorreoSolicitarTarjeta("ES", usuario);
				return new Respuesta(
						CodigoRespuesta.EXITO);
			}
			
		} else {
			
			return new Respuesta(CodigoRespuesta.DATOS_INVALIDOS);
		}
		return new Respuesta(CodigoRespuesta.ERROR_INTERNO);
	}

	public Respuesta cambiarCredencialPorCorreo(String usuarioApi,
			String passwordApi, String email, String credencial) {
		if (validarUsuario(usuarioApi, passwordApi)) {
			if (email == null || email.equals("")) {
				return new Respuesta(CodigoRespuesta.DATOS_NULOS);
			}

			Usuario usuario = null;
			try {
				usuario = getUsuarioporemail(Encryptor.decrypt(
						Utils.obtienePropiedad("ENC_KEY"),
						Utils.obtienePropiedad("ENC_INIT_VALUE"), email));
			} catch (Exception e) {
				logger.debug("Error al obtener usuario: " + e);
				return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
			}

			if (usuario == null) {
				return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
			}
			if (!credencial.matches("(?=.*[a-zA-Z])(?=.*[0-9]).{5,}")) {
				return new Respuesta(new Date(), "97", "CONTRASENIA_INVALIDA");
			}
			usuario.setCredencial(credencial);
			usuario.setCredencialFecha(new Date());
			entityManager.merge(usuario);
			return new Respuesta(CodigoRespuesta.EXITO);
		} else {
			return new Respuesta(CodigoRespuesta.ERROR_CREDENCIALES);
		}
	}

	public Respuesta recuperarCredencial(String usuarioApi, String passwordApi,
			String idioma, String email) {
		if (validarUsuario(usuarioApi, passwordApi)) {
			if (email == null || email.equals("")) {
				return new Respuesta(CodigoRespuesta.DATOS_NULOS);
			}
			Usuario usuario = getUsuarioporemail(email);
			if (usuario == null) {
				return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
			}

			Utils.enviarCorreoRecuperarCredencial(idioma, email);

			return new Respuesta(CodigoRespuesta.EXITO);
		} else {
			return new Respuesta(CodigoRespuesta.ERROR_CREDENCIALES);
		}
	}
	
	public Respuesta activarTarjeta(String usuarioApi, String passwordApi,String usuarioId, String pin){
		Respuesta activacion = null;
			if (validarUsuario(usuarioApi, passwordApi)) {
				if (usuarioId == null || usuarioId.equals("")||pin==null||pin.equals("")) {
					return new Respuesta(CodigoRespuesta.DATOS_NULOS);
				}
				Usuario usuario =entityManager.find(Usuario.class, Integer.parseInt(usuarioId));
				if (usuario == null) {
					return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
				}
				System.out.println(pin+" ---- "+usuario.getPin());
				if(pin.equals(usuario.getPin())){
				
					List<TarjetaUsuario> tarjetas = entityManager
							.createNamedQuery("TarjetaUsuario.findByUserState",TarjetaUsuario.class)
							.setParameter("usuario", usuario)
							.setParameter("estado", Estado.PENDIENTE)
							.getResultList();
					
					if(tarjetas!=null&&tarjetas.size()==1){
						TarjetaUsuario tarjeta=tarjetas.get(0);
						tarjeta.setEstado(Estado.ACTIVO);
						
						Tarjeta card =entityManager.find(Tarjeta.class, tarjeta.getId().getTarjetaId());
						
						Estado estado = this.getEstadoPorDescripcion(Estado.ACTIVO);
						card.setEstadoTarjetaId(estado.getEstadoId());
						
						entityManager.persist(card);
						entityManager.persist(tarjeta);
						
						Utils.enviarCorreoActivacionTarjeta("ES", usuario);
						
						return new Respuesta(CodigoRespuesta.EXITO);
						
					}	
				}else{
					return new Respuesta(CodigoRespuesta.CODIGO_VALIDACION_INVALIDO);
				}
		}
		return activacion;
	}
	

	public Respuesta lexis (String usuarioId) throws Exception{
		
		Usuario usuario  = entityManager.find(Usuario.class, Integer.parseInt(usuarioId));
		if(Utils.esUsuarioFraudulento(usuario))
		{
			return new Respuesta(CodigoRespuesta.EXITO);
		}

		return new Respuesta(CodigoRespuesta.ERROR_INTERNO);
	}
	
	public Respuesta afiliarCuenta(String usuarioApi, String passwordApi,
			String usuarioId, String BancoId, String cuentaBancariaId,
			String numeroRuta, String numeroCuenta) throws ParseException {
		int cuentaAlodiga = 1;
		int contadorDia = 0;
		if (validarUsuario(usuarioApi, passwordApi)) {
			if (usuarioId == null || usuarioId.equals("") || BancoId == null
					|| BancoId.equals("") || cuentaBancariaId == null
					|| cuentaBancariaId.equals("") || numeroRuta == null
					|| numeroRuta.equals("") || numeroCuenta == null
					|| numeroCuenta.equals("")) {
				return new Respuesta(CodigoRespuesta.DATOS_NULOS);
			}
			Usuario usuario = entityManager.find(Usuario.class,
					Integer.parseInt(usuarioId));
			if (usuario != null) {

				// Afiliaciones diarias o mensuales
				List<CuentaBancaria> lista = entityManager
						.createNamedQuery("CuentaBancaria.findByUser",
								CuentaBancaria.class)
						.setParameter("usuario", usuario).getResultList();

				for (CuentaBancaria nodo : lista) {
					CuentaBancaria CuentaTemp = nodo;
//					if (CuentaTemp.getCuentaAlodiga() == 1) {
//						cuentaAlodiga = 0;
//					}
					Date fechatemp = CuentaTemp.getFechaCreacion();
					Date hoy = new Date(System.currentTimeMillis());

					if (CuentaTemp.getFechaCreacion() != null
							&& ((fechatemp.getMonth() == hoy.getMonth() && fechatemp
									.getYear() == hoy.getYear()) || hoy == fechatemp)) {
						if (contadorDia == 1) {
							return new Respuesta(
									CodigoRespuesta.AFILIACIONES_MAXIMAS_ALCANZADAS);
						}
						contadorDia++;
					}
				}

				// Cuenta ya registrada
				lista = entityManager.createNamedQuery(
						"CuentaBancaria.findAll", CuentaBancaria.class)
						.getResultList();
				for (CuentaBancaria nodo : lista) {
					CuentaBancaria CuentaTemp = nodo;
					if (CuentaTemp.getNumeroCuenta().equals(numeroCuenta)
							&& CuentaTemp.getBanco().getBancoId() == Integer
									.parseInt(BancoId)) {
						return new Respuesta(
								CodigoRespuesta.CUENTA_BANCARIA_YA_EXISTE);
					}
				}

				String modifiedDate = new SimpleDateFormat("dd/MM/yyyy")
						.format(new Date(System.currentTimeMillis()));

				CuentaBancaria nuevaCuenta = new CuentaBancaria();
				nuevaCuenta.setBanco(entityManager
						.createNamedQuery("Banco.findById", Banco.class)
						.setParameter("bancoId", Integer.parseInt(BancoId)).getSingleResult());
				nuevaCuenta.setCuentaBancariaTipo(entityManager
						.createNamedQuery("CuentaBancariaTipo.findById",
								CuentaBancariaTipo.class)
						.setParameter("cuentaBancariaId", Integer.parseInt(cuentaBancariaId))
						.getSingleResult());
				nuevaCuenta.setNumeroRuta(numeroRuta);
				nuevaCuenta.setNumeroCuenta(numeroCuenta);
				nuevaCuenta.setUsuario(usuario);
				//nuevaCuenta.setCuentaAlodiga(cuentaAlodiga);
				nuevaCuenta.setFechaCreacion(new SimpleDateFormat("dd/MM/yyyy")
						.parse(modifiedDate));

				entityManager.persist(nuevaCuenta);
				return new Respuesta(CodigoRespuesta.EXITO);
			}
			return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
		}
		return new Respuesta(CodigoRespuesta.CREDENCIALES_INVALIDAS);
	}
	
	public Respuesta afiliarTarjeta(String usuarioApi, String passwordApi,String usuarioId, String pais, String estado, String ciudad, String condado, String codigoPostal, String direccion, String nombre, String numeroTarjeta,String fechaVencimiento, String tipo, String cvv ) throws ParseException{
		
		if (validarUsuario(usuarioApi, passwordApi)) {
			
			if(usuarioId==null||usuarioId.equals("")||pais==null||pais.equals("")||estado.equals("")||estado==null||ciudad==null||ciudad.equals("")||condado.equals("")||condado==null||codigoPostal==null||codigoPostal.equals("")||direccion==null||direccion.equals("")||nombre.equals("")||nombre==null||numeroTarjeta==null||numeroTarjeta.equals("")||fechaVencimiento.equals("")||fechaVencimiento==null||tipo==null||tipo.equals("")||cvv==null||cvv.equals(""))
			{
				return new Respuesta(CodigoRespuesta.DATOS_NULOS);
			}
			
			Usuario usuario =entityManager.find(Usuario.class, Integer.parseInt(usuarioId));
			
			if(usuario!=null){
				
				List<TarjetaUsuario> lista= entityManager.createNamedQuery("TarjetaUsuario.findByUser",TarjetaUsuario.class).setParameter("usuario",usuario).getResultList();
				int contadorDia=0;
				for(TarjetaUsuario nodo:lista){
					
					System.out.println(nodo.getTarjeta().getNombreTarjetaHabiente()+"...."+nodo.getTarjeta().getNumeroTarjeta());
					Tarjeta tarjetatemp =nodo.getTarjeta();
					if(!tarjetatemp.getTipoTarjeta().equals("ALODIGA")){

						Date fechatemp =tarjetatemp.getFechaCreacion();
						Date hoy=new Date(System.currentTimeMillis());
						
						if(tarjetatemp.getFechaCreacion()!=null&&((fechatemp.getMonth()==hoy.getMonth()&&fechatemp.getYear()==hoy.getYear())||hoy==fechatemp)){
							if(contadorDia==1){
								return new Respuesta(CodigoRespuesta.AFILIACIONES_MAXIMAS_ALCANZADAS);
							}
							contadorDia++;
						}
					}
					
				}
				
				//TODO validacion de transacci??n tarjeta de credito
				
				Direccion address = new Direccion();
				address.setPaisId(Integer.parseInt(pais));
				address.setEstadoId(Integer.parseInt(estado));
				address.setCiudadId(Integer.parseInt(ciudad));
				address.setCondadoId(Integer.parseInt(condado));
				address.setDireccion(direccion);

				entityManager.persist(address);
				Estado state = this.getEstadoPorDescripcion(Estado.ACTIVO);
		
				
				Tarjeta tarjeta = new Tarjeta();
				tarjeta.setTipoTarjeta(tipo);
				tarjeta.setEstadoTarjetaId(state.getEstadoId());
				tarjeta.setDireccion(address);	
				tarjeta.setNombreTarjetaHabiente(nombre);
				tarjeta.setNumeroTarjeta(numeroTarjeta);
				tarjeta.setFechaVencimiento(fechaVencimiento);
				
				String modifiedDate= new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()));
				tarjeta.setFechaCreacion( new SimpleDateFormat("dd/MM/yyyy").parse(modifiedDate));
				
				TarjetaUsuarioPK llave = new TarjetaUsuarioPK();
				llave.setTarjetaId(tarjeta.getTarjetaId());
				llave.setUsuarioId(usuario.getUsuarioId());
				
				TarjetaUsuario asignacion = new TarjetaUsuario();
				asignacion.setTarjeta(tarjeta);
				asignacion.setUsuario(usuario);
				asignacion.setEstado(Estado.ACTIVO);
				asignacion.setId(llave);
				
				entityManager.persist(asignacion);
				return new Respuesta(CodigoRespuesta.EXITO);
			}
			else{
				return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
			}
		}
		return new Respuesta(CodigoRespuesta.CREDENCIALES_INVALIDAS);
	}
	

	private List<Estado> findAllEstados() {
		return entityManager.createNamedQuery("Estado.findAll", Estado.class)
				.getResultList();
	}
	
	private List<Usuario> getAgentesComercialesPorEmpresa(String empresaId,
			String tipoPersona) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			usuarios = entityManager
					.createNamedQuery("Usuario.findUserAloPos", Usuario.class)
					.setParameter("empresaId", Integer.parseInt(empresaId))
					.setParameter("tipoPersona", tipoPersona).getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuarios;

	}
	public RespuestaListadoUsuarios getAgentesComercialesPorEmpresa(
			String usuarioApi, String passwordApi, String empresaId,
			String tipoPersona) {

		if (validarUsuario(usuarioApi, passwordApi)) {
			List<Usuario> usuarios = getAgentesComercialesPorEmpresa(empresaId,
					tipoPersona);
			return new RespuestaListadoUsuarios(CodigoRespuesta.EXITO, null,
					usuarios);
		} else {
			return new RespuestaListadoUsuarios(
					CodigoRespuesta.ERROR_CREDENCIALES);
		}
	}

	public RespuestaListadoEstados obtenerEstadosUsuario(String usuarioApi,
			String passwordApi) {
		RespuestaListadoEstados respuesta = null;

		if (validarUsuario(usuarioApi, passwordApi)) {
			List<Estado> estados = this.findAllEstados();

			respuesta = new RespuestaListadoEstados(CodigoRespuesta.EXITO,
					null, estados);

		} else {
			respuesta = new RespuestaListadoEstados(
					CodigoRespuesta.ERROR_INTERNO);
		}
		return respuesta;
	}

	public RespuestaGuardarUsuario guardarAgenteComercial(String usuarioApi,
			String passwordApi, String usuarioId, String usuarioEmpresaId,
			String nombre, String apellido, String credencial, String email,
			String movil, String fechaNacimiento, String direccion,
			String paisId, String estadoId, String ciudadId, String condadoId,
			String codigoPostal, String link, String fechaVencimientoDocumento,
			String estado, String tipoDocumento, String numeroDocumento,
			String numeroIdentificacion, String telefono) {
		try {

			if (validarUsuario(usuarioApi, passwordApi)) {
				// String codigoGenerado = "";
				Usuario usuario;
				Direccion direccion1;
				// Imagen imagen1;
				if (nombre == null || nombre.trim().equals("")) {
					return new RespuestaGuardarUsuario(
							CodigoRespuesta.DATOS_INVALIDOS,
							Utils.obtieneMensaje("null.name"));
				} else {
					if (!nombre.matches(Utils
							.obtienePropiedad("REGEX_ENCOUDING_UTF-8"))) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.DATOS_INVALIDOS,
								Utils.obtieneMensaje("invalid.name"));
					}
				}
				if (apellido == null || apellido.trim().equals("")) {
					return new RespuestaGuardarUsuario(
							CodigoRespuesta.DATOS_INVALIDOS,
							Utils.obtieneMensaje("null.lastname"));
				} else {
					if (!apellido.matches(Utils
							.obtienePropiedad("REGEX_ENCOUDING_UTF-8"))) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.DATOS_INVALIDOS,
								Utils.obtieneMensaje("invalid.lastname"));
					}
				}

				if (usuarioId == null || usuarioId.equals("")) {
					usuario = new Usuario();
					direccion1 = new Direccion();
					// imagen1 = new Imagen();
					Estado estado1 = getEstadoPorDescripcion(Estado.PENDIENTE);
					usuario.setEstado(estado1);
					usuario.setIntentosFallidos(0);
					if (!isEmailUnique(email)) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.CORREO_YA_EXISTE);
					}
					if (!isMovilUnique(movil)) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.NUMERO_TELEFONO_YA_EXISTE);
					}/*
					 * try { codigoGenerado = getMovilCodigoPorMovil(movil)
					 * .getCodigo(); } catch (NoResultException e) { return new
					 * RespuestaGuardarUsuario( CodigoRespuesta.GENERAR_CODIGO);
					 * }
					 * 
					 * if (!codigoValidacionMovil.equals(codigoGenerado)) {
					 * return new RespuestaGuardarUsuario(
					 * CodigoRespuesta.CODIGO_VALIDACION_INVALIDO); }
					 */
				} else {
					usuario = entityManager.find(Usuario.class,
							Integer.parseInt(usuarioId));
					if (credencial == null || credencial.trim().equals("")) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.DATOS_INVALIDOS,
								Utils.obtieneMensaje("null.password"));
					}
					if (email == null || email.trim().equals("")) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.DATOS_INVALIDOS,
								Utils.obtieneMensaje("null.email"));
					}
					if (movil == null || movil.trim().equals("")) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.DATOS_INVALIDOS,
								Utils.obtieneMensaje("null.phonenumber"));
					}
					if (!isEmailUnique(email)) {
						if (!email.equalsIgnoreCase(usuario.getEmail())) {
							return new RespuestaGuardarUsuario(
									CodigoRespuesta.CORREO_YA_EXISTE);
						}
					}
					if (usuario == null) {
						return new RespuestaGuardarUsuario(
								CodigoRespuesta.USUARIO_NO_EXISTE);
					}
					direccion1 = usuario.getDireccion();
				}
				if (paisId == null || paisId.equals("")
						|| Integer.parseInt(paisId) == 0) {
					return new RespuestaGuardarUsuario(
							CodigoRespuesta.DATOS_INVALIDOS, "PAIS_NULO");
				}
				usuario.setApellido(apellido);
				direccion1.setCiudadId(!StringUtils.isEmpty(ciudadId) ? Integer
						.parseInt(ciudadId) : 0);
				direccion1
						.setCondadoId(!StringUtils.isEmpty(condadoId) ? Integer
								.parseInt(condadoId) : 0);
				direccion1.setCodigoPostal(codigoPostal);
				direccion1.setDireccion(direccion);
				direccion1.setEstadoId(!StringUtils.isEmpty(estadoId) ? Integer
						.parseInt(estadoId) : 0);
				direccion1.setPaisId(!StringUtils.isEmpty(paisId) ? Integer
						.parseInt(paisId) : 0);
				usuario.setDireccion(direccion1);
				usuario.setEmail(email);
				DateFormat format = new SimpleDateFormat("dd-MM-yyyy",
						Locale.ENGLISH);
				Date date = format.parse(fechaNacimiento);
				usuario.setFechaNacimiento(date);
				usuario.setMovil(movil);
				usuario.setTelefonoResidencial(telefono);
				usuario.setNombre(nombre);
				usuario.setCredencial(credencial);
				usuario.setCredencialFecha(new Date());
				usuario.setEstado(getEstadoPorDescripcion(estado));
				TipoDocumento tipoDocumentoDesc = entityManager.find(
						TipoDocumento.class, Integer.parseInt(tipoDocumento));
				usuario.setTipoDocumento(tipoDocumentoDesc);
				usuario.setNumeroDocumento(numeroDocumento);
				usuario.setTelefonoResidencial(telefono);
				logger.debug("usuario: --->" + usuario);
				logger.debug("direccion1: --->" + direccion1);
				// logger.debug("cuenta: --->" + cuenta);
				Usuario usuarioEmpresa = getUsuarioporId(usuarioEmpresaId);

				if (usuarioId == null) {
					Cuenta cuenta = new Cuenta();
					cuenta.setSaldoAlocoins(0d);
					cuenta.setSaldoAlodiga(0d);
					cuenta.setSaldoHealthCareCoins(0d);
					cuenta.setNumeroCuenta(Utils.generarNumeroDeCuenta());
					usuario.setCuenta(cuenta);

					entityManager.persist(usuario);

					guardarPerfilAloPosComercial(usuarioApi, passwordApi,
							usuario, usuarioEmpresa, fechaVencimientoDocumento);

					logger.info("**************Sending email to user ********************"
							+ usuario.getNombre());
					Utils.enviarCorreUsuarioNuevo("ES", usuario, link);
				} else {
					entityManager.merge(usuario);
					if (usuario.getPerfilAloPos() == null) {
						guardarPerfilAloPosComercial(usuarioApi, passwordApi,
								usuario, usuarioEmpresa,
								fechaVencimientoDocumento);
					}

				}
				return new RespuestaGuardarUsuario(CodigoRespuesta.EXITO,
						CodigoRespuesta.EXITO.name(), usuario);
			}
			return new RespuestaGuardarUsuario(
					CodigoRespuesta.ERROR_CREDENCIALES);
		} catch (ConstraintViolationException e) {
			ConstraintViolationImpl<?> cv = (ConstraintViolationImpl<?>) e
					.getConstraintViolations().toArray()[0];
			return new RespuestaGuardarUsuario(CodigoRespuesta.DATOS_INVALIDOS,
					cv.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			return new RespuestaGuardarUsuario(CodigoRespuesta.ERROR_INTERNO,
					"Error - " + e.getMessage() + e.getLocalizedMessage()
							+ e.getCause() + e.getStackTrace());
		}
	}

	public RespuestaGuardarUsuario guardarPerfilAloPosComercial(
			String usuarioApi, String passwordApi, Usuario usuario,
			Usuario usuarioEmpresa, String fechaVencimientoDocumento) {

		if (!validarUsuario(usuarioApi, passwordApi)) {
			return new RespuestaGuardarUsuario(
					CodigoRespuesta.ERROR_CREDENCIALES);
		}

		try {
			logger.info("********** validando perfil alopos");
			if (usuario == null || usuarioEmpresa == null
					|| fechaVencimientoDocumento == null)

			{
				return new RespuestaGuardarUsuario(CodigoRespuesta.DATOS_NULOS);
			}

			Aplicacion aplicacion = getAplicacionporNombre("ALOPOS");
			List<Aplicacion> app = new ArrayList<Aplicacion>();
			if (usuario.getAplicaciones() == null) {
				app.add(aplicacion);
				usuario.setAplicacionUsuarios(app);
			} else {
				usuario.getAplicaciones().add(aplicacion);
			}

			PerfilAloPos perfil = new PerfilAloPos();

			if (usuario.getPerfilAloPos() == null) {

				perfil.setEmpresa(usuarioEmpresa.getPerfilAloPos().getEmpresa());
				perfil.setTipoPersona("NATURAL");
				DateFormat format = new SimpleDateFormat("dd-MM-yyyy",
						Locale.ENGLISH);
				Date date = format.parse(fechaVencimientoDocumento);
				perfil.setFechaVencimientoDocumento(date);
			}
			usuario.setPerfilAloPos(perfil);
			entityManager.merge(usuario);
			Utils.enviarCorreoConfirmacion("ES", usuario, "ALOPOS");
		} catch (ConstraintViolationException e) {
			return new RespuestaGuardarUsuario(CodigoRespuesta.DATOS_INVALIDOS,
					e.getLocalizedMessage());
		} catch (Exception e) {
			e.printStackTrace();
			return new RespuestaGuardarUsuario(CodigoRespuesta.ERROR_INTERNO,
					"Error - " + e.getMessage() + e.getLocalizedMessage()
							+ e.getCause() + e.getStackTrace());
		}
		return new RespuestaGuardarUsuario(CodigoRespuesta.EXITO, null, usuario);
	}
	
	
	public Respuesta transferirAlocoins(String usuarioId1, String usuarioId2, String usuarioApi, String passwordApi, String alocoins){
		Respuesta respuesta= null;
		if (!validarUsuario(usuarioApi, passwordApi)) {
			return new Respuesta(
					CodigoRespuesta.ERROR_CREDENCIALES);
		}
		
		if(usuarioId1==null||usuarioId1.equals("")||usuarioId2==null||usuarioId2.equals("")
		   ||alocoins==null||alocoins.equals("")){
			
			return new Respuesta(CodigoRespuesta.DATOS_NULOS);
			
		}else{
			
			Usuario usuario1 = entityManager.find(Usuario.class, Integer.parseInt(usuarioId1));
			Usuario usuario2 = entityManager.find(Usuario.class, Integer.parseInt(usuarioId2));
			
			if(usuario1!=null &&usuario2!=null)
			{
				double alocoins_cuenta=usuario1.getCuenta().getSaldoAlocoins();
				
				usuario1.getCuenta().setSaldoAlocoins(alocoins_cuenta-Integer.parseInt(alocoins));
				usuario2.getCuenta().setSaldoAlocoins(usuario2.getCuenta().getSaldoAlocoins()+Integer.parseInt(alocoins));
				
				entityManager.persist(usuario1);
				entityManager.persist(usuario2);
				
				String mensaje="";
				
				mensaje="Se ha realizado la transferencia a "+usuario2.getNombre()+" "+usuario2.getApellido()+" exitosamente.<br/>"+
						"Resumen<br/>"+
						"Alocoins enviados: "+alocoins+"<br/>"+
						"Fecha: "+(new Date().toLocaleString());
				
				Utils.enviarCorreoTransferenciaAlocoins("ES", usuario1, mensaje);
				
				
				return new Respuesta(CodigoRespuesta.EXITO);
			}
		}
		
		return respuesta;
	}
	
	public RespuestaUsuario getUsuarioPorTarjeta(String usuarioApi,
			String passwordApi, String tarjeta) {
		try {
			if (validarUsuario(usuarioApi, passwordApi)) {
				Usuario usuario = getUsuarioportarjeta(tarjeta);
				if (usuario == null) {
					return new RespuestaUsuario(
							CodigoRespuesta.USUARIO_NO_EXISTE,
							CodigoRespuesta.USUARIO_NO_EXISTE.name(), null);
				}
				return new RespuestaUsuario(CodigoRespuesta.EXITO, null,
						usuario);
			} else {
				return new RespuestaUsuario(CodigoRespuesta.ERROR_CREDENCIALES);
			}
		} catch (NoResultException e) {
			return new RespuestaUsuario(CodigoRespuesta.USUARIO_NO_EXISTE);
		} catch (Exception e) {
			return new RespuestaUsuario(CodigoRespuesta.ERROR_INTERNO,
					e.getMessage());
		}
	}
	public RespuestaUsuario getUsuarioPorCuenta(String usuarioApi,
			String passwordApi, String cuenta) {
		try {
			if (validarUsuario(usuarioApi, passwordApi)) {
				Usuario usuario = getUsuarioporcuenta(cuenta);
				if (usuario == null) {
					return new RespuestaUsuario(
							CodigoRespuesta.USUARIO_NO_EXISTE,
							CodigoRespuesta.USUARIO_NO_EXISTE.name(), null);
				}
				return new RespuestaUsuario(CodigoRespuesta.EXITO, null,
						usuario);
			} else {
				return new RespuestaUsuario(CodigoRespuesta.ERROR_CREDENCIALES);
			}
		} catch (NoResultException e) {
			return new RespuestaUsuario(CodigoRespuesta.USUARIO_NO_EXISTE);
		} catch (Exception e) {
			return new RespuestaUsuario(CodigoRespuesta.ERROR_INTERNO,
					e.getMessage());
		}
	}
        
    public Respuesta recuperarPassword(String usuarioApi, String passwordApi,
            String idioma, String email, String cliente) {
        if (validarUsuario(usuarioApi, passwordApi)) {
            if (email == null || email.equals("")) {
                return new Respuesta(CodigoRespuesta.DATOS_NULOS);
            }
            Usuario usuario = getUsuarioporemail(email);
            if (usuario == null) {
                return new Respuesta(CodigoRespuesta.USUARIO_NO_EXISTE);
            }

            if (cliente.equals(Constante.sCLIENTE_RRP)) {
                Utils.enviarCorreoRecuperarCredencialRRP(idioma, email);
            } else {
                Utils.enviarCorreoRecuperarCredencial(idioma, email);
            }

            return new Respuesta(CodigoRespuesta.EXITO);
        } else {
            return new Respuesta(CodigoRespuesta.ERROR_CREDENCIALES);
        }
    }
    
    
    
    public RespuestaNuevoToken loginSocialNetwork(String usuarioApi, String passwordApi,
			String email, String movil, String ip) {
		if (!validarUsuario(usuarioApi, passwordApi)) {
			return new RespuestaNuevoToken(CodigoRespuesta.ERROR_CREDENCIALES);
		}
		if (!Utils.isStringValido(movil) && !Utils.isStringValido(email)) {
			return new RespuestaNuevoToken(CodigoRespuesta.DATOS_NULOS);
		}
//		ConfiguracionGeneral diasValidezCredencial = entityManagerSaat
//				.createNamedQuery("getConfiguracionGeneralByNombre",
//						ConfiguracionGeneral.class)
//				.setParameter("nombreConfiguracion", "DIAS_MAXIMO_CREDENCIAL")
//				.getSingleResult();
		Usuario usuario = getLoginUsuario(email, movil);
		if (usuario == null) {
			return new RespuestaNuevoToken(CodigoRespuesta.USUARIO_NO_EXISTE);
		}
                if (usuario.getMovil() == null) {
			return new RespuestaNuevoToken(CodigoRespuesta.USER_NOT_HAS_PHONE_NUMBER);
		}
		DateTime fechaActual = new DateTime();
		DateTime fechaCredencial = new DateTime(usuario.getCredencialFecha());
//		fechaCredencial = fechaCredencial.plusDays(Integer
//				.parseInt(diasValidezCredencial.getValorConfiguracion()));
		if (usuario.getEstado().getDescripcion().equals(Estado.BLOQUEADO)) {
			return new RespuestaNuevoToken(CodigoRespuesta.USUARIO_BLOQUEADO);
		} /*else if (fechaCredencial.isBefore(fechaActual)) {
			return new RespuestaNuevoToken(CodigoRespuesta.CONTRASENIA_EXPIRADA);
		}*/  else if (usuario.getEstado().getDescripcion()
				.equals(Estado.PENDIENTE)) {
			return new RespuestaNuevoToken(CodigoRespuesta.USUARIO_PENDIENTE);
		}

		// Comentado para pruebas de Alodiga

		/*
		 * DireccionConfianza direccion = null; try { direccion =
		 * getDireccionConfianza(usuario, ip); } catch (NoResultException e) {
		 * return new RespuestaNuevoToken(CodigoRespuesta.IP_NO_CONFIANZA); }
		 */

		// Agregado unicamente para pruebas de Alodiga

		DireccionConfianza direccion = entityManager.find(
				DireccionConfianza.class, 2);
		if (usuario.getPreguntaSecretas() == null
				|| usuario.getPreguntaSecretas().isEmpty()) {
			return new RespuestaNuevoToken(CodigoRespuesta.PRIMER_INGRESO);
		}
		usuario.setIntentosFallidos(0);
		SesionUsuario sesion = new SesionUsuario();
		sesion.setActivo(true);
		sesion.setDireccionConfianza(direccion);
		sesion.setFechaActividad(new Date());
		sesion.setUsuario(usuario);
		String token = UUID.randomUUID().toString();
		sesion.setToken(token);
		System.out.println("token: " + token);
		Accion action = entityManager
				.createNamedQuery("Accion.byDescripcion", Accion.class)
				.setParameter("descripcion", Accion.LOGIN).getSingleResult();
		
		entityManager.persist(new Bitacora(ip, action, usuario));
		entityManager.persist(sesion);
		entityManager.merge(usuario);
		return new RespuestaNuevoToken(CodigoRespuesta.EXITO,
				CodigoRespuesta.EXITO.name(), token);
	}

}









