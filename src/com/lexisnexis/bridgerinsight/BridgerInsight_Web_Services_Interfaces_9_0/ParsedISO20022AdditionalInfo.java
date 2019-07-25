/**
 * ParsedISO20022AdditionalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedISO20022AdditionalInfo  implements java.io.Serializable {
    private java.lang.String countryOfBirth;

    private java.lang.String info;

    private java.lang.String parsedInfo;

    private java.lang.String provinceOfBirth;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AdditionalInfoType type;

    public ParsedISO20022AdditionalInfo() {
    }

    public ParsedISO20022AdditionalInfo(
           java.lang.String countryOfBirth,
           java.lang.String info,
           java.lang.String parsedInfo,
           java.lang.String provinceOfBirth,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AdditionalInfoType type) {
           this.countryOfBirth = countryOfBirth;
           this.info = info;
           this.parsedInfo = parsedInfo;
           this.provinceOfBirth = provinceOfBirth;
           this.type = type;
    }


    /**
     * Gets the countryOfBirth value for this ParsedISO20022AdditionalInfo.
     * 
     * @return countryOfBirth
     */
    public java.lang.String getCountryOfBirth() {
        return countryOfBirth;
    }


    /**
     * Sets the countryOfBirth value for this ParsedISO20022AdditionalInfo.
     * 
     * @param countryOfBirth
     */
    public void setCountryOfBirth(java.lang.String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }


    /**
     * Gets the info value for this ParsedISO20022AdditionalInfo.
     * 
     * @return info
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this ParsedISO20022AdditionalInfo.
     * 
     * @param info
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
    }


    /**
     * Gets the parsedInfo value for this ParsedISO20022AdditionalInfo.
     * 
     * @return parsedInfo
     */
    public java.lang.String getParsedInfo() {
        return parsedInfo;
    }


    /**
     * Sets the parsedInfo value for this ParsedISO20022AdditionalInfo.
     * 
     * @param parsedInfo
     */
    public void setParsedInfo(java.lang.String parsedInfo) {
        this.parsedInfo = parsedInfo;
    }


    /**
     * Gets the provinceOfBirth value for this ParsedISO20022AdditionalInfo.
     * 
     * @return provinceOfBirth
     */
    public java.lang.String getProvinceOfBirth() {
        return provinceOfBirth;
    }


    /**
     * Sets the provinceOfBirth value for this ParsedISO20022AdditionalInfo.
     * 
     * @param provinceOfBirth
     */
    public void setProvinceOfBirth(java.lang.String provinceOfBirth) {
        this.provinceOfBirth = provinceOfBirth;
    }


    /**
     * Gets the type value for this ParsedISO20022AdditionalInfo.
     * 
     * @return type
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AdditionalInfoType getType() {
        return type;
    }


    /**
     * Sets the type value for this ParsedISO20022AdditionalInfo.
     * 
     * @param type
     */
    public void setType(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AdditionalInfoType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedISO20022AdditionalInfo)) return false;
        ParsedISO20022AdditionalInfo other = (ParsedISO20022AdditionalInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countryOfBirth==null && other.getCountryOfBirth()==null) || 
             (this.countryOfBirth!=null &&
              this.countryOfBirth.equals(other.getCountryOfBirth()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            ((this.parsedInfo==null && other.getParsedInfo()==null) || 
             (this.parsedInfo!=null &&
              this.parsedInfo.equals(other.getParsedInfo()))) &&
            ((this.provinceOfBirth==null && other.getProvinceOfBirth()==null) || 
             (this.provinceOfBirth!=null &&
              this.provinceOfBirth.equals(other.getProvinceOfBirth()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getCountryOfBirth() != null) {
            _hashCode += getCountryOfBirth().hashCode();
        }
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        if (getParsedInfo() != null) {
            _hashCode += getParsedInfo().hashCode();
        }
        if (getProvinceOfBirth() != null) {
            _hashCode += getProvinceOfBirth().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedISO20022AdditionalInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022AdditionalInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CountryOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parsedInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinceOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ProvinceOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AdditionalInfoType"));
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
