/**
 * ParsedFedwire.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedFedwire  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] actualAmounts;

    private java.lang.String adjustmentEffectiveDate;

    private java.lang.String adjustmentReasonCode;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAdjustment[] adjustments;

    private java.lang.String businessFunctionCode;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] charges;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount currencyInstructedAmount;

    private java.lang.String detailsOfCharges;

    private java.lang.String[] documentDates;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireDocument[] documents;

    private java.lang.String dollarAmount;

    private java.lang.String exchangeRate;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] grossAmounts;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount instructedAmount;

    private java.lang.String localInstrumentCode;

    private java.lang.String localInstrumentProprietaryCode;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] negotiatedDiscounts;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireNote[] notes;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireParty[] parties;

    private java.lang.String paymentNotificationIndicator;

    private java.lang.String referenceForBeneficiary;

    private java.lang.String remittanceLocationMethod;

    private java.lang.String senderReferenceNumber;

    private java.lang.String senderSuppliedInformation;

    private java.lang.String typeCode;

    public ParsedFedwire() {
    }

    public ParsedFedwire(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] actualAmounts,
           java.lang.String adjustmentEffectiveDate,
           java.lang.String adjustmentReasonCode,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAdjustment[] adjustments,
           java.lang.String businessFunctionCode,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] charges,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount currencyInstructedAmount,
           java.lang.String detailsOfCharges,
           java.lang.String[] documentDates,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireDocument[] documents,
           java.lang.String dollarAmount,
           java.lang.String exchangeRate,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] grossAmounts,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount instructedAmount,
           java.lang.String localInstrumentCode,
           java.lang.String localInstrumentProprietaryCode,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] negotiatedDiscounts,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireNote[] notes,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireParty[] parties,
           java.lang.String paymentNotificationIndicator,
           java.lang.String referenceForBeneficiary,
           java.lang.String remittanceLocationMethod,
           java.lang.String senderReferenceNumber,
           java.lang.String senderSuppliedInformation,
           java.lang.String typeCode) {
           this.actualAmounts = actualAmounts;
           this.adjustmentEffectiveDate = adjustmentEffectiveDate;
           this.adjustmentReasonCode = adjustmentReasonCode;
           this.adjustments = adjustments;
           this.businessFunctionCode = businessFunctionCode;
           this.charges = charges;
           this.currencyInstructedAmount = currencyInstructedAmount;
           this.detailsOfCharges = detailsOfCharges;
           this.documentDates = documentDates;
           this.documents = documents;
           this.dollarAmount = dollarAmount;
           this.exchangeRate = exchangeRate;
           this.grossAmounts = grossAmounts;
           this.instructedAmount = instructedAmount;
           this.localInstrumentCode = localInstrumentCode;
           this.localInstrumentProprietaryCode = localInstrumentProprietaryCode;
           this.negotiatedDiscounts = negotiatedDiscounts;
           this.notes = notes;
           this.parties = parties;
           this.paymentNotificationIndicator = paymentNotificationIndicator;
           this.referenceForBeneficiary = referenceForBeneficiary;
           this.remittanceLocationMethod = remittanceLocationMethod;
           this.senderReferenceNumber = senderReferenceNumber;
           this.senderSuppliedInformation = senderSuppliedInformation;
           this.typeCode = typeCode;
    }


    /**
     * Gets the actualAmounts value for this ParsedFedwire.
     * 
     * @return actualAmounts
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] getActualAmounts() {
        return actualAmounts;
    }


    /**
     * Sets the actualAmounts value for this ParsedFedwire.
     * 
     * @param actualAmounts
     */
    public void setActualAmounts(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] actualAmounts) {
        this.actualAmounts = actualAmounts;
    }


    /**
     * Gets the adjustmentEffectiveDate value for this ParsedFedwire.
     * 
     * @return adjustmentEffectiveDate
     */
    public java.lang.String getAdjustmentEffectiveDate() {
        return adjustmentEffectiveDate;
    }


    /**
     * Sets the adjustmentEffectiveDate value for this ParsedFedwire.
     * 
     * @param adjustmentEffectiveDate
     */
    public void setAdjustmentEffectiveDate(java.lang.String adjustmentEffectiveDate) {
        this.adjustmentEffectiveDate = adjustmentEffectiveDate;
    }


    /**
     * Gets the adjustmentReasonCode value for this ParsedFedwire.
     * 
     * @return adjustmentReasonCode
     */
    public java.lang.String getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }


    /**
     * Sets the adjustmentReasonCode value for this ParsedFedwire.
     * 
     * @param adjustmentReasonCode
     */
    public void setAdjustmentReasonCode(java.lang.String adjustmentReasonCode) {
        this.adjustmentReasonCode = adjustmentReasonCode;
    }


    /**
     * Gets the adjustments value for this ParsedFedwire.
     * 
     * @return adjustments
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAdjustment[] getAdjustments() {
        return adjustments;
    }


    /**
     * Sets the adjustments value for this ParsedFedwire.
     * 
     * @param adjustments
     */
    public void setAdjustments(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAdjustment[] adjustments) {
        this.adjustments = adjustments;
    }


    /**
     * Gets the businessFunctionCode value for this ParsedFedwire.
     * 
     * @return businessFunctionCode
     */
    public java.lang.String getBusinessFunctionCode() {
        return businessFunctionCode;
    }


    /**
     * Sets the businessFunctionCode value for this ParsedFedwire.
     * 
     * @param businessFunctionCode
     */
    public void setBusinessFunctionCode(java.lang.String businessFunctionCode) {
        this.businessFunctionCode = businessFunctionCode;
    }


    /**
     * Gets the charges value for this ParsedFedwire.
     * 
     * @return charges
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] getCharges() {
        return charges;
    }


    /**
     * Sets the charges value for this ParsedFedwire.
     * 
     * @param charges
     */
    public void setCharges(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] charges) {
        this.charges = charges;
    }


    /**
     * Gets the currencyInstructedAmount value for this ParsedFedwire.
     * 
     * @return currencyInstructedAmount
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount getCurrencyInstructedAmount() {
        return currencyInstructedAmount;
    }


    /**
     * Sets the currencyInstructedAmount value for this ParsedFedwire.
     * 
     * @param currencyInstructedAmount
     */
    public void setCurrencyInstructedAmount(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount currencyInstructedAmount) {
        this.currencyInstructedAmount = currencyInstructedAmount;
    }


    /**
     * Gets the detailsOfCharges value for this ParsedFedwire.
     * 
     * @return detailsOfCharges
     */
    public java.lang.String getDetailsOfCharges() {
        return detailsOfCharges;
    }


    /**
     * Sets the detailsOfCharges value for this ParsedFedwire.
     * 
     * @param detailsOfCharges
     */
    public void setDetailsOfCharges(java.lang.String detailsOfCharges) {
        this.detailsOfCharges = detailsOfCharges;
    }


    /**
     * Gets the documentDates value for this ParsedFedwire.
     * 
     * @return documentDates
     */
    public java.lang.String[] getDocumentDates() {
        return documentDates;
    }


    /**
     * Sets the documentDates value for this ParsedFedwire.
     * 
     * @param documentDates
     */
    public void setDocumentDates(java.lang.String[] documentDates) {
        this.documentDates = documentDates;
    }


    /**
     * Gets the documents value for this ParsedFedwire.
     * 
     * @return documents
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireDocument[] getDocuments() {
        return documents;
    }


    /**
     * Sets the documents value for this ParsedFedwire.
     * 
     * @param documents
     */
    public void setDocuments(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireDocument[] documents) {
        this.documents = documents;
    }


    /**
     * Gets the dollarAmount value for this ParsedFedwire.
     * 
     * @return dollarAmount
     */
    public java.lang.String getDollarAmount() {
        return dollarAmount;
    }


    /**
     * Sets the dollarAmount value for this ParsedFedwire.
     * 
     * @param dollarAmount
     */
    public void setDollarAmount(java.lang.String dollarAmount) {
        this.dollarAmount = dollarAmount;
    }


    /**
     * Gets the exchangeRate value for this ParsedFedwire.
     * 
     * @return exchangeRate
     */
    public java.lang.String getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this ParsedFedwire.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the grossAmounts value for this ParsedFedwire.
     * 
     * @return grossAmounts
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] getGrossAmounts() {
        return grossAmounts;
    }


    /**
     * Sets the grossAmounts value for this ParsedFedwire.
     * 
     * @param grossAmounts
     */
    public void setGrossAmounts(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] grossAmounts) {
        this.grossAmounts = grossAmounts;
    }


    /**
     * Gets the instructedAmount value for this ParsedFedwire.
     * 
     * @return instructedAmount
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount getInstructedAmount() {
        return instructedAmount;
    }


    /**
     * Sets the instructedAmount value for this ParsedFedwire.
     * 
     * @param instructedAmount
     */
    public void setInstructedAmount(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }


    /**
     * Gets the localInstrumentCode value for this ParsedFedwire.
     * 
     * @return localInstrumentCode
     */
    public java.lang.String getLocalInstrumentCode() {
        return localInstrumentCode;
    }


    /**
     * Sets the localInstrumentCode value for this ParsedFedwire.
     * 
     * @param localInstrumentCode
     */
    public void setLocalInstrumentCode(java.lang.String localInstrumentCode) {
        this.localInstrumentCode = localInstrumentCode;
    }


    /**
     * Gets the localInstrumentProprietaryCode value for this ParsedFedwire.
     * 
     * @return localInstrumentProprietaryCode
     */
    public java.lang.String getLocalInstrumentProprietaryCode() {
        return localInstrumentProprietaryCode;
    }


    /**
     * Sets the localInstrumentProprietaryCode value for this ParsedFedwire.
     * 
     * @param localInstrumentProprietaryCode
     */
    public void setLocalInstrumentProprietaryCode(java.lang.String localInstrumentProprietaryCode) {
        this.localInstrumentProprietaryCode = localInstrumentProprietaryCode;
    }


    /**
     * Gets the negotiatedDiscounts value for this ParsedFedwire.
     * 
     * @return negotiatedDiscounts
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] getNegotiatedDiscounts() {
        return negotiatedDiscounts;
    }


    /**
     * Sets the negotiatedDiscounts value for this ParsedFedwire.
     * 
     * @param negotiatedDiscounts
     */
    public void setNegotiatedDiscounts(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[] negotiatedDiscounts) {
        this.negotiatedDiscounts = negotiatedDiscounts;
    }


    /**
     * Gets the notes value for this ParsedFedwire.
     * 
     * @return notes
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireNote[] getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this ParsedFedwire.
     * 
     * @param notes
     */
    public void setNotes(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireNote[] notes) {
        this.notes = notes;
    }


    /**
     * Gets the parties value for this ParsedFedwire.
     * 
     * @return parties
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireParty[] getParties() {
        return parties;
    }


    /**
     * Sets the parties value for this ParsedFedwire.
     * 
     * @param parties
     */
    public void setParties(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireParty[] parties) {
        this.parties = parties;
    }


    /**
     * Gets the paymentNotificationIndicator value for this ParsedFedwire.
     * 
     * @return paymentNotificationIndicator
     */
    public java.lang.String getPaymentNotificationIndicator() {
        return paymentNotificationIndicator;
    }


    /**
     * Sets the paymentNotificationIndicator value for this ParsedFedwire.
     * 
     * @param paymentNotificationIndicator
     */
    public void setPaymentNotificationIndicator(java.lang.String paymentNotificationIndicator) {
        this.paymentNotificationIndicator = paymentNotificationIndicator;
    }


    /**
     * Gets the referenceForBeneficiary value for this ParsedFedwire.
     * 
     * @return referenceForBeneficiary
     */
    public java.lang.String getReferenceForBeneficiary() {
        return referenceForBeneficiary;
    }


    /**
     * Sets the referenceForBeneficiary value for this ParsedFedwire.
     * 
     * @param referenceForBeneficiary
     */
    public void setReferenceForBeneficiary(java.lang.String referenceForBeneficiary) {
        this.referenceForBeneficiary = referenceForBeneficiary;
    }


    /**
     * Gets the remittanceLocationMethod value for this ParsedFedwire.
     * 
     * @return remittanceLocationMethod
     */
    public java.lang.String getRemittanceLocationMethod() {
        return remittanceLocationMethod;
    }


    /**
     * Sets the remittanceLocationMethod value for this ParsedFedwire.
     * 
     * @param remittanceLocationMethod
     */
    public void setRemittanceLocationMethod(java.lang.String remittanceLocationMethod) {
        this.remittanceLocationMethod = remittanceLocationMethod;
    }


    /**
     * Gets the senderReferenceNumber value for this ParsedFedwire.
     * 
     * @return senderReferenceNumber
     */
    public java.lang.String getSenderReferenceNumber() {
        return senderReferenceNumber;
    }


    /**
     * Sets the senderReferenceNumber value for this ParsedFedwire.
     * 
     * @param senderReferenceNumber
     */
    public void setSenderReferenceNumber(java.lang.String senderReferenceNumber) {
        this.senderReferenceNumber = senderReferenceNumber;
    }


    /**
     * Gets the senderSuppliedInformation value for this ParsedFedwire.
     * 
     * @return senderSuppliedInformation
     */
    public java.lang.String getSenderSuppliedInformation() {
        return senderSuppliedInformation;
    }


    /**
     * Sets the senderSuppliedInformation value for this ParsedFedwire.
     * 
     * @param senderSuppliedInformation
     */
    public void setSenderSuppliedInformation(java.lang.String senderSuppliedInformation) {
        this.senderSuppliedInformation = senderSuppliedInformation;
    }


    /**
     * Gets the typeCode value for this ParsedFedwire.
     * 
     * @return typeCode
     */
    public java.lang.String getTypeCode() {
        return typeCode;
    }


    /**
     * Sets the typeCode value for this ParsedFedwire.
     * 
     * @param typeCode
     */
    public void setTypeCode(java.lang.String typeCode) {
        this.typeCode = typeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedFedwire)) return false;
        ParsedFedwire other = (ParsedFedwire) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualAmounts==null && other.getActualAmounts()==null) || 
             (this.actualAmounts!=null &&
              java.util.Arrays.equals(this.actualAmounts, other.getActualAmounts()))) &&
            ((this.adjustmentEffectiveDate==null && other.getAdjustmentEffectiveDate()==null) || 
             (this.adjustmentEffectiveDate!=null &&
              this.adjustmentEffectiveDate.equals(other.getAdjustmentEffectiveDate()))) &&
            ((this.adjustmentReasonCode==null && other.getAdjustmentReasonCode()==null) || 
             (this.adjustmentReasonCode!=null &&
              this.adjustmentReasonCode.equals(other.getAdjustmentReasonCode()))) &&
            ((this.adjustments==null && other.getAdjustments()==null) || 
             (this.adjustments!=null &&
              java.util.Arrays.equals(this.adjustments, other.getAdjustments()))) &&
            ((this.businessFunctionCode==null && other.getBusinessFunctionCode()==null) || 
             (this.businessFunctionCode!=null &&
              this.businessFunctionCode.equals(other.getBusinessFunctionCode()))) &&
            ((this.charges==null && other.getCharges()==null) || 
             (this.charges!=null &&
              java.util.Arrays.equals(this.charges, other.getCharges()))) &&
            ((this.currencyInstructedAmount==null && other.getCurrencyInstructedAmount()==null) || 
             (this.currencyInstructedAmount!=null &&
              this.currencyInstructedAmount.equals(other.getCurrencyInstructedAmount()))) &&
            ((this.detailsOfCharges==null && other.getDetailsOfCharges()==null) || 
             (this.detailsOfCharges!=null &&
              this.detailsOfCharges.equals(other.getDetailsOfCharges()))) &&
            ((this.documentDates==null && other.getDocumentDates()==null) || 
             (this.documentDates!=null &&
              java.util.Arrays.equals(this.documentDates, other.getDocumentDates()))) &&
            ((this.documents==null && other.getDocuments()==null) || 
             (this.documents!=null &&
              java.util.Arrays.equals(this.documents, other.getDocuments()))) &&
            ((this.dollarAmount==null && other.getDollarAmount()==null) || 
             (this.dollarAmount!=null &&
              this.dollarAmount.equals(other.getDollarAmount()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.grossAmounts==null && other.getGrossAmounts()==null) || 
             (this.grossAmounts!=null &&
              java.util.Arrays.equals(this.grossAmounts, other.getGrossAmounts()))) &&
            ((this.instructedAmount==null && other.getInstructedAmount()==null) || 
             (this.instructedAmount!=null &&
              this.instructedAmount.equals(other.getInstructedAmount()))) &&
            ((this.localInstrumentCode==null && other.getLocalInstrumentCode()==null) || 
             (this.localInstrumentCode!=null &&
              this.localInstrumentCode.equals(other.getLocalInstrumentCode()))) &&
            ((this.localInstrumentProprietaryCode==null && other.getLocalInstrumentProprietaryCode()==null) || 
             (this.localInstrumentProprietaryCode!=null &&
              this.localInstrumentProprietaryCode.equals(other.getLocalInstrumentProprietaryCode()))) &&
            ((this.negotiatedDiscounts==null && other.getNegotiatedDiscounts()==null) || 
             (this.negotiatedDiscounts!=null &&
              java.util.Arrays.equals(this.negotiatedDiscounts, other.getNegotiatedDiscounts()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              java.util.Arrays.equals(this.notes, other.getNotes()))) &&
            ((this.parties==null && other.getParties()==null) || 
             (this.parties!=null &&
              java.util.Arrays.equals(this.parties, other.getParties()))) &&
            ((this.paymentNotificationIndicator==null && other.getPaymentNotificationIndicator()==null) || 
             (this.paymentNotificationIndicator!=null &&
              this.paymentNotificationIndicator.equals(other.getPaymentNotificationIndicator()))) &&
            ((this.referenceForBeneficiary==null && other.getReferenceForBeneficiary()==null) || 
             (this.referenceForBeneficiary!=null &&
              this.referenceForBeneficiary.equals(other.getReferenceForBeneficiary()))) &&
            ((this.remittanceLocationMethod==null && other.getRemittanceLocationMethod()==null) || 
             (this.remittanceLocationMethod!=null &&
              this.remittanceLocationMethod.equals(other.getRemittanceLocationMethod()))) &&
            ((this.senderReferenceNumber==null && other.getSenderReferenceNumber()==null) || 
             (this.senderReferenceNumber!=null &&
              this.senderReferenceNumber.equals(other.getSenderReferenceNumber()))) &&
            ((this.senderSuppliedInformation==null && other.getSenderSuppliedInformation()==null) || 
             (this.senderSuppliedInformation!=null &&
              this.senderSuppliedInformation.equals(other.getSenderSuppliedInformation()))) &&
            ((this.typeCode==null && other.getTypeCode()==null) || 
             (this.typeCode!=null &&
              this.typeCode.equals(other.getTypeCode())));
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
        if (getActualAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualAmounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualAmounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdjustmentEffectiveDate() != null) {
            _hashCode += getAdjustmentEffectiveDate().hashCode();
        }
        if (getAdjustmentReasonCode() != null) {
            _hashCode += getAdjustmentReasonCode().hashCode();
        }
        if (getAdjustments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdjustments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdjustments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBusinessFunctionCode() != null) {
            _hashCode += getBusinessFunctionCode().hashCode();
        }
        if (getCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCharges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrencyInstructedAmount() != null) {
            _hashCode += getCurrencyInstructedAmount().hashCode();
        }
        if (getDetailsOfCharges() != null) {
            _hashCode += getDetailsOfCharges().hashCode();
        }
        if (getDocumentDates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentDates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentDates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDollarAmount() != null) {
            _hashCode += getDollarAmount().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getGrossAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrossAmounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrossAmounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInstructedAmount() != null) {
            _hashCode += getInstructedAmount().hashCode();
        }
        if (getLocalInstrumentCode() != null) {
            _hashCode += getLocalInstrumentCode().hashCode();
        }
        if (getLocalInstrumentProprietaryCode() != null) {
            _hashCode += getLocalInstrumentProprietaryCode().hashCode();
        }
        if (getNegotiatedDiscounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNegotiatedDiscounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNegotiatedDiscounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentNotificationIndicator() != null) {
            _hashCode += getPaymentNotificationIndicator().hashCode();
        }
        if (getReferenceForBeneficiary() != null) {
            _hashCode += getReferenceForBeneficiary().hashCode();
        }
        if (getRemittanceLocationMethod() != null) {
            _hashCode += getRemittanceLocationMethod().hashCode();
        }
        if (getSenderReferenceNumber() != null) {
            _hashCode += getSenderReferenceNumber().hashCode();
        }
        if (getSenderSuppliedInformation() != null) {
            _hashCode += getSenderSuppliedInformation().hashCode();
        }
        if (getTypeCode() != null) {
            _hashCode += getTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedFedwire.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwire"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ActualAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AdjustmentEffectiveDate"));
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
        elemField.setFieldName("adjustments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Adjustments"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAdjustment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAdjustment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessFunctionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "BusinessFunctionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Charges"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyInstructedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CurrencyInstructedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailsOfCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DetailsOfCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentDates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DocumentDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Documents"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireDocument"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dollarAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DollarAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "GrossAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instructedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstructedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localInstrumentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "LocalInstrumentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localInstrumentProprietaryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "LocalInstrumentProprietaryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negotiatedDiscounts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "NegotiatedDiscounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireNote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireNote"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parties");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Parties"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireParty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireParty"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentNotificationIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PaymentNotificationIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceForBeneficiary");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ReferenceForBeneficiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remittanceLocationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RemittanceLocationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SenderReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderSuppliedInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SenderSuppliedInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TypeCode"));
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
