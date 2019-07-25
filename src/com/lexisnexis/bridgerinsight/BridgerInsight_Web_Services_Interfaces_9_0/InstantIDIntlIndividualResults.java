/**
 * InstantIDIntlIndividualResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class InstantIDIntlIndividualResults  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIHeader header;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIResult result;

    public InstantIDIntlIndividualResults() {
    }

    public InstantIDIntlIndividualResults(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIHeader header,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIResult result) {
           this.header = header;
           this.result = result;
    }


    /**
     * Gets the header value for this InstantIDIntlIndividualResults.
     * 
     * @return header
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIHeader getHeader() {
        return header;
    }


    /**
     * Sets the header value for this InstantIDIntlIndividualResults.
     * 
     * @param header
     */
    public void setHeader(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIHeader header) {
        this.header = header;
    }


    /**
     * Gets the result value for this InstantIDIntlIndividualResults.
     * 
     * @return result
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIResult getResult() {
        return result;
    }


    /**
     * Sets the result value for this InstantIDIntlIndividualResults.
     * 
     * @param result
     */
    public void setResult(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIResult result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstantIDIntlIndividualResults)) return false;
        InstantIDIntlIndividualResults other = (InstantIDIntlIndividualResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
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
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstantIDIntlIndividualResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDIntlIndividualResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Header"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIResult"));
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
