/**
 * ParsedFedwireDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedFedwireDocument  implements java.io.Serializable {
    private java.lang.String documentIdentificationNumber;

    private java.lang.String documentTypeCode;

    private java.lang.String issuer;

    private java.lang.String proprietaryDocumentTypeCode;

    public ParsedFedwireDocument() {
    }

    public ParsedFedwireDocument(
           java.lang.String documentIdentificationNumber,
           java.lang.String documentTypeCode,
           java.lang.String issuer,
           java.lang.String proprietaryDocumentTypeCode) {
           this.documentIdentificationNumber = documentIdentificationNumber;
           this.documentTypeCode = documentTypeCode;
           this.issuer = issuer;
           this.proprietaryDocumentTypeCode = proprietaryDocumentTypeCode;
    }


    /**
     * Gets the documentIdentificationNumber value for this ParsedFedwireDocument.
     * 
     * @return documentIdentificationNumber
     */
    public java.lang.String getDocumentIdentificationNumber() {
        return documentIdentificationNumber;
    }


    /**
     * Sets the documentIdentificationNumber value for this ParsedFedwireDocument.
     * 
     * @param documentIdentificationNumber
     */
    public void setDocumentIdentificationNumber(java.lang.String documentIdentificationNumber) {
        this.documentIdentificationNumber = documentIdentificationNumber;
    }


    /**
     * Gets the documentTypeCode value for this ParsedFedwireDocument.
     * 
     * @return documentTypeCode
     */
    public java.lang.String getDocumentTypeCode() {
        return documentTypeCode;
    }


    /**
     * Sets the documentTypeCode value for this ParsedFedwireDocument.
     * 
     * @param documentTypeCode
     */
    public void setDocumentTypeCode(java.lang.String documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }


    /**
     * Gets the issuer value for this ParsedFedwireDocument.
     * 
     * @return issuer
     */
    public java.lang.String getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this ParsedFedwireDocument.
     * 
     * @param issuer
     */
    public void setIssuer(java.lang.String issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the proprietaryDocumentTypeCode value for this ParsedFedwireDocument.
     * 
     * @return proprietaryDocumentTypeCode
     */
    public java.lang.String getProprietaryDocumentTypeCode() {
        return proprietaryDocumentTypeCode;
    }


    /**
     * Sets the proprietaryDocumentTypeCode value for this ParsedFedwireDocument.
     * 
     * @param proprietaryDocumentTypeCode
     */
    public void setProprietaryDocumentTypeCode(java.lang.String proprietaryDocumentTypeCode) {
        this.proprietaryDocumentTypeCode = proprietaryDocumentTypeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedFedwireDocument)) return false;
        ParsedFedwireDocument other = (ParsedFedwireDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentIdentificationNumber==null && other.getDocumentIdentificationNumber()==null) || 
             (this.documentIdentificationNumber!=null &&
              this.documentIdentificationNumber.equals(other.getDocumentIdentificationNumber()))) &&
            ((this.documentTypeCode==null && other.getDocumentTypeCode()==null) || 
             (this.documentTypeCode!=null &&
              this.documentTypeCode.equals(other.getDocumentTypeCode()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
            ((this.proprietaryDocumentTypeCode==null && other.getProprietaryDocumentTypeCode()==null) || 
             (this.proprietaryDocumentTypeCode!=null &&
              this.proprietaryDocumentTypeCode.equals(other.getProprietaryDocumentTypeCode())));
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
        if (getDocumentIdentificationNumber() != null) {
            _hashCode += getDocumentIdentificationNumber().hashCode();
        }
        if (getDocumentTypeCode() != null) {
            _hashCode += getDocumentTypeCode().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        if (getProprietaryDocumentTypeCode() != null) {
            _hashCode += getProprietaryDocumentTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedFedwireDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentIdentificationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DocumentIdentificationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DocumentTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proprietaryDocumentTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ProprietaryDocumentTypeCode"));
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
