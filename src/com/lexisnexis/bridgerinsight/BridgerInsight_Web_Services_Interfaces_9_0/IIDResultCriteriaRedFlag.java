/**
 * IIDResultCriteriaRedFlag.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class IIDResultCriteriaRedFlag  implements java.io.Serializable {
    private java.lang.Integer primaryID;

    private java.lang.Integer secondaryID;

    public IIDResultCriteriaRedFlag() {
    }

    public IIDResultCriteriaRedFlag(
           java.lang.Integer primaryID,
           java.lang.Integer secondaryID) {
           this.primaryID = primaryID;
           this.secondaryID = secondaryID;
    }


    /**
     * Gets the primaryID value for this IIDResultCriteriaRedFlag.
     * 
     * @return primaryID
     */
    public java.lang.Integer getPrimaryID() {
        return primaryID;
    }


    /**
     * Sets the primaryID value for this IIDResultCriteriaRedFlag.
     * 
     * @param primaryID
     */
    public void setPrimaryID(java.lang.Integer primaryID) {
        this.primaryID = primaryID;
    }


    /**
     * Gets the secondaryID value for this IIDResultCriteriaRedFlag.
     * 
     * @return secondaryID
     */
    public java.lang.Integer getSecondaryID() {
        return secondaryID;
    }


    /**
     * Sets the secondaryID value for this IIDResultCriteriaRedFlag.
     * 
     * @param secondaryID
     */
    public void setSecondaryID(java.lang.Integer secondaryID) {
        this.secondaryID = secondaryID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IIDResultCriteriaRedFlag)) return false;
        IIDResultCriteriaRedFlag other = (IIDResultCriteriaRedFlag) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primaryID==null && other.getPrimaryID()==null) || 
             (this.primaryID!=null &&
              this.primaryID.equals(other.getPrimaryID()))) &&
            ((this.secondaryID==null && other.getSecondaryID()==null) || 
             (this.secondaryID!=null &&
              this.secondaryID.equals(other.getSecondaryID())));
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
        if (getPrimaryID() != null) {
            _hashCode += getPrimaryID().hashCode();
        }
        if (getSecondaryID() != null) {
            _hashCode += getSecondaryID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IIDResultCriteriaRedFlag.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDResultCriteriaRedFlag"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PrimaryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SecondaryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
