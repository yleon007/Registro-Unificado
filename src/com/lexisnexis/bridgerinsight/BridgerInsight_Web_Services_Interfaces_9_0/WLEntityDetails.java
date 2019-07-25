/**
 * WLEntityDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class WLEntityDetails  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAdditionalInfo[] additionalInfo;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAddress[] addresses;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAKA[] AKAs;

    private java.lang.String comments;

    private java.lang.String dateListed;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListEntityType entityType;

    private java.lang.String gender;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityID[] IDs;

    private java.lang.String listReferenceNumber;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityName name;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityPhone[] phones;

    private java.lang.String reasonListed;

    public WLEntityDetails() {
    }

    public WLEntityDetails(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAdditionalInfo[] additionalInfo,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAddress[] addresses,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAKA[] AKAs,
           java.lang.String comments,
           java.lang.String dateListed,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListEntityType entityType,
           java.lang.String gender,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityID[] IDs,
           java.lang.String listReferenceNumber,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityName name,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityPhone[] phones,
           java.lang.String reasonListed) {
           this.additionalInfo = additionalInfo;
           this.addresses = addresses;
           this.AKAs = AKAs;
           this.comments = comments;
           this.dateListed = dateListed;
           this.entityType = entityType;
           this.gender = gender;
           this.IDs = IDs;
           this.listReferenceNumber = listReferenceNumber;
           this.name = name;
           this.phones = phones;
           this.reasonListed = reasonListed;
    }


    /**
     * Gets the additionalInfo value for this WLEntityDetails.
     * 
     * @return additionalInfo
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this WLEntityDetails.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the addresses value for this WLEntityDetails.
     * 
     * @return addresses
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAddress[] getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this WLEntityDetails.
     * 
     * @param addresses
     */
    public void setAddresses(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAddress[] addresses) {
        this.addresses = addresses;
    }


    /**
     * Gets the AKAs value for this WLEntityDetails.
     * 
     * @return AKAs
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAKA[] getAKAs() {
        return AKAs;
    }


    /**
     * Sets the AKAs value for this WLEntityDetails.
     * 
     * @param AKAs
     */
    public void setAKAs(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAKA[] AKAs) {
        this.AKAs = AKAs;
    }


    /**
     * Gets the comments value for this WLEntityDetails.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this WLEntityDetails.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the dateListed value for this WLEntityDetails.
     * 
     * @return dateListed
     */
    public java.lang.String getDateListed() {
        return dateListed;
    }


    /**
     * Sets the dateListed value for this WLEntityDetails.
     * 
     * @param dateListed
     */
    public void setDateListed(java.lang.String dateListed) {
        this.dateListed = dateListed;
    }


    /**
     * Gets the entityType value for this WLEntityDetails.
     * 
     * @return entityType
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListEntityType getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this WLEntityDetails.
     * 
     * @param entityType
     */
    public void setEntityType(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListEntityType entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the gender value for this WLEntityDetails.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this WLEntityDetails.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the IDs value for this WLEntityDetails.
     * 
     * @return IDs
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityID[] getIDs() {
        return IDs;
    }


    /**
     * Sets the IDs value for this WLEntityDetails.
     * 
     * @param IDs
     */
    public void setIDs(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityID[] IDs) {
        this.IDs = IDs;
    }


    /**
     * Gets the listReferenceNumber value for this WLEntityDetails.
     * 
     * @return listReferenceNumber
     */
    public java.lang.String getListReferenceNumber() {
        return listReferenceNumber;
    }


    /**
     * Sets the listReferenceNumber value for this WLEntityDetails.
     * 
     * @param listReferenceNumber
     */
    public void setListReferenceNumber(java.lang.String listReferenceNumber) {
        this.listReferenceNumber = listReferenceNumber;
    }


    /**
     * Gets the name value for this WLEntityDetails.
     * 
     * @return name
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityName getName() {
        return name;
    }


    /**
     * Sets the name value for this WLEntityDetails.
     * 
     * @param name
     */
    public void setName(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityName name) {
        this.name = name;
    }


    /**
     * Gets the phones value for this WLEntityDetails.
     * 
     * @return phones
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityPhone[] getPhones() {
        return phones;
    }


    /**
     * Sets the phones value for this WLEntityDetails.
     * 
     * @param phones
     */
    public void setPhones(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityPhone[] phones) {
        this.phones = phones;
    }


    /**
     * Gets the reasonListed value for this WLEntityDetails.
     * 
     * @return reasonListed
     */
    public java.lang.String getReasonListed() {
        return reasonListed;
    }


    /**
     * Sets the reasonListed value for this WLEntityDetails.
     * 
     * @param reasonListed
     */
    public void setReasonListed(java.lang.String reasonListed) {
        this.reasonListed = reasonListed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WLEntityDetails)) return false;
        WLEntityDetails other = (WLEntityDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              java.util.Arrays.equals(this.additionalInfo, other.getAdditionalInfo()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              java.util.Arrays.equals(this.addresses, other.getAddresses()))) &&
            ((this.AKAs==null && other.getAKAs()==null) || 
             (this.AKAs!=null &&
              java.util.Arrays.equals(this.AKAs, other.getAKAs()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.dateListed==null && other.getDateListed()==null) || 
             (this.dateListed!=null &&
              this.dateListed.equals(other.getDateListed()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.IDs==null && other.getIDs()==null) || 
             (this.IDs!=null &&
              java.util.Arrays.equals(this.IDs, other.getIDs()))) &&
            ((this.listReferenceNumber==null && other.getListReferenceNumber()==null) || 
             (this.listReferenceNumber!=null &&
              this.listReferenceNumber.equals(other.getListReferenceNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.phones==null && other.getPhones()==null) || 
             (this.phones!=null &&
              java.util.Arrays.equals(this.phones, other.getPhones()))) &&
            ((this.reasonListed==null && other.getReasonListed()==null) || 
             (this.reasonListed!=null &&
              this.reasonListed.equals(other.getReasonListed())));
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
        if (getAdditionalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getDateListed() != null) {
            _hashCode += getDateListed().hashCode();
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListReferenceNumber() != null) {
            _hashCode += getListReferenceNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPhones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReasonListed() != null) {
            _hashCode += getReasonListed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WLEntityDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLEntityDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAdditionalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAdditionalInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAddress"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AKAs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AKAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAKA"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAKA"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Comments"));
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
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ListEntityType"));
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
        elemField.setFieldName("IDs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityID"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ListReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phones");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Phones"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityPhone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityPhone"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonListed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ReasonListed"));
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
