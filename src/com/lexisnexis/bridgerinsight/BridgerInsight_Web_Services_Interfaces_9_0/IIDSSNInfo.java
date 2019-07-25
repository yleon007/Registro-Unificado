/**
 * IIDSSNInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class IIDSSNInfo  implements java.io.Serializable {
    private java.lang.String issuedEndDate;

    private java.lang.String issuedLocation;

    private java.lang.String issuedStartDate;

    public IIDSSNInfo() {
    }

    public IIDSSNInfo(
           java.lang.String issuedEndDate,
           java.lang.String issuedLocation,
           java.lang.String issuedStartDate) {
           this.issuedEndDate = issuedEndDate;
           this.issuedLocation = issuedLocation;
           this.issuedStartDate = issuedStartDate;
    }


    /**
     * Gets the issuedEndDate value for this IIDSSNInfo.
     * 
     * @return issuedEndDate
     */
    public java.lang.String getIssuedEndDate() {
        return issuedEndDate;
    }


    /**
     * Sets the issuedEndDate value for this IIDSSNInfo.
     * 
     * @param issuedEndDate
     */
    public void setIssuedEndDate(java.lang.String issuedEndDate) {
        this.issuedEndDate = issuedEndDate;
    }


    /**
     * Gets the issuedLocation value for this IIDSSNInfo.
     * 
     * @return issuedLocation
     */
    public java.lang.String getIssuedLocation() {
        return issuedLocation;
    }


    /**
     * Sets the issuedLocation value for this IIDSSNInfo.
     * 
     * @param issuedLocation
     */
    public void setIssuedLocation(java.lang.String issuedLocation) {
        this.issuedLocation = issuedLocation;
    }


    /**
     * Gets the issuedStartDate value for this IIDSSNInfo.
     * 
     * @return issuedStartDate
     */
    public java.lang.String getIssuedStartDate() {
        return issuedStartDate;
    }


    /**
     * Sets the issuedStartDate value for this IIDSSNInfo.
     * 
     * @param issuedStartDate
     */
    public void setIssuedStartDate(java.lang.String issuedStartDate) {
        this.issuedStartDate = issuedStartDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IIDSSNInfo)) return false;
        IIDSSNInfo other = (IIDSSNInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.issuedEndDate==null && other.getIssuedEndDate()==null) || 
             (this.issuedEndDate!=null &&
              this.issuedEndDate.equals(other.getIssuedEndDate()))) &&
            ((this.issuedLocation==null && other.getIssuedLocation()==null) || 
             (this.issuedLocation!=null &&
              this.issuedLocation.equals(other.getIssuedLocation()))) &&
            ((this.issuedStartDate==null && other.getIssuedStartDate()==null) || 
             (this.issuedStartDate!=null &&
              this.issuedStartDate.equals(other.getIssuedStartDate())));
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
        if (getIssuedEndDate() != null) {
            _hashCode += getIssuedEndDate().hashCode();
        }
        if (getIssuedLocation() != null) {
            _hashCode += getIssuedLocation().hashCode();
        }
        if (getIssuedStartDate() != null) {
            _hashCode += getIssuedStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IIDSSNInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDSSNInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuedEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IssuedEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuedLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IssuedLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuedStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IssuedStartDate"));
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
