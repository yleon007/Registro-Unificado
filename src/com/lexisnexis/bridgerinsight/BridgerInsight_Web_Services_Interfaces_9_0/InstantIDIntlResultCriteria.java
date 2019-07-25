/**
 * InstantIDIntlResultCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class InstantIDIntlResultCriteria  implements java.io.Serializable {
    private java.lang.String errorText;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIResultCriteriaIndividual individual;

    private java.lang.Boolean providerErrorsOnly;

    public InstantIDIntlResultCriteria() {
    }

    public InstantIDIntlResultCriteria(
           java.lang.String errorText,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIResultCriteriaIndividual individual,
           java.lang.Boolean providerErrorsOnly) {
           this.errorText = errorText;
           this.individual = individual;
           this.providerErrorsOnly = providerErrorsOnly;
    }


    /**
     * Gets the errorText value for this InstantIDIntlResultCriteria.
     * 
     * @return errorText
     */
    public java.lang.String getErrorText() {
        return errorText;
    }


    /**
     * Sets the errorText value for this InstantIDIntlResultCriteria.
     * 
     * @param errorText
     */
    public void setErrorText(java.lang.String errorText) {
        this.errorText = errorText;
    }


    /**
     * Gets the individual value for this InstantIDIntlResultCriteria.
     * 
     * @return individual
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIResultCriteriaIndividual getIndividual() {
        return individual;
    }


    /**
     * Sets the individual value for this InstantIDIntlResultCriteria.
     * 
     * @param individual
     */
    public void setIndividual(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIResultCriteriaIndividual individual) {
        this.individual = individual;
    }


    /**
     * Gets the providerErrorsOnly value for this InstantIDIntlResultCriteria.
     * 
     * @return providerErrorsOnly
     */
    public java.lang.Boolean getProviderErrorsOnly() {
        return providerErrorsOnly;
    }


    /**
     * Sets the providerErrorsOnly value for this InstantIDIntlResultCriteria.
     * 
     * @param providerErrorsOnly
     */
    public void setProviderErrorsOnly(java.lang.Boolean providerErrorsOnly) {
        this.providerErrorsOnly = providerErrorsOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstantIDIntlResultCriteria)) return false;
        InstantIDIntlResultCriteria other = (InstantIDIntlResultCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorText==null && other.getErrorText()==null) || 
             (this.errorText!=null &&
              this.errorText.equals(other.getErrorText()))) &&
            ((this.individual==null && other.getIndividual()==null) || 
             (this.individual!=null &&
              this.individual.equals(other.getIndividual()))) &&
            ((this.providerErrorsOnly==null && other.getProviderErrorsOnly()==null) || 
             (this.providerErrorsOnly!=null &&
              this.providerErrorsOnly.equals(other.getProviderErrorsOnly())));
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
        if (getErrorText() != null) {
            _hashCode += getErrorText().hashCode();
        }
        if (getIndividual() != null) {
            _hashCode += getIndividual().hashCode();
        }
        if (getProviderErrorsOnly() != null) {
            _hashCode += getProviderErrorsOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstantIDIntlResultCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDIntlResultCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ErrorText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individual");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Individual"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIResultCriteriaIndividual"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerErrorsOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ProviderErrorsOnly"));
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
