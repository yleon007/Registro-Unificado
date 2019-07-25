/**
 * ParsedSWIFTDrawingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ParsedSWIFTDrawingInfo  implements java.io.Serializable {
    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount amount;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount baseAmount;

    private java.lang.String basisRate;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount differentialAmount;

    private java.lang.String drawingID;

    private java.lang.String drawDownPeriod;

    private java.lang.String exchangeRate;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount interestAmount;

    private java.lang.String interestMargin;

    private java.lang.String interestPeriod;

    private java.lang.String interestRate;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount netInterestAmount;

    private java.lang.String rateFixingDate;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount receiversParticipation;

    private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount repaymentOfPrincipal;

    private java.lang.String reserveInterest;

    private java.lang.String selectedCurrency;

    private java.lang.String totalInterestRate;

    public ParsedSWIFTDrawingInfo() {
    }

    public ParsedSWIFTDrawingInfo(
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount amount,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount baseAmount,
           java.lang.String basisRate,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount differentialAmount,
           java.lang.String drawingID,
           java.lang.String drawDownPeriod,
           java.lang.String exchangeRate,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount interestAmount,
           java.lang.String interestMargin,
           java.lang.String interestPeriod,
           java.lang.String interestRate,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount netInterestAmount,
           java.lang.String rateFixingDate,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount receiversParticipation,
           com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount repaymentOfPrincipal,
           java.lang.String reserveInterest,
           java.lang.String selectedCurrency,
           java.lang.String totalInterestRate) {
           this.amount = amount;
           this.baseAmount = baseAmount;
           this.basisRate = basisRate;
           this.differentialAmount = differentialAmount;
           this.drawingID = drawingID;
           this.drawDownPeriod = drawDownPeriod;
           this.exchangeRate = exchangeRate;
           this.interestAmount = interestAmount;
           this.interestMargin = interestMargin;
           this.interestPeriod = interestPeriod;
           this.interestRate = interestRate;
           this.netInterestAmount = netInterestAmount;
           this.rateFixingDate = rateFixingDate;
           this.receiversParticipation = receiversParticipation;
           this.repaymentOfPrincipal = repaymentOfPrincipal;
           this.reserveInterest = reserveInterest;
           this.selectedCurrency = selectedCurrency;
           this.totalInterestRate = totalInterestRate;
    }


    /**
     * Gets the amount value for this ParsedSWIFTDrawingInfo.
     * 
     * @return amount
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ParsedSWIFTDrawingInfo.
     * 
     * @param amount
     */
    public void setAmount(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount amount) {
        this.amount = amount;
    }


    /**
     * Gets the baseAmount value for this ParsedSWIFTDrawingInfo.
     * 
     * @return baseAmount
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount getBaseAmount() {
        return baseAmount;
    }


    /**
     * Sets the baseAmount value for this ParsedSWIFTDrawingInfo.
     * 
     * @param baseAmount
     */
    public void setBaseAmount(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount baseAmount) {
        this.baseAmount = baseAmount;
    }


    /**
     * Gets the basisRate value for this ParsedSWIFTDrawingInfo.
     * 
     * @return basisRate
     */
    public java.lang.String getBasisRate() {
        return basisRate;
    }


    /**
     * Sets the basisRate value for this ParsedSWIFTDrawingInfo.
     * 
     * @param basisRate
     */
    public void setBasisRate(java.lang.String basisRate) {
        this.basisRate = basisRate;
    }


    /**
     * Gets the differentialAmount value for this ParsedSWIFTDrawingInfo.
     * 
     * @return differentialAmount
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount getDifferentialAmount() {
        return differentialAmount;
    }


    /**
     * Sets the differentialAmount value for this ParsedSWIFTDrawingInfo.
     * 
     * @param differentialAmount
     */
    public void setDifferentialAmount(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount differentialAmount) {
        this.differentialAmount = differentialAmount;
    }


    /**
     * Gets the drawingID value for this ParsedSWIFTDrawingInfo.
     * 
     * @return drawingID
     */
    public java.lang.String getDrawingID() {
        return drawingID;
    }


    /**
     * Sets the drawingID value for this ParsedSWIFTDrawingInfo.
     * 
     * @param drawingID
     */
    public void setDrawingID(java.lang.String drawingID) {
        this.drawingID = drawingID;
    }


    /**
     * Gets the drawDownPeriod value for this ParsedSWIFTDrawingInfo.
     * 
     * @return drawDownPeriod
     */
    public java.lang.String getDrawDownPeriod() {
        return drawDownPeriod;
    }


    /**
     * Sets the drawDownPeriod value for this ParsedSWIFTDrawingInfo.
     * 
     * @param drawDownPeriod
     */
    public void setDrawDownPeriod(java.lang.String drawDownPeriod) {
        this.drawDownPeriod = drawDownPeriod;
    }


    /**
     * Gets the exchangeRate value for this ParsedSWIFTDrawingInfo.
     * 
     * @return exchangeRate
     */
    public java.lang.String getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this ParsedSWIFTDrawingInfo.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the interestAmount value for this ParsedSWIFTDrawingInfo.
     * 
     * @return interestAmount
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount getInterestAmount() {
        return interestAmount;
    }


    /**
     * Sets the interestAmount value for this ParsedSWIFTDrawingInfo.
     * 
     * @param interestAmount
     */
    public void setInterestAmount(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount interestAmount) {
        this.interestAmount = interestAmount;
    }


    /**
     * Gets the interestMargin value for this ParsedSWIFTDrawingInfo.
     * 
     * @return interestMargin
     */
    public java.lang.String getInterestMargin() {
        return interestMargin;
    }


    /**
     * Sets the interestMargin value for this ParsedSWIFTDrawingInfo.
     * 
     * @param interestMargin
     */
    public void setInterestMargin(java.lang.String interestMargin) {
        this.interestMargin = interestMargin;
    }


    /**
     * Gets the interestPeriod value for this ParsedSWIFTDrawingInfo.
     * 
     * @return interestPeriod
     */
    public java.lang.String getInterestPeriod() {
        return interestPeriod;
    }


    /**
     * Sets the interestPeriod value for this ParsedSWIFTDrawingInfo.
     * 
     * @param interestPeriod
     */
    public void setInterestPeriod(java.lang.String interestPeriod) {
        this.interestPeriod = interestPeriod;
    }


    /**
     * Gets the interestRate value for this ParsedSWIFTDrawingInfo.
     * 
     * @return interestRate
     */
    public java.lang.String getInterestRate() {
        return interestRate;
    }


    /**
     * Sets the interestRate value for this ParsedSWIFTDrawingInfo.
     * 
     * @param interestRate
     */
    public void setInterestRate(java.lang.String interestRate) {
        this.interestRate = interestRate;
    }


    /**
     * Gets the netInterestAmount value for this ParsedSWIFTDrawingInfo.
     * 
     * @return netInterestAmount
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount getNetInterestAmount() {
        return netInterestAmount;
    }


    /**
     * Sets the netInterestAmount value for this ParsedSWIFTDrawingInfo.
     * 
     * @param netInterestAmount
     */
    public void setNetInterestAmount(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount netInterestAmount) {
        this.netInterestAmount = netInterestAmount;
    }


    /**
     * Gets the rateFixingDate value for this ParsedSWIFTDrawingInfo.
     * 
     * @return rateFixingDate
     */
    public java.lang.String getRateFixingDate() {
        return rateFixingDate;
    }


    /**
     * Sets the rateFixingDate value for this ParsedSWIFTDrawingInfo.
     * 
     * @param rateFixingDate
     */
    public void setRateFixingDate(java.lang.String rateFixingDate) {
        this.rateFixingDate = rateFixingDate;
    }


    /**
     * Gets the receiversParticipation value for this ParsedSWIFTDrawingInfo.
     * 
     * @return receiversParticipation
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount getReceiversParticipation() {
        return receiversParticipation;
    }


    /**
     * Sets the receiversParticipation value for this ParsedSWIFTDrawingInfo.
     * 
     * @param receiversParticipation
     */
    public void setReceiversParticipation(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount receiversParticipation) {
        this.receiversParticipation = receiversParticipation;
    }


    /**
     * Gets the repaymentOfPrincipal value for this ParsedSWIFTDrawingInfo.
     * 
     * @return repaymentOfPrincipal
     */
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount getRepaymentOfPrincipal() {
        return repaymentOfPrincipal;
    }


    /**
     * Sets the repaymentOfPrincipal value for this ParsedSWIFTDrawingInfo.
     * 
     * @param repaymentOfPrincipal
     */
    public void setRepaymentOfPrincipal(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount repaymentOfPrincipal) {
        this.repaymentOfPrincipal = repaymentOfPrincipal;
    }


    /**
     * Gets the reserveInterest value for this ParsedSWIFTDrawingInfo.
     * 
     * @return reserveInterest
     */
    public java.lang.String getReserveInterest() {
        return reserveInterest;
    }


    /**
     * Sets the reserveInterest value for this ParsedSWIFTDrawingInfo.
     * 
     * @param reserveInterest
     */
    public void setReserveInterest(java.lang.String reserveInterest) {
        this.reserveInterest = reserveInterest;
    }


    /**
     * Gets the selectedCurrency value for this ParsedSWIFTDrawingInfo.
     * 
     * @return selectedCurrency
     */
    public java.lang.String getSelectedCurrency() {
        return selectedCurrency;
    }


    /**
     * Sets the selectedCurrency value for this ParsedSWIFTDrawingInfo.
     * 
     * @param selectedCurrency
     */
    public void setSelectedCurrency(java.lang.String selectedCurrency) {
        this.selectedCurrency = selectedCurrency;
    }


    /**
     * Gets the totalInterestRate value for this ParsedSWIFTDrawingInfo.
     * 
     * @return totalInterestRate
     */
    public java.lang.String getTotalInterestRate() {
        return totalInterestRate;
    }


    /**
     * Sets the totalInterestRate value for this ParsedSWIFTDrawingInfo.
     * 
     * @param totalInterestRate
     */
    public void setTotalInterestRate(java.lang.String totalInterestRate) {
        this.totalInterestRate = totalInterestRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedSWIFTDrawingInfo)) return false;
        ParsedSWIFTDrawingInfo other = (ParsedSWIFTDrawingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.baseAmount==null && other.getBaseAmount()==null) || 
             (this.baseAmount!=null &&
              this.baseAmount.equals(other.getBaseAmount()))) &&
            ((this.basisRate==null && other.getBasisRate()==null) || 
             (this.basisRate!=null &&
              this.basisRate.equals(other.getBasisRate()))) &&
            ((this.differentialAmount==null && other.getDifferentialAmount()==null) || 
             (this.differentialAmount!=null &&
              this.differentialAmount.equals(other.getDifferentialAmount()))) &&
            ((this.drawingID==null && other.getDrawingID()==null) || 
             (this.drawingID!=null &&
              this.drawingID.equals(other.getDrawingID()))) &&
            ((this.drawDownPeriod==null && other.getDrawDownPeriod()==null) || 
             (this.drawDownPeriod!=null &&
              this.drawDownPeriod.equals(other.getDrawDownPeriod()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.interestAmount==null && other.getInterestAmount()==null) || 
             (this.interestAmount!=null &&
              this.interestAmount.equals(other.getInterestAmount()))) &&
            ((this.interestMargin==null && other.getInterestMargin()==null) || 
             (this.interestMargin!=null &&
              this.interestMargin.equals(other.getInterestMargin()))) &&
            ((this.interestPeriod==null && other.getInterestPeriod()==null) || 
             (this.interestPeriod!=null &&
              this.interestPeriod.equals(other.getInterestPeriod()))) &&
            ((this.interestRate==null && other.getInterestRate()==null) || 
             (this.interestRate!=null &&
              this.interestRate.equals(other.getInterestRate()))) &&
            ((this.netInterestAmount==null && other.getNetInterestAmount()==null) || 
             (this.netInterestAmount!=null &&
              this.netInterestAmount.equals(other.getNetInterestAmount()))) &&
            ((this.rateFixingDate==null && other.getRateFixingDate()==null) || 
             (this.rateFixingDate!=null &&
              this.rateFixingDate.equals(other.getRateFixingDate()))) &&
            ((this.receiversParticipation==null && other.getReceiversParticipation()==null) || 
             (this.receiversParticipation!=null &&
              this.receiversParticipation.equals(other.getReceiversParticipation()))) &&
            ((this.repaymentOfPrincipal==null && other.getRepaymentOfPrincipal()==null) || 
             (this.repaymentOfPrincipal!=null &&
              this.repaymentOfPrincipal.equals(other.getRepaymentOfPrincipal()))) &&
            ((this.reserveInterest==null && other.getReserveInterest()==null) || 
             (this.reserveInterest!=null &&
              this.reserveInterest.equals(other.getReserveInterest()))) &&
            ((this.selectedCurrency==null && other.getSelectedCurrency()==null) || 
             (this.selectedCurrency!=null &&
              this.selectedCurrency.equals(other.getSelectedCurrency()))) &&
            ((this.totalInterestRate==null && other.getTotalInterestRate()==null) || 
             (this.totalInterestRate!=null &&
              this.totalInterestRate.equals(other.getTotalInterestRate())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBaseAmount() != null) {
            _hashCode += getBaseAmount().hashCode();
        }
        if (getBasisRate() != null) {
            _hashCode += getBasisRate().hashCode();
        }
        if (getDifferentialAmount() != null) {
            _hashCode += getDifferentialAmount().hashCode();
        }
        if (getDrawingID() != null) {
            _hashCode += getDrawingID().hashCode();
        }
        if (getDrawDownPeriod() != null) {
            _hashCode += getDrawDownPeriod().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getInterestAmount() != null) {
            _hashCode += getInterestAmount().hashCode();
        }
        if (getInterestMargin() != null) {
            _hashCode += getInterestMargin().hashCode();
        }
        if (getInterestPeriod() != null) {
            _hashCode += getInterestPeriod().hashCode();
        }
        if (getInterestRate() != null) {
            _hashCode += getInterestRate().hashCode();
        }
        if (getNetInterestAmount() != null) {
            _hashCode += getNetInterestAmount().hashCode();
        }
        if (getRateFixingDate() != null) {
            _hashCode += getRateFixingDate().hashCode();
        }
        if (getReceiversParticipation() != null) {
            _hashCode += getReceiversParticipation().hashCode();
        }
        if (getRepaymentOfPrincipal() != null) {
            _hashCode += getRepaymentOfPrincipal().hashCode();
        }
        if (getReserveInterest() != null) {
            _hashCode += getReserveInterest().hashCode();
        }
        if (getSelectedCurrency() != null) {
            _hashCode += getSelectedCurrency().hashCode();
        }
        if (getTotalInterestRate() != null) {
            _hashCode += getTotalInterestRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedSWIFTDrawingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTDrawingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "BaseAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basisRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "BasisRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("differentialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DifferentialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drawingID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DrawingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drawDownPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DrawDownPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InterestAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestMargin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InterestMargin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InterestPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InterestRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netInterestAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "NetInterestAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateFixingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RateFixingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiversParticipation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ReceiversParticipation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repaymentOfPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RepaymentOfPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveInterest");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ReserveInterest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SelectedCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInterestRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "TotalInterestRate"));
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
