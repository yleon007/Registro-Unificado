/**
 * FraudPointResultCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class FraudPointResultCriteria  implements java.io.Serializable {
    private java.lang.String errorText;

    private java.lang.Boolean providerErrorsOnly;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPResultCriteriaRedFlag[] redFlags;

    private int[] riskIndicators;

    private java.lang.Integer scoreEnd;

    private java.lang.Integer scoreStart;

    public FraudPointResultCriteria() {
    }

    public FraudPointResultCriteria(
           java.lang.String errorText,
           java.lang.Boolean providerErrorsOnly,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPResultCriteriaRedFlag[] redFlags,
           int[] riskIndicators,
           java.lang.Integer scoreEnd,
           java.lang.Integer scoreStart) {
           this.errorText = errorText;
           this.providerErrorsOnly = providerErrorsOnly;
           this.redFlags = redFlags;
           this.riskIndicators = riskIndicators;
           this.scoreEnd = scoreEnd;
           this.scoreStart = scoreStart;
    }


    /**
     * Gets the errorText value for this FraudPointResultCriteria.
     * 
     * @return errorText
     */
    public java.lang.String getErrorText() {
        return errorText;
    }


    /**
     * Sets the errorText value for this FraudPointResultCriteria.
     * 
     * @param errorText
     */
    public void setErrorText(java.lang.String errorText) {
        this.errorText = errorText;
    }


    /**
     * Gets the providerErrorsOnly value for this FraudPointResultCriteria.
     * 
     * @return providerErrorsOnly
     */
    public java.lang.Boolean getProviderErrorsOnly() {
        return providerErrorsOnly;
    }


    /**
     * Sets the providerErrorsOnly value for this FraudPointResultCriteria.
     * 
     * @param providerErrorsOnly
     */
    public void setProviderErrorsOnly(java.lang.Boolean providerErrorsOnly) {
        this.providerErrorsOnly = providerErrorsOnly;
    }


    /**
     * Gets the redFlags value for this FraudPointResultCriteria.
     * 
     * @return redFlags
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPResultCriteriaRedFlag[] getRedFlags() {
        return redFlags;
    }


    /**
     * Sets the redFlags value for this FraudPointResultCriteria.
     * 
     * @param redFlags
     */
    public void setRedFlags(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPResultCriteriaRedFlag[] redFlags) {
        this.redFlags = redFlags;
    }


    /**
     * Gets the riskIndicators value for this FraudPointResultCriteria.
     * 
     * @return riskIndicators
     */
    public int[] getRiskIndicators() {
        return riskIndicators;
    }


    /**
     * Sets the riskIndicators value for this FraudPointResultCriteria.
     * 
     * @param riskIndicators
     */
    public void setRiskIndicators(int[] riskIndicators) {
        this.riskIndicators = riskIndicators;
    }


    /**
     * Gets the scoreEnd value for this FraudPointResultCriteria.
     * 
     * @return scoreEnd
     */
    public java.lang.Integer getScoreEnd() {
        return scoreEnd;
    }


    /**
     * Sets the scoreEnd value for this FraudPointResultCriteria.
     * 
     * @param scoreEnd
     */
    public void setScoreEnd(java.lang.Integer scoreEnd) {
        this.scoreEnd = scoreEnd;
    }


    /**
     * Gets the scoreStart value for this FraudPointResultCriteria.
     * 
     * @return scoreStart
     */
    public java.lang.Integer getScoreStart() {
        return scoreStart;
    }


    /**
     * Sets the scoreStart value for this FraudPointResultCriteria.
     * 
     * @param scoreStart
     */
    public void setScoreStart(java.lang.Integer scoreStart) {
        this.scoreStart = scoreStart;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FraudPointResultCriteria)) return false;
        FraudPointResultCriteria other = (FraudPointResultCriteria) obj;
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
            ((this.providerErrorsOnly==null && other.getProviderErrorsOnly()==null) || 
             (this.providerErrorsOnly!=null &&
              this.providerErrorsOnly.equals(other.getProviderErrorsOnly()))) &&
            ((this.redFlags==null && other.getRedFlags()==null) || 
             (this.redFlags!=null &&
              java.util.Arrays.equals(this.redFlags, other.getRedFlags()))) &&
            ((this.riskIndicators==null && other.getRiskIndicators()==null) || 
             (this.riskIndicators!=null &&
              java.util.Arrays.equals(this.riskIndicators, other.getRiskIndicators()))) &&
            ((this.scoreEnd==null && other.getScoreEnd()==null) || 
             (this.scoreEnd!=null &&
              this.scoreEnd.equals(other.getScoreEnd()))) &&
            ((this.scoreStart==null && other.getScoreStart()==null) || 
             (this.scoreStart!=null &&
              this.scoreStart.equals(other.getScoreStart())));
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
        if (getProviderErrorsOnly() != null) {
            _hashCode += getProviderErrorsOnly().hashCode();
        }
        if (getRedFlags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRedFlags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRedFlags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRiskIndicators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRiskIndicators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRiskIndicators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScoreEnd() != null) {
            _hashCode += getScoreEnd().hashCode();
        }
        if (getScoreStart() != null) {
            _hashCode += getScoreStart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FraudPointResultCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FraudPointResultCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ErrorText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RedFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPResultCriteriaRedFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPResultCriteriaRedFlag"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RiskIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ScoreEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreStart");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ScoreStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
