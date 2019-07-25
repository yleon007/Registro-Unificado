/**
 * ParsedSWIFTChequeDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedSWIFTChequeDetails  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount chequeAmount;

    private java.lang.String chequeNumber;

    private java.lang.String chequeReferenceNumber;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount interestCharges;

    private java.lang.String interestRate;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount issuersFICharges;

    private java.lang.String relatedMessageReference;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount sendersCharges;

    private java.lang.String transactionReference;

    public ParsedSWIFTChequeDetails() {
    }

    public ParsedSWIFTChequeDetails(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount chequeAmount,
           java.lang.String chequeNumber,
           java.lang.String chequeReferenceNumber,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount interestCharges,
           java.lang.String interestRate,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount issuersFICharges,
           java.lang.String relatedMessageReference,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount sendersCharges,
           java.lang.String transactionReference) {
           this.chequeAmount = chequeAmount;
           this.chequeNumber = chequeNumber;
           this.chequeReferenceNumber = chequeReferenceNumber;
           this.interestCharges = interestCharges;
           this.interestRate = interestRate;
           this.issuersFICharges = issuersFICharges;
           this.relatedMessageReference = relatedMessageReference;
           this.sendersCharges = sendersCharges;
           this.transactionReference = transactionReference;
    }


    /**
     * Gets the chequeAmount value for this ParsedSWIFTChequeDetails.
     * 
     * @return chequeAmount
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount getChequeAmount() {
        return chequeAmount;
    }


    /**
     * Sets the chequeAmount value for this ParsedSWIFTChequeDetails.
     * 
     * @param chequeAmount
     */
    public void setChequeAmount(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount chequeAmount) {
        this.chequeAmount = chequeAmount;
    }


    /**
     * Gets the chequeNumber value for this ParsedSWIFTChequeDetails.
     * 
     * @return chequeNumber
     */
    public java.lang.String getChequeNumber() {
        return chequeNumber;
    }


    /**
     * Sets the chequeNumber value for this ParsedSWIFTChequeDetails.
     * 
     * @param chequeNumber
     */
    public void setChequeNumber(java.lang.String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }


    /**
     * Gets the chequeReferenceNumber value for this ParsedSWIFTChequeDetails.
     * 
     * @return chequeReferenceNumber
     */
    public java.lang.String getChequeReferenceNumber() {
        return chequeReferenceNumber;
    }


    /**
     * Sets the chequeReferenceNumber value for this ParsedSWIFTChequeDetails.
     * 
     * @param chequeReferenceNumber
     */
    public void setChequeReferenceNumber(java.lang.String chequeReferenceNumber) {
        this.chequeReferenceNumber = chequeReferenceNumber;
    }


    /**
     * Gets the interestCharges value for this ParsedSWIFTChequeDetails.
     * 
     * @return interestCharges
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount getInterestCharges() {
        return interestCharges;
    }


    /**
     * Sets the interestCharges value for this ParsedSWIFTChequeDetails.
     * 
     * @param interestCharges
     */
    public void setInterestCharges(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount interestCharges) {
        this.interestCharges = interestCharges;
    }


    /**
     * Gets the interestRate value for this ParsedSWIFTChequeDetails.
     * 
     * @return interestRate
     */
    public java.lang.String getInterestRate() {
        return interestRate;
    }


    /**
     * Sets the interestRate value for this ParsedSWIFTChequeDetails.
     * 
     * @param interestRate
     */
    public void setInterestRate(java.lang.String interestRate) {
        this.interestRate = interestRate;
    }


    /**
     * Gets the issuersFICharges value for this ParsedSWIFTChequeDetails.
     * 
     * @return issuersFICharges
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount getIssuersFICharges() {
        return issuersFICharges;
    }


    /**
     * Sets the issuersFICharges value for this ParsedSWIFTChequeDetails.
     * 
     * @param issuersFICharges
     */
    public void setIssuersFICharges(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount issuersFICharges) {
        this.issuersFICharges = issuersFICharges;
    }


    /**
     * Gets the relatedMessageReference value for this ParsedSWIFTChequeDetails.
     * 
     * @return relatedMessageReference
     */
    public java.lang.String getRelatedMessageReference() {
        return relatedMessageReference;
    }


    /**
     * Sets the relatedMessageReference value for this ParsedSWIFTChequeDetails.
     * 
     * @param relatedMessageReference
     */
    public void setRelatedMessageReference(java.lang.String relatedMessageReference) {
        this.relatedMessageReference = relatedMessageReference;
    }


    /**
     * Gets the sendersCharges value for this ParsedSWIFTChequeDetails.
     * 
     * @return sendersCharges
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount getSendersCharges() {
        return sendersCharges;
    }


    /**
     * Sets the sendersCharges value for this ParsedSWIFTChequeDetails.
     * 
     * @param sendersCharges
     */
    public void setSendersCharges(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount sendersCharges) {
        this.sendersCharges = sendersCharges;
    }


    /**
     * Gets the transactionReference value for this ParsedSWIFTChequeDetails.
     * 
     * @return transactionReference
     */
    public java.lang.String getTransactionReference() {
        return transactionReference;
    }


    /**
     * Sets the transactionReference value for this ParsedSWIFTChequeDetails.
     * 
     * @param transactionReference
     */
    public void setTransactionReference(java.lang.String transactionReference) {
        this.transactionReference = transactionReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedSWIFTChequeDetails)) return false;
        ParsedSWIFTChequeDetails other = (ParsedSWIFTChequeDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chequeAmount==null && other.getChequeAmount()==null) || 
             (this.chequeAmount!=null &&
              this.chequeAmount.equals(other.getChequeAmount()))) &&
            ((this.chequeNumber==null && other.getChequeNumber()==null) || 
             (this.chequeNumber!=null &&
              this.chequeNumber.equals(other.getChequeNumber()))) &&
            ((this.chequeReferenceNumber==null && other.getChequeReferenceNumber()==null) || 
             (this.chequeReferenceNumber!=null &&
              this.chequeReferenceNumber.equals(other.getChequeReferenceNumber()))) &&
            ((this.interestCharges==null && other.getInterestCharges()==null) || 
             (this.interestCharges!=null &&
              this.interestCharges.equals(other.getInterestCharges()))) &&
            ((this.interestRate==null && other.getInterestRate()==null) || 
             (this.interestRate!=null &&
              this.interestRate.equals(other.getInterestRate()))) &&
            ((this.issuersFICharges==null && other.getIssuersFICharges()==null) || 
             (this.issuersFICharges!=null &&
              this.issuersFICharges.equals(other.getIssuersFICharges()))) &&
            ((this.relatedMessageReference==null && other.getRelatedMessageReference()==null) || 
             (this.relatedMessageReference!=null &&
              this.relatedMessageReference.equals(other.getRelatedMessageReference()))) &&
            ((this.sendersCharges==null && other.getSendersCharges()==null) || 
             (this.sendersCharges!=null &&
              this.sendersCharges.equals(other.getSendersCharges()))) &&
            ((this.transactionReference==null && other.getTransactionReference()==null) || 
             (this.transactionReference!=null &&
              this.transactionReference.equals(other.getTransactionReference())));
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
        if (getChequeAmount() != null) {
            _hashCode += getChequeAmount().hashCode();
        }
        if (getChequeNumber() != null) {
            _hashCode += getChequeNumber().hashCode();
        }
        if (getChequeReferenceNumber() != null) {
            _hashCode += getChequeReferenceNumber().hashCode();
        }
        if (getInterestCharges() != null) {
            _hashCode += getInterestCharges().hashCode();
        }
        if (getInterestRate() != null) {
            _hashCode += getInterestRate().hashCode();
        }
        if (getIssuersFICharges() != null) {
            _hashCode += getIssuersFICharges().hashCode();
        }
        if (getRelatedMessageReference() != null) {
            _hashCode += getRelatedMessageReference().hashCode();
        }
        if (getSendersCharges() != null) {
            _hashCode += getSendersCharges().hashCode();
        }
        if (getTransactionReference() != null) {
            _hashCode += getTransactionReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedSWIFTChequeDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTChequeDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ChequeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ChequeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ChequeReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InterestCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InterestRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuersFICharges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IssuersFICharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedMessageReference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RelatedMessageReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendersCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SendersCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionReference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TransactionReference"));
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
