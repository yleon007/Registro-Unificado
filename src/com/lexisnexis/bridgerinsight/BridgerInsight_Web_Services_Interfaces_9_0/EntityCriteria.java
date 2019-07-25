/**
 * EntityCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class EntityCriteria  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaAdditionalInfo additionalInfo;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaAddress address;

    private java.lang.String entityAddedBy;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListEntityType entityType;

    private java.lang.Boolean excludeIfTrueMatchesOnly;

    private java.lang.String firstName;

    private java.lang.String fullName;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaID ID;

    private java.lang.String lastName;

    private java.lang.String middleName;

    private java.lang.String SSNEIN;

    private java.lang.Boolean trueMatchesOnly;

    public EntityCriteria() {
    }

    public EntityCriteria(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaAdditionalInfo additionalInfo,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaAddress address,
           java.lang.String entityAddedBy,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListEntityType entityType,
           java.lang.Boolean excludeIfTrueMatchesOnly,
           java.lang.String firstName,
           java.lang.String fullName,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaID ID,
           java.lang.String lastName,
           java.lang.String middleName,
           java.lang.String SSNEIN,
           java.lang.Boolean trueMatchesOnly) {
           this.additionalInfo = additionalInfo;
           this.address = address;
           this.entityAddedBy = entityAddedBy;
           this.entityType = entityType;
           this.excludeIfTrueMatchesOnly = excludeIfTrueMatchesOnly;
           this.firstName = firstName;
           this.fullName = fullName;
           this.ID = ID;
           this.lastName = lastName;
           this.middleName = middleName;
           this.SSNEIN = SSNEIN;
           this.trueMatchesOnly = trueMatchesOnly;
    }


    /**
     * Gets the additionalInfo value for this EntityCriteria.
     * 
     * @return additionalInfo
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this EntityCriteria.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the address value for this EntityCriteria.
     * 
     * @return address
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this EntityCriteria.
     * 
     * @param address
     */
    public void setAddress(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaAddress address) {
        this.address = address;
    }


    /**
     * Gets the entityAddedBy value for this EntityCriteria.
     * 
     * @return entityAddedBy
     */
    public java.lang.String getEntityAddedBy() {
        return entityAddedBy;
    }


    /**
     * Sets the entityAddedBy value for this EntityCriteria.
     * 
     * @param entityAddedBy
     */
    public void setEntityAddedBy(java.lang.String entityAddedBy) {
        this.entityAddedBy = entityAddedBy;
    }


    /**
     * Gets the entityType value for this EntityCriteria.
     * 
     * @return entityType
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListEntityType getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this EntityCriteria.
     * 
     * @param entityType
     */
    public void setEntityType(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListEntityType entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the excludeIfTrueMatchesOnly value for this EntityCriteria.
     * 
     * @return excludeIfTrueMatchesOnly
     */
    public java.lang.Boolean getExcludeIfTrueMatchesOnly() {
        return excludeIfTrueMatchesOnly;
    }


    /**
     * Sets the excludeIfTrueMatchesOnly value for this EntityCriteria.
     * 
     * @param excludeIfTrueMatchesOnly
     */
    public void setExcludeIfTrueMatchesOnly(java.lang.Boolean excludeIfTrueMatchesOnly) {
        this.excludeIfTrueMatchesOnly = excludeIfTrueMatchesOnly;
    }


    /**
     * Gets the firstName value for this EntityCriteria.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this EntityCriteria.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the fullName value for this EntityCriteria.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this EntityCriteria.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the ID value for this EntityCriteria.
     * 
     * @return ID
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaID getID() {
        return ID;
    }


    /**
     * Sets the ID value for this EntityCriteria.
     * 
     * @param ID
     */
    public void setID(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityCriteriaID ID) {
        this.ID = ID;
    }


    /**
     * Gets the lastName value for this EntityCriteria.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this EntityCriteria.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the middleName value for this EntityCriteria.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this EntityCriteria.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the SSNEIN value for this EntityCriteria.
     * 
     * @return SSNEIN
     */
    public java.lang.String getSSNEIN() {
        return SSNEIN;
    }


    /**
     * Sets the SSNEIN value for this EntityCriteria.
     * 
     * @param SSNEIN
     */
    public void setSSNEIN(java.lang.String SSNEIN) {
        this.SSNEIN = SSNEIN;
    }


    /**
     * Gets the trueMatchesOnly value for this EntityCriteria.
     * 
     * @return trueMatchesOnly
     */
    public java.lang.Boolean getTrueMatchesOnly() {
        return trueMatchesOnly;
    }


    /**
     * Sets the trueMatchesOnly value for this EntityCriteria.
     * 
     * @param trueMatchesOnly
     */
    public void setTrueMatchesOnly(java.lang.Boolean trueMatchesOnly) {
        this.trueMatchesOnly = trueMatchesOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityCriteria)) return false;
        EntityCriteria other = (EntityCriteria) obj;
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
              this.additionalInfo.equals(other.getAdditionalInfo()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.entityAddedBy==null && other.getEntityAddedBy()==null) || 
             (this.entityAddedBy!=null &&
              this.entityAddedBy.equals(other.getEntityAddedBy()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.excludeIfTrueMatchesOnly==null && other.getExcludeIfTrueMatchesOnly()==null) || 
             (this.excludeIfTrueMatchesOnly!=null &&
              this.excludeIfTrueMatchesOnly.equals(other.getExcludeIfTrueMatchesOnly()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.SSNEIN==null && other.getSSNEIN()==null) || 
             (this.SSNEIN!=null &&
              this.SSNEIN.equals(other.getSSNEIN()))) &&
            ((this.trueMatchesOnly==null && other.getTrueMatchesOnly()==null) || 
             (this.trueMatchesOnly!=null &&
              this.trueMatchesOnly.equals(other.getTrueMatchesOnly())));
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
            _hashCode += getAdditionalInfo().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getEntityAddedBy() != null) {
            _hashCode += getEntityAddedBy().hashCode();
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getExcludeIfTrueMatchesOnly() != null) {
            _hashCode += getExcludeIfTrueMatchesOnly().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getSSNEIN() != null) {
            _hashCode += getSSNEIN().hashCode();
        }
        if (getTrueMatchesOnly() != null) {
            _hashCode += getTrueMatchesOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityCriteriaAdditionalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityCriteriaAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityAddedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAddedBy"));
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
        elemField.setFieldName("excludeIfTrueMatchesOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ExcludeIfTrueMatchesOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityCriteriaID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "MiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSNEIN");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SSNEIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trueMatchesOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TrueMatchesOnly"));
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
