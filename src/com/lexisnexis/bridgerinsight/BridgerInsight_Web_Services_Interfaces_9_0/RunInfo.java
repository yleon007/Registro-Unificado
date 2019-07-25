/**
 * RunInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class RunInfo  implements java.io.Serializable {
    private java.lang.Integer alertCount;

    private java.lang.String division;

    private java.lang.Integer divisionID;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType DPPA;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType EFTType;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType entityType;

    private java.lang.Integer errorCount;

    private java.lang.String errorMessage;

    private java.lang.String fileName;

    private java.lang.String fileFormatName;

    private java.lang.Integer GLB;

    private java.util.Calendar lastUpdateTime;

    private java.lang.Integer numRecordsProcessed;

    private java.lang.String permissibleUse;

    private java.lang.String predefinedSearchName;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ProcessingStateType processingState;

    private java.lang.String resultsFile1;

    private java.lang.String resultsFile2;

    private java.lang.Long runID;

    private java.util.Calendar startTime;

    private java.lang.String submitType;

    private java.lang.Integer totalNumRecords;

    private java.lang.Integer totalNumRows;

    private java.lang.String userName;

    private java.lang.Integer WLMatchCount;

    public RunInfo() {
    }

    public RunInfo(
           java.lang.Integer alertCount,
           java.lang.String division,
           java.lang.Integer divisionID,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType DPPA,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType EFTType,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType entityType,
           java.lang.Integer errorCount,
           java.lang.String errorMessage,
           java.lang.String fileName,
           java.lang.String fileFormatName,
           java.lang.Integer GLB,
           java.util.Calendar lastUpdateTime,
           java.lang.Integer numRecordsProcessed,
           java.lang.String permissibleUse,
           java.lang.String predefinedSearchName,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ProcessingStateType processingState,
           java.lang.String resultsFile1,
           java.lang.String resultsFile2,
           java.lang.Long runID,
           java.util.Calendar startTime,
           java.lang.String submitType,
           java.lang.Integer totalNumRecords,
           java.lang.Integer totalNumRows,
           java.lang.String userName,
           java.lang.Integer WLMatchCount) {
           this.alertCount = alertCount;
           this.division = division;
           this.divisionID = divisionID;
           this.DPPA = DPPA;
           this.EFTType = EFTType;
           this.entityType = entityType;
           this.errorCount = errorCount;
           this.errorMessage = errorMessage;
           this.fileName = fileName;
           this.fileFormatName = fileFormatName;
           this.GLB = GLB;
           this.lastUpdateTime = lastUpdateTime;
           this.numRecordsProcessed = numRecordsProcessed;
           this.permissibleUse = permissibleUse;
           this.predefinedSearchName = predefinedSearchName;
           this.processingState = processingState;
           this.resultsFile1 = resultsFile1;
           this.resultsFile2 = resultsFile2;
           this.runID = runID;
           this.startTime = startTime;
           this.submitType = submitType;
           this.totalNumRecords = totalNumRecords;
           this.totalNumRows = totalNumRows;
           this.userName = userName;
           this.WLMatchCount = WLMatchCount;
    }


    /**
     * Gets the alertCount value for this RunInfo.
     * 
     * @return alertCount
     */
    public java.lang.Integer getAlertCount() {
        return alertCount;
    }


    /**
     * Sets the alertCount value for this RunInfo.
     * 
     * @param alertCount
     */
    public void setAlertCount(java.lang.Integer alertCount) {
        this.alertCount = alertCount;
    }


    /**
     * Gets the division value for this RunInfo.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this RunInfo.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the divisionID value for this RunInfo.
     * 
     * @return divisionID
     */
    public java.lang.Integer getDivisionID() {
        return divisionID;
    }


    /**
     * Sets the divisionID value for this RunInfo.
     * 
     * @param divisionID
     */
    public void setDivisionID(java.lang.Integer divisionID) {
        this.divisionID = divisionID;
    }


    /**
     * Gets the DPPA value for this RunInfo.
     * 
     * @return DPPA
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType getDPPA() {
        return DPPA;
    }


    /**
     * Sets the DPPA value for this RunInfo.
     * 
     * @param DPPA
     */
    public void setDPPA(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType DPPA) {
        this.DPPA = DPPA;
    }


    /**
     * Gets the EFTType value for this RunInfo.
     * 
     * @return EFTType
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType getEFTType() {
        return EFTType;
    }


    /**
     * Sets the EFTType value for this RunInfo.
     * 
     * @param EFTType
     */
    public void setEFTType(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType EFTType) {
        this.EFTType = EFTType;
    }


    /**
     * Gets the entityType value for this RunInfo.
     * 
     * @return entityType
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this RunInfo.
     * 
     * @param entityType
     */
    public void setEntityType(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the errorCount value for this RunInfo.
     * 
     * @return errorCount
     */
    public java.lang.Integer getErrorCount() {
        return errorCount;
    }


    /**
     * Sets the errorCount value for this RunInfo.
     * 
     * @param errorCount
     */
    public void setErrorCount(java.lang.Integer errorCount) {
        this.errorCount = errorCount;
    }


    /**
     * Gets the errorMessage value for this RunInfo.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this RunInfo.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the fileName value for this RunInfo.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this RunInfo.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileFormatName value for this RunInfo.
     * 
     * @return fileFormatName
     */
    public java.lang.String getFileFormatName() {
        return fileFormatName;
    }


    /**
     * Sets the fileFormatName value for this RunInfo.
     * 
     * @param fileFormatName
     */
    public void setFileFormatName(java.lang.String fileFormatName) {
        this.fileFormatName = fileFormatName;
    }


    /**
     * Gets the GLB value for this RunInfo.
     * 
     * @return GLB
     */
    public java.lang.Integer getGLB() {
        return GLB;
    }


    /**
     * Sets the GLB value for this RunInfo.
     * 
     * @param GLB
     */
    public void setGLB(java.lang.Integer GLB) {
        this.GLB = GLB;
    }


    /**
     * Gets the lastUpdateTime value for this RunInfo.
     * 
     * @return lastUpdateTime
     */
    public java.util.Calendar getLastUpdateTime() {
        return lastUpdateTime;
    }


    /**
     * Sets the lastUpdateTime value for this RunInfo.
     * 
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(java.util.Calendar lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


    /**
     * Gets the numRecordsProcessed value for this RunInfo.
     * 
     * @return numRecordsProcessed
     */
    public java.lang.Integer getNumRecordsProcessed() {
        return numRecordsProcessed;
    }


    /**
     * Sets the numRecordsProcessed value for this RunInfo.
     * 
     * @param numRecordsProcessed
     */
    public void setNumRecordsProcessed(java.lang.Integer numRecordsProcessed) {
        this.numRecordsProcessed = numRecordsProcessed;
    }


    /**
     * Gets the permissibleUse value for this RunInfo.
     * 
     * @return permissibleUse
     */
    public java.lang.String getPermissibleUse() {
        return permissibleUse;
    }


    /**
     * Sets the permissibleUse value for this RunInfo.
     * 
     * @param permissibleUse
     */
    public void setPermissibleUse(java.lang.String permissibleUse) {
        this.permissibleUse = permissibleUse;
    }


    /**
     * Gets the predefinedSearchName value for this RunInfo.
     * 
     * @return predefinedSearchName
     */
    public java.lang.String getPredefinedSearchName() {
        return predefinedSearchName;
    }


    /**
     * Sets the predefinedSearchName value for this RunInfo.
     * 
     * @param predefinedSearchName
     */
    public void setPredefinedSearchName(java.lang.String predefinedSearchName) {
        this.predefinedSearchName = predefinedSearchName;
    }


    /**
     * Gets the processingState value for this RunInfo.
     * 
     * @return processingState
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ProcessingStateType getProcessingState() {
        return processingState;
    }


    /**
     * Sets the processingState value for this RunInfo.
     * 
     * @param processingState
     */
    public void setProcessingState(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ProcessingStateType processingState) {
        this.processingState = processingState;
    }


    /**
     * Gets the resultsFile1 value for this RunInfo.
     * 
     * @return resultsFile1
     */
    public java.lang.String getResultsFile1() {
        return resultsFile1;
    }


    /**
     * Sets the resultsFile1 value for this RunInfo.
     * 
     * @param resultsFile1
     */
    public void setResultsFile1(java.lang.String resultsFile1) {
        this.resultsFile1 = resultsFile1;
    }


    /**
     * Gets the resultsFile2 value for this RunInfo.
     * 
     * @return resultsFile2
     */
    public java.lang.String getResultsFile2() {
        return resultsFile2;
    }


    /**
     * Sets the resultsFile2 value for this RunInfo.
     * 
     * @param resultsFile2
     */
    public void setResultsFile2(java.lang.String resultsFile2) {
        this.resultsFile2 = resultsFile2;
    }


    /**
     * Gets the runID value for this RunInfo.
     * 
     * @return runID
     */
    public java.lang.Long getRunID() {
        return runID;
    }


    /**
     * Sets the runID value for this RunInfo.
     * 
     * @param runID
     */
    public void setRunID(java.lang.Long runID) {
        this.runID = runID;
    }


    /**
     * Gets the startTime value for this RunInfo.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this RunInfo.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the submitType value for this RunInfo.
     * 
     * @return submitType
     */
    public java.lang.String getSubmitType() {
        return submitType;
    }


    /**
     * Sets the submitType value for this RunInfo.
     * 
     * @param submitType
     */
    public void setSubmitType(java.lang.String submitType) {
        this.submitType = submitType;
    }


    /**
     * Gets the totalNumRecords value for this RunInfo.
     * 
     * @return totalNumRecords
     */
    public java.lang.Integer getTotalNumRecords() {
        return totalNumRecords;
    }


    /**
     * Sets the totalNumRecords value for this RunInfo.
     * 
     * @param totalNumRecords
     */
    public void setTotalNumRecords(java.lang.Integer totalNumRecords) {
        this.totalNumRecords = totalNumRecords;
    }


    /**
     * Gets the totalNumRows value for this RunInfo.
     * 
     * @return totalNumRows
     */
    public java.lang.Integer getTotalNumRows() {
        return totalNumRows;
    }


    /**
     * Sets the totalNumRows value for this RunInfo.
     * 
     * @param totalNumRows
     */
    public void setTotalNumRows(java.lang.Integer totalNumRows) {
        this.totalNumRows = totalNumRows;
    }


    /**
     * Gets the userName value for this RunInfo.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this RunInfo.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the WLMatchCount value for this RunInfo.
     * 
     * @return WLMatchCount
     */
    public java.lang.Integer getWLMatchCount() {
        return WLMatchCount;
    }


    /**
     * Sets the WLMatchCount value for this RunInfo.
     * 
     * @param WLMatchCount
     */
    public void setWLMatchCount(java.lang.Integer WLMatchCount) {
        this.WLMatchCount = WLMatchCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunInfo)) return false;
        RunInfo other = (RunInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alertCount==null && other.getAlertCount()==null) || 
             (this.alertCount!=null &&
              this.alertCount.equals(other.getAlertCount()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.divisionID==null && other.getDivisionID()==null) || 
             (this.divisionID!=null &&
              this.divisionID.equals(other.getDivisionID()))) &&
            ((this.DPPA==null && other.getDPPA()==null) || 
             (this.DPPA!=null &&
              this.DPPA.equals(other.getDPPA()))) &&
            ((this.EFTType==null && other.getEFTType()==null) || 
             (this.EFTType!=null &&
              this.EFTType.equals(other.getEFTType()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.errorCount==null && other.getErrorCount()==null) || 
             (this.errorCount!=null &&
              this.errorCount.equals(other.getErrorCount()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.fileFormatName==null && other.getFileFormatName()==null) || 
             (this.fileFormatName!=null &&
              this.fileFormatName.equals(other.getFileFormatName()))) &&
            ((this.GLB==null && other.getGLB()==null) || 
             (this.GLB!=null &&
              this.GLB.equals(other.getGLB()))) &&
            ((this.lastUpdateTime==null && other.getLastUpdateTime()==null) || 
             (this.lastUpdateTime!=null &&
              this.lastUpdateTime.equals(other.getLastUpdateTime()))) &&
            ((this.numRecordsProcessed==null && other.getNumRecordsProcessed()==null) || 
             (this.numRecordsProcessed!=null &&
              this.numRecordsProcessed.equals(other.getNumRecordsProcessed()))) &&
            ((this.permissibleUse==null && other.getPermissibleUse()==null) || 
             (this.permissibleUse!=null &&
              this.permissibleUse.equals(other.getPermissibleUse()))) &&
            ((this.predefinedSearchName==null && other.getPredefinedSearchName()==null) || 
             (this.predefinedSearchName!=null &&
              this.predefinedSearchName.equals(other.getPredefinedSearchName()))) &&
            ((this.processingState==null && other.getProcessingState()==null) || 
             (this.processingState!=null &&
              this.processingState.equals(other.getProcessingState()))) &&
            ((this.resultsFile1==null && other.getResultsFile1()==null) || 
             (this.resultsFile1!=null &&
              this.resultsFile1.equals(other.getResultsFile1()))) &&
            ((this.resultsFile2==null && other.getResultsFile2()==null) || 
             (this.resultsFile2!=null &&
              this.resultsFile2.equals(other.getResultsFile2()))) &&
            ((this.runID==null && other.getRunID()==null) || 
             (this.runID!=null &&
              this.runID.equals(other.getRunID()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.submitType==null && other.getSubmitType()==null) || 
             (this.submitType!=null &&
              this.submitType.equals(other.getSubmitType()))) &&
            ((this.totalNumRecords==null && other.getTotalNumRecords()==null) || 
             (this.totalNumRecords!=null &&
              this.totalNumRecords.equals(other.getTotalNumRecords()))) &&
            ((this.totalNumRows==null && other.getTotalNumRows()==null) || 
             (this.totalNumRows!=null &&
              this.totalNumRows.equals(other.getTotalNumRows()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.WLMatchCount==null && other.getWLMatchCount()==null) || 
             (this.WLMatchCount!=null &&
              this.WLMatchCount.equals(other.getWLMatchCount())));
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
        if (getAlertCount() != null) {
            _hashCode += getAlertCount().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getDivisionID() != null) {
            _hashCode += getDivisionID().hashCode();
        }
        if (getDPPA() != null) {
            _hashCode += getDPPA().hashCode();
        }
        if (getEFTType() != null) {
            _hashCode += getEFTType().hashCode();
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getErrorCount() != null) {
            _hashCode += getErrorCount().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFileFormatName() != null) {
            _hashCode += getFileFormatName().hashCode();
        }
        if (getGLB() != null) {
            _hashCode += getGLB().hashCode();
        }
        if (getLastUpdateTime() != null) {
            _hashCode += getLastUpdateTime().hashCode();
        }
        if (getNumRecordsProcessed() != null) {
            _hashCode += getNumRecordsProcessed().hashCode();
        }
        if (getPermissibleUse() != null) {
            _hashCode += getPermissibleUse().hashCode();
        }
        if (getPredefinedSearchName() != null) {
            _hashCode += getPredefinedSearchName().hashCode();
        }
        if (getProcessingState() != null) {
            _hashCode += getProcessingState().hashCode();
        }
        if (getResultsFile1() != null) {
            _hashCode += getResultsFile1().hashCode();
        }
        if (getResultsFile2() != null) {
            _hashCode += getResultsFile2().hashCode();
        }
        if (getRunID() != null) {
            _hashCode += getRunID().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getSubmitType() != null) {
            _hashCode += getSubmitType().hashCode();
        }
        if (getTotalNumRecords() != null) {
            _hashCode += getTotalNumRecords().hashCode();
        }
        if (getTotalNumRows() != null) {
            _hashCode += getTotalNumRows().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getWLMatchCount() != null) {
            _hashCode += getWLMatchCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RunInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RunInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AlertCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DivisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPPA");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DPPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DPPAChoiceType"));
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
        elemField.setFieldName("errorCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ErrorCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("fileFormatName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FileFormatName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLB");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "GLB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "LastUpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRecordsProcessed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "NumRecordsProcessed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissibleUse");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PermissibleUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predefinedSearchName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PredefinedSearchName"));
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
        elemField.setFieldName("resultsFile1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultsFile1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultsFile2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultsFile2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SubmitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TotalNumRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumRows");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TotalNumRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WLMatchCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLMatchCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
