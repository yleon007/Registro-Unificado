/**
 * ParsedSWIFTUniqueTransactionIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedSWIFTUniqueTransactionIdentifier  implements java.io.Serializable {
    private java.lang.String namespaceIssuerCode;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTUniqueTransactionIdentifier[] priorUniqueTransactionIdentifiers;

    private java.lang.String transactionIdentifier;

    public ParsedSWIFTUniqueTransactionIdentifier() {
    }

    public ParsedSWIFTUniqueTransactionIdentifier(
           java.lang.String namespaceIssuerCode,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTUniqueTransactionIdentifier[] priorUniqueTransactionIdentifiers,
           java.lang.String transactionIdentifier) {
           this.namespaceIssuerCode = namespaceIssuerCode;
           this.priorUniqueTransactionIdentifiers = priorUniqueTransactionIdentifiers;
           this.transactionIdentifier = transactionIdentifier;
    }


    /**
     * Gets the namespaceIssuerCode value for this ParsedSWIFTUniqueTransactionIdentifier.
     * 
     * @return namespaceIssuerCode
     */
    public java.lang.String getNamespaceIssuerCode() {
        return namespaceIssuerCode;
    }


    /**
     * Sets the namespaceIssuerCode value for this ParsedSWIFTUniqueTransactionIdentifier.
     * 
     * @param namespaceIssuerCode
     */
    public void setNamespaceIssuerCode(java.lang.String namespaceIssuerCode) {
        this.namespaceIssuerCode = namespaceIssuerCode;
    }


    /**
     * Gets the priorUniqueTransactionIdentifiers value for this ParsedSWIFTUniqueTransactionIdentifier.
     * 
     * @return priorUniqueTransactionIdentifiers
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTUniqueTransactionIdentifier[] getPriorUniqueTransactionIdentifiers() {
        return priorUniqueTransactionIdentifiers;
    }


    /**
     * Sets the priorUniqueTransactionIdentifiers value for this ParsedSWIFTUniqueTransactionIdentifier.
     * 
     * @param priorUniqueTransactionIdentifiers
     */
    public void setPriorUniqueTransactionIdentifiers(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTUniqueTransactionIdentifier[] priorUniqueTransactionIdentifiers) {
        this.priorUniqueTransactionIdentifiers = priorUniqueTransactionIdentifiers;
    }


    /**
     * Gets the transactionIdentifier value for this ParsedSWIFTUniqueTransactionIdentifier.
     * 
     * @return transactionIdentifier
     */
    public java.lang.String getTransactionIdentifier() {
        return transactionIdentifier;
    }


    /**
     * Sets the transactionIdentifier value for this ParsedSWIFTUniqueTransactionIdentifier.
     * 
     * @param transactionIdentifier
     */
    public void setTransactionIdentifier(java.lang.String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedSWIFTUniqueTransactionIdentifier)) return false;
        ParsedSWIFTUniqueTransactionIdentifier other = (ParsedSWIFTUniqueTransactionIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.namespaceIssuerCode==null && other.getNamespaceIssuerCode()==null) || 
             (this.namespaceIssuerCode!=null &&
              this.namespaceIssuerCode.equals(other.getNamespaceIssuerCode()))) &&
            ((this.priorUniqueTransactionIdentifiers==null && other.getPriorUniqueTransactionIdentifiers()==null) || 
             (this.priorUniqueTransactionIdentifiers!=null &&
              java.util.Arrays.equals(this.priorUniqueTransactionIdentifiers, other.getPriorUniqueTransactionIdentifiers()))) &&
            ((this.transactionIdentifier==null && other.getTransactionIdentifier()==null) || 
             (this.transactionIdentifier!=null &&
              this.transactionIdentifier.equals(other.getTransactionIdentifier())));
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
        if (getNamespaceIssuerCode() != null) {
            _hashCode += getNamespaceIssuerCode().hashCode();
        }
        if (getPriorUniqueTransactionIdentifiers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriorUniqueTransactionIdentifiers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriorUniqueTransactionIdentifiers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionIdentifier() != null) {
            _hashCode += getTransactionIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedSWIFTUniqueTransactionIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTUniqueTransactionIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespaceIssuerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "NamespaceIssuerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorUniqueTransactionIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PriorUniqueTransactionIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTUniqueTransactionIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTUniqueTransactionIdentifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TransactionIdentifier"));
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
