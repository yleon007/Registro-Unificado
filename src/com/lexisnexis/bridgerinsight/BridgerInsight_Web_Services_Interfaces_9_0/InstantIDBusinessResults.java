/**
 * InstantIDBusinessResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class InstantIDBusinessResults  implements java.io.Serializable {
    private java.lang.Integer bankruptcyFilingsCount;

    private java.lang.Integer comprehensiveVerificationIndex;

    private java.lang.String correctedCompanyName;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] errors;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFEINMatch[] FEINMatches;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput input;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFiling mostRecentBankrupctyFiling;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFiling mostRecentJudgmentLienFiling;

    private java.lang.Integer nameAddressFEINIndicator;

    private java.lang.Integer nameAddressPhoneIndicator;

    private java.lang.Integer nameAddressSSNIndicator;

    private java.lang.String phoneOfNameAddress;

    private java.lang.String phoneType;

    private java.lang.Integer releasedJudgmentLienCount;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDReversePhone reversePhone;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] riskIndicators;

    private java.lang.Integer unreleasedJudgmentLienCount;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDVerificationIndicators verificationIndicators;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput verifiedInput;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist watchlist;

    public InstantIDBusinessResults() {
    }

    public InstantIDBusinessResults(
           java.lang.Integer bankruptcyFilingsCount,
           java.lang.Integer comprehensiveVerificationIndex,
           java.lang.String correctedCompanyName,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] errors,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFEINMatch[] FEINMatches,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput input,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFiling mostRecentBankrupctyFiling,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFiling mostRecentJudgmentLienFiling,
           java.lang.Integer nameAddressFEINIndicator,
           java.lang.Integer nameAddressPhoneIndicator,
           java.lang.Integer nameAddressSSNIndicator,
           java.lang.String phoneOfNameAddress,
           java.lang.String phoneType,
           java.lang.Integer releasedJudgmentLienCount,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDReversePhone reversePhone,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] riskIndicators,
           java.lang.Integer unreleasedJudgmentLienCount,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDVerificationIndicators verificationIndicators,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput verifiedInput,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist watchlist) {
           this.bankruptcyFilingsCount = bankruptcyFilingsCount;
           this.comprehensiveVerificationIndex = comprehensiveVerificationIndex;
           this.correctedCompanyName = correctedCompanyName;
           this.errors = errors;
           this.FEINMatches = FEINMatches;
           this.input = input;
           this.mostRecentBankrupctyFiling = mostRecentBankrupctyFiling;
           this.mostRecentJudgmentLienFiling = mostRecentJudgmentLienFiling;
           this.nameAddressFEINIndicator = nameAddressFEINIndicator;
           this.nameAddressPhoneIndicator = nameAddressPhoneIndicator;
           this.nameAddressSSNIndicator = nameAddressSSNIndicator;
           this.phoneOfNameAddress = phoneOfNameAddress;
           this.phoneType = phoneType;
           this.releasedJudgmentLienCount = releasedJudgmentLienCount;
           this.reversePhone = reversePhone;
           this.riskIndicators = riskIndicators;
           this.unreleasedJudgmentLienCount = unreleasedJudgmentLienCount;
           this.verificationIndicators = verificationIndicators;
           this.verifiedInput = verifiedInput;
           this.watchlist = watchlist;
    }


    /**
     * Gets the bankruptcyFilingsCount value for this InstantIDBusinessResults.
     * 
     * @return bankruptcyFilingsCount
     */
    public java.lang.Integer getBankruptcyFilingsCount() {
        return bankruptcyFilingsCount;
    }


    /**
     * Sets the bankruptcyFilingsCount value for this InstantIDBusinessResults.
     * 
     * @param bankruptcyFilingsCount
     */
    public void setBankruptcyFilingsCount(java.lang.Integer bankruptcyFilingsCount) {
        this.bankruptcyFilingsCount = bankruptcyFilingsCount;
    }


    /**
     * Gets the comprehensiveVerificationIndex value for this InstantIDBusinessResults.
     * 
     * @return comprehensiveVerificationIndex
     */
    public java.lang.Integer getComprehensiveVerificationIndex() {
        return comprehensiveVerificationIndex;
    }


    /**
     * Sets the comprehensiveVerificationIndex value for this InstantIDBusinessResults.
     * 
     * @param comprehensiveVerificationIndex
     */
    public void setComprehensiveVerificationIndex(java.lang.Integer comprehensiveVerificationIndex) {
        this.comprehensiveVerificationIndex = comprehensiveVerificationIndex;
    }


    /**
     * Gets the correctedCompanyName value for this InstantIDBusinessResults.
     * 
     * @return correctedCompanyName
     */
    public java.lang.String getCorrectedCompanyName() {
        return correctedCompanyName;
    }


    /**
     * Sets the correctedCompanyName value for this InstantIDBusinessResults.
     * 
     * @param correctedCompanyName
     */
    public void setCorrectedCompanyName(java.lang.String correctedCompanyName) {
        this.correctedCompanyName = correctedCompanyName;
    }


    /**
     * Gets the errors value for this InstantIDBusinessResults.
     * 
     * @return errors
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this InstantIDBusinessResults.
     * 
     * @param errors
     */
    public void setErrors(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the FEINMatches value for this InstantIDBusinessResults.
     * 
     * @return FEINMatches
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFEINMatch[] getFEINMatches() {
        return FEINMatches;
    }


    /**
     * Sets the FEINMatches value for this InstantIDBusinessResults.
     * 
     * @param FEINMatches
     */
    public void setFEINMatches(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFEINMatch[] FEINMatches) {
        this.FEINMatches = FEINMatches;
    }


    /**
     * Gets the input value for this InstantIDBusinessResults.
     * 
     * @return input
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput getInput() {
        return input;
    }


    /**
     * Sets the input value for this InstantIDBusinessResults.
     * 
     * @param input
     */
    public void setInput(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput input) {
        this.input = input;
    }


    /**
     * Gets the mostRecentBankrupctyFiling value for this InstantIDBusinessResults.
     * 
     * @return mostRecentBankrupctyFiling
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFiling getMostRecentBankrupctyFiling() {
        return mostRecentBankrupctyFiling;
    }


    /**
     * Sets the mostRecentBankrupctyFiling value for this InstantIDBusinessResults.
     * 
     * @param mostRecentBankrupctyFiling
     */
    public void setMostRecentBankrupctyFiling(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFiling mostRecentBankrupctyFiling) {
        this.mostRecentBankrupctyFiling = mostRecentBankrupctyFiling;
    }


    /**
     * Gets the mostRecentJudgmentLienFiling value for this InstantIDBusinessResults.
     * 
     * @return mostRecentJudgmentLienFiling
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFiling getMostRecentJudgmentLienFiling() {
        return mostRecentJudgmentLienFiling;
    }


    /**
     * Sets the mostRecentJudgmentLienFiling value for this InstantIDBusinessResults.
     * 
     * @param mostRecentJudgmentLienFiling
     */
    public void setMostRecentJudgmentLienFiling(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFiling mostRecentJudgmentLienFiling) {
        this.mostRecentJudgmentLienFiling = mostRecentJudgmentLienFiling;
    }


    /**
     * Gets the nameAddressFEINIndicator value for this InstantIDBusinessResults.
     * 
     * @return nameAddressFEINIndicator
     */
    public java.lang.Integer getNameAddressFEINIndicator() {
        return nameAddressFEINIndicator;
    }


    /**
     * Sets the nameAddressFEINIndicator value for this InstantIDBusinessResults.
     * 
     * @param nameAddressFEINIndicator
     */
    public void setNameAddressFEINIndicator(java.lang.Integer nameAddressFEINIndicator) {
        this.nameAddressFEINIndicator = nameAddressFEINIndicator;
    }


    /**
     * Gets the nameAddressPhoneIndicator value for this InstantIDBusinessResults.
     * 
     * @return nameAddressPhoneIndicator
     */
    public java.lang.Integer getNameAddressPhoneIndicator() {
        return nameAddressPhoneIndicator;
    }


    /**
     * Sets the nameAddressPhoneIndicator value for this InstantIDBusinessResults.
     * 
     * @param nameAddressPhoneIndicator
     */
    public void setNameAddressPhoneIndicator(java.lang.Integer nameAddressPhoneIndicator) {
        this.nameAddressPhoneIndicator = nameAddressPhoneIndicator;
    }


    /**
     * Gets the nameAddressSSNIndicator value for this InstantIDBusinessResults.
     * 
     * @return nameAddressSSNIndicator
     */
    public java.lang.Integer getNameAddressSSNIndicator() {
        return nameAddressSSNIndicator;
    }


    /**
     * Sets the nameAddressSSNIndicator value for this InstantIDBusinessResults.
     * 
     * @param nameAddressSSNIndicator
     */
    public void setNameAddressSSNIndicator(java.lang.Integer nameAddressSSNIndicator) {
        this.nameAddressSSNIndicator = nameAddressSSNIndicator;
    }


    /**
     * Gets the phoneOfNameAddress value for this InstantIDBusinessResults.
     * 
     * @return phoneOfNameAddress
     */
    public java.lang.String getPhoneOfNameAddress() {
        return phoneOfNameAddress;
    }


    /**
     * Sets the phoneOfNameAddress value for this InstantIDBusinessResults.
     * 
     * @param phoneOfNameAddress
     */
    public void setPhoneOfNameAddress(java.lang.String phoneOfNameAddress) {
        this.phoneOfNameAddress = phoneOfNameAddress;
    }


    /**
     * Gets the phoneType value for this InstantIDBusinessResults.
     * 
     * @return phoneType
     */
    public java.lang.String getPhoneType() {
        return phoneType;
    }


    /**
     * Sets the phoneType value for this InstantIDBusinessResults.
     * 
     * @param phoneType
     */
    public void setPhoneType(java.lang.String phoneType) {
        this.phoneType = phoneType;
    }


    /**
     * Gets the releasedJudgmentLienCount value for this InstantIDBusinessResults.
     * 
     * @return releasedJudgmentLienCount
     */
    public java.lang.Integer getReleasedJudgmentLienCount() {
        return releasedJudgmentLienCount;
    }


    /**
     * Sets the releasedJudgmentLienCount value for this InstantIDBusinessResults.
     * 
     * @param releasedJudgmentLienCount
     */
    public void setReleasedJudgmentLienCount(java.lang.Integer releasedJudgmentLienCount) {
        this.releasedJudgmentLienCount = releasedJudgmentLienCount;
    }


    /**
     * Gets the reversePhone value for this InstantIDBusinessResults.
     * 
     * @return reversePhone
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDReversePhone getReversePhone() {
        return reversePhone;
    }


    /**
     * Sets the reversePhone value for this InstantIDBusinessResults.
     * 
     * @param reversePhone
     */
    public void setReversePhone(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDReversePhone reversePhone) {
        this.reversePhone = reversePhone;
    }


    /**
     * Gets the riskIndicators value for this InstantIDBusinessResults.
     * 
     * @return riskIndicators
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] getRiskIndicators() {
        return riskIndicators;
    }


    /**
     * Sets the riskIndicators value for this InstantIDBusinessResults.
     * 
     * @param riskIndicators
     */
    public void setRiskIndicators(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[] riskIndicators) {
        this.riskIndicators = riskIndicators;
    }


    /**
     * Gets the unreleasedJudgmentLienCount value for this InstantIDBusinessResults.
     * 
     * @return unreleasedJudgmentLienCount
     */
    public java.lang.Integer getUnreleasedJudgmentLienCount() {
        return unreleasedJudgmentLienCount;
    }


    /**
     * Sets the unreleasedJudgmentLienCount value for this InstantIDBusinessResults.
     * 
     * @param unreleasedJudgmentLienCount
     */
    public void setUnreleasedJudgmentLienCount(java.lang.Integer unreleasedJudgmentLienCount) {
        this.unreleasedJudgmentLienCount = unreleasedJudgmentLienCount;
    }


    /**
     * Gets the verificationIndicators value for this InstantIDBusinessResults.
     * 
     * @return verificationIndicators
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDVerificationIndicators getVerificationIndicators() {
        return verificationIndicators;
    }


    /**
     * Sets the verificationIndicators value for this InstantIDBusinessResults.
     * 
     * @param verificationIndicators
     */
    public void setVerificationIndicators(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDVerificationIndicators verificationIndicators) {
        this.verificationIndicators = verificationIndicators;
    }


    /**
     * Gets the verifiedInput value for this InstantIDBusinessResults.
     * 
     * @return verifiedInput
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput getVerifiedInput() {
        return verifiedInput;
    }


    /**
     * Sets the verifiedInput value for this InstantIDBusinessResults.
     * 
     * @param verifiedInput
     */
    public void setVerifiedInput(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput verifiedInput) {
        this.verifiedInput = verifiedInput;
    }


    /**
     * Gets the watchlist value for this InstantIDBusinessResults.
     * 
     * @return watchlist
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist getWatchlist() {
        return watchlist;
    }


    /**
     * Sets the watchlist value for this InstantIDBusinessResults.
     * 
     * @param watchlist
     */
    public void setWatchlist(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist watchlist) {
        this.watchlist = watchlist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstantIDBusinessResults)) return false;
        InstantIDBusinessResults other = (InstantIDBusinessResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankruptcyFilingsCount==null && other.getBankruptcyFilingsCount()==null) || 
             (this.bankruptcyFilingsCount!=null &&
              this.bankruptcyFilingsCount.equals(other.getBankruptcyFilingsCount()))) &&
            ((this.comprehensiveVerificationIndex==null && other.getComprehensiveVerificationIndex()==null) || 
             (this.comprehensiveVerificationIndex!=null &&
              this.comprehensiveVerificationIndex.equals(other.getComprehensiveVerificationIndex()))) &&
            ((this.correctedCompanyName==null && other.getCorrectedCompanyName()==null) || 
             (this.correctedCompanyName!=null &&
              this.correctedCompanyName.equals(other.getCorrectedCompanyName()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.FEINMatches==null && other.getFEINMatches()==null) || 
             (this.FEINMatches!=null &&
              java.util.Arrays.equals(this.FEINMatches, other.getFEINMatches()))) &&
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              this.input.equals(other.getInput()))) &&
            ((this.mostRecentBankrupctyFiling==null && other.getMostRecentBankrupctyFiling()==null) || 
             (this.mostRecentBankrupctyFiling!=null &&
              this.mostRecentBankrupctyFiling.equals(other.getMostRecentBankrupctyFiling()))) &&
            ((this.mostRecentJudgmentLienFiling==null && other.getMostRecentJudgmentLienFiling()==null) || 
             (this.mostRecentJudgmentLienFiling!=null &&
              this.mostRecentJudgmentLienFiling.equals(other.getMostRecentJudgmentLienFiling()))) &&
            ((this.nameAddressFEINIndicator==null && other.getNameAddressFEINIndicator()==null) || 
             (this.nameAddressFEINIndicator!=null &&
              this.nameAddressFEINIndicator.equals(other.getNameAddressFEINIndicator()))) &&
            ((this.nameAddressPhoneIndicator==null && other.getNameAddressPhoneIndicator()==null) || 
             (this.nameAddressPhoneIndicator!=null &&
              this.nameAddressPhoneIndicator.equals(other.getNameAddressPhoneIndicator()))) &&
            ((this.nameAddressSSNIndicator==null && other.getNameAddressSSNIndicator()==null) || 
             (this.nameAddressSSNIndicator!=null &&
              this.nameAddressSSNIndicator.equals(other.getNameAddressSSNIndicator()))) &&
            ((this.phoneOfNameAddress==null && other.getPhoneOfNameAddress()==null) || 
             (this.phoneOfNameAddress!=null &&
              this.phoneOfNameAddress.equals(other.getPhoneOfNameAddress()))) &&
            ((this.phoneType==null && other.getPhoneType()==null) || 
             (this.phoneType!=null &&
              this.phoneType.equals(other.getPhoneType()))) &&
            ((this.releasedJudgmentLienCount==null && other.getReleasedJudgmentLienCount()==null) || 
             (this.releasedJudgmentLienCount!=null &&
              this.releasedJudgmentLienCount.equals(other.getReleasedJudgmentLienCount()))) &&
            ((this.reversePhone==null && other.getReversePhone()==null) || 
             (this.reversePhone!=null &&
              this.reversePhone.equals(other.getReversePhone()))) &&
            ((this.riskIndicators==null && other.getRiskIndicators()==null) || 
             (this.riskIndicators!=null &&
              java.util.Arrays.equals(this.riskIndicators, other.getRiskIndicators()))) &&
            ((this.unreleasedJudgmentLienCount==null && other.getUnreleasedJudgmentLienCount()==null) || 
             (this.unreleasedJudgmentLienCount!=null &&
              this.unreleasedJudgmentLienCount.equals(other.getUnreleasedJudgmentLienCount()))) &&
            ((this.verificationIndicators==null && other.getVerificationIndicators()==null) || 
             (this.verificationIndicators!=null &&
              this.verificationIndicators.equals(other.getVerificationIndicators()))) &&
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
        if (getBankruptcyFilingsCount() != null) {
            _hashCode += getBankruptcyFilingsCount().hashCode();
        }
        if (getComprehensiveVerificationIndex() != null) {
            _hashCode += getComprehensiveVerificationIndex().hashCode();
        }
        if (getCorrectedCompanyName() != null) {
            _hashCode += getCorrectedCompanyName().hashCode();
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
        if (getFEINMatches() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFEINMatches());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFEINMatches(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInput() != null) {
            _hashCode += getInput().hashCode();
        }
        if (getMostRecentBankrupctyFiling() != null) {
            _hashCode += getMostRecentBankrupctyFiling().hashCode();
        }
        if (getMostRecentJudgmentLienFiling() != null) {
            _hashCode += getMostRecentJudgmentLienFiling().hashCode();
        }
        if (getNameAddressFEINIndicator() != null) {
            _hashCode += getNameAddressFEINIndicator().hashCode();
        }
        if (getNameAddressPhoneIndicator() != null) {
            _hashCode += getNameAddressPhoneIndicator().hashCode();
        }
        if (getNameAddressSSNIndicator() != null) {
            _hashCode += getNameAddressSSNIndicator().hashCode();
        }
        if (getPhoneOfNameAddress() != null) {
            _hashCode += getPhoneOfNameAddress().hashCode();
        }
        if (getPhoneType() != null) {
            _hashCode += getPhoneType().hashCode();
        }
        if (getReleasedJudgmentLienCount() != null) {
            _hashCode += getReleasedJudgmentLienCount().hashCode();
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
        if (getUnreleasedJudgmentLienCount() != null) {
            _hashCode += getUnreleasedJudgmentLienCount().hashCode();
        }
        if (getVerificationIndicators() != null) {
            _hashCode += getVerificationIndicators().hashCode();
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
        new org.apache.axis.description.TypeDesc(InstantIDBusinessResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDBusinessResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankruptcyFilingsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "BankruptcyFilingsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comprehensiveVerificationIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ComprehensiveVerificationIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CorrectedCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("FEINMatches");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FEINMatches"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDFEINMatch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDFEINMatch"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Input"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mostRecentBankrupctyFiling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "MostRecentBankrupctyFiling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDFiling"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mostRecentJudgmentLienFiling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "MostRecentJudgmentLienFiling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDFiling"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameAddressFEINIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "NameAddressFEINIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameAddressPhoneIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "NameAddressPhoneIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameAddressSSNIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "NameAddressSSNIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("phoneType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PhoneType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releasedJudgmentLienCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ReleasedJudgmentLienCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("unreleasedJudgmentLienCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "UnreleasedJudgmentLienCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "VerificationIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDVerificationIndicators"));
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
