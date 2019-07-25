/**
 * ParsedSWIFTCurrencySequence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedSWIFTCurrencySequence  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCurrencyDetail[] currencyDetails;

    private java.lang.String totalFaceValue;

    public ParsedSWIFTCurrencySequence() {
    }

    public ParsedSWIFTCurrencySequence(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCurrencyDetail[] currencyDetails,
           java.lang.String totalFaceValue) {
           this.currencyDetails = currencyDetails;
           this.totalFaceValue = totalFaceValue;
    }


    /**
     * Gets the currencyDetails value for this ParsedSWIFTCurrencySequence.
     * 
     * @return currencyDetails
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCurrencyDetail[] getCurrencyDetails() {
        return currencyDetails;
    }


    /**
     * Sets the currencyDetails value for this ParsedSWIFTCurrencySequence.
     * 
     * @param currencyDetails
     */
    public void setCurrencyDetails(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCurrencyDetail[] currencyDetails) {
        this.currencyDetails = currencyDetails;
    }


    /**
     * Gets the totalFaceValue value for this ParsedSWIFTCurrencySequence.
     * 
     * @return totalFaceValue
     */
    public java.lang.String getTotalFaceValue() {
        return totalFaceValue;
    }


    /**
     * Sets the totalFaceValue value for this ParsedSWIFTCurrencySequence.
     * 
     * @param totalFaceValue
     */
    public void setTotalFaceValue(java.lang.String totalFaceValue) {
        this.totalFaceValue = totalFaceValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedSWIFTCurrencySequence)) return false;
        ParsedSWIFTCurrencySequence other = (ParsedSWIFTCurrencySequence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencyDetails==null && other.getCurrencyDetails()==null) || 
             (this.currencyDetails!=null &&
              java.util.Arrays.equals(this.currencyDetails, other.getCurrencyDetails()))) &&
            ((this.totalFaceValue==null && other.getTotalFaceValue()==null) || 
             (this.totalFaceValue!=null &&
              this.totalFaceValue.equals(other.getTotalFaceValue())));
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
        if (getCurrencyDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencyDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrencyDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalFaceValue() != null) {
            _hashCode += getTotalFaceValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedSWIFTCurrencySequence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCurrencySequence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CurrencyDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCurrencyDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCurrencyDetail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFaceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TotalFaceValue"));
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
