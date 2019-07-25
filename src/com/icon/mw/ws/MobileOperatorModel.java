/**
 * MobileOperatorModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.icon.mw.ws;

public class MobileOperatorModel  implements java.io.Serializable {
    private java.lang.String alternativeName1;

    private java.lang.String alternativeName2;

    private java.lang.String countryName;

    private java.lang.String countryReferenceCode;

    private java.lang.String name;

    private java.lang.String referenceCode;

    public MobileOperatorModel() {
    }

    public MobileOperatorModel(
           java.lang.String alternativeName1,
           java.lang.String alternativeName2,
           java.lang.String countryName,
           java.lang.String countryReferenceCode,
           java.lang.String name,
           java.lang.String referenceCode) {
           this.alternativeName1 = alternativeName1;
           this.alternativeName2 = alternativeName2;
           this.countryName = countryName;
           this.countryReferenceCode = countryReferenceCode;
           this.name = name;
           this.referenceCode = referenceCode;
    }


    /**
     * Gets the alternativeName1 value for this MobileOperatorModel.
     * 
     * @return alternativeName1
     */
    public java.lang.String getAlternativeName1() {
        return alternativeName1;
    }


    /**
     * Sets the alternativeName1 value for this MobileOperatorModel.
     * 
     * @param alternativeName1
     */
    public void setAlternativeName1(java.lang.String alternativeName1) {
        this.alternativeName1 = alternativeName1;
    }


    /**
     * Gets the alternativeName2 value for this MobileOperatorModel.
     * 
     * @return alternativeName2
     */
    public java.lang.String getAlternativeName2() {
        return alternativeName2;
    }


    /**
     * Sets the alternativeName2 value for this MobileOperatorModel.
     * 
     * @param alternativeName2
     */
    public void setAlternativeName2(java.lang.String alternativeName2) {
        this.alternativeName2 = alternativeName2;
    }


    /**
     * Gets the countryName value for this MobileOperatorModel.
     * 
     * @return countryName
     */
    public java.lang.String getCountryName() {
        return countryName;
    }


    /**
     * Sets the countryName value for this MobileOperatorModel.
     * 
     * @param countryName
     */
    public void setCountryName(java.lang.String countryName) {
        this.countryName = countryName;
    }


    /**
     * Gets the countryReferenceCode value for this MobileOperatorModel.
     * 
     * @return countryReferenceCode
     */
    public java.lang.String getCountryReferenceCode() {
        return countryReferenceCode;
    }


    /**
     * Sets the countryReferenceCode value for this MobileOperatorModel.
     * 
     * @param countryReferenceCode
     */
    public void setCountryReferenceCode(java.lang.String countryReferenceCode) {
        this.countryReferenceCode = countryReferenceCode;
    }


    /**
     * Gets the name value for this MobileOperatorModel.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MobileOperatorModel.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the referenceCode value for this MobileOperatorModel.
     * 
     * @return referenceCode
     */
    public java.lang.String getReferenceCode() {
        return referenceCode;
    }


    /**
     * Sets the referenceCode value for this MobileOperatorModel.
     * 
     * @param referenceCode
     */
    public void setReferenceCode(java.lang.String referenceCode) {
        this.referenceCode = referenceCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileOperatorModel)) return false;
        MobileOperatorModel other = (MobileOperatorModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alternativeName1==null && other.getAlternativeName1()==null) || 
             (this.alternativeName1!=null &&
              this.alternativeName1.equals(other.getAlternativeName1()))) &&
            ((this.alternativeName2==null && other.getAlternativeName2()==null) || 
             (this.alternativeName2!=null &&
              this.alternativeName2.equals(other.getAlternativeName2()))) &&
            ((this.countryName==null && other.getCountryName()==null) || 
             (this.countryName!=null &&
              this.countryName.equals(other.getCountryName()))) &&
            ((this.countryReferenceCode==null && other.getCountryReferenceCode()==null) || 
             (this.countryReferenceCode!=null &&
              this.countryReferenceCode.equals(other.getCountryReferenceCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.referenceCode==null && other.getReferenceCode()==null) || 
             (this.referenceCode!=null &&
              this.referenceCode.equals(other.getReferenceCode())));
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
        if (getAlternativeName1() != null) {
            _hashCode += getAlternativeName1().hashCode();
        }
        if (getAlternativeName2() != null) {
            _hashCode += getAlternativeName2().hashCode();
        }
        if (getCountryName() != null) {
            _hashCode += getCountryName().hashCode();
        }
        if (getCountryReferenceCode() != null) {
            _hashCode += getCountryReferenceCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getReferenceCode() != null) {
            _hashCode += getReferenceCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileOperatorModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.mw.icon.com/", "mobileOperatorModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternativeName1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alternativeName1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternativeName2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alternativeName2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryReferenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryReferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceCode"));
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
