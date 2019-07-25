/**
 * ParsedSWIFTStandingSettlementInstruction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedSWIFTStandingSettlementInstruction  implements java.io.Serializable {
    private java.lang.String effectiveDate;

    private java.lang.String[] effectiveDateIndicators;

    private java.lang.String[] marketAreaIndicators;

    private java.lang.String[] paymentMethodIndicators;

    private java.lang.String SSICurrency;

    private java.lang.String SSIPurpose;

    private java.lang.String SSIReference;

    public ParsedSWIFTStandingSettlementInstruction() {
    }

    public ParsedSWIFTStandingSettlementInstruction(
           java.lang.String effectiveDate,
           java.lang.String[] effectiveDateIndicators,
           java.lang.String[] marketAreaIndicators,
           java.lang.String[] paymentMethodIndicators,
           java.lang.String SSICurrency,
           java.lang.String SSIPurpose,
           java.lang.String SSIReference) {
           this.effectiveDate = effectiveDate;
           this.effectiveDateIndicators = effectiveDateIndicators;
           this.marketAreaIndicators = marketAreaIndicators;
           this.paymentMethodIndicators = paymentMethodIndicators;
           this.SSICurrency = SSICurrency;
           this.SSIPurpose = SSIPurpose;
           this.SSIReference = SSIReference;
    }


    /**
     * Gets the effectiveDate value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the effectiveDateIndicators value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @return effectiveDateIndicators
     */
    public java.lang.String[] getEffectiveDateIndicators() {
        return effectiveDateIndicators;
    }


    /**
     * Sets the effectiveDateIndicators value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @param effectiveDateIndicators
     */
    public void setEffectiveDateIndicators(java.lang.String[] effectiveDateIndicators) {
        this.effectiveDateIndicators = effectiveDateIndicators;
    }


    /**
     * Gets the marketAreaIndicators value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @return marketAreaIndicators
     */
    public java.lang.String[] getMarketAreaIndicators() {
        return marketAreaIndicators;
    }


    /**
     * Sets the marketAreaIndicators value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @param marketAreaIndicators
     */
    public void setMarketAreaIndicators(java.lang.String[] marketAreaIndicators) {
        this.marketAreaIndicators = marketAreaIndicators;
    }


    /**
     * Gets the paymentMethodIndicators value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @return paymentMethodIndicators
     */
    public java.lang.String[] getPaymentMethodIndicators() {
        return paymentMethodIndicators;
    }


    /**
     * Sets the paymentMethodIndicators value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @param paymentMethodIndicators
     */
    public void setPaymentMethodIndicators(java.lang.String[] paymentMethodIndicators) {
        this.paymentMethodIndicators = paymentMethodIndicators;
    }


    /**
     * Gets the SSICurrency value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @return SSICurrency
     */
    public java.lang.String getSSICurrency() {
        return SSICurrency;
    }


    /**
     * Sets the SSICurrency value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @param SSICurrency
     */
    public void setSSICurrency(java.lang.String SSICurrency) {
        this.SSICurrency = SSICurrency;
    }


    /**
     * Gets the SSIPurpose value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @return SSIPurpose
     */
    public java.lang.String getSSIPurpose() {
        return SSIPurpose;
    }


    /**
     * Sets the SSIPurpose value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @param SSIPurpose
     */
    public void setSSIPurpose(java.lang.String SSIPurpose) {
        this.SSIPurpose = SSIPurpose;
    }


    /**
     * Gets the SSIReference value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @return SSIReference
     */
    public java.lang.String getSSIReference() {
        return SSIReference;
    }


    /**
     * Sets the SSIReference value for this ParsedSWIFTStandingSettlementInstruction.
     * 
     * @param SSIReference
     */
    public void setSSIReference(java.lang.String SSIReference) {
        this.SSIReference = SSIReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedSWIFTStandingSettlementInstruction)) return false;
        ParsedSWIFTStandingSettlementInstruction other = (ParsedSWIFTStandingSettlementInstruction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.effectiveDateIndicators==null && other.getEffectiveDateIndicators()==null) || 
             (this.effectiveDateIndicators!=null &&
              java.util.Arrays.equals(this.effectiveDateIndicators, other.getEffectiveDateIndicators()))) &&
            ((this.marketAreaIndicators==null && other.getMarketAreaIndicators()==null) || 
             (this.marketAreaIndicators!=null &&
              java.util.Arrays.equals(this.marketAreaIndicators, other.getMarketAreaIndicators()))) &&
            ((this.paymentMethodIndicators==null && other.getPaymentMethodIndicators()==null) || 
             (this.paymentMethodIndicators!=null &&
              java.util.Arrays.equals(this.paymentMethodIndicators, other.getPaymentMethodIndicators()))) &&
            ((this.SSICurrency==null && other.getSSICurrency()==null) || 
             (this.SSICurrency!=null &&
              this.SSICurrency.equals(other.getSSICurrency()))) &&
            ((this.SSIPurpose==null && other.getSSIPurpose()==null) || 
             (this.SSIPurpose!=null &&
              this.SSIPurpose.equals(other.getSSIPurpose()))) &&
            ((this.SSIReference==null && other.getSSIReference()==null) || 
             (this.SSIReference!=null &&
              this.SSIReference.equals(other.getSSIReference())));
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
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getEffectiveDateIndicators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveDateIndicators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveDateIndicators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarketAreaIndicators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarketAreaIndicators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarketAreaIndicators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentMethodIndicators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentMethodIndicators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentMethodIndicators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSSICurrency() != null) {
            _hashCode += getSSICurrency().hashCode();
        }
        if (getSSIPurpose() != null) {
            _hashCode += getSSIPurpose().hashCode();
        }
        if (getSSIReference() != null) {
            _hashCode += getSSIReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedSWIFTStandingSettlementInstruction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTStandingSettlementInstruction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDateIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EffectiveDateIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketAreaIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "MarketAreaIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PaymentMethodIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSICurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SSICurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSIPurpose");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SSIPurpose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSIReference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SSIReference"));
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
