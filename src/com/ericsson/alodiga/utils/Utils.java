package com.ericsson.alodiga.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Properties;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;

import com.ericsson.alodiga.model.Direccion;
import com.ericsson.alodiga.model.Ocupacion;
import com.ericsson.alodiga.model.TipoDocumento;
import com.ericsson.alodiga.model.Usuario;
import com.icon.mw.ws.AloDiga;
import com.icon.mw.ws.AloDigaServiceLocator;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AdditionalInfoType;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AssignmentInfo;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AssignmentType;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_ISearchStub;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Date;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.GenderType;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IDType;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ISearch;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAdditionalInfo;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAddress;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputEntity;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputEntityType;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputID;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputName;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputPhone;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputRecord;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputText;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchConfiguration;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchInput;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchResults;
import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.XGServicesLocator;

public class Utils {

    private static Properties messages;
    private static Properties validationMessages;

    private static final Logger logger = Logger.getLogger(Utils.class);

    public static String generarCodigoRandom(int longitud) {
        String codigoGenerado = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud) {
            codigoGenerado += "" + r.nextInt(10);
            i++;
        }
        System.out.println("codGenerado: ----> " + codigoGenerado);
        return codigoGenerado;
    }

    public static String generarNumeroDeCuenta() {
        return "256344" + Utils.generarCodigoRandom(10);

    }

    private static AloDiga wsaPort;

    /**
     * Devuelve una instancia para la comunicaci??n con el web service de AloDiga
     *
     * @return {@link AuthPos}
     * @throws ServiceException
     */
    public static AloDiga getWsaPort() {
        try {
            if (wsaPort == null) {
                AloDigaServiceLocator locator = new AloDigaServiceLocator();
                locator.setAloDigaPortEndpointAddress(obtienePropiedad("webServiceAlodigaUrl"));
                wsaPort = locator.getAloDigaPort();
            }
        } catch (ServiceException se) {
            logger.error("Error en el webservice", se);
        }
        return wsaPort;
    }

    public static String obtienePropiedad(String key) {
        try {
            if (messages == null) {
                messages = new Properties();
                String path = Utils.class.getClassLoader()
                        .getResource("config.properties").getFile();
                messages.load(new FileInputStream(path));
            }
            return messages.getProperty(key).trim();
        } catch (IOException ex) {
            return "(El sistema no puede encontrar el archivo .properties)";
        }
    }

    public static String obtieneMensaje(String key) {
        try {
            if (validationMessages == null) {
                validationMessages = new Properties();
                String path = Utils.class.getClassLoader()
                        .getResource("ValidationMessages.properties").getFile();
                validationMessages.load(new FileInputStream(path));
            }
            return validationMessages.getProperty(key).trim();
        } catch (IOException ex) {
            return "(El sistema no puede encontrar el archivo .properties)";
        }
    }

    private static boolean enviarCorreoConfirmacionAloBenefit(String idioma,
            Usuario usuario) {
        File imagenMembresia = null;
        File imagenMembresiaBorrar = null;
        String mensajeConfirmacion = "ES";
        if (idioma.equalsIgnoreCase("ES")) {
            mensajeConfirmacion = obtienePropiedad("MENSAJE_CONFIRMACION_BENEFIT_ES");
            imagenMembresia = new File(Utils.class.getClassLoader()
                    .getResource("tarjeta_alobenefit_es.png").getFile());
        }
        if (idioma.equalsIgnoreCase("EN")) {
            mensajeConfirmacion = obtienePropiedad("MENSAJE_CONFIRMACION_BENEFIT_EN");
            imagenMembresia = new File(Utils.class.getClassLoader()
                    .getResource("tarjeta_alobenefit_en.png").getFile());
        }
        if (imagenMembresia != null) {
            BufferedImage image;
            try {
                image = ImageIO.read(imagenMembresia);
            } catch (IOException e) {
                logger.error("Problema al leer imagen de membresia Alobenefit",
                        e);
                return false;
            }
            Graphics g = image.getGraphics();
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 14));
            g.drawString(usuario.getMovil(), 280, 170);
            g.drawString(usuario.getNombre() + " " + usuario.getApellido(), 55,
                    125);
            g.dispose();
            try {
                ImageIO.write(image, "png", imagenMembresiaBorrar = new File(
                        imagenMembresia.getAbsolutePath()
                        + generarCodigoRandom(10) + ".png"));
            } catch (IOException e) {
                logger.error(
                        "Problema al escribir imagen de membresia Alobenefit",
                        e);
                return false;
            }
        }
        String cuerpoCorreo = String.format(mensajeConfirmacion,
                usuario.getNombre() + " " + usuario.getApellido(), "");
        logger.debug("alobenefit-registro-Mensaje-a-enviar: " + cuerpoCorreo);
        boolean correoEnviado = EnvioCorreo.enviarCorreoHtml(
                new String[]{usuario.getEmail()}, "Registro AloBenefit",
                cuerpoCorreo, Utils.obtienePropiedad("mail.user"),
                imagenMembresiaBorrar);
        imagenMembresiaBorrar.delete();
        return correoEnviado;
    }

    private static boolean enviarCorreoConfirmacionPorAplicacion(String idioma,
            Usuario usuario, String aplicacion) {
        String mensajeConfirmacion = "ES";
        if (idioma.equalsIgnoreCase("ES")) {
            mensajeConfirmacion = obtienePropiedad("MENSAJE_CONFIRMACION_"
                    + aplicacion + "_ES");

        }
        if (idioma.equalsIgnoreCase("EN")) {
            mensajeConfirmacion = obtienePropiedad("MENSAJE_CONFIRMACION_"
                    + aplicacion + "_EN");

        }
        String cuerpoCorreo = String.format(mensajeConfirmacion,
                usuario.getNombre() + " " + usuario.getApellido(), "");
        logger.debug(aplicacion + "-registro-Mensaje-a-enviar: " + cuerpoCorreo);
        EnvioCorreo.enviarCorreoHtml(new String[]{usuario.getEmail()},
                "Registro " + aplicacion, cuerpoCorreo,
                Utils.obtienePropiedad("mail.user"), null);
        return true;
    }

    private static boolean enviarCorreoConfirmacionAloCash(String idioma,
            Usuario usuario) {
        File imagenMembresia = null;
        File imagenMembresiaBorrar = null;
        String mensajeConfirmacion = "ES";
        String numeroCuenta = usuario.getCuenta().getNumeroCuenta();
        if (idioma.equalsIgnoreCase("ES")) {
            mensajeConfirmacion = obtienePropiedad("MENSAJE_CONFIRMACION_ALOCASH_ES");
            imagenMembresia = new File(Utils.class.getClassLoader()
                    .getResource("tarjeta_rrp_es.png").getFile());
        }
        if (idioma.equalsIgnoreCase("EN")) {
            mensajeConfirmacion = obtienePropiedad("MENSAJE_CONFIRMACION_ALOCASH_EN");
            imagenMembresia = new File(Utils.class.getClassLoader()
                    .getResource("tarjeta_rrp_en.png").getFile());
        }
        if (imagenMembresia != null) {
            BufferedImage image;
            try {
                image = ImageIO.read(imagenMembresia);
            } catch (IOException e) {
                logger.error(
                        "Problema al escribir imagen de membresia Alocash", e);
                return false;
            }
            Graphics g = image.getGraphics();
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 70));
            g.drawString(String.format(
                    Utils.obtienePropiedad("FORMATO_TARJETA_ALOCASH"),
                    numeroCuenta.substring(0, 2), numeroCuenta.substring(2, 6),
                    numeroCuenta.substring(6, 10)), 105, 400);
            String sNombreTarjetaHabiente = usuario.getNombre().toUpperCase()
                    + " " + usuario.getApellido().toUpperCase();

            if (sNombreTarjetaHabiente.length() > 26) {
                sNombreTarjetaHabiente = sNombreTarjetaHabiente
                        .substring(0, 25);
                g.setFont(new Font("Arial", Font.BOLD, 40));
            } else {
                g.setFont(new Font("Arial", Font.BOLD, 45));
            }
            g.drawString(sNombreTarjetaHabiente, 135, 600);
            g.setFont(new Font("Arial", Font.PLAIN, 50));
            g.drawString("EXPIRES", 135, 510);
            g.setFont(new Font("Arial", Font.BOLD, 50));
			// TODO Colocar fecha vencimiento?
            // TODO Colocar codigo Tarjeta?
            // g.drawString(sFechaVencimiento, 400, 510);
            // g.drawString(sCodigoTarjeta, 1830, 235);
            // insertar nombre, pin y fecha vencimiento
            g.dispose();
            try {
                ImageIO.write(image, "png", imagenMembresiaBorrar = new File(
                        imagenMembresia.getAbsolutePath()
                        + generarCodigoRandom(10) + ".png"));
            } catch (IOException e) {
                logger.error(
                        "Problema al escribir imagen de membresia Alocash", e);
                return false;
            }
        }
        String cuerpoCorreo = String.format(mensajeConfirmacion,
                usuario.getNombre() + " " + usuario.getApellido(), "");
        logger.debug("alobenefit-registro-Mensaje-a-enviar: " + cuerpoCorreo);
        EnvioCorreo.enviarCorreoHtml(new String[]{usuario.getEmail()},
                "Registro AloBenefit", cuerpoCorreo,
                Utils.obtienePropiedad("mail.user"), imagenMembresiaBorrar);
        imagenMembresiaBorrar.delete();
        return true;
    }

    public static boolean enviarCorreoConfirmacion(String idioma,
            Usuario usuario, String aplicacion) {
        if (aplicacion.equals("ALOBENEFIT")) {
            return enviarCorreoConfirmacionAloBenefit(idioma, usuario);
        } else if (aplicacion.equals("ALOCASH")) {
            return enviarCorreoConfirmacionAloCash(idioma, usuario);
        } else {
            return enviarCorreoConfirmacionPorAplicacion(idioma, usuario,
                    aplicacion);
        }
    }

    public static void enviarCorreoBloqueo(String idioma, Usuario usuario) {
        String mensaje = null;
        String subject = null;
        if (idioma.equalsIgnoreCase("ES")) {
            mensaje = obtienePropiedad("INTENTOS_LOGIN_ES");
            subject = "Cuenta bloqueada";
        } else if (idioma.equalsIgnoreCase("EN")) {
            mensaje = obtienePropiedad("INTENTOS_LOGIN_EN");
            subject = "Blocked account";
        }

        EnvioCorreo.enviarCorreoHtml(new String[]{usuario.getEmail()},
                subject, mensaje, Utils.obtienePropiedad("mail.user"), null);
    }

    public static void enviarCorreoSolicitarTarjeta(String idioma, Usuario usuario) {
        String mensaje = null;
        String subject = null;
        if (idioma.equalsIgnoreCase("ES")) {
            mensaje = "Solicitud de Tarjeta";
            subject = "Solicitud de Tarjeta";
        }

        EnvioCorreo.enviarCorreoHtml(new String[]{usuario.getEmail()},
                subject, mensaje, Utils.obtienePropiedad("mail.user"), null);
    }

    public static void enviarCorreoActivacionTarjeta(String idioma, Usuario usuario) {
        String mensaje = null;
        String subject = null;
        if (idioma.equalsIgnoreCase("ES")) {
            mensaje = "Activacion de Tarjeta";
            subject = "Activacion de Tarjeta";
        }

        EnvioCorreo.enviarCorreoHtml(new String[]{usuario.getEmail()},
                subject, mensaje, Utils.obtienePropiedad("mail.user"), null);
    }

    public static void enviarCorreoTransferenciaAlocoins(String idioma, Usuario usuario, String mensaje) {

        String subject = null;
        if (idioma.equalsIgnoreCase("ES")) {

            subject = "Transferencia de Alocoins";
        }

        EnvioCorreo.enviarCorreoHtml(new String[]{usuario.getEmail()},
                subject, mensaje, Utils.obtienePropiedad("mail.user"), null);
    }

    public static boolean isNumeroValido(String numero) {
        return (numero.matches("[0-9]+"));
    }

    public static void enviarCorreoRecuperarCredencial(String idioma,
            String email) {
        String mensaje = null;
        String subject = null;
        if (idioma.equalsIgnoreCase("ES")) {
            mensaje = obtienePropiedad("MENSAJE_RECUPERAR_CREDENCIAL_ES");
            subject = "Cambiar credencial";
        } else if (idioma.equalsIgnoreCase("EN")) {
            mensaje = obtienePropiedad("MENSAJE_RECUPERAR_CREDENCIAL_EN");
            subject = "Password reset";
        }

        String correoEncriptado = Encryptor.encrypt(
                obtienePropiedad("ENC_KEY"),
                obtienePropiedad("ENC_INIT_VALUE"), email);

        mensaje = String.format(mensaje, correoEncriptado, correoEncriptado);

        EnvioCorreo.enviarCorreoHtml(new String[]{email}, subject, mensaje,
                Utils.obtienePropiedad("mail.user"), null);
    }

    public static boolean isDecimalValido(String numero) {
        return numero.matches("[0-9]+(\\.[0-9][0-9]?)?");
    }

    public static boolean isStringValido(String string) {
        return !(string == null || string.equals(""));
    }

    static XGServicesLocator xglocator = new XGServicesLocator();

    static BasicHttpBinding_ISearchStub searchStub;

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.setApellido("Frank");
        usuario.setNombre("Diaz");
        usuario.setFechaNacimiento(new java.util.Date());
        usuario.setEmail("kerwin2821@gmail.com");
        usuario.setGenero("M");

        TipoDocumento td = new TipoDocumento();
        td.setNombre("PASAPORTE");
        td.setTipoDocumentoId(2);
        usuario.setTipoDocumento(td);
        usuario.setNumeroDocumento("1234567890");

        Direccion direccion = new Direccion();
        direccion.setCiudadId(1);
        direccion.setCodigoPostal("1234");
        direccion.setDireccion("14th St.");
        direccion.setEstadoId(1);
        direccion.setPaisId(1);
        usuario.setDireccion(direccion);

        Ocupacion ocupacion = new Ocupacion();
        ocupacion.setNombre("None");
        usuario.setOcupacion(ocupacion);

        try {
            System.out.println(esUsuarioFraudulento(usuario));
        } catch (Exception e) {
            e.printStackTrace();
        }
        enviarCorreUsuarioNuevo("ES", usuario, "alodiga");

    }

    public static boolean esUsuarioFraudulento(Usuario usuario)
            throws Exception {
        xglocator.setBasicHttpBinding_ISearchEndpointAddress(xglocator
                .getBasicHttpBinding_ISearchAddress());
        try {
            System.getProperties().put("proxySet", "true");
            System.getProperties().put("https.proxyHost", "192.168.15.7");
            System.getProperties().put("https.proxyPort", "8080");
            ISearch s = xglocator.getBasicHttpBinding_ISearch();
            System.out.println("setting client context");
            ClientContext cc = new ClientContext(
                    obtienePropiedad("LN_CLIENT_ID"), null, null, null,
                    obtienePropiedad("LN_PASSWORD"), null,
                    obtienePropiedad("LN_USER_ID"));
            System.out.println("setting user data");
            Calendar cal = Calendar.getInstance();
            cal.setTime(usuario.getFechaNacimiento());
            Date fechaNacimiento = new Date();
            fechaNacimiento.setDay(cal.get(Calendar.DAY_OF_MONTH));
            fechaNacimiento.setMonth(cal.get(Calendar.MONTH));
            fechaNacimiento.setYear(cal.get(Calendar.YEAR));
            System.out.println("setting iaiDOB");
            InputAdditionalInfo iaiDOB = new InputAdditionalInfo(
                    fechaNacimiento, "", AdditionalInfoType.DOB, "");
            System.out.println("setting iaiOcupacion");
            InputAdditionalInfo iaiOcupacion = new InputAdditionalInfo(null,
                    "", AdditionalInfoType.Occupation, usuario.getOcupacion()
                    .getNombre());
            System.out.println("setting user data");
            InputEntity ie = new InputEntity();
            ie.setGender(usuario.getGenero().equalsIgnoreCase("M") ? GenderType.Male
                    : GenderType.Female);
            String primerNombre = "";
            String segundoNombre = "";
            if (usuario.getNombre().contains(" ")) {
                String[] nombres = usuario.getNombre().split(" ");
                if (nombres.length > 1) {
                    primerNombre = nombres[0];
                    segundoNombre = nombres[1];
                }
            }
            ie.setName(new InputName(primerNombre, "", "", usuario.getApellido(), segundoNombre, ""));

            ie.setEntityType(InputEntityType.Individual);
            ie.setAdditionalInfo(new InputAdditionalInfo[]{iaiDOB,
                iaiOcupacion});
            InputAddress ia = new InputAddress();
            ia.setFullAddress(usuario.getDireccion().getDireccion());
			// TODO obtener ciudad no id .... obtener pais no id ... obtener
            // estado no id
            ia.setPostalCode(usuario.getDireccion().getCodigoPostal());

            ie.setAddresses(new InputAddress[]{ia});

            InputID ii = new InputID();
            ii.setType(obtenerTipoDocumento(usuario.getTipoDocumento()));
            ii.setNumber(usuario.getNumeroDocumento());
            ie.setIDs(new InputID[]{ii});

            InputPhone ip = new InputPhone();
            ip.setNumber(usuario.getMovil());
            ie.setPhones(new InputPhone[]{ip});
            InputText it = new InputText();
            InputRecord ir = new InputRecord(null, ie, 0l, it);
            AssignmentInfo ai = new AssignmentInfo(null, false,
                    new String[]{obtienePropiedad("LN_ROLE")},
                    AssignmentType.Role);

            SearchConfiguration sc = new SearchConfiguration(ai, null, null,
                    null, obtienePropiedad("LN_PREDEFINED_SEARCH_NAME"), null,
                    false);

            SearchInput si = new SearchInput("1", new InputRecord[]{ir});
            System.out.println("pre search");
            SearchResults searchResult = s.search(cc, sc, si);
            return (searchResult.getRecords() != null && searchResult
                    .getRecords().length > 0);

        } catch (Exception e) {
            logger.error("Error al verificar usuario con LexisNexis", e);
            throw e;
        }
    }

    private static String obtenerCiudad(String ciudadId) {
        // TODO
        return "";
    }

    private static String obtenerEstado(String ciudadId) {
        // TODO
        return "";
    }

    private static String obtenerPais(String ciudadId) {
        // TODO
        return "";
    }

    private static IDType obtenerTipoDocumento(TipoDocumento tipoDocumento) {
        if (tipoDocumento.getNombre().equalsIgnoreCase("LICENCIA")) {
            return IDType.DriversLicense;
        } else if (tipoDocumento.getNombre().equalsIgnoreCase("PASAPORTE")) {
            return IDType.Passport;
        } else if (tipoDocumento.getNombre().equalsIgnoreCase("SSN")) {
            return IDType.SSN;
        }
        return IDType.TaxID;
    }

    public static boolean enviarCorreUsuarioNuevo(String idioma, Usuario usuario, String link) {
        // TODO Auto-generated method stub
        String mensajeConfirmacion = "ES";
        if (idioma.equalsIgnoreCase("ES")) {
            mensajeConfirmacion = obtienePropiedad("MENSAJE_CONFIRMACION_ES");

        }
        if (idioma.equalsIgnoreCase("EN")) {
            mensajeConfirmacion = obtienePropiedad("MENSAJE_CONFIRMACION_EN");

        }

        String correoEncriptado = Encryptor.encrypt(
                obtienePropiedad("ENC_KEY"),
                obtienePropiedad("ENC_INIT_VALUE"), usuario.getEmail());

        String cuerpoCorreo = String.format(mensajeConfirmacion,
                usuario.getNombre() + " " + usuario.getApellido(), link, correoEncriptado, link, correoEncriptado);
        logger.debug("-registro-Mensaje-a-enviar: " + cuerpoCorreo);
        EnvioCorreo.enviarCorreoHtml(new String[]{usuario.getEmail()},
                "Registro ", cuerpoCorreo, Utils.obtienePropiedad("mail.user"),
                null);
        return true;
    }

    public static void enviarCorreoRecuperarCredencialRRP(String idioma,
            String email) {
        String mensaje = null;
        String subject = null;
        if (idioma.equalsIgnoreCase("ES")) {
            mensaje = obtienePropiedad("MENSAJE_RECUPERAR_CREDENCIALRRP_ES");
            subject = "Cambiar credencial";
        } else if (idioma.equalsIgnoreCase("EN")) {
            mensaje = obtienePropiedad("MENSAJE_RECUPERAR_CREDENCIALRRP_EN");
            subject = "Password reset";
        }

        String correoEncriptado = Encryptor.encrypt(
                obtienePropiedad("ENC_KEY"),
                obtienePropiedad("ENC_INIT_VALUE"), email);

        mensaje = String.format(mensaje, correoEncriptado, correoEncriptado);

        EnvioCorreo.enviarCorreoHtml(new String[]{email}, subject, mensaje,
                Utils.obtienePropiedad("mail.user"), null);
    }

}
