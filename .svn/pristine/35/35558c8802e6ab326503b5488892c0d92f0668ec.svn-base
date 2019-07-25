/**
 * PinUsuario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.icon.mw.ws;

public class PinUsuario  implements java.io.Serializable {
    private com.icon.mw.ws.PinLineModel pinLineModel;

    private java.lang.String userId;

    public PinUsuario() {
    }

    public PinUsuario(
           com.icon.mw.ws.PinLineModel pinLineModel,
           java.lang.String userId) {
           this.pinLineModel = pinLineModel;
           this.userId = userId;
    }


    /**
     * Gets the pinLineModel value for this PinUsuario.
     * 
     * @return pinLineModel
     */
    public com.icon.mw.ws.PinLineModel getPinLineModel() {
        return pinLineModel;
    }


    /**
     * Sets the pinLineModel value for this PinUsuario.
     * 
     * @param pinLineModel
     */
    public void setPinLineModel(com.icon.mw.ws.PinLineModel pinLineModel) {
        this.pinLineModel = pinLineModel;
    }


    /**
     * Gets the userId value for this PinUsuario.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this PinUsuario.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PinUsuario)) return false;
        PinUsuario other = (PinUsuario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pinLineModel==null && other.getPinLineModel()==null) || 
             (this.pinLineModel!=null &&
              this.pinLineModel.equals(other.getPinLineModel()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getPinLineModel() != null) {
            _hashCode += getPinLineModel().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PinUsuario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.mw.icon.com/", "pinUsuario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinLineModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pinLineModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.mw.icon.com/", "pinLineModel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
