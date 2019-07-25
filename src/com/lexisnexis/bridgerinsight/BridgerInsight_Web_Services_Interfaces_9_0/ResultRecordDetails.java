/**
 * ResultRecordDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ResultRecordDetails  implements java.io.Serializable {
    private java.lang.Long acceptListID;

    private java.lang.String accountAmount;

    private java.lang.String accountDate;

    private java.lang.String accountGroupID;

    private java.lang.String accountOtherData;

    private java.lang.String accountProviderID;

    private java.lang.String accountType;

    private java.lang.Boolean addedToAcceptList;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAdditionalInfo[] additionalInfo;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAddress[] addresses;

    private int[] customWatchlistIDs;

    private java.lang.String division;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType DPPA;

    private java.lang.String EFTContext;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType EFTType;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType entityType;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError error;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.GenderType gender;

    private java.lang.Integer GLB;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputID[] IDs;

    private java.util.Calendar lastUpdatedDate;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputName name;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACH parsedACH;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwire parsedFedwire;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022 parsedISO20022;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFT parsedSWIFT;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputPhone[] phones;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.RecordState recordState;

    private java.util.Calendar searchDate;

    private java.lang.String text;

    public ResultRecordDetails() {
    }

    public ResultRecordDetails(
           java.lang.Long acceptListID,
           java.lang.String accountAmount,
           java.lang.String accountDate,
           java.lang.String accountGroupID,
           java.lang.String accountOtherData,
           java.lang.String accountProviderID,
           java.lang.String accountType,
           java.lang.Boolean addedToAcceptList,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAdditionalInfo[] additionalInfo,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAddress[] addresses,
           int[] customWatchlistIDs,
           java.lang.String division,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType DPPA,
           java.lang.String EFTContext,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType EFTType,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType entityType,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError error,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.GenderType gender,
           java.lang.Integer GLB,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputID[] IDs,
           java.util.Calendar lastUpdatedDate,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputName name,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACH parsedACH,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwire parsedFedwire,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022 parsedISO20022,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFT parsedSWIFT,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputPhone[] phones,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.RecordState recordState,
           java.util.Calendar searchDate,
           java.lang.String text) {
           this.acceptListID = acceptListID;
           this.accountAmount = accountAmount;
           this.accountDate = accountDate;
           this.accountGroupID = accountGroupID;
           this.accountOtherData = accountOtherData;
           this.accountProviderID = accountProviderID;
           this.accountType = accountType;
           this.addedToAcceptList = addedToAcceptList;
           this.additionalInfo = additionalInfo;
           this.addresses = addresses;
           this.customWatchlistIDs = customWatchlistIDs;
           this.division = division;
           this.DPPA = DPPA;
           this.EFTContext = EFTContext;
           this.EFTType = EFTType;
           this.entityType = entityType;
           this.error = error;
           this.gender = gender;
           this.GLB = GLB;
           this.IDs = IDs;
           this.lastUpdatedDate = lastUpdatedDate;
           this.name = name;
           this.parsedACH = parsedACH;
           this.parsedFedwire = parsedFedwire;
           this.parsedISO20022 = parsedISO20022;
           this.parsedSWIFT = parsedSWIFT;
           this.phones = phones;
           this.recordState = recordState;
           this.searchDate = searchDate;
           this.text = text;
    }


    /**
     * Gets the acceptListID value for this ResultRecordDetails.
     * 
     * @return acceptListID
     */
    public java.lang.Long getAcceptListID() {
        return acceptListID;
    }


    /**
     * Sets the acceptListID value for this ResultRecordDetails.
     * 
     * @param acceptListID
     */
    public void setAcceptListID(java.lang.Long acceptListID) {
        this.acceptListID = acceptListID;
    }


    /**
     * Gets the accountAmount value for this ResultRecordDetails.
     * 
     * @return accountAmount
     */
    public java.lang.String getAccountAmount() {
        return accountAmount;
    }


    /**
     * Sets the accountAmount value for this ResultRecordDetails.
     * 
     * @param accountAmount
     */
    public void setAccountAmount(java.lang.String accountAmount) {
        this.accountAmount = accountAmount;
    }


    /**
     * Gets the accountDate value for this ResultRecordDetails.
     * 
     * @return accountDate
     */
    public java.lang.String getAccountDate() {
        return accountDate;
    }


    /**
     * Sets the accountDate value for this ResultRecordDetails.
     * 
     * @param accountDate
     */
    public void setAccountDate(java.lang.String accountDate) {
        this.accountDate = accountDate;
    }


    /**
     * Gets the accountGroupID value for this ResultRecordDetails.
     * 
     * @return accountGroupID
     */
    public java.lang.String getAccountGroupID() {
        return accountGroupID;
    }


    /**
     * Sets the accountGroupID value for this ResultRecordDetails.
     * 
     * @param accountGroupID
     */
    public void setAccountGroupID(java.lang.String accountGroupID) {
        this.accountGroupID = accountGroupID;
    }


    /**
     * Gets the accountOtherData value for this ResultRecordDetails.
     * 
     * @return accountOtherData
     */
    public java.lang.String getAccountOtherData() {
        return accountOtherData;
    }


    /**
     * Sets the accountOtherData value for this ResultRecordDetails.
     * 
     * @param accountOtherData
     */
    public void setAccountOtherData(java.lang.String accountOtherData) {
        this.accountOtherData = accountOtherData;
    }


    /**
     * Gets the accountProviderID value for this ResultRecordDetails.
     * 
     * @return accountProviderID
     */
    public java.lang.String getAccountProviderID() {
        return accountProviderID;
    }


    /**
     * Sets the accountProviderID value for this ResultRecordDetails.
     * 
     * @param accountProviderID
     */
    public void setAccountProviderID(java.lang.String accountProviderID) {
        this.accountProviderID = accountProviderID;
    }


    /**
     * Gets the accountType value for this ResultRecordDetails.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this ResultRecordDetails.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the addedToAcceptList value for this ResultRecordDetails.
     * 
     * @return addedToAcceptList
     */
    public java.lang.Boolean getAddedToAcceptList() {
        return addedToAcceptList;
    }


    /**
     * Sets the addedToAcceptList value for this ResultRecordDetails.
     * 
     * @param addedToAcceptList
     */
    public void setAddedToAcceptList(java.lang.Boolean addedToAcceptList) {
        this.addedToAcceptList = addedToAcceptList;
    }


    /**
     * Gets the additionalInfo value for this ResultRecordDetails.
     * 
     * @return additionalInfo
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this ResultRecordDetails.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the addresses value for this ResultRecordDetails.
     * 
     * @return addresses
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAddress[] getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this ResultRecordDetails.
     * 
     * @param addresses
     */
    public void setAddresses(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAddress[] addresses) {
        this.addresses = addresses;
    }


    /**
     * Gets the customWatchlistIDs value for this ResultRecordDetails.
     * 
     * @return customWatchlistIDs
     */
    public int[] getCustomWatchlistIDs() {
        return customWatchlistIDs;
    }


    /**
     * Sets the customWatchlistIDs value for this ResultRecordDetails.
     * 
     * @param customWatchlistIDs
     */
    public void setCustomWatchlistIDs(int[] customWatchlistIDs) {
        this.customWatchlistIDs = customWatchlistIDs;
    }


    /**
     * Gets the division value for this ResultRecordDetails.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this ResultRecordDetails.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the DPPA value for this ResultRecordDetails.
     * 
     * @return DPPA
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType getDPPA() {
        return DPPA;
    }


    /**
     * Sets the DPPA value for this ResultRecordDetails.
     * 
     * @param DPPA
     */
    public void setDPPA(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType DPPA) {
        this.DPPA = DPPA;
    }


    /**
     * Gets the EFTContext value for this ResultRecordDetails.
     * 
     * @return EFTContext
     */
    public java.lang.String getEFTContext() {
        return EFTContext;
    }


    /**
     * Sets the EFTContext value for this ResultRecordDetails.
     * 
     * @param EFTContext
     */
    public void setEFTContext(java.lang.String EFTContext) {
        this.EFTContext = EFTContext;
    }


    /**
     * Gets the EFTType value for this ResultRecordDetails.
     * 
     * @return EFTType
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType getEFTType() {
        return EFTType;
    }


    /**
     * Sets the EFTType value for this ResultRecordDetails.
     * 
     * @param EFTType
     */
    public void setEFTType(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType EFTType) {
        this.EFTType = EFTType;
    }


    /**
     * Gets the entityType value for this ResultRecordDetails.
     * 
     * @return entityType
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this ResultRecordDetails.
     * 
     * @param entityType
     */
    public void setEntityType(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the error value for this ResultRecordDetails.
     * 
     * @return error
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError getError() {
        return error;
    }


    /**
     * Sets the error value for this ResultRecordDetails.
     * 
     * @param error
     */
    public void setError(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError error) {
        this.error = error;
    }


    /**
     * Gets the gender value for this ResultRecordDetails.
     * 
     * @return gender
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.GenderType getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this ResultRecordDetails.
     * 
     * @param gender
     */
    public void setGender(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.GenderType gender) {
        this.gender = gender;
    }


    /**
     * Gets the GLB value for this ResultRecordDetails.
     * 
     * @return GLB
     */
    public java.lang.Integer getGLB() {
        return GLB;
    }


    /**
     * Sets the GLB value for this ResultRecordDetails.
     * 
     * @param GLB
     */
    public void setGLB(java.lang.Integer GLB) {
        this.GLB = GLB;
    }


    /**
     * Gets the IDs value for this ResultRecordDetails.
     * 
     * @return IDs
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputID[] getIDs() {
        return IDs;
    }


    /**
     * Sets the IDs value for this ResultRecordDetails.
     * 
     * @param IDs
     */
    public void setIDs(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputID[] IDs) {
        this.IDs = IDs;
    }


    /**
     * Gets the lastUpdatedDate value for this ResultRecordDetails.
     * 
     * @return lastUpdatedDate
     */
    public java.util.Calendar getLastUpdatedDate() {
        return lastUpdatedDate;
    }


    /**
     * Sets the lastUpdatedDate value for this ResultRecordDetails.
     * 
     * @param lastUpdatedDate
     */
    public void setLastUpdatedDate(java.util.Calendar lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }


    /**
     * Gets the name value for this ResultRecordDetails.
     * 
     * @return name
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputName getName() {
        return name;
    }


    /**
     * Sets the name value for this ResultRecordDetails.
     * 
     * @param name
     */
    public void setName(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputName name) {
        this.name = name;
    }


    /**
     * Gets the parsedACH value for this ResultRecordDetails.
     * 
     * @return parsedACH
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACH getParsedACH() {
        return parsedACH;
    }


    /**
     * Sets the parsedACH value for this ResultRecordDetails.
     * 
     * @param parsedACH
     */
    public void setParsedACH(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACH parsedACH) {
        this.parsedACH = parsedACH;
    }


    /**
     * Gets the parsedFedwire value for this ResultRecordDetails.
     * 
     * @return parsedFedwire
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwire getParsedFedwire() {
        return parsedFedwire;
    }


    /**
     * Sets the parsedFedwire value for this ResultRecordDetails.
     * 
     * @param parsedFedwire
     */
    public void setParsedFedwire(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwire parsedFedwire) {
        this.parsedFedwire = parsedFedwire;
    }


    /**
     * Gets the parsedISO20022 value for this ResultRecordDetails.
     * 
     * @return parsedISO20022
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022 getParsedISO20022() {
        return parsedISO20022;
    }


    /**
     * Sets the parsedISO20022 value for this ResultRecordDetails.
     * 
     * @param parsedISO20022
     */
    public void setParsedISO20022(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022 parsedISO20022) {
        this.parsedISO20022 = parsedISO20022;
    }


    /**
     * Gets the parsedSWIFT value for this ResultRecordDetails.
     * 
     * @return parsedSWIFT
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFT getParsedSWIFT() {
        return parsedSWIFT;
    }


    /**
     * Sets the parsedSWIFT value for this ResultRecordDetails.
     * 
     * @param parsedSWIFT
     */
    public void setParsedSWIFT(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFT parsedSWIFT) {
        this.parsedSWIFT = parsedSWIFT;
    }


    /**
     * Gets the phones value for this ResultRecordDetails.
     * 
     * @return phones
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputPhone[] getPhones() {
        return phones;
    }


    /**
     * Sets the phones value for this ResultRecordDetails.
     * 
     * @param phones
     */
    public void setPhones(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputPhone[] phones) {
        this.phones = phones;
    }


    /**
     * Gets the recordState value for this ResultRecordDetails.
     * 
     * @return recordState
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.RecordState getRecordState() {
        return recordState;
    }


    /**
     * Sets the recordState value for this ResultRecordDetails.
     * 
     * @param recordState
     */
    public void setRecordState(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.RecordState recordState) {
        this.recordState = recordState;
    }


    /**
     * Gets the searchDate value for this ResultRecordDetails.
     * 
     * @return searchDate
     */
    public java.util.Calendar getSearchDate() {
        return searchDate;
    }


    /**
     * Sets the searchDate value for this ResultRecordDetails.
     * 
     * @param searchDate
     */
    public void setSearchDate(java.util.Calendar searchDate) {
        this.searchDate = searchDate;
    }


    /**
     * Gets the text value for this ResultRecordDetails.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this ResultRecordDetails.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultRecordDetails)) return false;
        ResultRecordDetails other = (ResultRecordDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acceptListID==null && other.getAcceptListID()==null) || 
             (this.acceptListID!=null &&
              this.acceptListID.equals(other.getAcceptListID()))) &&
            ((this.accountAmount==null && other.getAccountAmount()==null) || 
             (this.accountAmount!=null &&
              this.accountAmount.equals(other.getAccountAmount()))) &&
            ((this.accountDate==null && other.getAccountDate()==null) || 
             (this.accountDate!=null &&
              this.accountDate.equals(other.getAccountDate()))) &&
            ((this.accountGroupID==null && other.getAccountGroupID()==null) || 
             (this.accountGroupID!=null &&
              this.accountGroupID.equals(other.getAccountGroupID()))) &&
            ((this.accountOtherData==null && other.getAccountOtherData()==null) || 
             (this.accountOtherData!=null &&
              this.accountOtherData.equals(other.getAccountOtherData()))) &&
            ((this.accountProviderID==null && other.getAccountProviderID()==null) || 
             (this.accountProviderID!=null &&
              this.accountProviderID.equals(other.getAccountProviderID()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.addedToAcceptList==null && other.getAddedToAcceptList()==null) || 
             (this.addedToAcceptList!=null &&
              this.addedToAcceptList.equals(other.getAddedToAcceptList()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              java.util.Arrays.equals(this.additionalInfo, other.getAdditionalInfo()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              java.util.Arrays.equals(this.addresses, other.getAddresses()))) &&
            ((this.customWatchlistIDs==null && other.getCustomWatchlistIDs()==null) || 
             (this.customWatchlistIDs!=null &&
              java.util.Arrays.equals(this.customWatchlistIDs, other.getCustomWatchlistIDs()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.DPPA==null && other.getDPPA()==null) || 
             (this.DPPA!=null &&
              this.DPPA.equals(other.getDPPA()))) &&
            ((this.EFTContext==null && other.getEFTContext()==null) || 
             (this.EFTContext!=null &&
              this.EFTContext.equals(other.getEFTContext()))) &&
            ((this.EFTType==null && other.getEFTType()==null) || 
             (this.EFTType!=null &&
              this.EFTType.equals(other.getEFTType()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.GLB==null && other.getGLB()==null) || 
             (this.GLB!=null &&
              this.GLB.equals(other.getGLB()))) &&
            ((this.IDs==null && other.getIDs()==null) || 
             (this.IDs!=null &&
              java.util.Arrays.equals(this.IDs, other.getIDs()))) &&
            ((this.lastUpdatedDate==null && other.getLastUpdatedDate()==null) || 
             (this.lastUpdatedDate!=null &&
              this.lastUpdatedDate.equals(other.getLastUpdatedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parsedACH==null && other.getParsedACH()==null) || 
             (this.parsedACH!=null &&
              this.parsedACH.equals(other.getParsedACH()))) &&
            ((this.parsedFedwire==null && other.getParsedFedwire()==null) || 
             (this.parsedFedwire!=null &&
              this.parsedFedwire.equals(other.getParsedFedwire()))) &&
            ((this.parsedISO20022==null && other.getParsedISO20022()==null) || 
             (this.parsedISO20022!=null &&
              this.parsedISO20022.equals(other.getParsedISO20022()))) &&
            ((this.parsedSWIFT==null && other.getParsedSWIFT()==null) || 
             (this.parsedSWIFT!=null &&
              this.parsedSWIFT.equals(other.getParsedSWIFT()))) &&
            ((this.phones==null && other.getPhones()==null) || 
             (this.phones!=null &&
              java.util.Arrays.equals(this.phones, other.getPhones()))) &&
            ((this.recordState==null && other.getRecordState()==null) || 
             (this.recordState!=null &&
              this.recordState.equals(other.getRecordState()))) &&
            ((this.searchDate==null && other.getSearchDate()==null) || 
             (this.searchDate!=null &&
              this.searchDate.equals(other.getSearchDate()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText())));
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
        if (getAcceptListID() != null) {
            _hashCode += getAcceptListID().hashCode();
        }
        if (getAccountAmount() != null) {
            _hashCode += getAccountAmount().hashCode();
        }
        if (getAccountDate() != null) {
            _hashCode += getAccountDate().hashCode();
        }
        if (getAccountGroupID() != null) {
            _hashCode += getAccountGroupID().hashCode();
        }
        if (getAccountOtherData() != null) {
            _hashCode += getAccountOtherData().hashCode();
        }
        if (getAccountProviderID() != null) {
            _hashCode += getAccountProviderID().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAddedToAcceptList() != null) {
            _hashCode += getAddedToAcceptList().hashCode();
        }
        if (getAdditionalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomWatchlistIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomWatchlistIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomWatchlistIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getDPPA() != null) {
            _hashCode += getDPPA().hashCode();
        }
        if (getEFTContext() != null) {
            _hashCode += getEFTContext().hashCode();
        }
        if (getEFTType() != null) {
            _hashCode += getEFTType().hashCode();
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getGLB() != null) {
            _hashCode += getGLB().hashCode();
        }
        if (getIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastUpdatedDate() != null) {
            _hashCode += getLastUpdatedDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParsedACH() != null) {
            _hashCode += getParsedACH().hashCode();
        }
        if (getParsedFedwire() != null) {
            _hashCode += getParsedFedwire().hashCode();
        }
        if (getParsedISO20022() != null) {
            _hashCode += getParsedISO20022().hashCode();
        }
        if (getParsedSWIFT() != null) {
            _hashCode += getParsedSWIFT().hashCode();
        }
        if (getPhones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordState() != null) {
            _hashCode += getRecordState().hashCode();
        }
        if (getSearchDate() != null) {
            _hashCode += getSearchDate().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultRecordDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultRecordDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptListID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AcceptListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AccountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AccountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AccountGroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountOtherData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AccountOtherData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountProviderID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AccountProviderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addedToAcceptList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AddedToAcceptList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputAdditionalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputAdditionalInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputAddress"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customWatchlistIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CustomWatchlistIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPPA");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DPPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DPPAChoiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EFTContext");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EFTContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EFTType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EFTType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EFTType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultEntityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "GenderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLB");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "GLB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputID"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "LastUpdatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parsedACH");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACH"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACH"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parsedFedwire");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwire"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwire"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parsedISO20022");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parsedSWIFT");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFT"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phones");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Phones"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputPhone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputPhone"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RecordState"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RecordState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SearchDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Text"));
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
