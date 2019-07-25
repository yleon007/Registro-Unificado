/**
 * BillPaymentModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.icon.mw.ws;

public class BillPaymentModel  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.Float amount;

    private java.lang.Float appliedFee;

    private java.lang.String autenticationKey;

    private java.lang.String billPaymentCode;

    private java.lang.String customerEmail;

    private java.lang.String externalId;

    private java.lang.String invoiceId;

    private java.lang.String orderId;

    private java.lang.String SMSToSender;

    private java.lang.String senderName;

    private java.lang.String senderNumber;

    public BillPaymentModel() {
    }

    public BillPaymentModel(
           java.lang.String accountNumber,
           java.lang.Float amount,
           java.lang.Float appliedFee,
           java.lang.String autenticationKey,
           java.lang.String billPaymentCode,
           java.lang.String customerEmail,
           java.lang.String externalId,
           java.lang.String invoiceId,
           java.lang.String orderId,
           java.lang.String SMSToSender,
           java.lang.String senderName,
           java.lang.String senderNumber) {
           this.accountNumber = accountNumber;
           this.amount = amount;
           this.appliedFee = appliedFee;
           this.autenticationKey = autenticationKey;
           this.billPaymentCode = billPaymentCode;
           this.customerEmail = customerEmail;
           this.externalId = externalId;
           this.invoiceId = invoiceId;
           this.orderId = orderId;
           this.SMSToSender = SMSToSender;
           this.senderName = senderName;
           this.senderNumber = senderNumber;
    }


    /**
     * Gets the accountNumber value for this BillPaymentModel.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this BillPaymentModel.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the amount value for this BillPaymentModel.
     * 
     * @return amount
     */
    public java.lang.Float getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BillPaymentModel.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Float amount) {
        this.amount = amount;
    }


    /**
     * Gets the appliedFee value for this BillPaymentModel.
     * 
     * @return appliedFee
     */
    public java.lang.Float getAppliedFee() {
        return appliedFee;
    }


    /**
     * Sets the appliedFee value for this BillPaymentModel.
     * 
     * @param appliedFee
     */
    public void setAppliedFee(java.lang.Float appliedFee) {
        this.appliedFee = appliedFee;
    }


    /**
     * Gets the autenticationKey value for this BillPaymentModel.
     * 
     * @return autenticationKey
     */
    public java.lang.String getAutenticationKey() {
        return autenticationKey;
    }


    /**
     * Sets the autenticationKey value for this BillPaymentModel.
     * 
     * @param autenticationKey
     */
    public void setAutenticationKey(java.lang.String autenticationKey) {
        this.autenticationKey = autenticationKey;
    }


    /**
     * Gets the billPaymentCode value for this BillPaymentModel.
     * 
     * @return billPaymentCode
     */
    public java.lang.String getBillPaymentCode() {
        return billPaymentCode;
    }


    /**
     * Sets the billPaymentCode value for this BillPaymentModel.
     * 
     * @param billPaymentCode
     */
    public void setBillPaymentCode(java.lang.String billPaymentCode) {
        this.billPaymentCode = billPaymentCode;
    }


    /**
     * Gets the customerEmail value for this BillPaymentModel.
     * 
     * @return customerEmail
     */
    public java.lang.String getCustomerEmail() {
        return customerEmail;
    }


    /**
     * Sets the customerEmail value for this BillPaymentModel.
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(java.lang.String customerEmail) {
        this.customerEmail = customerEmail;
    }


    /**
     * Gets the externalId value for this BillPaymentModel.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this BillPaymentModel.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the invoiceId value for this BillPaymentModel.
     * 
     * @return invoiceId
     */
    public java.lang.String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this BillPaymentModel.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the orderId value for this BillPaymentModel.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this BillPaymentModel.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the SMSToSender value for this BillPaymentModel.
     * 
     * @return SMSToSender
     */
    public java.lang.String getSMSToSender() {
        return SMSToSender;
    }


    /**
     * Sets the SMSToSender value for this BillPaymentModel.
     * 
     * @param SMSToSender
     */
    public void setSMSToSender(java.lang.String SMSToSender) {
        this.SMSToSender = SMSToSender;
    }


    /**
     * Gets the senderName value for this BillPaymentModel.
     * 
     * @return senderName
     */
    public java.lang.String getSenderName() {
        return senderName;
    }


    /**
     * Sets the senderName value for this BillPaymentModel.
     * 
     * @param senderName
     */
    public void setSenderName(java.lang.String senderName) {
        this.senderName = senderName;
    }


    /**
     * Gets the senderNumber value for this BillPaymentModel.
     * 
     * @return senderNumber
     */
    public java.lang.String getSenderNumber() {
        return senderNumber;
    }


    /**
     * Sets the senderNumber value for this BillPaymentModel.
     * 
     * @param senderNumber
     */
    public void setSenderNumber(java.lang.String senderNumber) {
        this.senderNumber = senderNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentModel)) return false;
        BillPaymentModel other = (BillPaymentModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.appliedFee==null && other.getAppliedFee()==null) || 
             (this.appliedFee!=null &&
              this.appliedFee.equals(other.getAppliedFee()))) &&
            ((this.autenticationKey==null && other.getAutenticationKey()==null) || 
             (this.autenticationKey!=null &&
              this.autenticationKey.equals(other.getAutenticationKey()))) &&
            ((this.billPaymentCode==null && other.getBillPaymentCode()==null) || 
             (this.billPaymentCode!=null &&
              this.billPaymentCode.equals(other.getBillPaymentCode()))) &&
            ((this.customerEmail==null && other.getCustomerEmail()==null) || 
             (this.customerEmail!=null &&
              this.customerEmail.equals(other.getCustomerEmail()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.SMSToSender==null && other.getSMSToSender()==null) || 
             (this.SMSToSender!=null &&
              this.SMSToSender.equals(other.getSMSToSender()))) &&
            ((this.senderName==null && other.getSenderName()==null) || 
             (this.senderName!=null &&
              this.senderName.equals(other.getSenderName()))) &&
            ((this.senderNumber==null && other.getSenderNumber()==null) || 
             (this.senderNumber!=null &&
              this.senderNumber.equals(other.getSenderNumber())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAppliedFee() != null) {
            _hashCode += getAppliedFee().hashCode();
        }
        if (getAutenticationKey() != null) {
            _hashCode += getAutenticationKey().hashCode();
        }
        if (getBillPaymentCode() != null) {
            _hashCode += getBillPaymentCode().hashCode();
        }
        if (getCustomerEmail() != null) {
            _hashCode += getCustomerEmail().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getSMSToSender() != null) {
            _hashCode += getSMSToSender().hashCode();
        }
        if (getSenderName() != null) {
            _hashCode += getSenderName().hashCode();
        }
        if (getSenderNumber() != null) {
            _hashCode += getSenderNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillPaymentModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.mw.icon.com/", "billPaymentModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appliedFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autenticationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autenticationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPaymentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billPaymentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSToSender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SMSToSender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderNumber"));
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
