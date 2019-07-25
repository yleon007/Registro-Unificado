/**
 * InstantIDIndividualResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class InstantIDIndividualResults  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAddressHistory[] addressHistory;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAlternateName[] alternateNames;

    private java.lang.Integer comprehensiveVerificationIndex;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] errors;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput input;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator nameAddressPhone;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator nameAddressSSN;

    private java.lang.String phoneOfNameAddress;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] potentialFollowupActions;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRedFlag[] redFlags;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDReversePhone reversePhone;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] riskIndicators;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDSSNInfo SSNInfo;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput verifiedInput;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist watchlist;

    public InstantIDIndividualResults() {
    }

    public InstantIDIndividualResults(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAddressHistory[] addressHistory,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAlternateName[] alternateNames,
           java.lang.Integer comprehensiveVerificationIndex,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] errors,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput input,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator nameAddressPhone,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator nameAddressSSN,
           java.lang.String phoneOfNameAddress,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] potentialFollowupActions,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRedFlag[] redFlags,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDReversePhone reversePhone,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] riskIndicators,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDSSNInfo SSNInfo,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput verifiedInput,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist watchlist) {
           this.addressHistory = addressHistory;
           this.alternateNames = alternateNames;
           this.comprehensiveVerificationIndex = comprehensiveVerificationIndex;
           this.errors = errors;
           this.input = input;
           this.nameAddressPhone = nameAddressPhone;
           this.nameAddressSSN = nameAddressSSN;
           this.phoneOfNameAddress = phoneOfNameAddress;
           this.potentialFollowupActions = potentialFollowupActions;
           this.redFlags = redFlags;
           this.reversePhone = reversePhone;
           this.riskIndicators = riskIndicators;
           this.SSNInfo = SSNInfo;
           this.verifiedInput = verifiedInput;
           this.watchlist = watchlist;
    }


    /**
     * Gets the addressHistory value for this InstantIDIndividualResults.
     * 
     * @return addressHistory
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAddressHistory[] getAddressHistory() {
        return addressHistory;
    }


    /**
     * Sets the addressHistory value for this InstantIDIndividualResults.
     * 
     * @param addressHistory
     */
    public void setAddressHistory(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAddressHistory[] addressHistory) {
        this.addressHistory = addressHistory;
    }


    /**
     * Gets the alternateNames value for this InstantIDIndividualResults.
     * 
     * @return alternateNames
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAlternateName[] getAlternateNames() {
        return alternateNames;
    }


    /**
     * Sets the alternateNames value for this InstantIDIndividualResults.
     * 
     * @param alternateNames
     */
    public void setAlternateNames(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAlternateName[] alternateNames) {
        this.alternateNames = alternateNames;
    }


    /**
     * Gets the comprehensiveVerificationIndex value for this InstantIDIndividualResults.
     * 
     * @return comprehensiveVerificationIndex
     */
    public java.lang.Integer getComprehensiveVerificationIndex() {
        return comprehensiveVerificationIndex;
    }


    /**
     * Sets the comprehensiveVerificationIndex value for this InstantIDIndividualResults.
     * 
     * @param comprehensiveVerificationIndex
     */
    public void setComprehensiveVerificationIndex(java.lang.Integer comprehensiveVerificationIndex) {
        this.comprehensiveVerificationIndex = comprehensiveVerificationIndex;
    }


    /**
     * Gets the errors value for this InstantIDIndividualResults.
     * 
     * @return errors
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this InstantIDIndividualResults.
     * 
     * @param errors
     */
    public void setErrors(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the input value for this InstantIDIndividualResults.
     * 
     * @return input
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput getInput() {
        return input;
    }


    /**
     * Sets the input value for this InstantIDIndividualResults.
     * 
     * @param input
     */
    public void setInput(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput input) {
        this.input = input;
    }


    /**
     * Gets the nameAddressPhone value for this InstantIDIndividualResults.
     * 
     * @return nameAddressPhone
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator getNameAddressPhone() {
        return nameAddressPhone;
    }


    /**
     * Sets the nameAddressPhone value for this InstantIDIndividualResults.
     * 
     * @param nameAddressPhone
     */
    public void setNameAddressPhone(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator nameAddressPhone) {
        this.nameAddressPhone = nameAddressPhone;
    }


    /**
     * Gets the nameAddressSSN value for this InstantIDIndividualResults.
     * 
     * @return nameAddressSSN
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator getNameAddressSSN() {
        return nameAddressSSN;
    }


    /**
     * Sets the nameAddressSSN value for this InstantIDIndividualResults.
     * 
     * @param nameAddressSSN
     */
    public void setNameAddressSSN(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator nameAddressSSN) {
        this.nameAddressSSN = nameAddressSSN;
    }


    /**
     * Gets the phoneOfNameAddress value for this InstantIDIndividualResults.
     * 
     * @return phoneOfNameAddress
     */
    public java.lang.String getPhoneOfNameAddress() {
        return phoneOfNameAddress;
    }


    /**
     * Sets the phoneOfNameAddress value for this InstantIDIndividualResults.
     * 
     * @param phoneOfNameAddress
     */
    public void setPhoneOfNameAddress(java.lang.String phoneOfNameAddress) {
        this.phoneOfNameAddress = phoneOfNameAddress;
    }


    /**
     * Gets the potentialFollowupActions value for this InstantIDIndividualResults.
     * 
     * @return potentialFollowupActions
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] getPotentialFollowupActions() {
        return potentialFollowupActions;
    }


    /**
     * Sets the potentialFollowupActions value for this InstantIDIndividualResults.
     * 
     * @param potentialFollowupActions
     */
    public void setPotentialFollowupActions(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] potentialFollowupActions) {
        this.potentialFollowupActions = potentialFollowupActions;
    }


    /**
     * Gets the redFlags value for this InstantIDIndividualResults.
     * 
     * @return redFlags
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRedFlag[] getRedFlags() {
        return redFlags;
    }


    /**
     * Sets the redFlags value for this InstantIDIndividualResults.
     * 
     * @param redFlags
     */
    public void setRedFlags(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRedFlag[] redFlags) {
        this.redFlags = redFlags;
    }


    /**
     * Gets the reversePhone value for this InstantIDIndividualResults.
     * 
     * @return reversePhone
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDReversePhone getReversePhone() {
        return reversePhone;
    }


    /**
     * Sets the reversePhone value for this InstantIDIndividualResults.
     * 
     * @param reversePhone
     */
    public void setReversePhone(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDReversePhone reversePhone) {
        this.reversePhone = reversePhone;
    }


    /**
     * Gets the riskIndicators value for this InstantIDIndividualResults.
     * 
     * @return riskIndicators
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] getRiskIndicators() {
        return riskIndicators;
    }


    /**
     * Sets the riskIndicators value for this InstantIDIndividualResults.
     * 
     * @param riskIndicators
     */
    public void setRiskIndicators(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] riskIndicators) {
        this.riskIndicators = riskIndicators;
    }


    /**
     * Gets the SSNInfo value for this InstantIDIndividualResults.
     * 
     * @return SSNInfo
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDSSNInfo getSSNInfo() {
        return SSNInfo;
    }


    /**
     * Sets the SSNInfo value for this InstantIDIndividualResults.
     * 
     * @param SSNInfo
     */
    public void setSSNInfo(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDSSNInfo SSNInfo) {
        this.SSNInfo = SSNInfo;
    }


    /**
     * Gets the verifiedInput value for this InstantIDIndividualResults.
     * 
     * @return verifiedInput
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput getVerifiedInput() {
        return verifiedInput;
    }


    /**
     * Sets the verifiedInput value for this InstantIDIndividualResults.
     * 
     * @param verifiedInput
     */
    public void setVerifiedInput(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput verifiedInput) {
        this.verifiedInput = verifiedInput;
    }


    /**
     * Gets the watchlist value for this InstantIDIndividualResults.
     * 
     * @return watchlist
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist getWatchlist() {
        return watchlist;
    }


    /**
     * Sets the watchlist value for this InstantIDIndividualResults.
     * 
     * @param watchlist
     */
    public void setWatchlist(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist watchlist) {
        this.watchlist = watchlist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstantIDIndividualResults)) return false;
        InstantIDIndividualResults other = (InstantIDIndividualResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressHistory==null && other.getAddressHistory()==null) || 
             (this.addressHistory!=null &&
              java.util.Arrays.equals(this.addressHistory, other.getAddressHistory()))) &&
            ((this.alternateNames==null && other.getAlternateNames()==null) || 
             (this.alternateNames!=null &&
              java.util.Arrays.equals(this.alternateNames, other.getAlternateNames()))) &&
            ((this.comprehensiveVerificationIndex==null && other.getComprehensiveVerificationIndex()==null) || 
             (this.comprehensiveVerificationIndex!=null &&
              this.comprehensiveVerificationIndex.equals(other.getComprehensiveVerificationIndex()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              this.input.equals(other.getInput()))) &&
            ((this.nameAddressPhone==null && other.getNameAddressPhone()==null) || 
             (this.nameAddressPhone!=null &&
              this.nameAddressPhone.equals(other.getNameAddressPhone()))) &&
            ((this.nameAddressSSN==null && other.getNameAddressSSN()==null) || 
             (this.nameAddressSSN!=null &&
              this.nameAddressSSN.equals(other.getNameAddressSSN()))) &&
            ((this.phoneOfNameAddress==null && other.getPhoneOfNameAddress()==null) || 
             (this.phoneOfNameAddress!=null &&
              this.phoneOfNameAddress.equals(other.getPhoneOfNameAddress()))) &&
            ((this.potentialFollowupActions==null && other.getPotentialFollowupActions()==null) || 
             (this.potentialFollowupActions!=null &&
              java.util.Arrays.equals(this.potentialFollowupActions, other.getPotentialFollowupActions()))) &&
            ((this.redFlags==null && other.getRedFlags()==null) || 
             (this.redFlags!=null &&
              java.util.Arrays.equals(this.redFlags, other.getRedFlags()))) &&
            ((this.reversePhone==null && other.getReversePhone()==null) || 
             (this.reversePhone!=null &&
              this.reversePhone.equals(other.getReversePhone()))) &&
            ((this.riskIndicators==null && other.getRiskIndicators()==null) || 
             (this.riskIndicators!=null &&
              java.util.Arrays.equals(this.riskIndicators, other.getRiskIndicators()))) &&
            ((this.SSNInfo==null && other.getSSNInfo()==null) || 
             (this.SSNInfo!=null &&
              this.SSNInfo.equals(other.getSSNInfo()))) &&
            ((this.verifiedInput==null && other.getVerifiedInput()==null) || 
             (this.verifiedInput!=null &&
              this.verifiedInput.equals(other.getVerifiedInput()))) &&
            ((this.watchlist==null && other.getWatchlist()==null) || 
             (this.watchlist!=null &&
              this.watchlist.equals(other.getWatchlist())));
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
        if (getAddressHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressHistory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlternateNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComprehensiveVerificationIndex() != null) {
            _hashCode += getComprehensiveVerificationIndex().hashCode();
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
        if (getNameAddressPhone() != null) {
            _hashCode += getNameAddressPhone().hashCode();
        }
        if (getNameAddressSSN() != null) {
            _hashCode += getNameAddressSSN().hashCode();
        }
        if (getPhoneOfNameAddress() != null) {
            _hashCode += getPhoneOfNameAddress().hashCode();
        }
        if (getPotentialFollowupActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPotentialFollowupActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPotentialFollowupActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getReversePhone() != null) {
            _hashCode += getReversePhone().hashCode();
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
        if (getSSNInfo() != null) {
            _hashCode += getSSNInfo().hashCode();
        }
        if (getVerifiedInput() != null) {
            _hashCode += getVerifiedInput().hashCode();
        }
        if (getWatchlist() != null) {
            _hashCode += getWatchlist().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstantIDIndividualResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDIndividualResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AddressHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDAddressHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDAddressHistory"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateNames");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AlternateNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDAlternateName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDAlternateName"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comprehensiveVerificationIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ComprehensiveVerificationIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameAddressPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "NameAddressPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRiskIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameAddressSSN");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "NameAddressSSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRiskIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneOfNameAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PhoneOfNameAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potentialFollowupActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PotentialFollowupActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRiskIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRiskIndicator"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RedFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRedFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRedFlag"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ReversePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDReversePhone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RiskIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRiskIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRiskIndicator"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSNInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SSNInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDSSNInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifiedInput");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "VerifiedInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("watchlist");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Watchlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDWatchlist"));
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
