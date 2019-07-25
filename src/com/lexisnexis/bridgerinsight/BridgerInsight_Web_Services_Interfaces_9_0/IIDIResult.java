/**
 * IIDIResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class IIDIResult  implements java.io.Serializable {
    private java.lang.String complianceLevel;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDataSource[] dataSourceResults;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIInput inputEcho;

    private java.lang.String passportNumberValidated;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIRiskIndicator[] riskIndicators;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIVerificationIndex verificationIndex;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIVerificationResult[] verificationResults;

    private java.lang.String visaNumberValidated;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist watchlist;

    public IIDIResult() {
    }

    public IIDIResult(
           java.lang.String complianceLevel,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDataSource[] dataSourceResults,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIInput inputEcho,
           java.lang.String passportNumberValidated,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIRiskIndicator[] riskIndicators,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIVerificationIndex verificationIndex,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIVerificationResult[] verificationResults,
           java.lang.String visaNumberValidated,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist watchlist) {
           this.complianceLevel = complianceLevel;
           this.dataSourceResults = dataSourceResults;
           this.inputEcho = inputEcho;
           this.passportNumberValidated = passportNumberValidated;
           this.riskIndicators = riskIndicators;
           this.verificationIndex = verificationIndex;
           this.verificationResults = verificationResults;
           this.visaNumberValidated = visaNumberValidated;
           this.watchlist = watchlist;
    }


    /**
     * Gets the complianceLevel value for this IIDIResult.
     * 
     * @return complianceLevel
     */
    public java.lang.String getComplianceLevel() {
        return complianceLevel;
    }


    /**
     * Sets the complianceLevel value for this IIDIResult.
     * 
     * @param complianceLevel
     */
    public void setComplianceLevel(java.lang.String complianceLevel) {
        this.complianceLevel = complianceLevel;
    }


    /**
     * Gets the dataSourceResults value for this IIDIResult.
     * 
     * @return dataSourceResults
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDataSource[] getDataSourceResults() {
        return dataSourceResults;
    }


    /**
     * Sets the dataSourceResults value for this IIDIResult.
     * 
     * @param dataSourceResults
     */
    public void setDataSourceResults(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDataSource[] dataSourceResults) {
        this.dataSourceResults = dataSourceResults;
    }


    /**
     * Gets the inputEcho value for this IIDIResult.
     * 
     * @return inputEcho
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIInput getInputEcho() {
        return inputEcho;
    }


    /**
     * Sets the inputEcho value for this IIDIResult.
     * 
     * @param inputEcho
     */
    public void setInputEcho(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIInput inputEcho) {
        this.inputEcho = inputEcho;
    }


    /**
     * Gets the passportNumberValidated value for this IIDIResult.
     * 
     * @return passportNumberValidated
     */
    public java.lang.String getPassportNumberValidated() {
        return passportNumberValidated;
    }


    /**
     * Sets the passportNumberValidated value for this IIDIResult.
     * 
     * @param passportNumberValidated
     */
    public void setPassportNumberValidated(java.lang.String passportNumberValidated) {
        this.passportNumberValidated = passportNumberValidated;
    }


    /**
     * Gets the riskIndicators value for this IIDIResult.
     * 
     * @return riskIndicators
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIRiskIndicator[] getRiskIndicators() {
        return riskIndicators;
    }


    /**
     * Sets the riskIndicators value for this IIDIResult.
     * 
     * @param riskIndicators
     */
    public void setRiskIndicators(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIRiskIndicator[] riskIndicators) {
        this.riskIndicators = riskIndicators;
    }


    /**
     * Gets the verificationIndex value for this IIDIResult.
     * 
     * @return verificationIndex
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIVerificationIndex getVerificationIndex() {
        return verificationIndex;
    }


    /**
     * Sets the verificationIndex value for this IIDIResult.
     * 
     * @param verificationIndex
     */
    public void setVerificationIndex(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIVerificationIndex verificationIndex) {
        this.verificationIndex = verificationIndex;
    }


    /**
     * Gets the verificationResults value for this IIDIResult.
     * 
     * @return verificationResults
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIVerificationResult[] getVerificationResults() {
        return verificationResults;
    }


    /**
     * Sets the verificationResults value for this IIDIResult.
     * 
     * @param verificationResults
     */
    public void setVerificationResults(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIVerificationResult[] verificationResults) {
        this.verificationResults = verificationResults;
    }


    /**
     * Gets the visaNumberValidated value for this IIDIResult.
     * 
     * @return visaNumberValidated
     */
    public java.lang.String getVisaNumberValidated() {
        return visaNumberValidated;
    }


    /**
     * Sets the visaNumberValidated value for this IIDIResult.
     * 
     * @param visaNumberValidated
     */
    public void setVisaNumberValidated(java.lang.String visaNumberValidated) {
        this.visaNumberValidated = visaNumberValidated;
    }


    /**
     * Gets the watchlist value for this IIDIResult.
     * 
     * @return watchlist
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist getWatchlist() {
        return watchlist;
    }


    /**
     * Sets the watchlist value for this IIDIResult.
     * 
     * @param watchlist
     */
    public void setWatchlist(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist watchlist) {
        this.watchlist = watchlist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IIDIResult)) return false;
        IIDIResult other = (IIDIResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complianceLevel==null && other.getComplianceLevel()==null) || 
             (this.complianceLevel!=null &&
              this.complianceLevel.equals(other.getComplianceLevel()))) &&
            ((this.dataSourceResults==null && other.getDataSourceResults()==null) || 
             (this.dataSourceResults!=null &&
              java.util.Arrays.equals(this.dataSourceResults, other.getDataSourceResults()))) &&
            ((this.inputEcho==null && other.getInputEcho()==null) || 
             (this.inputEcho!=null &&
              this.inputEcho.equals(other.getInputEcho()))) &&
            ((this.passportNumberValidated==null && other.getPassportNumberValidated()==null) || 
             (this.passportNumberValidated!=null &&
              this.passportNumberValidated.equals(other.getPassportNumberValidated()))) &&
            ((this.riskIndicators==null && other.getRiskIndicators()==null) || 
             (this.riskIndicators!=null &&
              java.util.Arrays.equals(this.riskIndicators, other.getRiskIndicators()))) &&
            ((this.verificationIndex==null && other.getVerificationIndex()==null) || 
             (this.verificationIndex!=null &&
              this.verificationIndex.equals(other.getVerificationIndex()))) &&
            ((this.verificationResults==null && other.getVerificationResults()==null) || 
             (this.verificationResults!=null &&
              java.util.Arrays.equals(this.verificationResults, other.getVerificationResults()))) &&
            ((this.visaNumberValidated==null && other.getVisaNumberValidated()==null) || 
             (this.visaNumberValidated!=null &&
              this.visaNumberValidated.equals(other.getVisaNumberValidated()))) &&
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
        if (getComplianceLevel() != null) {
            _hashCode += getComplianceLevel().hashCode();
        }
        if (getDataSourceResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataSourceResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataSourceResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInputEcho() != null) {
            _hashCode += getInputEcho().hashCode();
        }
        if (getPassportNumberValidated() != null) {
            _hashCode += getPassportNumberValidated().hashCode();
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
        if (getVerificationIndex() != null) {
            _hashCode += getVerificationIndex().hashCode();
        }
        if (getVerificationResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVerificationResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVerificationResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVisaNumberValidated() != null) {
            _hashCode += getVisaNumberValidated().hashCode();
        }
        if (getWatchlist() != null) {
            _hashCode += getWatchlist().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IIDIResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complianceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ComplianceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceResults");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DataSourceResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIDataSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIDataSource"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputEcho");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputEcho"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passportNumberValidated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PassportNumberValidated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RiskIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIRiskIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIRiskIndicator"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "VerificationIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIVerificationIndex"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationResults");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "VerificationResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIVerificationResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIVerificationResult"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaNumberValidated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "VisaNumberValidated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
