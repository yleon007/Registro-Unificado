/**
 * ParsedSWIFTCommodityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedSWIFTCommodityInfo  implements java.io.Serializable {
    private java.lang.String[] transactionsDetails;

    public ParsedSWIFTCommodityInfo() {
    }

    public ParsedSWIFTCommodityInfo(
           java.lang.String[] transactionsDetails) {
           this.transactionsDetails = transactionsDetails;
    }


    /**
     * Gets the transactionsDetails value for this ParsedSWIFTCommodityInfo.
     * 
     * @return transactionsDetails
     */
    public java.lang.String[] getTransactionsDetails() {
        return transactionsDetails;
    }


    /**
     * Sets the transactionsDetails value for this ParsedSWIFTCommodityInfo.
     * 
     * @param transactionsDetails
     */
    public void setTransactionsDetails(java.lang.String[] transactionsDetails) {
        this.transactionsDetails = transactionsDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedSWIFTCommodityInfo)) return false;
        ParsedSWIFTCommodityInfo other = (ParsedSWIFTCommodityInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionsDetails==null && other.getTransactionsDetails()==null) || 
             (this.transactionsDetails!=null &&
              java.util.Arrays.equals(this.transactionsDetails, other.getTransactionsDetails())));
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
        if (getTransactionsDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionsDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionsDetails(), i);
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
        new org.apache.axis.description.TypeDesc(ParsedSWIFTCommodityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCommodityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionsDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TransactionsDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
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
