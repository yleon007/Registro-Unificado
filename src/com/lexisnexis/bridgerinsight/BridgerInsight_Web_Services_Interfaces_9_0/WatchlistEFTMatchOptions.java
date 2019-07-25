/**
 * WatchlistEFTMatchOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class WatchlistEFTMatchOptions  implements java.io.Serializable {
    private java.lang.Boolean ACHGatewayOperatorOFACScreeningIndicator;

    private java.lang.Boolean ACHSecondaryOFACScreeningIndicator;

    public WatchlistEFTMatchOptions() {
    }

    public WatchlistEFTMatchOptions(
           java.lang.Boolean ACHGatewayOperatorOFACScreeningIndicator,
           java.lang.Boolean ACHSecondaryOFACScreeningIndicator) {
           this.ACHGatewayOperatorOFACScreeningIndicator = ACHGatewayOperatorOFACScreeningIndicator;
           this.ACHSecondaryOFACScreeningIndicator = ACHSecondaryOFACScreeningIndicator;
    }


    /**
     * Gets the ACHGatewayOperatorOFACScreeningIndicator value for this WatchlistEFTMatchOptions.
     * 
     * @return ACHGatewayOperatorOFACScreeningIndicator
     */
    public java.lang.Boolean getACHGatewayOperatorOFACScreeningIndicator() {
        return ACHGatewayOperatorOFACScreeningIndicator;
    }


    /**
     * Sets the ACHGatewayOperatorOFACScreeningIndicator value for this WatchlistEFTMatchOptions.
     * 
     * @param ACHGatewayOperatorOFACScreeningIndicator
     */
    public void setACHGatewayOperatorOFACScreeningIndicator(java.lang.Boolean ACHGatewayOperatorOFACScreeningIndicator) {
        this.ACHGatewayOperatorOFACScreeningIndicator = ACHGatewayOperatorOFACScreeningIndicator;
    }


    /**
     * Gets the ACHSecondaryOFACScreeningIndicator value for this WatchlistEFTMatchOptions.
     * 
     * @return ACHSecondaryOFACScreeningIndicator
     */
    public java.lang.Boolean getACHSecondaryOFACScreeningIndicator() {
        return ACHSecondaryOFACScreeningIndicator;
    }


    /**
     * Sets the ACHSecondaryOFACScreeningIndicator value for this WatchlistEFTMatchOptions.
     * 
     * @param ACHSecondaryOFACScreeningIndicator
     */
    public void setACHSecondaryOFACScreeningIndicator(java.lang.Boolean ACHSecondaryOFACScreeningIndicator) {
        this.ACHSecondaryOFACScreeningIndicator = ACHSecondaryOFACScreeningIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WatchlistEFTMatchOptions)) return false;
        WatchlistEFTMatchOptions other = (WatchlistEFTMatchOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACHGatewayOperatorOFACScreeningIndicator==null && other.getACHGatewayOperatorOFACScreeningIndicator()==null) || 
             (this.ACHGatewayOperatorOFACScreeningIndicator!=null &&
              this.ACHGatewayOperatorOFACScreeningIndicator.equals(other.getACHGatewayOperatorOFACScreeningIndicator()))) &&
            ((this.ACHSecondaryOFACScreeningIndicator==null && other.getACHSecondaryOFACScreeningIndicator()==null) || 
             (this.ACHSecondaryOFACScreeningIndicator!=null &&
              this.ACHSecondaryOFACScreeningIndicator.equals(other.getACHSecondaryOFACScreeningIndicator())));
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
        if (getACHGatewayOperatorOFACScreeningIndicator() != null) {
            _hashCode += getACHGatewayOperatorOFACScreeningIndicator().hashCode();
        }
        if (getACHSecondaryOFACScreeningIndicator() != null) {
            _hashCode += getACHSecondaryOFACScreeningIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WatchlistEFTMatchOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistEFTMatchOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACHGatewayOperatorOFACScreeningIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ACHGatewayOperatorOFACScreeningIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACHSecondaryOFACScreeningIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ACHSecondaryOFACScreeningIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
