/**
 * RunsCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class RunsCriteria  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Date dateEnd;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Date dateStart;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType EFTType;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType entityType;

    private java.lang.String fileName;

    private java.lang.String predefinedSearch;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ProcessingStateType processingState;

    private java.lang.String[] submitType;

    public RunsCriteria() {
    }

    public RunsCriteria(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Date dateEnd,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Date dateStart,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType EFTType,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType entityType,
           java.lang.String fileName,
           java.lang.String predefinedSearch,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ProcessingStateType processingState,
           java.lang.String[] submitType) {
           this.dateEnd = dateEnd;
           this.dateStart = dateStart;
           this.EFTType = EFTType;
           this.entityType = entityType;
           this.fileName = fileName;
           this.predefinedSearch = predefinedSearch;
           this.processingState = processingState;
           this.submitType = submitType;
    }


    /**
     * Gets the dateEnd value for this RunsCriteria.
     * 
     * @return dateEnd
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Date getDateEnd() {
        return dateEnd;
    }


    /**
     * Sets the dateEnd value for this RunsCriteria.
     * 
     * @param dateEnd
     */
    public void setDateEnd(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Date dateEnd) {
        this.dateEnd = dateEnd;
    }


    /**
     * Gets the dateStart value for this RunsCriteria.
     * 
     * @return dateStart
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Date getDateStart() {
        return dateStart;
    }


    /**
     * Sets the dateStart value for this RunsCriteria.
     * 
     * @param dateStart
     */
    public void setDateStart(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Date dateStart) {
        this.dateStart = dateStart;
    }


    /**
     * Gets the EFTType value for this RunsCriteria.
     * 
     * @return EFTType
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType getEFTType() {
        return EFTType;
    }


    /**
     * Sets the EFTType value for this RunsCriteria.
     * 
     * @param EFTType
     */
    public void setEFTType(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType EFTType) {
        this.EFTType = EFTType;
    }


    /**
     * Gets the entityType value for this RunsCriteria.
     * 
     * @return entityType
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this RunsCriteria.
     * 
     * @param entityType
     */
    public void setEntityType(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the fileName value for this RunsCriteria.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this RunsCriteria.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the predefinedSearch value for this RunsCriteria.
     * 
     * @return predefinedSearch
     */
    public java.lang.String getPredefinedSearch() {
        return predefinedSearch;
    }


    /**
     * Sets the predefinedSearch value for this RunsCriteria.
     * 
     * @param predefinedSearch
     */
    public void setPredefinedSearch(java.lang.String predefinedSearch) {
        this.predefinedSearch = predefinedSearch;
    }


    /**
     * Gets the processingState value for this RunsCriteria.
     * 
     * @return processingState
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ProcessingStateType getProcessingState() {
        return processingState;
    }


    /**
     * Sets the processingState value for this RunsCriteria.
     * 
     * @param processingState
     */
    public void setProcessingState(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ProcessingStateType processingState) {
        this.processingState = processingState;
    }


    /**
     * Gets the submitType value for this RunsCriteria.
     * 
     * @return submitType
     */
    public java.lang.String[] getSubmitType() {
        return submitType;
    }


    /**
     * Sets the submitType value for this RunsCriteria.
     * 
     * @param submitType
     */
    public void setSubmitType(java.lang.String[] submitType) {
        this.submitType = submitType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunsCriteria)) return false;
        RunsCriteria other = (RunsCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateEnd==null && other.getDateEnd()==null) || 
             (this.dateEnd!=null &&
              this.dateEnd.equals(other.getDateEnd()))) &&
            ((this.dateStart==null && other.getDateStart()==null) || 
             (this.dateStart!=null &&
              this.dateStart.equals(other.getDateStart()))) &&
            ((this.EFTType==null && other.getEFTType()==null) || 
             (this.EFTType!=null &&
              this.EFTType.equals(other.getEFTType()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.predefinedSearch==null && other.getPredefinedSearch()==null) || 
             (this.predefinedSearch!=null &&
              this.predefinedSearch.equals(other.getPredefinedSearch()))) &&
            ((this.processingState==null && other.getProcessingState()==null) || 
             (this.processingState!=null &&
              this.processingState.equals(other.getProcessingState()))) &&
            ((this.submitType==null && other.getSubmitType()==null) || 
             (this.submitType!=null &&
              java.util.Arrays.equals(this.submitType, other.getSubmitType())));
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
        if (getDateEnd() != null) {
            _hashCode += getDateEnd().hashCode();
        }
        if (getDateStart() != null) {
            _hashCode += getDateStart().hashCode();
        }
        if (getEFTType() != null) {
            _hashCode += getEFTType().hashCode();
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getPredefinedSearch() != null) {
            _hashCode += getPredefinedSearch().hashCode();
        }
        if (getProcessingState() != null) {
            _hashCode += getProcessingState().hashCode();
        }
        if (getSubmitType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubmitType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubmitType(), i);
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
        new org.apache.axis.description.TypeDesc(RunsCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RunsCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EFTType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EFTType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EFTType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultEntityType"));
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
        elemField.setFieldName("predefinedSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PredefinedSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ProcessingState"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ProcessingStateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SubmitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RunsCritieraSubmitType"));
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
