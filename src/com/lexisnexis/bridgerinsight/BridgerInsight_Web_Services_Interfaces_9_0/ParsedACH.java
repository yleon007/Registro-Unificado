/**
 * ParsedACH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedACH  implements java.io.Serializable {
    private java.lang.String batchNumber;

    private java.lang.String cardExpirationDate;

    private java.lang.String cardTransactionTypeCode;

    private java.lang.String companyEntryDescription;

    private java.lang.String companyEntryDescriptiveDate;

    private java.lang.String effectiveEntryDate;

    private java.lang.String fileCreationDate;

    private java.lang.String fileCreationTime;

    private java.lang.String fileIdentification;

    private java.lang.String foreignExchangeIndicator;

    private java.lang.String foreignExchangeReference;

    private java.lang.String foreignExchangeReferenceIndicator;

    private java.lang.String gatewayOperatorOFACScreeningIndicator;

    private java.lang.String IATIndicator;

    private java.lang.String ISODestinationCountryCode;

    private java.lang.String ISODestinationCurrencyCode;

    private java.lang.String ISOOriginatingCurrencyCode;

    private java.lang.String itemTypeIndicator;

    private java.lang.String julianDateOnWhichThisAdviceIsCreated;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHNote[] notes;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHParty[] parties;

    private java.lang.String paymentTypeCode;

    private java.lang.String processControlField;

    private java.lang.String referenceCode;

    private java.lang.String refusedAcknowledgmentCode;

    private java.lang.String secondaryOFACScreeningIndicator;

    private java.lang.String serviceClassCode;

    private java.lang.String settlementDate;

    private java.lang.String standardEntryClassCode;

    private java.lang.String totalAmount;

    private java.lang.String traceNumber;

    private java.lang.String transactionCode;

    public ParsedACH() {
    }

    public ParsedACH(
           java.lang.String batchNumber,
           java.lang.String cardExpirationDate,
           java.lang.String cardTransactionTypeCode,
           java.lang.String companyEntryDescription,
           java.lang.String companyEntryDescriptiveDate,
           java.lang.String effectiveEntryDate,
           java.lang.String fileCreationDate,
           java.lang.String fileCreationTime,
           java.lang.String fileIdentification,
           java.lang.String foreignExchangeIndicator,
           java.lang.String foreignExchangeReference,
           java.lang.String foreignExchangeReferenceIndicator,
           java.lang.String gatewayOperatorOFACScreeningIndicator,
           java.lang.String IATIndicator,
           java.lang.String ISODestinationCountryCode,
           java.lang.String ISODestinationCurrencyCode,
           java.lang.String ISOOriginatingCurrencyCode,
           java.lang.String itemTypeIndicator,
           java.lang.String julianDateOnWhichThisAdviceIsCreated,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHNote[] notes,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHParty[] parties,
           java.lang.String paymentTypeCode,
           java.lang.String processControlField,
           java.lang.String referenceCode,
           java.lang.String refusedAcknowledgmentCode,
           java.lang.String secondaryOFACScreeningIndicator,
           java.lang.String serviceClassCode,
           java.lang.String settlementDate,
           java.lang.String standardEntryClassCode,
           java.lang.String totalAmount,
           java.lang.String traceNumber,
           java.lang.String transactionCode) {
           this.batchNumber = batchNumber;
           this.cardExpirationDate = cardExpirationDate;
           this.cardTransactionTypeCode = cardTransactionTypeCode;
           this.companyEntryDescription = companyEntryDescription;
           this.companyEntryDescriptiveDate = companyEntryDescriptiveDate;
           this.effectiveEntryDate = effectiveEntryDate;
           this.fileCreationDate = fileCreationDate;
           this.fileCreationTime = fileCreationTime;
           this.fileIdentification = fileIdentification;
           this.foreignExchangeIndicator = foreignExchangeIndicator;
           this.foreignExchangeReference = foreignExchangeReference;
           this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator;
           this.gatewayOperatorOFACScreeningIndicator = gatewayOperatorOFACScreeningIndicator;
           this.IATIndicator = IATIndicator;
           this.ISODestinationCountryCode = ISODestinationCountryCode;
           this.ISODestinationCurrencyCode = ISODestinationCurrencyCode;
           this.ISOOriginatingCurrencyCode = ISOOriginatingCurrencyCode;
           this.itemTypeIndicator = itemTypeIndicator;
           this.julianDateOnWhichThisAdviceIsCreated = julianDateOnWhichThisAdviceIsCreated;
           this.notes = notes;
           this.parties = parties;
           this.paymentTypeCode = paymentTypeCode;
           this.processControlField = processControlField;
           this.referenceCode = referenceCode;
           this.refusedAcknowledgmentCode = refusedAcknowledgmentCode;
           this.secondaryOFACScreeningIndicator = secondaryOFACScreeningIndicator;
           this.serviceClassCode = serviceClassCode;
           this.settlementDate = settlementDate;
           this.standardEntryClassCode = standardEntryClassCode;
           this.totalAmount = totalAmount;
           this.traceNumber = traceNumber;
           this.transactionCode = transactionCode;
    }


    /**
     * Gets the batchNumber value for this ParsedACH.
     * 
     * @return batchNumber
     */
    public java.lang.String getBatchNumber() {
        return batchNumber;
    }


    /**
     * Sets the batchNumber value for this ParsedACH.
     * 
     * @param batchNumber
     */
    public void setBatchNumber(java.lang.String batchNumber) {
        this.batchNumber = batchNumber;
    }


    /**
     * Gets the cardExpirationDate value for this ParsedACH.
     * 
     * @return cardExpirationDate
     */
    public java.lang.String getCardExpirationDate() {
        return cardExpirationDate;
    }


    /**
     * Sets the cardExpirationDate value for this ParsedACH.
     * 
     * @param cardExpirationDate
     */
    public void setCardExpirationDate(java.lang.String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }


    /**
     * Gets the cardTransactionTypeCode value for this ParsedACH.
     * 
     * @return cardTransactionTypeCode
     */
    public java.lang.String getCardTransactionTypeCode() {
        return cardTransactionTypeCode;
    }


    /**
     * Sets the cardTransactionTypeCode value for this ParsedACH.
     * 
     * @param cardTransactionTypeCode
     */
    public void setCardTransactionTypeCode(java.lang.String cardTransactionTypeCode) {
        this.cardTransactionTypeCode = cardTransactionTypeCode;
    }


    /**
     * Gets the companyEntryDescription value for this ParsedACH.
     * 
     * @return companyEntryDescription
     */
    public java.lang.String getCompanyEntryDescription() {
        return companyEntryDescription;
    }


    /**
     * Sets the companyEntryDescription value for this ParsedACH.
     * 
     * @param companyEntryDescription
     */
    public void setCompanyEntryDescription(java.lang.String companyEntryDescription) {
        this.companyEntryDescription = companyEntryDescription;
    }


    /**
     * Gets the companyEntryDescriptiveDate value for this ParsedACH.
     * 
     * @return companyEntryDescriptiveDate
     */
    public java.lang.String getCompanyEntryDescriptiveDate() {
        return companyEntryDescriptiveDate;
    }


    /**
     * Sets the companyEntryDescriptiveDate value for this ParsedACH.
     * 
     * @param companyEntryDescriptiveDate
     */
    public void setCompanyEntryDescriptiveDate(java.lang.String companyEntryDescriptiveDate) {
        this.companyEntryDescriptiveDate = companyEntryDescriptiveDate;
    }


    /**
     * Gets the effectiveEntryDate value for this ParsedACH.
     * 
     * @return effectiveEntryDate
     */
    public java.lang.String getEffectiveEntryDate() {
        return effectiveEntryDate;
    }


    /**
     * Sets the effectiveEntryDate value for this ParsedACH.
     * 
     * @param effectiveEntryDate
     */
    public void setEffectiveEntryDate(java.lang.String effectiveEntryDate) {
        this.effectiveEntryDate = effectiveEntryDate;
    }


    /**
     * Gets the fileCreationDate value for this ParsedACH.
     * 
     * @return fileCreationDate
     */
    public java.lang.String getFileCreationDate() {
        return fileCreationDate;
    }


    /**
     * Sets the fileCreationDate value for this ParsedACH.
     * 
     * @param fileCreationDate
     */
    public void setFileCreationDate(java.lang.String fileCreationDate) {
        this.fileCreationDate = fileCreationDate;
    }


    /**
     * Gets the fileCreationTime value for this ParsedACH.
     * 
     * @return fileCreationTime
     */
    public java.lang.String getFileCreationTime() {
        return fileCreationTime;
    }


    /**
     * Sets the fileCreationTime value for this ParsedACH.
     * 
     * @param fileCreationTime
     */
    public void setFileCreationTime(java.lang.String fileCreationTime) {
        this.fileCreationTime = fileCreationTime;
    }


    /**
     * Gets the fileIdentification value for this ParsedACH.
     * 
     * @return fileIdentification
     */
    public java.lang.String getFileIdentification() {
        return fileIdentification;
    }


    /**
     * Sets the fileIdentification value for this ParsedACH.
     * 
     * @param fileIdentification
     */
    public void setFileIdentification(java.lang.String fileIdentification) {
        this.fileIdentification = fileIdentification;
    }


    /**
     * Gets the foreignExchangeIndicator value for this ParsedACH.
     * 
     * @return foreignExchangeIndicator
     */
    public java.lang.String getForeignExchangeIndicator() {
        return foreignExchangeIndicator;
    }


    /**
     * Sets the foreignExchangeIndicator value for this ParsedACH.
     * 
     * @param foreignExchangeIndicator
     */
    public void setForeignExchangeIndicator(java.lang.String foreignExchangeIndicator) {
        this.foreignExchangeIndicator = foreignExchangeIndicator;
    }


    /**
     * Gets the foreignExchangeReference value for this ParsedACH.
     * 
     * @return foreignExchangeReference
     */
    public java.lang.String getForeignExchangeReference() {
        return foreignExchangeReference;
    }


    /**
     * Sets the foreignExchangeReference value for this ParsedACH.
     * 
     * @param foreignExchangeReference
     */
    public void setForeignExchangeReference(java.lang.String foreignExchangeReference) {
        this.foreignExchangeReference = foreignExchangeReference;
    }


    /**
     * Gets the foreignExchangeReferenceIndicator value for this ParsedACH.
     * 
     * @return foreignExchangeReferenceIndicator
     */
    public java.lang.String getForeignExchangeReferenceIndicator() {
        return foreignExchangeReferenceIndicator;
    }


    /**
     * Sets the foreignExchangeReferenceIndicator value for this ParsedACH.
     * 
     * @param foreignExchangeReferenceIndicator
     */
    public void setForeignExchangeReferenceIndicator(java.lang.String foreignExchangeReferenceIndicator) {
        this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator;
    }


    /**
     * Gets the gatewayOperatorOFACScreeningIndicator value for this ParsedACH.
     * 
     * @return gatewayOperatorOFACScreeningIndicator
     */
    public java.lang.String getGatewayOperatorOFACScreeningIndicator() {
        return gatewayOperatorOFACScreeningIndicator;
    }


    /**
     * Sets the gatewayOperatorOFACScreeningIndicator value for this ParsedACH.
     * 
     * @param gatewayOperatorOFACScreeningIndicator
     */
    public void setGatewayOperatorOFACScreeningIndicator(java.lang.String gatewayOperatorOFACScreeningIndicator) {
        this.gatewayOperatorOFACScreeningIndicator = gatewayOperatorOFACScreeningIndicator;
    }


    /**
     * Gets the IATIndicator value for this ParsedACH.
     * 
     * @return IATIndicator
     */
    public java.lang.String getIATIndicator() {
        return IATIndicator;
    }


    /**
     * Sets the IATIndicator value for this ParsedACH.
     * 
     * @param IATIndicator
     */
    public void setIATIndicator(java.lang.String IATIndicator) {
        this.IATIndicator = IATIndicator;
    }


    /**
     * Gets the ISODestinationCountryCode value for this ParsedACH.
     * 
     * @return ISODestinationCountryCode
     */
    public java.lang.String getISODestinationCountryCode() {
        return ISODestinationCountryCode;
    }


    /**
     * Sets the ISODestinationCountryCode value for this ParsedACH.
     * 
     * @param ISODestinationCountryCode
     */
    public void setISODestinationCountryCode(java.lang.String ISODestinationCountryCode) {
        this.ISODestinationCountryCode = ISODestinationCountryCode;
    }


    /**
     * Gets the ISODestinationCurrencyCode value for this ParsedACH.
     * 
     * @return ISODestinationCurrencyCode
     */
    public java.lang.String getISODestinationCurrencyCode() {
        return ISODestinationCurrencyCode;
    }


    /**
     * Sets the ISODestinationCurrencyCode value for this ParsedACH.
     * 
     * @param ISODestinationCurrencyCode
     */
    public void setISODestinationCurrencyCode(java.lang.String ISODestinationCurrencyCode) {
        this.ISODestinationCurrencyCode = ISODestinationCurrencyCode;
    }


    /**
     * Gets the ISOOriginatingCurrencyCode value for this ParsedACH.
     * 
     * @return ISOOriginatingCurrencyCode
     */
    public java.lang.String getISOOriginatingCurrencyCode() {
        return ISOOriginatingCurrencyCode;
    }


    /**
     * Sets the ISOOriginatingCurrencyCode value for this ParsedACH.
     * 
     * @param ISOOriginatingCurrencyCode
     */
    public void setISOOriginatingCurrencyCode(java.lang.String ISOOriginatingCurrencyCode) {
        this.ISOOriginatingCurrencyCode = ISOOriginatingCurrencyCode;
    }


    /**
     * Gets the itemTypeIndicator value for this ParsedACH.
     * 
     * @return itemTypeIndicator
     */
    public java.lang.String getItemTypeIndicator() {
        return itemTypeIndicator;
    }


    /**
     * Sets the itemTypeIndicator value for this ParsedACH.
     * 
     * @param itemTypeIndicator
     */
    public void setItemTypeIndicator(java.lang.String itemTypeIndicator) {
        this.itemTypeIndicator = itemTypeIndicator;
    }


    /**
     * Gets the julianDateOnWhichThisAdviceIsCreated value for this ParsedACH.
     * 
     * @return julianDateOnWhichThisAdviceIsCreated
     */
    public java.lang.String getJulianDateOnWhichThisAdviceIsCreated() {
        return julianDateOnWhichThisAdviceIsCreated;
    }


    /**
     * Sets the julianDateOnWhichThisAdviceIsCreated value for this ParsedACH.
     * 
     * @param julianDateOnWhichThisAdviceIsCreated
     */
    public void setJulianDateOnWhichThisAdviceIsCreated(java.lang.String julianDateOnWhichThisAdviceIsCreated) {
        this.julianDateOnWhichThisAdviceIsCreated = julianDateOnWhichThisAdviceIsCreated;
    }


    /**
     * Gets the notes value for this ParsedACH.
     * 
     * @return notes
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHNote[] getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this ParsedACH.
     * 
     * @param notes
     */
    public void setNotes(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHNote[] notes) {
        this.notes = notes;
    }


    /**
     * Gets the parties value for this ParsedACH.
     * 
     * @return parties
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHParty[] getParties() {
        return parties;
    }


    /**
     * Sets the parties value for this ParsedACH.
     * 
     * @param parties
     */
    public void setParties(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHParty[] parties) {
        this.parties = parties;
    }


    /**
     * Gets the paymentTypeCode value for this ParsedACH.
     * 
     * @return paymentTypeCode
     */
    public java.lang.String getPaymentTypeCode() {
        return paymentTypeCode;
    }


    /**
     * Sets the paymentTypeCode value for this ParsedACH.
     * 
     * @param paymentTypeCode
     */
    public void setPaymentTypeCode(java.lang.String paymentTypeCode) {
        this.paymentTypeCode = paymentTypeCode;
    }


    /**
     * Gets the processControlField value for this ParsedACH.
     * 
     * @return processControlField
     */
    public java.lang.String getProcessControlField() {
        return processControlField;
    }


    /**
     * Sets the processControlField value for this ParsedACH.
     * 
     * @param processControlField
     */
    public void setProcessControlField(java.lang.String processControlField) {
        this.processControlField = processControlField;
    }


    /**
     * Gets the referenceCode value for this ParsedACH.
     * 
     * @return referenceCode
     */
    public java.lang.String getReferenceCode() {
        return referenceCode;
    }


    /**
     * Sets the referenceCode value for this ParsedACH.
     * 
     * @param referenceCode
     */
    public void setReferenceCode(java.lang.String referenceCode) {
        this.referenceCode = referenceCode;
    }


    /**
     * Gets the refusedAcknowledgmentCode value for this ParsedACH.
     * 
     * @return refusedAcknowledgmentCode
     */
    public java.lang.String getRefusedAcknowledgmentCode() {
        return refusedAcknowledgmentCode;
    }


    /**
     * Sets the refusedAcknowledgmentCode value for this ParsedACH.
     * 
     * @param refusedAcknowledgmentCode
     */
    public void setRefusedAcknowledgmentCode(java.lang.String refusedAcknowledgmentCode) {
        this.refusedAcknowledgmentCode = refusedAcknowledgmentCode;
    }


    /**
     * Gets the secondaryOFACScreeningIndicator value for this ParsedACH.
     * 
     * @return secondaryOFACScreeningIndicator
     */
    public java.lang.String getSecondaryOFACScreeningIndicator() {
        return secondaryOFACScreeningIndicator;
    }


    /**
     * Sets the secondaryOFACScreeningIndicator value for this ParsedACH.
     * 
     * @param secondaryOFACScreeningIndicator
     */
    public void setSecondaryOFACScreeningIndicator(java.lang.String secondaryOFACScreeningIndicator) {
        this.secondaryOFACScreeningIndicator = secondaryOFACScreeningIndicator;
    }


    /**
     * Gets the serviceClassCode value for this ParsedACH.
     * 
     * @return serviceClassCode
     */
    public java.lang.String getServiceClassCode() {
        return serviceClassCode;
    }


    /**
     * Sets the serviceClassCode value for this ParsedACH.
     * 
     * @param serviceClassCode
     */
    public void setServiceClassCode(java.lang.String serviceClassCode) {
        this.serviceClassCode = serviceClassCode;
    }


    /**
     * Gets the settlementDate value for this ParsedACH.
     * 
     * @return settlementDate
     */
    public java.lang.String getSettlementDate() {
        return settlementDate;
    }


    /**
     * Sets the settlementDate value for this ParsedACH.
     * 
     * @param settlementDate
     */
    public void setSettlementDate(java.lang.String settlementDate) {
        this.settlementDate = settlementDate;
    }


    /**
     * Gets the standardEntryClassCode value for this ParsedACH.
     * 
     * @return standardEntryClassCode
     */
    public java.lang.String getStandardEntryClassCode() {
        return standardEntryClassCode;
    }


    /**
     * Sets the standardEntryClassCode value for this ParsedACH.
     * 
     * @param standardEntryClassCode
     */
    public void setStandardEntryClassCode(java.lang.String standardEntryClassCode) {
        this.standardEntryClassCode = standardEntryClassCode;
    }


    /**
     * Gets the totalAmount value for this ParsedACH.
     * 
     * @return totalAmount
     */
    public java.lang.String getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this ParsedACH.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.lang.String totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the traceNumber value for this ParsedACH.
     * 
     * @return traceNumber
     */
    public java.lang.String getTraceNumber() {
        return traceNumber;
    }


    /**
     * Sets the traceNumber value for this ParsedACH.
     * 
     * @param traceNumber
     */
    public void setTraceNumber(java.lang.String traceNumber) {
        this.traceNumber = traceNumber;
    }


    /**
     * Gets the transactionCode value for this ParsedACH.
     * 
     * @return transactionCode
     */
    public java.lang.String getTransactionCode() {
        return transactionCode;
    }


    /**
     * Sets the transactionCode value for this ParsedACH.
     * 
     * @param transactionCode
     */
    public void setTransactionCode(java.lang.String transactionCode) {
        this.transactionCode = transactionCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedACH)) return false;
        ParsedACH other = (ParsedACH) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchNumber==null && other.getBatchNumber()==null) || 
             (this.batchNumber!=null &&
              this.batchNumber.equals(other.getBatchNumber()))) &&
            ((this.cardExpirationDate==null && other.getCardExpirationDate()==null) || 
             (this.cardExpirationDate!=null &&
              this.cardExpirationDate.equals(other.getCardExpirationDate()))) &&
            ((this.cardTransactionTypeCode==null && other.getCardTransactionTypeCode()==null) || 
             (this.cardTransactionTypeCode!=null &&
              this.cardTransactionTypeCode.equals(other.getCardTransactionTypeCode()))) &&
            ((this.companyEntryDescription==null && other.getCompanyEntryDescription()==null) || 
             (this.companyEntryDescription!=null &&
              this.companyEntryDescription.equals(other.getCompanyEntryDescription()))) &&
            ((this.companyEntryDescriptiveDate==null && other.getCompanyEntryDescriptiveDate()==null) || 
             (this.companyEntryDescriptiveDate!=null &&
              this.companyEntryDescriptiveDate.equals(other.getCompanyEntryDescriptiveDate()))) &&
            ((this.effectiveEntryDate==null && other.getEffectiveEntryDate()==null) || 
             (this.effectiveEntryDate!=null &&
              this.effectiveEntryDate.equals(other.getEffectiveEntryDate()))) &&
            ((this.fileCreationDate==null && other.getFileCreationDate()==null) || 
             (this.fileCreationDate!=null &&
              this.fileCreationDate.equals(other.getFileCreationDate()))) &&
            ((this.fileCreationTime==null && other.getFileCreationTime()==null) || 
             (this.fileCreationTime!=null &&
              this.fileCreationTime.equals(other.getFileCreationTime()))) &&
            ((this.fileIdentification==null && other.getFileIdentification()==null) || 
             (this.fileIdentification!=null &&
              this.fileIdentification.equals(other.getFileIdentification()))) &&
            ((this.foreignExchangeIndicator==null && other.getForeignExchangeIndicator()==null) || 
             (this.foreignExchangeIndicator!=null &&
              this.foreignExchangeIndicator.equals(other.getForeignExchangeIndicator()))) &&
            ((this.foreignExchangeReference==null && other.getForeignExchangeReference()==null) || 
             (this.foreignExchangeReference!=null &&
              this.foreignExchangeReference.equals(other.getForeignExchangeReference()))) &&
            ((this.foreignExchangeReferenceIndicator==null && other.getForeignExchangeReferenceIndicator()==null) || 
             (this.foreignExchangeReferenceIndicator!=null &&
              this.foreignExchangeReferenceIndicator.equals(other.getForeignExchangeReferenceIndicator()))) &&
            ((this.gatewayOperatorOFACScreeningIndicator==null && other.getGatewayOperatorOFACScreeningIndicator()==null) || 
             (this.gatewayOperatorOFACScreeningIndicator!=null &&
              this.gatewayOperatorOFACScreeningIndicator.equals(other.getGatewayOperatorOFACScreeningIndicator()))) &&
            ((this.IATIndicator==null && other.getIATIndicator()==null) || 
             (this.IATIndicator!=null &&
              this.IATIndicator.equals(other.getIATIndicator()))) &&
            ((this.ISODestinationCountryCode==null && other.getISODestinationCountryCode()==null) || 
             (this.ISODestinationCountryCode!=null &&
              this.ISODestinationCountryCode.equals(other.getISODestinationCountryCode()))) &&
            ((this.ISODestinationCurrencyCode==null && other.getISODestinationCurrencyCode()==null) || 
             (this.ISODestinationCurrencyCode!=null &&
              this.ISODestinationCurrencyCode.equals(other.getISODestinationCurrencyCode()))) &&
            ((this.ISOOriginatingCurrencyCode==null && other.getISOOriginatingCurrencyCode()==null) || 
             (this.ISOOriginatingCurrencyCode!=null &&
              this.ISOOriginatingCurrencyCode.equals(other.getISOOriginatingCurrencyCode()))) &&
            ((this.itemTypeIndicator==null && other.getItemTypeIndicator()==null) || 
             (this.itemTypeIndicator!=null &&
              this.itemTypeIndicator.equals(other.getItemTypeIndicator()))) &&
            ((this.julianDateOnWhichThisAdviceIsCreated==null && other.getJulianDateOnWhichThisAdviceIsCreated()==null) || 
             (this.julianDateOnWhichThisAdviceIsCreated!=null &&
              this.julianDateOnWhichThisAdviceIsCreated.equals(other.getJulianDateOnWhichThisAdviceIsCreated()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              java.util.Arrays.equals(this.notes, other.getNotes()))) &&
            ((this.parties==null && other.getParties()==null) || 
             (this.parties!=null &&
              java.util.Arrays.equals(this.parties, other.getParties()))) &&
            ((this.paymentTypeCode==null && other.getPaymentTypeCode()==null) || 
             (this.paymentTypeCode!=null &&
              this.paymentTypeCode.equals(other.getPaymentTypeCode()))) &&
            ((this.processControlField==null && other.getProcessControlField()==null) || 
             (this.processControlField!=null &&
              this.processControlField.equals(other.getProcessControlField()))) &&
            ((this.referenceCode==null && other.getReferenceCode()==null) || 
             (this.referenceCode!=null &&
              this.referenceCode.equals(other.getReferenceCode()))) &&
            ((this.refusedAcknowledgmentCode==null && other.getRefusedAcknowledgmentCode()==null) || 
             (this.refusedAcknowledgmentCode!=null &&
              this.refusedAcknowledgmentCode.equals(other.getRefusedAcknowledgmentCode()))) &&
            ((this.secondaryOFACScreeningIndicator==null && other.getSecondaryOFACScreeningIndicator()==null) || 
             (this.secondaryOFACScreeningIndicator!=null &&
              this.secondaryOFACScreeningIndicator.equals(other.getSecondaryOFACScreeningIndicator()))) &&
            ((this.serviceClassCode==null && other.getServiceClassCode()==null) || 
             (this.serviceClassCode!=null &&
              this.serviceClassCode.equals(other.getServiceClassCode()))) &&
            ((this.settlementDate==null && other.getSettlementDate()==null) || 
             (this.settlementDate!=null &&
              this.settlementDate.equals(other.getSettlementDate()))) &&
            ((this.standardEntryClassCode==null && other.getStandardEntryClassCode()==null) || 
             (this.standardEntryClassCode!=null &&
              this.standardEntryClassCode.equals(other.getStandardEntryClassCode()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.traceNumber==null && other.getTraceNumber()==null) || 
             (this.traceNumber!=null &&
              this.traceNumber.equals(other.getTraceNumber()))) &&
            ((this.transactionCode==null && other.getTransactionCode()==null) || 
             (this.transactionCode!=null &&
              this.transactionCode.equals(other.getTransactionCode())));
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
        if (getBatchNumber() != null) {
            _hashCode += getBatchNumber().hashCode();
        }
        if (getCardExpirationDate() != null) {
            _hashCode += getCardExpirationDate().hashCode();
        }
        if (getCardTransactionTypeCode() != null) {
            _hashCode += getCardTransactionTypeCode().hashCode();
        }
        if (getCompanyEntryDescription() != null) {
            _hashCode += getCompanyEntryDescription().hashCode();
        }
        if (getCompanyEntryDescriptiveDate() != null) {
            _hashCode += getCompanyEntryDescriptiveDate().hashCode();
        }
        if (getEffectiveEntryDate() != null) {
            _hashCode += getEffectiveEntryDate().hashCode();
        }
        if (getFileCreationDate() != null) {
            _hashCode += getFileCreationDate().hashCode();
        }
        if (getFileCreationTime() != null) {
            _hashCode += getFileCreationTime().hashCode();
        }
        if (getFileIdentification() != null) {
            _hashCode += getFileIdentification().hashCode();
        }
        if (getForeignExchangeIndicator() != null) {
            _hashCode += getForeignExchangeIndicator().hashCode();
        }
        if (getForeignExchangeReference() != null) {
            _hashCode += getForeignExchangeReference().hashCode();
        }
        if (getForeignExchangeReferenceIndicator() != null) {
            _hashCode += getForeignExchangeReferenceIndicator().hashCode();
        }
        if (getGatewayOperatorOFACScreeningIndicator() != null) {
            _hashCode += getGatewayOperatorOFACScreeningIndicator().hashCode();
        }
        if (getIATIndicator() != null) {
            _hashCode += getIATIndicator().hashCode();
        }
        if (getISODestinationCountryCode() != null) {
            _hashCode += getISODestinationCountryCode().hashCode();
        }
        if (getISODestinationCurrencyCode() != null) {
            _hashCode += getISODestinationCurrencyCode().hashCode();
        }
        if (getISOOriginatingCurrencyCode() != null) {
            _hashCode += getISOOriginatingCurrencyCode().hashCode();
        }
        if (getItemTypeIndicator() != null) {
            _hashCode += getItemTypeIndicator().hashCode();
        }
        if (getJulianDateOnWhichThisAdviceIsCreated() != null) {
            _hashCode += getJulianDateOnWhichThisAdviceIsCreated().hashCode();
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
        if (getPaymentTypeCode() != null) {
            _hashCode += getPaymentTypeCode().hashCode();
        }
        if (getProcessControlField() != null) {
            _hashCode += getProcessControlField().hashCode();
        }
        if (getReferenceCode() != null) {
            _hashCode += getReferenceCode().hashCode();
        }
        if (getRefusedAcknowledgmentCode() != null) {
            _hashCode += getRefusedAcknowledgmentCode().hashCode();
        }
        if (getSecondaryOFACScreeningIndicator() != null) {
            _hashCode += getSecondaryOFACScreeningIndicator().hashCode();
        }
        if (getServiceClassCode() != null) {
            _hashCode += getServiceClassCode().hashCode();
        }
        if (getSettlementDate() != null) {
            _hashCode += getSettlementDate().hashCode();
        }
        if (getStandardEntryClassCode() != null) {
            _hashCode += getStandardEntryClassCode().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getTraceNumber() != null) {
            _hashCode += getTraceNumber().hashCode();
        }
        if (getTransactionCode() != null) {
            _hashCode += getTransactionCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedACH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACH"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "BatchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CardExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTransactionTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CardTransactionTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyEntryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CompanyEntryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyEntryDescriptiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CompanyEntryDescriptiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveEntryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EffectiveEntryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FileCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileCreationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FileCreationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FileIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignExchangeIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ForeignExchangeIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignExchangeReference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ForeignExchangeReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignExchangeReferenceIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ForeignExchangeReferenceIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayOperatorOFACScreeningIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "GatewayOperatorOFACScreeningIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IATIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IATIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISODestinationCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ISODestinationCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISODestinationCurrencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ISODestinationCurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISOOriginatingCurrencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ISOOriginatingCurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTypeIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ItemTypeIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("julianDateOnWhichThisAdviceIsCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "JulianDateOnWhichThisAdviceIsCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHNote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHNote"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parties");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Parties"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHParty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHParty"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PaymentTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processControlField");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ProcessControlField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ReferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refusedAcknowledgmentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RefusedAcknowledgmentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryOFACScreeningIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SecondaryOFACScreeningIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ServiceClassCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settlementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SettlementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardEntryClassCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "StandardEntryClassCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TraceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TransactionCode"));
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
