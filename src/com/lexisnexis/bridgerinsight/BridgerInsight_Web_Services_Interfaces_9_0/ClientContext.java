/**
 * ClientContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ClientContext  implements java.io.Serializable {
    private java.lang.String clientID;

    private java.lang.String clientReference;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType DPPA;

    private java.lang.Integer GLB;

    private java.lang.String password;

    private java.lang.Boolean permissibleUse;

    private java.lang.String userID;

    public ClientContext() {
    }

    public ClientContext(
           java.lang.String clientID,
           java.lang.String clientReference,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType DPPA,
           java.lang.Integer GLB,
           java.lang.String password,
           java.lang.Boolean permissibleUse,
           java.lang.String userID) {
           this.clientID = clientID;
           this.clientReference = clientReference;
           this.DPPA = DPPA;
           this.GLB = GLB;
           this.password = password;
           this.permissibleUse = permissibleUse;
           this.userID = userID;
    }


    /**
     * Gets the clientID value for this ClientContext.
     * 
     * @return clientID
     */
    public java.lang.String getClientID() {
        return clientID;
    }


    /**
     * Sets the clientID value for this ClientContext.
     * 
     * @param clientID
     */
    public void setClientID(java.lang.String clientID) {
        this.clientID = clientID;
    }


    /**
     * Gets the clientReference value for this ClientContext.
     * 
     * @return clientReference
     */
    public java.lang.String getClientReference() {
        return clientReference;
    }


    /**
     * Sets the clientReference value for this ClientContext.
     * 
     * @param clientReference
     */
    public void setClientReference(java.lang.String clientReference) {
        this.clientReference = clientReference;
    }


    /**
     * Gets the DPPA value for this ClientContext.
     * 
     * @return DPPA
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType getDPPA() {
        return DPPA;
    }


    /**
     * Sets the DPPA value for this ClientContext.
     * 
     * @param DPPA
     */
    public void setDPPA(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType DPPA) {
        this.DPPA = DPPA;
    }


    /**
     * Gets the GLB value for this ClientContext.
     * 
     * @return GLB
     */
    public java.lang.Integer getGLB() {
        return GLB;
    }


    /**
     * Sets the GLB value for this ClientContext.
     * 
     * @param GLB
     */
    public void setGLB(java.lang.Integer GLB) {
        this.GLB = GLB;
    }


    /**
     * Gets the password value for this ClientContext.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ClientContext.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the permissibleUse value for this ClientContext.
     * 
     * @return permissibleUse
     */
    public java.lang.Boolean getPermissibleUse() {
        return permissibleUse;
    }


    /**
     * Sets the permissibleUse value for this ClientContext.
     * 
     * @param permissibleUse
     */
    public void setPermissibleUse(java.lang.Boolean permissibleUse) {
        this.permissibleUse = permissibleUse;
    }


    /**
     * Gets the userID value for this ClientContext.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this ClientContext.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientContext)) return false;
        ClientContext other = (ClientContext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientID==null && other.getClientID()==null) || 
             (this.clientID!=null &&
              this.clientID.equals(other.getClientID()))) &&
            ((this.clientReference==null && other.getClientReference()==null) || 
             (this.clientReference!=null &&
              this.clientReference.equals(other.getClientReference()))) &&
            ((this.DPPA==null && other.getDPPA()==null) || 
             (this.DPPA!=null &&
              this.DPPA.equals(other.getDPPA()))) &&
            ((this.GLB==null && other.getGLB()==null) || 
             (this.GLB!=null &&
              this.GLB.equals(other.getGLB()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.permissibleUse==null && other.getPermissibleUse()==null) || 
             (this.permissibleUse!=null &&
              this.permissibleUse.equals(other.getPermissibleUse()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getClientID() != null) {
            _hashCode += getClientID().hashCode();
        }
        if (getClientReference() != null) {
            _hashCode += getClientReference().hashCode();
        }
        if (getDPPA() != null) {
            _hashCode += getDPPA().hashCode();
        }
        if (getGLB() != null) {
            _hashCode += getGLB().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPermissibleUse() != null) {
            _hashCode += getPermissibleUse().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientContext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ClientContext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ClientID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ClientReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPPA");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DPPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DPPAChoiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLB");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "GLB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissibleUse");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PermissibleUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
