/**
 * IIDResultCriteriaBusiness.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class IIDResultCriteriaBusiness  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IndexLevelType indexEnd;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IndexLevelType indexStart;

    private int[] riskIndicators;

    public IIDResultCriteriaBusiness() {
    }

    public IIDResultCriteriaBusiness(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IndexLevelType indexEnd,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IndexLevelType indexStart,
           int[] riskIndicators) {
           this.indexEnd = indexEnd;
           this.indexStart = indexStart;
           this.riskIndicators = riskIndicators;
    }


    /**
     * Gets the indexEnd value for this IIDResultCriteriaBusiness.
     * 
     * @return indexEnd
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IndexLevelType getIndexEnd() {
        return indexEnd;
    }


    /**
     * Sets the indexEnd value for this IIDResultCriteriaBusiness.
     * 
     * @param indexEnd
     */
    public void setIndexEnd(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IndexLevelType indexEnd) {
        this.indexEnd = indexEnd;
    }


    /**
     * Gets the indexStart value for this IIDResultCriteriaBusiness.
     * 
     * @return indexStart
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IndexLevelType getIndexStart() {
        return indexStart;
    }


    /**
     * Sets the indexStart value for this IIDResultCriteriaBusiness.
     * 
     * @param indexStart
     */
    public void setIndexStart(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IndexLevelType indexStart) {
        this.indexStart = indexStart;
    }


    /**
     * Gets the riskIndicators value for this IIDResultCriteriaBusiness.
     * 
     * @return riskIndicators
     */
    public int[] getRiskIndicators() {
        return riskIndicators;
    }


    /**
     * Sets the riskIndicators value for this IIDResultCriteriaBusiness.
     * 
     * @param riskIndicators
     */
    public void setRiskIndicators(int[] riskIndicators) {
        this.riskIndicators = riskIndicators;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IIDResultCriteriaBusiness)) return false;
        IIDResultCriteriaBusiness other = (IIDResultCriteriaBusiness) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indexEnd==null && other.getIndexEnd()==null) || 
             (this.indexEnd!=null &&
              this.indexEnd.equals(other.getIndexEnd()))) &&
            ((this.indexStart==null && other.getIndexStart()==null) || 
             (this.indexStart!=null &&
              this.indexStart.equals(other.getIndexStart()))) &&
            ((this.riskIndicators==null && other.getRiskIndicators()==null) || 
             (this.riskIndicators!=null &&
              java.util.Arrays.equals(this.riskIndicators, other.getRiskIndicators())));
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
        if (getIndexEnd() != null) {
            _hashCode += getIndexEnd().hashCode();
        }
        if (getIndexStart() != null) {
            _hashCode += getIndexStart().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IIDResultCriteriaBusiness.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDResultCriteriaBusiness"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IndexEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IndexLevelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexStart");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IndexStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IndexLevelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RiskIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "int"));
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
