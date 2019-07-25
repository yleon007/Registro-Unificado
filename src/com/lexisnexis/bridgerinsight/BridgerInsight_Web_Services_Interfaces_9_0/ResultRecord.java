/**
 * ResultRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ResultRecord  implements java.io.Serializable {
    private long[] attachmentIDs;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FraudPointResults fraudPoint;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDBusinessResults instantIDBusiness;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDIndividualResults instantIDIndividual;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDIntlIndividualResults instantIDIntlIndividual;

    private java.lang.Long record;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultRecordDetails recordDetails;

    private java.lang.Long resultID;

    private java.lang.Long runID;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistResults watchlist;

    public ResultRecord() {
    }

    public ResultRecord(
           long[] attachmentIDs,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FraudPointResults fraudPoint,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDBusinessResults instantIDBusiness,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDIndividualResults instantIDIndividual,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDIntlIndividualResults instantIDIntlIndividual,
           java.lang.Long record,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultRecordDetails recordDetails,
           java.lang.Long resultID,
           java.lang.Long runID,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistResults watchlist) {
           this.attachmentIDs = attachmentIDs;
           this.fraudPoint = fraudPoint;
           this.instantIDBusiness = instantIDBusiness;
           this.instantIDIndividual = instantIDIndividual;
           this.instantIDIntlIndividual = instantIDIntlIndividual;
           this.record = record;
           this.recordDetails = recordDetails;
           this.resultID = resultID;
           this.runID = runID;
           this.watchlist = watchlist;
    }


    /**
     * Gets the attachmentIDs value for this ResultRecord.
     * 
     * @return attachmentIDs
     */
    public long[] getAttachmentIDs() {
        return attachmentIDs;
    }


    /**
     * Sets the attachmentIDs value for this ResultRecord.
     * 
     * @param attachmentIDs
     */
    public void setAttachmentIDs(long[] attachmentIDs) {
        this.attachmentIDs = attachmentIDs;
    }


    /**
     * Gets the fraudPoint value for this ResultRecord.
     * 
     * @return fraudPoint
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FraudPointResults getFraudPoint() {
        return fraudPoint;
    }


    /**
     * Sets the fraudPoint value for this ResultRecord.
     * 
     * @param fraudPoint
     */
    public void setFraudPoint(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FraudPointResults fraudPoint) {
        this.fraudPoint = fraudPoint;
    }


    /**
     * Gets the instantIDBusiness value for this ResultRecord.
     * 
     * @return instantIDBusiness
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDBusinessResults getInstantIDBusiness() {
        return instantIDBusiness;
    }


    /**
     * Sets the instantIDBusiness value for this ResultRecord.
     * 
     * @param instantIDBusiness
     */
    public void setInstantIDBusiness(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDBusinessResults instantIDBusiness) {
        this.instantIDBusiness = instantIDBusiness;
    }


    /**
     * Gets the instantIDIndividual value for this ResultRecord.
     * 
     * @return instantIDIndividual
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDIndividualResults getInstantIDIndividual() {
        return instantIDIndividual;
    }


    /**
     * Sets the instantIDIndividual value for this ResultRecord.
     * 
     * @param instantIDIndividual
     */
    public void setInstantIDIndividual(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDIndividualResults instantIDIndividual) {
        this.instantIDIndividual = instantIDIndividual;
    }


    /**
     * Gets the instantIDIntlIndividual value for this ResultRecord.
     * 
     * @return instantIDIntlIndividual
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDIntlIndividualResults getInstantIDIntlIndividual() {
        return instantIDIntlIndividual;
    }


    /**
     * Sets the instantIDIntlIndividual value for this ResultRecord.
     * 
     * @param instantIDIntlIndividual
     */
    public void setInstantIDIntlIndividual(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDIntlIndividualResults instantIDIntlIndividual) {
        this.instantIDIntlIndividual = instantIDIntlIndividual;
    }


    /**
     * Gets the record value for this ResultRecord.
     * 
     * @return record
     */
    public java.lang.Long getRecord() {
        return record;
    }


    /**
     * Sets the record value for this ResultRecord.
     * 
     * @param record
     */
    public void setRecord(java.lang.Long record) {
        this.record = record;
    }


    /**
     * Gets the recordDetails value for this ResultRecord.
     * 
     * @return recordDetails
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultRecordDetails getRecordDetails() {
        return recordDetails;
    }


    /**
     * Sets the recordDetails value for this ResultRecord.
     * 
     * @param recordDetails
     */
    public void setRecordDetails(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultRecordDetails recordDetails) {
        this.recordDetails = recordDetails;
    }


    /**
     * Gets the resultID value for this ResultRecord.
     * 
     * @return resultID
     */
    public java.lang.Long getResultID() {
        return resultID;
    }


    /**
     * Sets the resultID value for this ResultRecord.
     * 
     * @param resultID
     */
    public void setResultID(java.lang.Long resultID) {
        this.resultID = resultID;
    }


    /**
     * Gets the runID value for this ResultRecord.
     * 
     * @return runID
     */
    public java.lang.Long getRunID() {
        return runID;
    }


    /**
     * Sets the runID value for this ResultRecord.
     * 
     * @param runID
     */
    public void setRunID(java.lang.Long runID) {
        this.runID = runID;
    }


    /**
     * Gets the watchlist value for this ResultRecord.
     * 
     * @return watchlist
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistResults getWatchlist() {
        return watchlist;
    }


    /**
     * Sets the watchlist value for this ResultRecord.
     * 
     * @param watchlist
     */
    public void setWatchlist(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistResults watchlist) {
        this.watchlist = watchlist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultRecord)) return false;
        ResultRecord other = (ResultRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attachmentIDs==null && other.getAttachmentIDs()==null) || 
             (this.attachmentIDs!=null &&
              java.util.Arrays.equals(this.attachmentIDs, other.getAttachmentIDs()))) &&
            ((this.fraudPoint==null && other.getFraudPoint()==null) || 
             (this.fraudPoint!=null &&
              this.fraudPoint.equals(other.getFraudPoint()))) &&
            ((this.instantIDBusiness==null && other.getInstantIDBusiness()==null) || 
             (this.instantIDBusiness!=null &&
              this.instantIDBusiness.equals(other.getInstantIDBusiness()))) &&
            ((this.instantIDIndividual==null && other.getInstantIDIndividual()==null) || 
             (this.instantIDIndividual!=null &&
              this.instantIDIndividual.equals(other.getInstantIDIndividual()))) &&
            ((this.instantIDIntlIndividual==null && other.getInstantIDIntlIndividual()==null) || 
             (this.instantIDIntlIndividual!=null &&
              this.instantIDIntlIndividual.equals(other.getInstantIDIntlIndividual()))) &&
            ((this.record==null && other.getRecord()==null) || 
             (this.record!=null &&
              this.record.equals(other.getRecord()))) &&
            ((this.recordDetails==null && other.getRecordDetails()==null) || 
             (this.recordDetails!=null &&
              this.recordDetails.equals(other.getRecordDetails()))) &&
            ((this.resultID==null && other.getResultID()==null) || 
             (this.resultID!=null &&
              this.resultID.equals(other.getResultID()))) &&
            ((this.runID==null && other.getRunID()==null) || 
             (this.runID!=null &&
              this.runID.equals(other.getRunID()))) &&
            ((this.watchlist==null && other.getWatchlist()==null) || 
             (this.watchlist!=null &&
              this.watchlist.equals(other.getWatchlist())));
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
        if (getAttachmentIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachmentIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachmentIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFraudPoint() != null) {
            _hashCode += getFraudPoint().hashCode();
        }
        if (getInstantIDBusiness() != null) {
            _hashCode += getInstantIDBusiness().hashCode();
        }
        if (getInstantIDIndividual() != null) {
            _hashCode += getInstantIDIndividual().hashCode();
        }
        if (getInstantIDIntlIndividual() != null) {
            _hashCode += getInstantIDIntlIndividual().hashCode();
        }
        if (getRecord() != null) {
            _hashCode += getRecord().hashCode();
        }
        if (getRecordDetails() != null) {
            _hashCode += getRecordDetails().hashCode();
        }
        if (getResultID() != null) {
            _hashCode += getResultID().hashCode();
        }
        if (getRunID() != null) {
            _hashCode += getRunID().hashCode();
        }
        if (getWatchlist() != null) {
            _hashCode += getWatchlist().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AttachmentIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FraudPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FraudPointResults"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instantIDBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDBusinessResults"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instantIDIndividual");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDIndividual"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDIndividualResults"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instantIDIntlIndividual");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDIntlIndividual"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDIntlIndividualResults"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("record");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Record"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RecordDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultRecordDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RunID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("watchlist");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Watchlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistResults"));
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
