/**
 * ParsedSWIFTCurrencyDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedSWIFTCurrencyDetail  implements java.io.Serializable {
    private java.lang.String[] serialNumbers;

    private java.lang.String detailsOfCheques;

    public ParsedSWIFTCurrencyDetail() {
    }

    public ParsedSWIFTCurrencyDetail(
           java.lang.String[] serialNumbers,
           java.lang.String detailsOfCheques) {
           this.serialNumbers = serialNumbers;
           this.detailsOfCheques = detailsOfCheques;
    }


    /**
     * Gets the serialNumbers value for this ParsedSWIFTCurrencyDetail.
     * 
     * @return serialNumbers
     */
    public java.lang.String[] getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this ParsedSWIFTCurrencyDetail.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String[] serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the detailsOfCheques value for this ParsedSWIFTCurrencyDetail.
     * 
     * @return detailsOfCheques
     */
    public java.lang.String getDetailsOfCheques() {
        return detailsOfCheques;
    }


    /**
     * Sets the detailsOfCheques value for this ParsedSWIFTCurrencyDetail.
     * 
     * @param detailsOfCheques
     */
    public void setDetailsOfCheques(java.lang.String detailsOfCheques) {
        this.detailsOfCheques = detailsOfCheques;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedSWIFTCurrencyDetail)) return false;
        ParsedSWIFTCurrencyDetail other = (ParsedSWIFTCurrencyDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              java.util.Arrays.equals(this.serialNumbers, other.getSerialNumbers()))) &&
            ((this.detailsOfCheques==null && other.getDetailsOfCheques()==null) || 
             (this.detailsOfCheques!=null &&
              this.detailsOfCheques.equals(other.getDetailsOfCheques())));
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
        if (getSerialNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetailsOfCheques() != null) {
            _hashCode += getDetailsOfCheques().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedSWIFTCurrencyDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCurrencyDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SerialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailsOfCheques");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DetailsOfCheques"));
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
