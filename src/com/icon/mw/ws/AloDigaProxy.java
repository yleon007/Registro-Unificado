package com.icon.mw.ws;

public class AloDigaProxy implements com.icon.mw.ws.AloDiga {
  private String _endpoint = null;
  private com.icon.mw.ws.AloDiga aloDiga = null;
  
  public AloDigaProxy() {
    _initAloDigaProxy();
  }
  
  public AloDigaProxy(String endpoint) {
    _endpoint = endpoint;
    _initAloDigaProxy();
  }
  
  private void _initAloDigaProxy() {
    try {
      aloDiga = (new com.icon.mw.ws.AloDigaServiceLocator()).getAloDigaPort();
      if (aloDiga != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aloDiga)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aloDiga)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aloDiga != null)
      ((javax.xml.rpc.Stub)aloDiga)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.icon.mw.ws.AloDiga getAloDiga() {
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga;
  }
  
  public com.icon.mw.ws.Respuesta getPaisesDisponibilidadTopUps(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getPaisesDisponibilidadTopUps(arg0, arg1);
  }
  
  public com.icon.mw.ws.Respuesta cancelarPago(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.cancelarPago(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta getSaldoPin(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getSaldoPin(arg0, arg1, arg2, arg3);
  }
  
  public com.icon.mw.ws.Respuesta getNumeroAcceso(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getNumeroAcceso(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta realizarLlamadaRegistro(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.realizarLlamadaRegistro(arg0, arg1, arg2, arg3, arg4);
  }
  
  public com.icon.mw.ws.Respuesta getPaisesDestino(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getPaisesDestino(arg0, arg1);
  }
  
  public com.icon.mw.ws.Respuesta getRegionesDestino(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getRegionesDestino(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta getCostoPorDestino(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getCostoPorDestino(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta getDenominacionesPinLine(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getDenominacionesPinLine(arg0, arg1);
  }
  
  public com.icon.mw.ws.Respuesta getDetalleLlamadas(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getDetalleLlamadas(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
  }
  
  public com.icon.mw.ws.Respuesta getListaPinUsuario(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getListaPinUsuario(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta iniciaSesionAloMobile(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.iniciaSesionAloMobile(arg0, arg1, arg2, arg3);
  }
  
  public com.icon.mw.ws.Respuesta finalzaSesionAloMobile(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.finalzaSesionAloMobile(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta getPaisesPagoFacturaPorServicios(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getPaisesPagoFacturaPorServicios(arg0, arg1);
  }
  
  public com.icon.mw.ws.Respuesta getServiciosPagoFacturaPorServicios(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getServiciosPagoFacturaPorServicios(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta getServicioPagoFacturaPorServicios(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getServicioPagoFacturaPorServicios(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta procesarPagoFacturaPorServicios(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, boolean arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.procesarPagoFacturaPorServicios(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
  }
  
  public com.icon.mw.ws.Respuesta registrarCliente(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.registrarCliente(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public com.icon.mw.ws.Respuesta buscarCliente(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.buscarCliente(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta registrarClienteAloMobile(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.registrarClienteAloMobile(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
  }
  
  public com.icon.mw.ws.Respuesta registrarClienteSisac(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.registrarClienteSisac(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
  }
  
  public com.icon.mw.ws.Respuesta comprarPIN(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.comprarPIN(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
  }
  
  public com.icon.mw.ws.Respuesta cancelarCompraDePIN(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.cancelarCompraDePIN(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta recargaPIN(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.recargaPIN(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
  }
  
  public com.icon.mw.ws.Respuesta cancelarRecargaDePIN(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.cancelarRecargaDePIN(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta buscarPIN(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.buscarPIN(arg0, arg1, arg2, arg3);
  }
  
  public com.icon.mw.ws.Respuesta getTiposTarjetasCredito(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getTiposTarjetasCredito(arg0, arg1);
  }
  
  public com.icon.mw.ws.Respuesta getPaises(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getPaises(arg0, arg1);
  }
  
  public com.icon.mw.ws.Respuesta getEstados(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getEstados(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta getCiudades(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getCiudades(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta getCondados(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getCondados(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta procesarPago(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11, java.lang.String arg12, java.lang.String arg13, java.lang.String arg14) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.procesarPago(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
  }
  
  public com.icon.mw.ws.Respuesta getOperadorasDisponibilidadTopUps(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getOperadorasDisponibilidadTopUps(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta getProductosTopUpOperadora(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getProductosTopUpOperadora(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta getProductoTopUp(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.getProductoTopUp(arg0, arg1, arg2);
  }
  
  public com.icon.mw.ws.Respuesta comprarTopUp(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10, java.lang.String arg11, java.lang.String arg12) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.comprarTopUp(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
  }
  
  public com.icon.mw.ws.Respuesta enviarSMS(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.enviarSMS(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
  }
  
  public void validaTransaccion(java.lang.Long arg0, java.lang.Long arg1, java.lang.Long arg2, java.lang.Long arg3, java.lang.Double arg4, java.lang.Double arg5) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    aloDiga.validaTransaccion(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public com.icon.mw.ws.Respuesta obtenerParametroBD(java.lang.String arg0) throws java.rmi.RemoteException{
    if (aloDiga == null)
      _initAloDigaProxy();
    return aloDiga.obtenerParametroBD(arg0);
  }
  
  
}