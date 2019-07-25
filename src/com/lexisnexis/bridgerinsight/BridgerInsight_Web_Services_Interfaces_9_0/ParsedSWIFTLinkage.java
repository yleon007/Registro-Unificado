/**
 * ParsedSWIFTLinkage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedSWIFTLinkage  implements java.io.Serializable {
    private java.lang.String previousReference;

    private java.lang.String relatedReference;

    public ParsedSWIFTLinkage() {
    }

    public ParsedSWIFTLinkage(
           java.lang.String previousReference,
           java.lang.String relatedReference) {
           this.previousReference = previousReference;
           this.relatedReference = relatedReference;
    }


    /**
     * Gets the previousReference value for this ParsedSWIFTLinkage.
     * 
     * @return previousReference
     */
    public java.lang.String getPreviousReference() {
        return previousReference;
    }


    /**
     * Sets the previousReference value for this ParsedSWIFTLinkage.
     * 
     * @param previousReference
     */
    public void setPreviousReference(java.lang.String previousReference) {
        this.previousReference = previousReference;
    }


    /**
     * Gets the relatedReference value for this ParsedSWIFTLinkage.
     * 
     * @return relatedReference
     */
    public java.lang.String getRelatedReference() {
        return relatedReference;
    }


    /**
     * Sets the relatedReference value for this ParsedSWIFTLinkage.
     * 
     * @param relatedReference
     */
    public void setRelatedReference(java.lang.String relatedReference) {
        this.relatedReference = relatedReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedSWIFTLinkage)) return false;
        ParsedSWIFTLinkage other = (ParsedSWIFTLinkage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.previousReference==null && other.getPreviousReference()==null) || 
             (this.previousReference!=null &&
              this.previousReference.equals(other.getPreviousReference()))) &&
            ((this.relatedReference==null && other.getRelatedReference()==null) || 
             (this.relatedReference!=null &&
              this.relatedReference.equals(other.getRelatedReference())));
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
        if (getPreviousReference() != null) {
            _hashCode += getPreviousReference().hashCode();
        }
        if (getRelatedReference() != null) {
            _hashCode += getRelatedReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedSWIFTLinkage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTLinkage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousReference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PreviousReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedReference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RelatedReference"));
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
