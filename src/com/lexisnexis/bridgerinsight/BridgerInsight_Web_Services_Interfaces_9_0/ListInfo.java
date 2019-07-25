/**
 * ListInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ListInfo  implements java.io.Serializable {
    private java.lang.Boolean accountNumbersUniqueIDs;

    private java.lang.Boolean autoIndex;

    private java.lang.String comments;

    private java.lang.String description;

    private java.lang.String[] divisions;

    private java.lang.Boolean encrypt;

    private java.lang.Long ID;

    private java.lang.String name;

    private java.util.Calendar publication;

    private java.lang.String[] type;

    private java.lang.String uniqueID;

    private java.lang.Boolean userSelectedStatusRequired;

    public ListInfo() {
    }

    public ListInfo(
           java.lang.Boolean accountNumbersUniqueIDs,
           java.lang.Boolean autoIndex,
           java.lang.String comments,
           java.lang.String description,
           java.lang.String[] divisions,
           java.lang.Boolean encrypt,
           java.lang.Long ID,
           java.lang.String name,
           java.util.Calendar publication,
           java.lang.String[] type,
           java.lang.String uniqueID,
           java.lang.Boolean userSelectedStatusRequired) {
           this.accountNumbersUniqueIDs = accountNumbersUniqueIDs;
           this.autoIndex = autoIndex;
           this.comments = comments;
           this.description = description;
           this.divisions = divisions;
           this.encrypt = encrypt;
           this.ID = ID;
           this.name = name;
           this.publication = publication;
           this.type = type;
           this.uniqueID = uniqueID;
           this.userSelectedStatusRequired = userSelectedStatusRequired;
    }


    /**
     * Gets the accountNumbersUniqueIDs value for this ListInfo.
     * 
     * @return accountNumbersUniqueIDs
     */
    public java.lang.Boolean getAccountNumbersUniqueIDs() {
        return accountNumbersUniqueIDs;
    }


    /**
     * Sets the accountNumbersUniqueIDs value for this ListInfo.
     * 
     * @param accountNumbersUniqueIDs
     */
    public void setAccountNumbersUniqueIDs(java.lang.Boolean accountNumbersUniqueIDs) {
        this.accountNumbersUniqueIDs = accountNumbersUniqueIDs;
    }


    /**
     * Gets the autoIndex value for this ListInfo.
     * 
     * @return autoIndex
     */
    public java.lang.Boolean getAutoIndex() {
        return autoIndex;
    }


    /**
     * Sets the autoIndex value for this ListInfo.
     * 
     * @param autoIndex
     */
    public void setAutoIndex(java.lang.Boolean autoIndex) {
        this.autoIndex = autoIndex;
    }


    /**
     * Gets the comments value for this ListInfo.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this ListInfo.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the description value for this ListInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ListInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the divisions value for this ListInfo.
     * 
     * @return divisions
     */
    public java.lang.String[] getDivisions() {
        return divisions;
    }


    /**
     * Sets the divisions value for this ListInfo.
     * 
     * @param divisions
     */
    public void setDivisions(java.lang.String[] divisions) {
        this.divisions = divisions;
    }


    /**
     * Gets the encrypt value for this ListInfo.
     * 
     * @return encrypt
     */
    public java.lang.Boolean getEncrypt() {
        return encrypt;
    }


    /**
     * Sets the encrypt value for this ListInfo.
     * 
     * @param encrypt
     */
    public void setEncrypt(java.lang.Boolean encrypt) {
        this.encrypt = encrypt;
    }


    /**
     * Gets the ID value for this ListInfo.
     * 
     * @return ID
     */
    public java.lang.Long getID() {
        return ID;
    }


    /**
     * Sets the ID value for this ListInfo.
     * 
     * @param ID
     */
    public void setID(java.lang.Long ID) {
        this.ID = ID;
    }


    /**
     * Gets the name value for this ListInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ListInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the publication value for this ListInfo.
     * 
     * @return publication
     */
    public java.util.Calendar getPublication() {
        return publication;
    }


    /**
     * Sets the publication value for this ListInfo.
     * 
     * @param publication
     */
    public void setPublication(java.util.Calendar publication) {
        this.publication = publication;
    }


    /**
     * Gets the type value for this ListInfo.
     * 
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }


    /**
     * Sets the type value for this ListInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }


    /**
     * Gets the uniqueID value for this ListInfo.
     * 
     * @return uniqueID
     */
    public java.lang.String getUniqueID() {
        return uniqueID;
    }


    /**
     * Sets the uniqueID value for this ListInfo.
     * 
     * @param uniqueID
     */
    public void setUniqueID(java.lang.String uniqueID) {
        this.uniqueID = uniqueID;
    }


    /**
     * Gets the userSelectedStatusRequired value for this ListInfo.
     * 
     * @return userSelectedStatusRequired
     */
    public java.lang.Boolean getUserSelectedStatusRequired() {
        return userSelectedStatusRequired;
    }


    /**
     * Sets the userSelectedStatusRequired value for this ListInfo.
     * 
     * @param userSelectedStatusRequired
     */
    public void setUserSelectedStatusRequired(java.lang.Boolean userSelectedStatusRequired) {
        this.userSelectedStatusRequired = userSelectedStatusRequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListInfo)) return false;
        ListInfo other = (ListInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumbersUniqueIDs==null && other.getAccountNumbersUniqueIDs()==null) || 
             (this.accountNumbersUniqueIDs!=null &&
              this.accountNumbersUniqueIDs.equals(other.getAccountNumbersUniqueIDs()))) &&
            ((this.autoIndex==null && other.getAutoIndex()==null) || 
             (this.autoIndex!=null &&
              this.autoIndex.equals(other.getAutoIndex()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.divisions==null && other.getDivisions()==null) || 
             (this.divisions!=null &&
              java.util.Arrays.equals(this.divisions, other.getDivisions()))) &&
            ((this.encrypt==null && other.getEncrypt()==null) || 
             (this.encrypt!=null &&
              this.encrypt.equals(other.getEncrypt()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.publication==null && other.getPublication()==null) || 
             (this.publication!=null &&
              this.publication.equals(other.getPublication()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.uniqueID==null && other.getUniqueID()==null) || 
             (this.uniqueID!=null &&
              this.uniqueID.equals(other.getUniqueID()))) &&
            ((this.userSelectedStatusRequired==null && other.getUserSelectedStatusRequired()==null) || 
             (this.userSelectedStatusRequired!=null &&
              this.userSelectedStatusRequired.equals(other.getUserSelectedStatusRequired())));
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
        if (getAccountNumbersUniqueIDs() != null) {
            _hashCode += getAccountNumbersUniqueIDs().hashCode();
        }
        if (getAutoIndex() != null) {
            _hashCode += getAutoIndex().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDivisions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDivisions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDivisions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEncrypt() != null) {
            _hashCode += getEncrypt().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPublication() != null) {
            _hashCode += getPublication().hashCode();
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUniqueID() != null) {
            _hashCode += getUniqueID().hashCode();
        }
        if (getUserSelectedStatusRequired() != null) {
            _hashCode += getUserSelectedStatusRequired().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ListInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumbersUniqueIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AccountNumbersUniqueIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AutoIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Divisions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encrypt");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Encrypt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publication");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Publication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "UniqueID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSelectedStatusRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "UserSelectedStatusRequired"));
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
