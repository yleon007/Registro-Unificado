/**
 * XGServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class XGServicesLocator extends org.apache.axis.client.Service implements com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.XGServices {

    public XGServicesLocator() {
    }


    public XGServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public XGServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IAccount
    private java.lang.String BasicHttpBinding_IAccount_address = "https://bridger.lexisnexis.com/LN.WebService.V9/XGServices.svc/Account";

    public java.lang.String getBasicHttpBinding_IAccountAddress() {
        return BasicHttpBinding_IAccount_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IAccountWSDDServiceName = "BasicHttpBinding_IAccount";

    public java.lang.String getBasicHttpBinding_IAccountWSDDServiceName() {
        return BasicHttpBinding_IAccountWSDDServiceName;
    }

    public void setBasicHttpBinding_IAccountWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IAccountWSDDServiceName = name;
    }

    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IAccount getBasicHttpBinding_IAccount() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IAccount_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IAccount(endpoint);
    }

    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IAccount getBasicHttpBinding_IAccount(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IAccountStub _stub = new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IAccountStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IAccountWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IAccountEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IAccount_address = address;
    }


    // Use to get a proxy class for BasicHttpBinding_IResults
    private java.lang.String BasicHttpBinding_IResults_address = "https://bridger.lexisnexis.com/LN.WebService.V9/XGServices.svc/Results";

    public java.lang.String getBasicHttpBinding_IResultsAddress() {
        return BasicHttpBinding_IResults_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IResultsWSDDServiceName = "BasicHttpBinding_IResults";

    public java.lang.String getBasicHttpBinding_IResultsWSDDServiceName() {
        return BasicHttpBinding_IResultsWSDDServiceName;
    }

    public void setBasicHttpBinding_IResultsWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IResultsWSDDServiceName = name;
    }

    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IResults getBasicHttpBinding_IResults() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IResults_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IResults(endpoint);
    }

    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IResults getBasicHttpBinding_IResults(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IResultsStub _stub = new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IResultsStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IResultsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IResultsEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IResults_address = address;
    }


    // Use to get a proxy class for BasicHttpBinding_ISearch
    private java.lang.String BasicHttpBinding_ISearch_address = "https://bridger.lexisnexis.com/LN.WebService.V9/XGServices.svc/Search";

    public java.lang.String getBasicHttpBinding_ISearchAddress() {
        return BasicHttpBinding_ISearch_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ISearchWSDDServiceName = "BasicHttpBinding_ISearch";

    public java.lang.String getBasicHttpBinding_ISearchWSDDServiceName() {
        return BasicHttpBinding_ISearchWSDDServiceName;
    }

    public void setBasicHttpBinding_ISearchWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ISearchWSDDServiceName = name;
    }

    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ISearch getBasicHttpBinding_ISearch() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ISearch_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ISearch(endpoint);
    }

    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ISearch getBasicHttpBinding_ISearch(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_ISearchStub _stub = new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_ISearchStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ISearchWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ISearchEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ISearch_address = address;
    }


    // Use to get a proxy class for BasicHttpBinding_IListMaintenance
    private java.lang.String BasicHttpBinding_IListMaintenance_address = "https://bridger.lexisnexis.com/LN.WebService.V9/XGServices.svc/ListMaintenance";

    public java.lang.String getBasicHttpBinding_IListMaintenanceAddress() {
        return BasicHttpBinding_IListMaintenance_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IListMaintenanceWSDDServiceName = "BasicHttpBinding_IListMaintenance";

    public java.lang.String getBasicHttpBinding_IListMaintenanceWSDDServiceName() {
        return BasicHttpBinding_IListMaintenanceWSDDServiceName;
    }

    public void setBasicHttpBinding_IListMaintenanceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IListMaintenanceWSDDServiceName = name;
    }

    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IListMaintenance getBasicHttpBinding_IListMaintenance() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IListMaintenance_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IListMaintenance(endpoint);
    }

    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IListMaintenance getBasicHttpBinding_IListMaintenance(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IListMaintenanceStub _stub = new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IListMaintenanceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IListMaintenanceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IListMaintenanceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IListMaintenance_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IAccount.class.isAssignableFrom(serviceEndpointInterface)) {
                com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IAccountStub _stub = new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IAccountStub(new java.net.URL(BasicHttpBinding_IAccount_address), this);
                _stub.setPortName(getBasicHttpBinding_IAccountWSDDServiceName());
                return _stub;
            }
            if (com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IResults.class.isAssignableFrom(serviceEndpointInterface)) {
                com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IResultsStub _stub = new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IResultsStub(new java.net.URL(BasicHttpBinding_IResults_address), this);
                _stub.setPortName(getBasicHttpBinding_IResultsWSDDServiceName());
                return _stub;
            }
            if (com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ISearch.class.isAssignableFrom(serviceEndpointInterface)) {
                com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_ISearchStub _stub = new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_ISearchStub(new java.net.URL(BasicHttpBinding_ISearch_address), this);
                _stub.setPortName(getBasicHttpBinding_ISearchWSDDServiceName());
                return _stub;
            }
            if (com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IListMaintenance.class.isAssignableFrom(serviceEndpointInterface)) {
                com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IListMaintenanceStub _stub = new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.BasicHttpBinding_IListMaintenanceStub(new java.net.URL(BasicHttpBinding_IListMaintenance_address), this);
                _stub.setPortName(getBasicHttpBinding_IListMaintenanceWSDDServiceName());
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
        if ("BasicHttpBinding_IAccount".equals(inputPortName)) {
            return getBasicHttpBinding_IAccount();
        }
        else if ("BasicHttpBinding_IResults".equals(inputPortName)) {
            return getBasicHttpBinding_IResults();
        }
        else if ("BasicHttpBinding_ISearch".equals(inputPortName)) {
            return getBasicHttpBinding_ISearch();
        }
        else if ("BasicHttpBinding_IListMaintenance".equals(inputPortName)) {
            return getBasicHttpBinding_IListMaintenance();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "XGServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "BasicHttpBinding_IAccount"));
            ports.add(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "BasicHttpBinding_IResults"));
            ports.add(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "BasicHttpBinding_ISearch"));
            ports.add(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "BasicHttpBinding_IListMaintenance"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IAccount".equals(portName)) {
            setBasicHttpBinding_IAccountEndpointAddress(address);
        }
        else 
if ("BasicHttpBinding_IResults".equals(portName)) {
            setBasicHttpBinding_IResultsEndpointAddress(address);
        }
        else 
if ("BasicHttpBinding_ISearch".equals(portName)) {
            setBasicHttpBinding_ISearchEndpointAddress(address);
        }
        else 
if ("BasicHttpBinding_IListMaintenance".equals(portName)) {
            setBasicHttpBinding_IListMaintenanceEndpointAddress(address);
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
