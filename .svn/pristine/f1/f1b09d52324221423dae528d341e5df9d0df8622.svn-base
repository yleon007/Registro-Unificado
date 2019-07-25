/**
 * AloDigaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.icon.mw.ws;

public class AloDigaServiceLocator extends org.apache.axis.client.Service implements com.icon.mw.ws.AloDigaService {

    public AloDigaServiceLocator() {
    }


    public AloDigaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AloDigaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AloDigaPort
    private java.lang.String AloDigaPort_address = "http://localhost:8080/saatmw/AloDigaService";

    public java.lang.String getAloDigaPortAddress() {
        return AloDigaPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AloDigaPortWSDDServiceName = "AloDigaPort";

    public java.lang.String getAloDigaPortWSDDServiceName() {
        return AloDigaPortWSDDServiceName;
    }

    public void setAloDigaPortWSDDServiceName(java.lang.String name) {
        AloDigaPortWSDDServiceName = name;
    }

    public com.icon.mw.ws.AloDiga getAloDigaPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AloDigaPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAloDigaPort(endpoint);
    }

    public com.icon.mw.ws.AloDiga getAloDigaPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.icon.mw.ws.AloDigaPortBindingStub _stub = new com.icon.mw.ws.AloDigaPortBindingStub(portAddress, this);
            _stub.setPortName(getAloDigaPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAloDigaPortEndpointAddress(java.lang.String address) {
        AloDigaPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.icon.mw.ws.AloDiga.class.isAssignableFrom(serviceEndpointInterface)) {
                com.icon.mw.ws.AloDigaPortBindingStub _stub = new com.icon.mw.ws.AloDigaPortBindingStub(new java.net.URL(AloDigaPort_address), this);
                _stub.setPortName(getAloDigaPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AloDigaPort".equals(inputPortName)) {
            return getAloDigaPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.mw.icon.com/", "AloDigaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.mw.icon.com/", "AloDigaPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AloDigaPort".equals(portName)) {
            setAloDigaPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
