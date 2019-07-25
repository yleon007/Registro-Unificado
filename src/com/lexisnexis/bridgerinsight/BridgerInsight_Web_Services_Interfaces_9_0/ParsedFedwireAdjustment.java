/**
 * ParsedFedwireAdjustment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedFedwireAdjustment  implements java.io.Serializable {
    private java.lang.String additionalInformation;

    private java.lang.String adjustmentReasonCode;

    private java.lang.String amount;

    private java.lang.String creditDebitIndicator;

    private java.lang.String currencyCode;

    public ParsedFedwireAdjustment() {
    }

    public ParsedFedwireAdjustment(
           java.lang.String additionalInformation,
           java.lang.String adjustmentReasonCode,
           java.lang.String amount,
           java.lang.String creditDebitIndicator,
           java.lang.String currencyCode) {
           this.additionalInformation = additionalInformation;
           this.adjustmentReasonCode = adjustmentReasonCode;
           this.amount = amount;
           this.creditDebitIndicator = creditDebitIndicator;
           this.currencyCode = currencyCode;
    }


    /**
     * Gets the additionalInformation value for this ParsedFedwireAdjustment.
     * 
     * @return additionalInformation
     */
    public java.lang.String getAdditionalInformation() {
        return additionalInformation;
    }


    /**
     * Sets the additionalInformation value for this ParsedFedwireAdjustment.
     * 
     * @param additionalInformation
     */
    public void setAdditionalInformation(java.lang.String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }


    /**
     * Gets the adjustmentReasonCode value for this ParsedFedwireAdjustment.
     * 
     * @return adjustmentReasonCode
     */
    public java.lang.String getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }


    /**
     * Sets the adjustmentReasonCode value for this ParsedFedwireAdjustment.
     * 
     * @param adjustmentReasonCode
     */
    public void setAdjustmentReasonCode(java.lang.String adjustmentReasonCode) {
        this.adjustmentReasonCode = adjustmentReasonCode;
    }


    /**
     * Gets the amount value for this ParsedFedwireAdjustment.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ParsedFedwireAdjustment.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the creditDebitIndicator value for this ParsedFedwireAdjustment.
     * 
     * @return creditDebitIndicator
     */
    public java.lang.String getCreditDebitIndicator() {
        return creditDebitIndicator;
    }


    /**
     * Sets the creditDebitIndicator value for this ParsedFedwireAdjustment.
     * 
     * @param creditDebitIndicator
     */
    public void setCreditDebitIndicator(java.lang.String creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }


    /**
     * Gets the currencyCode value for this ParsedFedwireAdjustment.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this ParsedFedwireAdjustment.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedFedwireAdjustment)) return false;
        ParsedFedwireAdjustment other = (ParsedFedwireAdjustment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalInformation==null && other.getAdditionalInformation()==null) || 
             (this.additionalInformation!=null &&
              this.additionalInformation.equals(other.getAdditionalInformation()))) &&
            ((this.adjustmentReasonCode==null && other.getAdjustmentReasonCode()==null) || 
             (this.adjustmentReasonCode!=null &&
              this.adjustmentReasonCode.equals(other.getAdjustmentReasonCode()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.creditDebitIndicator==null && other.getCreditDebitIndicator()==null) || 
             (this.creditDebitIndicator!=null &&
              this.creditDebitIndicator.equals(other.getCreditDebitIndicator()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode())));
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
        if (getAdditionalInformation() != null) {
            _hashCode += getAdditionalInformation().hashCode();
        }
        if (getAdjustmentReasonCode() != null) {
            _hashCode += getAdjustmentReasonCode().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCreditDebitIndicator() != null) {
            _hashCode += getCreditDebitIndicator().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedFedwireAdjustment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAdjustment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AdditionalInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AdjustmentReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditDebitIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CreditDebitIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CurrencyCode"));
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
