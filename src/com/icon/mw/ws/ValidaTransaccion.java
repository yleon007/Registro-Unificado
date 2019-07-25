/**
 * ValidaTransaccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.icon.mw.ws;

public class ValidaTransaccion  implements java.io.Serializable {
    private java.lang.Long arg0;

    private java.lang.Long arg1;

    private java.lang.Long arg2;

    private java.lang.Long arg3;

    private java.lang.Double arg4;

    private java.lang.Double arg5;

    public ValidaTransaccion() {
    }

    public ValidaTransaccion(
           java.lang.Long arg0,
           java.lang.Long arg1,
           java.lang.Long arg2,
           java.lang.Long arg3,
           java.lang.Double arg4,
           java.lang.Double arg5) {
           this.arg0 = arg0;
           this.arg1 = arg1;
           this.arg2 = arg2;
           this.arg3 = arg3;
           this.arg4 = arg4;
           this.arg5 = arg5;
    }


    /**
     * Gets the arg0 value for this ValidaTransaccion.
     * 
     * @return arg0
     */
    public java.lang.Long getArg0() {
        return arg0;
    }


    /**
     * Sets the arg0 value for this ValidaTransaccion.
     * 
     * @param arg0
     */
    public void setArg0(java.lang.Long arg0) {
        this.arg0 = arg0;
    }


    /**
     * Gets the arg1 value for this ValidaTransaccion.
     * 
     * @return arg1
     */
    public java.lang.Long getArg1() {
        return arg1;
    }


    /**
     * Sets the arg1 value for this ValidaTransaccion.
     * 
     * @param arg1
     */
    public void setArg1(java.lang.Long arg1) {
        this.arg1 = arg1;
    }


    /**
     * Gets the arg2 value for this ValidaTransaccion.
     * 
     * @return arg2
     */
    public java.lang.Long getArg2() {
        return arg2;
    }


    /**
     * Sets the arg2 value for this ValidaTransaccion.
     * 
     * @param arg2
     */
    public void setArg2(java.lang.Long arg2) {
        this.arg2 = arg2;
    }


    /**
     * Gets the arg3 value for this ValidaTransaccion.
     * 
     * @return arg3
     */
    public java.lang.Long getArg3() {
        return arg3;
    }


    /**
     * Sets the arg3 value for this ValidaTransaccion.
     * 
     * @param arg3
     */
    public void setArg3(java.lang.Long arg3) {
        this.arg3 = arg3;
    }


    /**
     * Gets the arg4 value for this ValidaTransaccion.
     * 
     * @return arg4
     */
    public java.lang.Double getArg4() {
        return arg4;
    }


    /**
     * Sets the arg4 value for this ValidaTransaccion.
     * 
     * @param arg4
     */
    public void setArg4(java.lang.Double arg4) {
        this.arg4 = arg4;
    }


    /**
     * Gets the arg5 value for this ValidaTransaccion.
     * 
     * @return arg5
     */
    public java.lang.Double getArg5() {
        return arg5;
    }


    /**
     * Sets the arg5 value for this ValidaTransaccion.
     * 
     * @param arg5
     */
    public void setArg5(java.lang.Double arg5) {
        this.arg5 = arg5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidaTransaccion)) return false;
        ValidaTransaccion other = (ValidaTransaccion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arg0==null && other.getArg0()==null) || 
             (this.arg0!=null &&
              this.arg0.equals(other.getArg0()))) &&
            ((this.arg1==null && other.getArg1()==null) || 
             (this.arg1!=null &&
              this.arg1.equals(other.getArg1()))) &&
            ((this.arg2==null && other.getArg2()==null) || 
             (this.arg2!=null &&
              this.arg2.equals(other.getArg2()))) &&
            ((this.arg3==null && other.getArg3()==null) || 
             (this.arg3!=null &&
              this.arg3.equals(other.getArg3()))) &&
            ((this.arg4==null && other.getArg4()==null) || 
             (this.arg4!=null &&
              this.arg4.equals(other.getArg4()))) &&
            ((this.arg5==null && other.getArg5()==null) || 
             (this.arg5!=null &&
              this.arg5.equals(other.getArg5())));
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
        if (getArg0() != null) {
            _hashCode += getArg0().hashCode();
        }
        if (getArg1() != null) {
            _hashCode += getArg1().hashCode();
        }
        if (getArg2() != null) {
            _hashCode += getArg2().hashCode();
        }
        if (getArg3() != null) {
            _hashCode += getArg3().hashCode();
        }
        if (getArg4() != null) {
            _hashCode += getArg4().hashCode();
        }
        if (getArg5() != null) {
            _hashCode += getArg5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidaTransaccion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.mw.icon.com/", "validaTransaccion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg0");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arg0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arg1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arg2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arg3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arg4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arg5"));
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
