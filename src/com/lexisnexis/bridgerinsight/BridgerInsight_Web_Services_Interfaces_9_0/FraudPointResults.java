/**
 * FraudPointResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class FraudPointResults  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRedFlag[] arRedFlags;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRiskIndicator[] arRiskIndicators;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] arErrors;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] errors;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPInput input;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRedFlag[] redFlags;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRiskIndicator[] riskIndicators;

    private java.lang.Integer score;

    public FraudPointResults() {
    }

    public FraudPointResults(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRedFlag[] arRedFlags,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRiskIndicator[] arRiskIndicators,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] arErrors,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] errors,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPInput input,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRedFlag[] redFlags,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRiskIndicator[] riskIndicators,
           java.lang.Integer score) {
           this.arRedFlags = arRedFlags;
           this.arRiskIndicators = arRiskIndicators;
           this.arErrors = arErrors;
           this.errors = errors;
           this.input = input;
           this.redFlags = redFlags;
           this.riskIndicators = riskIndicators;
           this.score = score;
    }


    /**
     * Gets the arRedFlags value for this FraudPointResults.
     * 
     * @return arRedFlags
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRedFlag[] getArRedFlags() {
        return arRedFlags;
    }


    /**
     * Sets the arRedFlags value for this FraudPointResults.
     * 
     * @param arRedFlags
     */
    public void setArRedFlags(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRedFlag[] arRedFlags) {
        this.arRedFlags = arRedFlags;
    }


    /**
     * Gets the arRiskIndicators value for this FraudPointResults.
     * 
     * @return arRiskIndicators
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRiskIndicator[] getArRiskIndicators() {
        return arRiskIndicators;
    }


    /**
     * Sets the arRiskIndicators value for this FraudPointResults.
     * 
     * @param arRiskIndicators
     */
    public void setArRiskIndicators(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRiskIndicator[] arRiskIndicators) {
        this.arRiskIndicators = arRiskIndicators;
    }


    /**
     * Gets the arErrors value for this FraudPointResults.
     * 
     * @return arErrors
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] getArErrors() {
        return arErrors;
    }


    /**
     * Sets the arErrors value for this FraudPointResults.
     * 
     * @param arErrors
     */
    public void setArErrors(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] arErrors) {
        this.arErrors = arErrors;
    }


    /**
     * Gets the errors value for this FraudPointResults.
     * 
     * @return errors
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this FraudPointResults.
     * 
     * @param errors
     */
    public void setErrors(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the input value for this FraudPointResults.
     * 
     * @return input
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPInput getInput() {
        return input;
    }


    /**
     * Sets the input value for this FraudPointResults.
     * 
     * @param input
     */
    public void setInput(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPInput input) {
        this.input = input;
    }


    /**
     * Gets the redFlags value for this FraudPointResults.
     * 
     * @return redFlags
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRedFlag[] getRedFlags() {
        return redFlags;
    }


    /**
     * Sets the redFlags value for this FraudPointResults.
     * 
     * @param redFlags
     */
    public void setRedFlags(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRedFlag[] redFlags) {
        this.redFlags = redFlags;
    }


    /**
     * Gets the riskIndicators value for this FraudPointResults.
     * 
     * @return riskIndicators
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRiskIndicator[] getRiskIndicators() {
        return riskIndicators;
    }


    /**
     * Sets the riskIndicators value for this FraudPointResults.
     * 
     * @param riskIndicators
     */
    public void setRiskIndicators(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRiskIndicator[] riskIndicators) {
        this.riskIndicators = riskIndicators;
    }


    /**
     * Gets the score value for this FraudPointResults.
     * 
     * @return score
     */
    public java.lang.Integer getScore() {
        return score;
    }


    /**
     * Sets the score value for this FraudPointResults.
     * 
     * @param score
     */
    public void setScore(java.lang.Integer score) {
        this.score = score;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FraudPointResults)) return false;
        FraudPointResults other = (FraudPointResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arRedFlags==null && other.getArRedFlags()==null) || 
             (this.arRedFlags!=null &&
              java.util.Arrays.equals(this.arRedFlags, other.getArRedFlags()))) &&
            ((this.arRiskIndicators==null && other.getArRiskIndicators()==null) || 
             (this.arRiskIndicators!=null &&
              java.util.Arrays.equals(this.arRiskIndicators, other.getArRiskIndicators()))) &&
            ((this.arErrors==null && other.getArErrors()==null) || 
             (this.arErrors!=null &&
              java.util.Arrays.equals(this.arErrors, other.getArErrors()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              this.input.equals(other.getInput()))) &&
            ((this.redFlags==null && other.getRedFlags()==null) || 
             (this.redFlags!=null &&
              java.util.Arrays.equals(this.redFlags, other.getRedFlags()))) &&
            ((this.riskIndicators==null && other.getRiskIndicators()==null) || 
             (this.riskIndicators!=null &&
              java.util.Arrays.equals(this.riskIndicators, other.getRiskIndicators()))) &&
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore())));
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
        if (getArRedFlags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArRedFlags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArRedFlags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArRiskIndicators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArRiskIndicators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArRiskIndicators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInput() != null) {
            _hashCode += getInput().hashCode();
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
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FraudPointResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FraudPointResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arRedFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "arRedFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRedFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRedFlag"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arRiskIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "arRiskIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRiskIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRiskIndicator"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "arErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultError"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultError"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Input"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RedFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRedFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRedFlag"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RiskIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRiskIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRiskIndicator"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Score"));
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
