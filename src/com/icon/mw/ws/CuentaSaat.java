/**
 * CuentaSaat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.icon.mw.ws;

public class CuentaSaat  implements java.io.Serializable {
    private long cuenta_usuario_id;

    private long tipo_cuenta_id;

    private long usuario_alocash_id;

    private long usuario_benefit_id;

    private long usuario_authpos_id;

    private java.lang.String numero_cuenta;

    private java.lang.Double saldo;

    public CuentaSaat() {
    }

    public CuentaSaat(
           long cuenta_usuario_id,
           long tipo_cuenta_id,
           long usuario_alocash_id,
           long usuario_benefit_id,
           long usuario_authpos_id,
           java.lang.String numero_cuenta,
           java.lang.Double saldo) {
           this.cuenta_usuario_id = cuenta_usuario_id;
           this.tipo_cuenta_id = tipo_cuenta_id;
           this.usuario_alocash_id = usuario_alocash_id;
           this.usuario_benefit_id = usuario_benefit_id;
           this.usuario_authpos_id = usuario_authpos_id;
           this.numero_cuenta = numero_cuenta;
           this.saldo = saldo;
    }


    /**
     * Gets the cuenta_usuario_id value for this CuentaSaat.
     * 
     * @return cuenta_usuario_id
     */
    public long getCuenta_usuario_id() {
        return cuenta_usuario_id;
    }


    /**
     * Sets the cuenta_usuario_id value for this CuentaSaat.
     * 
     * @param cuenta_usuario_id
     */
    public void setCuenta_usuario_id(long cuenta_usuario_id) {
        this.cuenta_usuario_id = cuenta_usuario_id;
    }


    /**
     * Gets the tipo_cuenta_id value for this CuentaSaat.
     * 
     * @return tipo_cuenta_id
     */
    public long getTipo_cuenta_id() {
        return tipo_cuenta_id;
    }


    /**
     * Sets the tipo_cuenta_id value for this CuentaSaat.
     * 
     * @param tipo_cuenta_id
     */
    public void setTipo_cuenta_id(long tipo_cuenta_id) {
        this.tipo_cuenta_id = tipo_cuenta_id;
    }


    /**
     * Gets the usuario_alocash_id value for this CuentaSaat.
     * 
     * @return usuario_alocash_id
     */
    public long getUsuario_alocash_id() {
        return usuario_alocash_id;
    }


    /**
     * Sets the usuario_alocash_id value for this CuentaSaat.
     * 
     * @param usuario_alocash_id
     */
    public void setUsuario_alocash_id(long usuario_alocash_id) {
        this.usuario_alocash_id = usuario_alocash_id;
    }


    /**
     * Gets the usuario_benefit_id value for this CuentaSaat.
     * 
     * @return usuario_benefit_id
     */
    public long getUsuario_benefit_id() {
        return usuario_benefit_id;
    }


    /**
     * Sets the usuario_benefit_id value for this CuentaSaat.
     * 
     * @param usuario_benefit_id
     */
    public void setUsuario_benefit_id(long usuario_benefit_id) {
        this.usuario_benefit_id = usuario_benefit_id;
    }


    /**
     * Gets the usuario_authpos_id value for this CuentaSaat.
     * 
     * @return usuario_authpos_id
     */
    public long getUsuario_authpos_id() {
        return usuario_authpos_id;
    }


    /**
     * Sets the usuario_authpos_id value for this CuentaSaat.
     * 
     * @param usuario_authpos_id
     */
    public void setUsuario_authpos_id(long usuario_authpos_id) {
        this.usuario_authpos_id = usuario_authpos_id;
    }


    /**
     * Gets the numero_cuenta value for this CuentaSaat.
     * 
     * @return numero_cuenta
     */
    public java.lang.String getNumero_cuenta() {
        return numero_cuenta;
    }


    /**
     * Sets the numero_cuenta value for this CuentaSaat.
     * 
     * @param numero_cuenta
     */
    public void setNumero_cuenta(java.lang.String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }


    /**
     * Gets the saldo value for this CuentaSaat.
     * 
     * @return saldo
     */
    public java.lang.Double getSaldo() {
        return saldo;
    }


    /**
     * Sets the saldo value for this CuentaSaat.
     * 
     * @param saldo
     */
    public void setSaldo(java.lang.Double saldo) {
        this.saldo = saldo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CuentaSaat)) return false;
        CuentaSaat other = (CuentaSaat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cuenta_usuario_id == other.getCuenta_usuario_id() &&
            this.tipo_cuenta_id == other.getTipo_cuenta_id() &&
            this.usuario_alocash_id == other.getUsuario_alocash_id() &&
            this.usuario_benefit_id == other.getUsuario_benefit_id() &&
            this.usuario_authpos_id == other.getUsuario_authpos_id() &&
            ((this.numero_cuenta==null && other.getNumero_cuenta()==null) || 
             (this.numero_cuenta!=null &&
              this.numero_cuenta.equals(other.getNumero_cuenta()))) &&
            ((this.saldo==null && other.getSaldo()==null) || 
             (this.saldo!=null &&
              this.saldo.equals(other.getSaldo())));
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
        _hashCode += new Long(getCuenta_usuario_id()).hashCode();
        _hashCode += new Long(getTipo_cuenta_id()).hashCode();
        _hashCode += new Long(getUsuario_alocash_id()).hashCode();
        _hashCode += new Long(getUsuario_benefit_id()).hashCode();
        _hashCode += new Long(getUsuario_authpos_id()).hashCode();
        if (getNumero_cuenta() != null) {
            _hashCode += getNumero_cuenta().hashCode();
        }
        if (getSaldo() != null) {
            _hashCode += getSaldo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CuentaSaat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.mw.icon.com/", "cuentaSaat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuenta_usuario_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuenta_usuario_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_cuenta_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo_cuenta_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario_alocash_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario_alocash_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario_benefit_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario_benefit_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario_authpos_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario_authpos_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_cuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero_cuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saldo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
