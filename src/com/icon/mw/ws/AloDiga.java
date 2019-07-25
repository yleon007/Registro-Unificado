/**
 * AloDiga.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.icon.mw.ws;

public interface AloDiga extends java.rmi.Remote {
    public com.icon.mw.ws.Respuesta getPaisesDisponibilidadTopUps(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta cancelarPago(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getSaldoPin(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getNumeroAcceso(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta realizarLlamadaRegistro(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getPaisesDestino(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getRegionesDestino(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getCostoPorDestino(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getDenominacionesPinLine(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getDetalleLlamadas(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getListaPinUsuario(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta iniciaSesionAloMobile(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta finalzaSesionAloMobile(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getPaisesPagoFacturaPorServicios(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getServiciosPagoFacturaPorServicios(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getServicioPagoFacturaPorServicios(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta procesarPagoFacturaPorServicios(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, boolean arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta registrarCliente(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta buscarCliente(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta registrarClienteAloMobile(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta registrarClienteSisac(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta comprarPIN(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta cancelarCompraDePIN(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta recargaPIN(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta cancelarRecargaDePIN(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta buscarPIN(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getTiposTarjetasCredito(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getPaises(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getEstados(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getCiudades(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getCondados(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta procesarPago(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11, java.lang.String arg12, java.lang.String arg13, java.lang.String arg14) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getOperadorasDisponibilidadTopUps(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getProductosTopUpOperadora(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta getProductoTopUp(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta comprarTopUp(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11, java.lang.String arg12) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta enviarSMS(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6) throws java.rmi.RemoteException;
    public void validaTransaccion(java.lang.Long arg0, java.lang.Long arg1, java.lang.Long arg2, java.lang.Long arg3, java.lang.Double arg4, java.lang.Double arg5) throws java.rmi.RemoteException;
    public com.icon.mw.ws.Respuesta obtenerParametroBD(java.lang.String arg0) throws java.rmi.RemoteException;
}
