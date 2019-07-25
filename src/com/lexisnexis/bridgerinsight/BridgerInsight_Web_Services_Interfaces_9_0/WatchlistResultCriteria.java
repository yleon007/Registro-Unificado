/**
 * WatchlistResultCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class WatchlistResultCriteria  implements java.io.Serializable {
    private java.lang.String errorText;

    private java.lang.Boolean excludeIfTrueMatchUpdatesOnly;

    private java.lang.Boolean matchDispositionFalsePositive;

    private java.lang.Boolean matchDispositionTrueMatch;

    private java.lang.String reasonListed;

    private java.lang.Integer scoreEnd;

    private java.lang.Integer scoreStart;

    private java.lang.Boolean searchOnErrors;

    private java.lang.String sourceName;

    private java.lang.Boolean trueMatchUpdatesOnly;

    public WatchlistResultCriteria() {
    }

    public WatchlistResultCriteria(
           java.lang.String errorText,
           java.lang.Boolean excludeIfTrueMatchUpdatesOnly,
           java.lang.Boolean matchDispositionFalsePositive,
           java.lang.Boolean matchDispositionTrueMatch,
           java.lang.String reasonListed,
           java.lang.Integer scoreEnd,
           java.lang.Integer scoreStart,
           java.lang.Boolean searchOnErrors,
           java.lang.String sourceName,
           java.lang.Boolean trueMatchUpdatesOnly) {
           this.errorText = errorText;
           this.excludeIfTrueMatchUpdatesOnly = excludeIfTrueMatchUpdatesOnly;
           this.matchDispositionFalsePositive = matchDispositionFalsePositive;
           this.matchDispositionTrueMatch = matchDispositionTrueMatch;
           this.reasonListed = reasonListed;
           this.scoreEnd = scoreEnd;
           this.scoreStart = scoreStart;
           this.searchOnErrors = searchOnErrors;
           this.sourceName = sourceName;
           this.trueMatchUpdatesOnly = trueMatchUpdatesOnly;
    }


    /**
     * Gets the errorText value for this WatchlistResultCriteria.
     * 
     * @return errorText
     */
    public java.lang.String getErrorText() {
        return errorText;
    }


    /**
     * Sets the errorText value for this WatchlistResultCriteria.
     * 
     * @param errorText
     */
    public void setErrorText(java.lang.String errorText) {
        this.errorText = errorText;
    }


    /**
     * Gets the excludeIfTrueMatchUpdatesOnly value for this WatchlistResultCriteria.
     * 
     * @return excludeIfTrueMatchUpdatesOnly
     */
    public java.lang.Boolean getExcludeIfTrueMatchUpdatesOnly() {
        return excludeIfTrueMatchUpdatesOnly;
    }


    /**
     * Sets the excludeIfTrueMatchUpdatesOnly value for this WatchlistResultCriteria.
     * 
     * @param excludeIfTrueMatchUpdatesOnly
     */
    public void setExcludeIfTrueMatchUpdatesOnly(java.lang.Boolean excludeIfTrueMatchUpdatesOnly) {
        this.excludeIfTrueMatchUpdatesOnly = excludeIfTrueMatchUpdatesOnly;
    }


    /**
     * Gets the matchDispositionFalsePositive value for this WatchlistResultCriteria.
     * 
     * @return matchDispositionFalsePositive
     */
    public java.lang.Boolean getMatchDispositionFalsePositive() {
        return matchDispositionFalsePositive;
    }


    /**
     * Sets the matchDispositionFalsePositive value for this WatchlistResultCriteria.
     * 
     * @param matchDispositionFalsePositive
     */
    public void setMatchDispositionFalsePositive(java.lang.Boolean matchDispositionFalsePositive) {
        this.matchDispositionFalsePositive = matchDispositionFalsePositive;
    }


    /**
     * Gets the matchDispositionTrueMatch value for this WatchlistResultCriteria.
     * 
     * @return matchDispositionTrueMatch
     */
    public java.lang.Boolean getMatchDispositionTrueMatch() {
        return matchDispositionTrueMatch;
    }


    /**
     * Sets the matchDispositionTrueMatch value for this WatchlistResultCriteria.
     * 
     * @param matchDispositionTrueMatch
     */
    public void setMatchDispositionTrueMatch(java.lang.Boolean matchDispositionTrueMatch) {
        this.matchDispositionTrueMatch = matchDispositionTrueMatch;
    }


    /**
     * Gets the reasonListed value for this WatchlistResultCriteria.
     * 
     * @return reasonListed
     */
    public java.lang.String getReasonListed() {
        return reasonListed;
    }


    /**
     * Sets the reasonListed value for this WatchlistResultCriteria.
     * 
     * @param reasonListed
     */
    public void setReasonListed(java.lang.String reasonListed) {
        this.reasonListed = reasonListed;
    }


    /**
     * Gets the scoreEnd value for this WatchlistResultCriteria.
     * 
     * @return scoreEnd
     */
    public java.lang.Integer getScoreEnd() {
        return scoreEnd;
    }


    /**
     * Sets the scoreEnd value for this WatchlistResultCriteria.
     * 
     * @param scoreEnd
     */
    public void setScoreEnd(java.lang.Integer scoreEnd) {
        this.scoreEnd = scoreEnd;
    }


    /**
     * Gets the scoreStart value for this WatchlistResultCriteria.
     * 
     * @return scoreStart
     */
    public java.lang.Integer getScoreStart() {
        return scoreStart;
    }


    /**
     * Sets the scoreStart value for this WatchlistResultCriteria.
     * 
     * @param scoreStart
     */
    public void setScoreStart(java.lang.Integer scoreStart) {
        this.scoreStart = scoreStart;
    }


    /**
     * Gets the searchOnErrors value for this WatchlistResultCriteria.
     * 
     * @return searchOnErrors
     */
    public java.lang.Boolean getSearchOnErrors() {
        return searchOnErrors;
    }


    /**
     * Sets the searchOnErrors value for this WatchlistResultCriteria.
     * 
     * @param searchOnErrors
     */
    public void setSearchOnErrors(java.lang.Boolean searchOnErrors) {
        this.searchOnErrors = searchOnErrors;
    }


    /**
     * Gets the sourceName value for this WatchlistResultCriteria.
     * 
     * @return sourceName
     */
    public java.lang.String getSourceName() {
        return sourceName;
    }


    /**
     * Sets the sourceName value for this WatchlistResultCriteria.
     * 
     * @param sourceName
     */
    public void setSourceName(java.lang.String sourceName) {
        this.sourceName = sourceName;
    }


    /**
     * Gets the trueMatchUpdatesOnly value for this WatchlistResultCriteria.
     * 
     * @return trueMatchUpdatesOnly
     */
    public java.lang.Boolean getTrueMatchUpdatesOnly() {
        return trueMatchUpdatesOnly;
    }


    /**
     * Sets the trueMatchUpdatesOnly value for this WatchlistResultCriteria.
     * 
     * @param trueMatchUpdatesOnly
     */
    public void setTrueMatchUpdatesOnly(java.lang.Boolean trueMatchUpdatesOnly) {
        this.trueMatchUpdatesOnly = trueMatchUpdatesOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WatchlistResultCriteria)) return false;
        WatchlistResultCriteria other = (WatchlistResultCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorText==null && other.getErrorText()==null) || 
             (this.errorText!=null &&
              this.errorText.equals(other.getErrorText()))) &&
            ((this.excludeIfTrueMatchUpdatesOnly==null && other.getExcludeIfTrueMatchUpdatesOnly()==null) || 
             (this.excludeIfTrueMatchUpdatesOnly!=null &&
              this.excludeIfTrueMatchUpdatesOnly.equals(other.getExcludeIfTrueMatchUpdatesOnly()))) &&
            ((this.matchDispositionFalsePositive==null && other.getMatchDispositionFalsePositive()==null) || 
             (this.matchDispositionFalsePositive!=null &&
              this.matchDispositionFalsePositive.equals(other.getMatchDispositionFalsePositive()))) &&
            ((this.matchDispositionTrueMatch==null && other.getMatchDispositionTrueMatch()==null) || 
             (this.matchDispositionTrueMatch!=null &&
              this.matchDispositionTrueMatch.equals(other.getMatchDispositionTrueMatch()))) &&
            ((this.reasonListed==null && other.getReasonListed()==null) || 
             (this.reasonListed!=null &&
              this.reasonListed.equals(other.getReasonListed()))) &&
            ((this.scoreEnd==null && other.getScoreEnd()==null) || 
             (this.scoreEnd!=null &&
              this.scoreEnd.equals(other.getScoreEnd()))) &&
            ((this.scoreStart==null && other.getScoreStart()==null) || 
             (this.scoreStart!=null &&
              this.scoreStart.equals(other.getScoreStart()))) &&
            ((this.searchOnErrors==null && other.getSearchOnErrors()==null) || 
             (this.searchOnErrors!=null &&
              this.searchOnErrors.equals(other.getSearchOnErrors()))) &&
            ((this.sourceName==null && other.getSourceName()==null) || 
             (this.sourceName!=null &&
              this.sourceName.equals(other.getSourceName()))) &&
            ((this.trueMatchUpdatesOnly==null && other.getTrueMatchUpdatesOnly()==null) || 
             (this.trueMatchUpdatesOnly!=null &&
              this.trueMatchUpdatesOnly.equals(other.getTrueMatchUpdatesOnly())));
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
        if (getErrorText() != null) {
            _hashCode += getErrorText().hashCode();
        }
        if (getExcludeIfTrueMatchUpdatesOnly() != null) {
            _hashCode += getExcludeIfTrueMatchUpdatesOnly().hashCode();
        }
        if (getMatchDispositionFalsePositive() != null) {
            _hashCode += getMatchDispositionFalsePositive().hashCode();
        }
        if (getMatchDispositionTrueMatch() != null) {
            _hashCode += getMatchDispositionTrueMatch().hashCode();
        }
        if (getReasonListed() != null) {
            _hashCode += getReasonListed().hashCode();
        }
        if (getScoreEnd() != null) {
            _hashCode += getScoreEnd().hashCode();
        }
        if (getScoreStart() != null) {
            _hashCode += getScoreStart().hashCode();
        }
        if (getSearchOnErrors() != null) {
            _hashCode += getSearchOnErrors().hashCode();
        }
        if (getSourceName() != null) {
            _hashCode += getSourceName().hashCode();
        }
        if (getTrueMatchUpdatesOnly() != null) {
            _hashCode += getTrueMatchUpdatesOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WatchlistResultCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistResultCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ErrorText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeIfTrueMatchUpdatesOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ExcludeIfTrueMatchUpdatesOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchDispositionFalsePositive");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "MatchDispositionFalsePositive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchDispositionTrueMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "MatchDispositionTrueMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonListed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ReasonListed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ScoreEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreStart");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ScoreStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchOnErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SearchOnErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trueMatchUpdatesOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TrueMatchUpdatesOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
