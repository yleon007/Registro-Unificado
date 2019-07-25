/**
 * IIDIInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class IIDIInput  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIAddress address;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDate DOB;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIIdentification driver;

    private java.lang.String gender;

    private java.lang.String homePhone;

    private java.lang.String IPAddress;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputName name;

    private java.lang.String nationalIDCountry;

    private java.lang.String nationalIDNumber;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIPassport passport;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIPassport visa;

    private java.lang.String workPhone;

    public IIDIInput() {
    }

    public IIDIInput(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIAddress address,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDate DOB,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIIdentification driver,
           java.lang.String gender,
           java.lang.String homePhone,
           java.lang.String IPAddress,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputName name,
           java.lang.String nationalIDCountry,
           java.lang.String nationalIDNumber,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIPassport passport,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIPassport visa,
           java.lang.String workPhone) {
           this.address = address;
           this.DOB = DOB;
           this.driver = driver;
           this.gender = gender;
           this.homePhone = homePhone;
           this.IPAddress = IPAddress;
           this.name = name;
           this.nationalIDCountry = nationalIDCountry;
           this.nationalIDNumber = nationalIDNumber;
           this.passport = passport;
           this.visa = visa;
           this.workPhone = workPhone;
    }


    /**
     * Gets the address value for this IIDIInput.
     * 
     * @return address
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this IIDIInput.
     * 
     * @param address
     */
    public void setAddress(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIAddress address) {
        this.address = address;
    }


    /**
     * Gets the DOB value for this IIDIInput.
     * 
     * @return DOB
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDate getDOB() {
        return DOB;
    }


    /**
     * Sets the DOB value for this IIDIInput.
     * 
     * @param DOB
     */
    public void setDOB(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDate DOB) {
        this.DOB = DOB;
    }


    /**
     * Gets the driver value for this IIDIInput.
     * 
     * @return driver
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIIdentification getDriver() {
        return driver;
    }


    /**
     * Sets the driver value for this IIDIInput.
     * 
     * @param driver
     */
    public void setDriver(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIIdentification driver) {
        this.driver = driver;
    }


    /**
     * Gets the gender value for this IIDIInput.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this IIDIInput.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the homePhone value for this IIDIInput.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this IIDIInput.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the IPAddress value for this IIDIInput.
     * 
     * @return IPAddress
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this IIDIInput.
     * 
     * @param IPAddress
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the name value for this IIDIInput.
     * 
     * @return name
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputName getName() {
        return name;
    }


    /**
     * Sets the name value for this IIDIInput.
     * 
     * @param name
     */
    public void setName(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputName name) {
        this.name = name;
    }


    /**
     * Gets the nationalIDCountry value for this IIDIInput.
     * 
     * @return nationalIDCountry
     */
    public java.lang.String getNationalIDCountry() {
        return nationalIDCountry;
    }


    /**
     * Sets the nationalIDCountry value for this IIDIInput.
     * 
     * @param nationalIDCountry
     */
    public void setNationalIDCountry(java.lang.String nationalIDCountry) {
        this.nationalIDCountry = nationalIDCountry;
    }


    /**
     * Gets the nationalIDNumber value for this IIDIInput.
     * 
     * @return nationalIDNumber
     */
    public java.lang.String getNationalIDNumber() {
        return nationalIDNumber;
    }


    /**
     * Sets the nationalIDNumber value for this IIDIInput.
     * 
     * @param nationalIDNumber
     */
    public void setNationalIDNumber(java.lang.String nationalIDNumber) {
        this.nationalIDNumber = nationalIDNumber;
    }


    /**
     * Gets the passport value for this IIDIInput.
     * 
     * @return passport
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIPassport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this IIDIInput.
     * 
     * @param passport
     */
    public void setPassport(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIPassport passport) {
        this.passport = passport;
    }


    /**
     * Gets the visa value for this IIDIInput.
     * 
     * @return visa
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIPassport getVisa() {
        return visa;
    }


    /**
     * Sets the visa value for this IIDIInput.
     * 
     * @param visa
     */
    public void setVisa(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIPassport visa) {
        this.visa = visa;
    }


    /**
     * Gets the workPhone value for this IIDIInput.
     * 
     * @return workPhone
     */
    public java.lang.String getWorkPhone() {
        return workPhone;
    }


    /**
     * Sets the workPhone value for this IIDIInput.
     * 
     * @param workPhone
     */
    public void setWorkPhone(java.lang.String workPhone) {
        this.workPhone = workPhone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IIDIInput)) return false;
        IIDIInput other = (IIDIInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.DOB==null && other.getDOB()==null) || 
             (this.DOB!=null &&
              this.DOB.equals(other.getDOB()))) &&
            ((this.driver==null && other.getDriver()==null) || 
             (this.driver!=null &&
              this.driver.equals(other.getDriver()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nationalIDCountry==null && other.getNationalIDCountry()==null) || 
             (this.nationalIDCountry!=null &&
              this.nationalIDCountry.equals(other.getNationalIDCountry()))) &&
            ((this.nationalIDNumber==null && other.getNationalIDNumber()==null) || 
             (this.nationalIDNumber!=null &&
              this.nationalIDNumber.equals(other.getNationalIDNumber()))) &&
            ((this.passport==null && other.getPassport()==null) || 
             (this.passport!=null &&
              this.passport.equals(other.getPassport()))) &&
            ((this.visa==null && other.getVisa()==null) || 
             (this.visa!=null &&
              this.visa.equals(other.getVisa()))) &&
            ((this.workPhone==null && other.getWorkPhone()==null) || 
             (this.workPhone!=null &&
              this.workPhone.equals(other.getWorkPhone())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getDOB() != null) {
            _hashCode += getDOB().hashCode();
        }
        if (getDriver() != null) {
            _hashCode += getDriver().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNationalIDCountry() != null) {
            _hashCode += getNationalIDCountry().hashCode();
        }
        if (getNationalIDNumber() != null) {
            _hashCode += getNationalIDNumber().hashCode();
        }
        if (getPassport() != null) {
            _hashCode += getPassport().hashCode();
        }
        if (getVisa() != null) {
            _hashCode += getVisa().hashCode();
        }
        if (getWorkPhone() != null) {
            _hashCode += getWorkPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IIDIInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOB");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driver");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Driver"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIIdentification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "HomePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalIDCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "NationalIDCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalIDNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "NationalIDNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIPassport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visa");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Visa"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIPassport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WorkPhone"));
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
