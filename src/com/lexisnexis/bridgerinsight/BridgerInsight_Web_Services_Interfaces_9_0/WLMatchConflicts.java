/**
 * WLMatchConflicts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class WLMatchConflicts  implements java.io.Serializable {
    private java.lang.Boolean addressConflict;

    private java.lang.Boolean citizenshipConflict;

    private java.lang.Boolean countryConflict;

    private java.lang.Boolean DOBConflict;

    private java.lang.Boolean entityTypeConflict;

    private java.lang.Boolean genderConflict;

    private java.lang.Boolean IDConflict;

    private java.lang.Boolean phoneConflict;

    public WLMatchConflicts() {
    }

    public WLMatchConflicts(
           java.lang.Boolean addressConflict,
           java.lang.Boolean citizenshipConflict,
           java.lang.Boolean countryConflict,
           java.lang.Boolean DOBConflict,
           java.lang.Boolean entityTypeConflict,
           java.lang.Boolean genderConflict,
           java.lang.Boolean IDConflict,
           java.lang.Boolean phoneConflict) {
           this.addressConflict = addressConflict;
           this.citizenshipConflict = citizenshipConflict;
           this.countryConflict = countryConflict;
           this.DOBConflict = DOBConflict;
           this.entityTypeConflict = entityTypeConflict;
           this.genderConflict = genderConflict;
           this.IDConflict = IDConflict;
           this.phoneConflict = phoneConflict;
    }


    /**
     * Gets the addressConflict value for this WLMatchConflicts.
     * 
     * @return addressConflict
     */
    public java.lang.Boolean getAddressConflict() {
        return addressConflict;
    }


    /**
     * Sets the addressConflict value for this WLMatchConflicts.
     * 
     * @param addressConflict
     */
    public void setAddressConflict(java.lang.Boolean addressConflict) {
        this.addressConflict = addressConflict;
    }


    /**
     * Gets the citizenshipConflict value for this WLMatchConflicts.
     * 
     * @return citizenshipConflict
     */
    public java.lang.Boolean getCitizenshipConflict() {
        return citizenshipConflict;
    }


    /**
     * Sets the citizenshipConflict value for this WLMatchConflicts.
     * 
     * @param citizenshipConflict
     */
    public void setCitizenshipConflict(java.lang.Boolean citizenshipConflict) {
        this.citizenshipConflict = citizenshipConflict;
    }


    /**
     * Gets the countryConflict value for this WLMatchConflicts.
     * 
     * @return countryConflict
     */
    public java.lang.Boolean getCountryConflict() {
        return countryConflict;
    }


    /**
     * Sets the countryConflict value for this WLMatchConflicts.
     * 
     * @param countryConflict
     */
    public void setCountryConflict(java.lang.Boolean countryConflict) {
        this.countryConflict = countryConflict;
    }


    /**
     * Gets the DOBConflict value for this WLMatchConflicts.
     * 
     * @return DOBConflict
     */
    public java.lang.Boolean getDOBConflict() {
        return DOBConflict;
    }


    /**
     * Sets the DOBConflict value for this WLMatchConflicts.
     * 
     * @param DOBConflict
     */
    public void setDOBConflict(java.lang.Boolean DOBConflict) {
        this.DOBConflict = DOBConflict;
    }


    /**
     * Gets the entityTypeConflict value for this WLMatchConflicts.
     * 
     * @return entityTypeConflict
     */
    public java.lang.Boolean getEntityTypeConflict() {
        return entityTypeConflict;
    }


    /**
     * Sets the entityTypeConflict value for this WLMatchConflicts.
     * 
     * @param entityTypeConflict
     */
    public void setEntityTypeConflict(java.lang.Boolean entityTypeConflict) {
        this.entityTypeConflict = entityTypeConflict;
    }


    /**
     * Gets the genderConflict value for this WLMatchConflicts.
     * 
     * @return genderConflict
     */
    public java.lang.Boolean getGenderConflict() {
        return genderConflict;
    }


    /**
     * Sets the genderConflict value for this WLMatchConflicts.
     * 
     * @param genderConflict
     */
    public void setGenderConflict(java.lang.Boolean genderConflict) {
        this.genderConflict = genderConflict;
    }


    /**
     * Gets the IDConflict value for this WLMatchConflicts.
     * 
     * @return IDConflict
     */
    public java.lang.Boolean getIDConflict() {
        return IDConflict;
    }


    /**
     * Sets the IDConflict value for this WLMatchConflicts.
     * 
     * @param IDConflict
     */
    public void setIDConflict(java.lang.Boolean IDConflict) {
        this.IDConflict = IDConflict;
    }


    /**
     * Gets the phoneConflict value for this WLMatchConflicts.
     * 
     * @return phoneConflict
     */
    public java.lang.Boolean getPhoneConflict() {
        return phoneConflict;
    }


    /**
     * Sets the phoneConflict value for this WLMatchConflicts.
     * 
     * @param phoneConflict
     */
    public void setPhoneConflict(java.lang.Boolean phoneConflict) {
        this.phoneConflict = phoneConflict;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WLMatchConflicts)) return false;
        WLMatchConflicts other = (WLMatchConflicts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressConflict==null && other.getAddressConflict()==null) || 
             (this.addressConflict!=null &&
              this.addressConflict.equals(other.getAddressConflict()))) &&
            ((this.citizenshipConflict==null && other.getCitizenshipConflict()==null) || 
             (this.citizenshipConflict!=null &&
              this.citizenshipConflict.equals(other.getCitizenshipConflict()))) &&
            ((this.countryConflict==null && other.getCountryConflict()==null) || 
             (this.countryConflict!=null &&
              this.countryConflict.equals(other.getCountryConflict()))) &&
            ((this.DOBConflict==null && other.getDOBConflict()==null) || 
             (this.DOBConflict!=null &&
              this.DOBConflict.equals(other.getDOBConflict()))) &&
            ((this.entityTypeConflict==null && other.getEntityTypeConflict()==null) || 
             (this.entityTypeConflict!=null &&
              this.entityTypeConflict.equals(other.getEntityTypeConflict()))) &&
            ((this.genderConflict==null && other.getGenderConflict()==null) || 
             (this.genderConflict!=null &&
              this.genderConflict.equals(other.getGenderConflict()))) &&
            ((this.IDConflict==null && other.getIDConflict()==null) || 
             (this.IDConflict!=null &&
              this.IDConflict.equals(other.getIDConflict()))) &&
            ((this.phoneConflict==null && other.getPhoneConflict()==null) || 
             (this.phoneConflict!=null &&
              this.phoneConflict.equals(other.getPhoneConflict())));
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
        if (getAddressConflict() != null) {
            _hashCode += getAddressConflict().hashCode();
        }
        if (getCitizenshipConflict() != null) {
            _hashCode += getCitizenshipConflict().hashCode();
        }
        if (getCountryConflict() != null) {
            _hashCode += getCountryConflict().hashCode();
        }
        if (getDOBConflict() != null) {
            _hashCode += getDOBConflict().hashCode();
        }
        if (getEntityTypeConflict() != null) {
            _hashCode += getEntityTypeConflict().hashCode();
        }
        if (getGenderConflict() != null) {
            _hashCode += getGenderConflict().hashCode();
        }
        if (getIDConflict() != null) {
            _hashCode += getIDConflict().hashCode();
        }
        if (getPhoneConflict() != null) {
            _hashCode += getPhoneConflict().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WLMatchConflicts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLMatchConflicts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressConflict");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AddressConflict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citizenshipConflict");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CitizenshipConflict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryConflict");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CountryConflict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOBConflict");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DOBConflict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTypeConflict");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityTypeConflict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genderConflict");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "GenderConflict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDConflict");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IDConflict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneConflict");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PhoneConflict"));
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
