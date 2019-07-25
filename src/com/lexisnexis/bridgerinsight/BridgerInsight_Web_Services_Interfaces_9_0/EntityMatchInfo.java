/**
 * EntityMatchInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class EntityMatchInfo  implements java.io.Serializable {
    private java.lang.String bestName;

    private java.lang.Integer checkSum;

    private java.lang.Boolean customFile;

    private java.lang.String entityName;

    private java.lang.Integer entityScore;

    private java.lang.String entityUniqueID;

    private java.util.Calendar fileDate;

    private java.lang.String fileName;

    private java.lang.Long ID;

    private java.lang.Long lastAlertResultID;

    private java.lang.Long originatingResultID;

    private java.util.Calendar publishedDate;

    public EntityMatchInfo() {
    }

    public EntityMatchInfo(
           java.lang.String bestName,
           java.lang.Integer checkSum,
           java.lang.Boolean customFile,
           java.lang.String entityName,
           java.lang.Integer entityScore,
           java.lang.String entityUniqueID,
           java.util.Calendar fileDate,
           java.lang.String fileName,
           java.lang.Long ID,
           java.lang.Long lastAlertResultID,
           java.lang.Long originatingResultID,
           java.util.Calendar publishedDate) {
           this.bestName = bestName;
           this.checkSum = checkSum;
           this.customFile = customFile;
           this.entityName = entityName;
           this.entityScore = entityScore;
           this.entityUniqueID = entityUniqueID;
           this.fileDate = fileDate;
           this.fileName = fileName;
           this.ID = ID;
           this.lastAlertResultID = lastAlertResultID;
           this.originatingResultID = originatingResultID;
           this.publishedDate = publishedDate;
    }


    /**
     * Gets the bestName value for this EntityMatchInfo.
     * 
     * @return bestName
     */
    public java.lang.String getBestName() {
        return bestName;
    }


    /**
     * Sets the bestName value for this EntityMatchInfo.
     * 
     * @param bestName
     */
    public void setBestName(java.lang.String bestName) {
        this.bestName = bestName;
    }


    /**
     * Gets the checkSum value for this EntityMatchInfo.
     * 
     * @return checkSum
     */
    public java.lang.Integer getCheckSum() {
        return checkSum;
    }


    /**
     * Sets the checkSum value for this EntityMatchInfo.
     * 
     * @param checkSum
     */
    public void setCheckSum(java.lang.Integer checkSum) {
        this.checkSum = checkSum;
    }


    /**
     * Gets the customFile value for this EntityMatchInfo.
     * 
     * @return customFile
     */
    public java.lang.Boolean getCustomFile() {
        return customFile;
    }


    /**
     * Sets the customFile value for this EntityMatchInfo.
     * 
     * @param customFile
     */
    public void setCustomFile(java.lang.Boolean customFile) {
        this.customFile = customFile;
    }


    /**
     * Gets the entityName value for this EntityMatchInfo.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this EntityMatchInfo.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }


    /**
     * Gets the entityScore value for this EntityMatchInfo.
     * 
     * @return entityScore
     */
    public java.lang.Integer getEntityScore() {
        return entityScore;
    }


    /**
     * Sets the entityScore value for this EntityMatchInfo.
     * 
     * @param entityScore
     */
    public void setEntityScore(java.lang.Integer entityScore) {
        this.entityScore = entityScore;
    }


    /**
     * Gets the entityUniqueID value for this EntityMatchInfo.
     * 
     * @return entityUniqueID
     */
    public java.lang.String getEntityUniqueID() {
        return entityUniqueID;
    }


    /**
     * Sets the entityUniqueID value for this EntityMatchInfo.
     * 
     * @param entityUniqueID
     */
    public void setEntityUniqueID(java.lang.String entityUniqueID) {
        this.entityUniqueID = entityUniqueID;
    }


    /**
     * Gets the fileDate value for this EntityMatchInfo.
     * 
     * @return fileDate
     */
    public java.util.Calendar getFileDate() {
        return fileDate;
    }


    /**
     * Sets the fileDate value for this EntityMatchInfo.
     * 
     * @param fileDate
     */
    public void setFileDate(java.util.Calendar fileDate) {
        this.fileDate = fileDate;
    }


    /**
     * Gets the fileName value for this EntityMatchInfo.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this EntityMatchInfo.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the ID value for this EntityMatchInfo.
     * 
     * @return ID
     */
    public java.lang.Long getID() {
        return ID;
    }


    /**
     * Sets the ID value for this EntityMatchInfo.
     * 
     * @param ID
     */
    public void setID(java.lang.Long ID) {
        this.ID = ID;
    }


    /**
     * Gets the lastAlertResultID value for this EntityMatchInfo.
     * 
     * @return lastAlertResultID
     */
    public java.lang.Long getLastAlertResultID() {
        return lastAlertResultID;
    }


    /**
     * Sets the lastAlertResultID value for this EntityMatchInfo.
     * 
     * @param lastAlertResultID
     */
    public void setLastAlertResultID(java.lang.Long lastAlertResultID) {
        this.lastAlertResultID = lastAlertResultID;
    }


    /**
     * Gets the originatingResultID value for this EntityMatchInfo.
     * 
     * @return originatingResultID
     */
    public java.lang.Long getOriginatingResultID() {
        return originatingResultID;
    }


    /**
     * Sets the originatingResultID value for this EntityMatchInfo.
     * 
     * @param originatingResultID
     */
    public void setOriginatingResultID(java.lang.Long originatingResultID) {
        this.originatingResultID = originatingResultID;
    }


    /**
     * Gets the publishedDate value for this EntityMatchInfo.
     * 
     * @return publishedDate
     */
    public java.util.Calendar getPublishedDate() {
        return publishedDate;
    }


    /**
     * Sets the publishedDate value for this EntityMatchInfo.
     * 
     * @param publishedDate
     */
    public void setPublishedDate(java.util.Calendar publishedDate) {
        this.publishedDate = publishedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityMatchInfo)) return false;
        EntityMatchInfo other = (EntityMatchInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bestName==null && other.getBestName()==null) || 
             (this.bestName!=null &&
              this.bestName.equals(other.getBestName()))) &&
            ((this.checkSum==null && other.getCheckSum()==null) || 
             (this.checkSum!=null &&
              this.checkSum.equals(other.getCheckSum()))) &&
            ((this.customFile==null && other.getCustomFile()==null) || 
             (this.customFile!=null &&
              this.customFile.equals(other.getCustomFile()))) &&
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName()))) &&
            ((this.entityScore==null && other.getEntityScore()==null) || 
             (this.entityScore!=null &&
              this.entityScore.equals(other.getEntityScore()))) &&
            ((this.entityUniqueID==null && other.getEntityUniqueID()==null) || 
             (this.entityUniqueID!=null &&
              this.entityUniqueID.equals(other.getEntityUniqueID()))) &&
            ((this.fileDate==null && other.getFileDate()==null) || 
             (this.fileDate!=null &&
              this.fileDate.equals(other.getFileDate()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.lastAlertResultID==null && other.getLastAlertResultID()==null) || 
             (this.lastAlertResultID!=null &&
              this.lastAlertResultID.equals(other.getLastAlertResultID()))) &&
            ((this.originatingResultID==null && other.getOriginatingResultID()==null) || 
             (this.originatingResultID!=null &&
              this.originatingResultID.equals(other.getOriginatingResultID()))) &&
            ((this.publishedDate==null && other.getPublishedDate()==null) || 
             (this.publishedDate!=null &&
              this.publishedDate.equals(other.getPublishedDate())));
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
        if (getBestName() != null) {
            _hashCode += getBestName().hashCode();
        }
        if (getCheckSum() != null) {
            _hashCode += getCheckSum().hashCode();
        }
        if (getCustomFile() != null) {
            _hashCode += getCustomFile().hashCode();
        }
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        if (getEntityScore() != null) {
            _hashCode += getEntityScore().hashCode();
        }
        if (getEntityUniqueID() != null) {
            _hashCode += getEntityUniqueID().hashCode();
        }
        if (getFileDate() != null) {
            _hashCode += getFileDate().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getLastAlertResultID() != null) {
            _hashCode += getLastAlertResultID().hashCode();
        }
        if (getOriginatingResultID() != null) {
            _hashCode += getOriginatingResultID().hashCode();
        }
        if (getPublishedDate() != null) {
            _hashCode += getPublishedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityMatchInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityMatchInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bestName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "BestName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkSum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CheckSum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFile");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CustomFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityScore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityUniqueID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityUniqueID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FileDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("lastAlertResultID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "LastAlertResultID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingResultID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "OriginatingResultID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PublishedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
