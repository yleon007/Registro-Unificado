/**
 * ParsedSWIFTReportingPartyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedSWIFTReportingPartyInfo  implements java.io.Serializable {
    private java.lang.String jurisdiction;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTUniqueTransactionIdentifier[] uniqueTransactionIdentifiers;

    public ParsedSWIFTReportingPartyInfo() {
    }

    public ParsedSWIFTReportingPartyInfo(
           java.lang.String jurisdiction,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTUniqueTransactionIdentifier[] uniqueTransactionIdentifiers) {
           this.jurisdiction = jurisdiction;
           this.uniqueTransactionIdentifiers = uniqueTransactionIdentifiers;
    }


    /**
     * Gets the jurisdiction value for this ParsedSWIFTReportingPartyInfo.
     * 
     * @return jurisdiction
     */
    public java.lang.String getJurisdiction() {
        return jurisdiction;
    }


    /**
     * Sets the jurisdiction value for this ParsedSWIFTReportingPartyInfo.
     * 
     * @param jurisdiction
     */
    public void setJurisdiction(java.lang.String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    /**
     * Gets the uniqueTransactionIdentifiers value for this ParsedSWIFTReportingPartyInfo.
     * 
     * @return uniqueTransactionIdentifiers
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTUniqueTransactionIdentifier[] getUniqueTransactionIdentifiers() {
        return uniqueTransactionIdentifiers;
    }


    /**
     * Sets the uniqueTransactionIdentifiers value for this ParsedSWIFTReportingPartyInfo.
     * 
     * @param uniqueTransactionIdentifiers
     */
    public void setUniqueTransactionIdentifiers(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTUniqueTransactionIdentifier[] uniqueTransactionIdentifiers) {
        this.uniqueTransactionIdentifiers = uniqueTransactionIdentifiers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedSWIFTReportingPartyInfo)) return false;
        ParsedSWIFTReportingPartyInfo other = (ParsedSWIFTReportingPartyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jurisdiction==null && other.getJurisdiction()==null) || 
             (this.jurisdiction!=null &&
              this.jurisdiction.equals(other.getJurisdiction()))) &&
            ((this.uniqueTransactionIdentifiers==null && other.getUniqueTransactionIdentifiers()==null) || 
             (this.uniqueTransactionIdentifiers!=null &&
              java.util.Arrays.equals(this.uniqueTransactionIdentifiers, other.getUniqueTransactionIdentifiers())));
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
        if (getJurisdiction() != null) {
            _hashCode += getJurisdiction().hashCode();
        }
        if (getUniqueTransactionIdentifiers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUniqueTransactionIdentifiers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUniqueTransactionIdentifiers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedSWIFTReportingPartyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTReportingPartyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Jurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueTransactionIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "UniqueTransactionIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTUniqueTransactionIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTUniqueTransactionIdentifier"));
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
