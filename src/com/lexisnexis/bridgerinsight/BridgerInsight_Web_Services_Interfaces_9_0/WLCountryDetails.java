/**
 * WLCountryDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class WLCountryDetails  implements java.io.Serializable {
    private java.lang.String[] AKAs;

    private java.lang.String[] cities;

    private java.lang.String[] codes;

    private java.lang.String comments;

    private java.lang.String country;

    private java.lang.String dateListed;

    private java.lang.String listReferenceNumber;

    private java.lang.String[] ports;

    private java.lang.String reasonListed;

    private java.lang.String[] terms;

    public WLCountryDetails() {
    }

    public WLCountryDetails(
           java.lang.String[] AKAs,
           java.lang.String[] cities,
           java.lang.String[] codes,
           java.lang.String comments,
           java.lang.String country,
           java.lang.String dateListed,
           java.lang.String listReferenceNumber,
           java.lang.String[] ports,
           java.lang.String reasonListed,
           java.lang.String[] terms) {
           this.AKAs = AKAs;
           this.cities = cities;
           this.codes = codes;
           this.comments = comments;
           this.country = country;
           this.dateListed = dateListed;
           this.listReferenceNumber = listReferenceNumber;
           this.ports = ports;
           this.reasonListed = reasonListed;
           this.terms = terms;
    }


    /**
     * Gets the AKAs value for this WLCountryDetails.
     * 
     * @return AKAs
     */
    public java.lang.String[] getAKAs() {
        return AKAs;
    }


    /**
     * Sets the AKAs value for this WLCountryDetails.
     * 
     * @param AKAs
     */
    public void setAKAs(java.lang.String[] AKAs) {
        this.AKAs = AKAs;
    }


    /**
     * Gets the cities value for this WLCountryDetails.
     * 
     * @return cities
     */
    public java.lang.String[] getCities() {
        return cities;
    }


    /**
     * Sets the cities value for this WLCountryDetails.
     * 
     * @param cities
     */
    public void setCities(java.lang.String[] cities) {
        this.cities = cities;
    }


    /**
     * Gets the codes value for this WLCountryDetails.
     * 
     * @return codes
     */
    public java.lang.String[] getCodes() {
        return codes;
    }


    /**
     * Sets the codes value for this WLCountryDetails.
     * 
     * @param codes
     */
    public void setCodes(java.lang.String[] codes) {
        this.codes = codes;
    }


    /**
     * Gets the comments value for this WLCountryDetails.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this WLCountryDetails.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the country value for this WLCountryDetails.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this WLCountryDetails.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the dateListed value for this WLCountryDetails.
     * 
     * @return dateListed
     */
    public java.lang.String getDateListed() {
        return dateListed;
    }


    /**
     * Sets the dateListed value for this WLCountryDetails.
     * 
     * @param dateListed
     */
    public void setDateListed(java.lang.String dateListed) {
        this.dateListed = dateListed;
    }


    /**
     * Gets the listReferenceNumber value for this WLCountryDetails.
     * 
     * @return listReferenceNumber
     */
    public java.lang.String getListReferenceNumber() {
        return listReferenceNumber;
    }


    /**
     * Sets the listReferenceNumber value for this WLCountryDetails.
     * 
     * @param listReferenceNumber
     */
    public void setListReferenceNumber(java.lang.String listReferenceNumber) {
        this.listReferenceNumber = listReferenceNumber;
    }


    /**
     * Gets the ports value for this WLCountryDetails.
     * 
     * @return ports
     */
    public java.lang.String[] getPorts() {
        return ports;
    }


    /**
     * Sets the ports value for this WLCountryDetails.
     * 
     * @param ports
     */
    public void setPorts(java.lang.String[] ports) {
        this.ports = ports;
    }


    /**
     * Gets the reasonListed value for this WLCountryDetails.
     * 
     * @return reasonListed
     */
    public java.lang.String getReasonListed() {
        return reasonListed;
    }


    /**
     * Sets the reasonListed value for this WLCountryDetails.
     * 
     * @param reasonListed
     */
    public void setReasonListed(java.lang.String reasonListed) {
        this.reasonListed = reasonListed;
    }


    /**
     * Gets the terms value for this WLCountryDetails.
     * 
     * @return terms
     */
    public java.lang.String[] getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this WLCountryDetails.
     * 
     * @param terms
     */
    public void setTerms(java.lang.String[] terms) {
        this.terms = terms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WLCountryDetails)) return false;
        WLCountryDetails other = (WLCountryDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AKAs==null && other.getAKAs()==null) || 
             (this.AKAs!=null &&
              java.util.Arrays.equals(this.AKAs, other.getAKAs()))) &&
            ((this.cities==null && other.getCities()==null) || 
             (this.cities!=null &&
              java.util.Arrays.equals(this.cities, other.getCities()))) &&
            ((this.codes==null && other.getCodes()==null) || 
             (this.codes!=null &&
              java.util.Arrays.equals(this.codes, other.getCodes()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.dateListed==null && other.getDateListed()==null) || 
             (this.dateListed!=null &&
              this.dateListed.equals(other.getDateListed()))) &&
            ((this.listReferenceNumber==null && other.getListReferenceNumber()==null) || 
             (this.listReferenceNumber!=null &&
              this.listReferenceNumber.equals(other.getListReferenceNumber()))) &&
            ((this.ports==null && other.getPorts()==null) || 
             (this.ports!=null &&
              java.util.Arrays.equals(this.ports, other.getPorts()))) &&
            ((this.reasonListed==null && other.getReasonListed()==null) || 
             (this.reasonListed!=null &&
              this.reasonListed.equals(other.getReasonListed()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              java.util.Arrays.equals(this.terms, other.getTerms())));
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
        if (getAKAs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAKAs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAKAs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getDateListed() != null) {
            _hashCode += getDateListed().hashCode();
        }
        if (getListReferenceNumber() != null) {
            _hashCode += getListReferenceNumber().hashCode();
        }
        if (getPorts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPorts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPorts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReasonListed() != null) {
            _hashCode += getReasonListed().hashCode();
        }
        if (getTerms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTerms(), i);
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
        new org.apache.axis.description.TypeDesc(WLCountryDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLCountryDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AKAs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AKAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Cities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Codes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateListed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DateListed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ListReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ports");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Ports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonListed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ReasonListed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
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
