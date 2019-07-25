/**
 * ContractModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.icon.mw.ws;

public class ContractModel  implements java.io.Serializable {
    private java.lang.String alias;

    private java.lang.String balance;

    private java.lang.String balanceControl;

    private java.lang.String beginningDate;

    private java.lang.String cd;

    private java.lang.String emissionDate;

    private java.lang.String id;

    private java.lang.String lastBillingDate;

    private com.icon.mw.ws.PinLineModel[] pins;

    private java.lang.String prepaid;

    private java.lang.String status;

    public ContractModel() {
    }

    public ContractModel(
           java.lang.String alias,
           java.lang.String balance,
           java.lang.String balanceControl,
           java.lang.String beginningDate,
           java.lang.String cd,
           java.lang.String emissionDate,
           java.lang.String id,
           java.lang.String lastBillingDate,
           com.icon.mw.ws.PinLineModel[] pins,
           java.lang.String prepaid,
           java.lang.String status) {
           this.alias = alias;
           this.balance = balance;
           this.balanceControl = balanceControl;
           this.beginningDate = beginningDate;
           this.cd = cd;
           this.emissionDate = emissionDate;
           this.id = id;
           this.lastBillingDate = lastBillingDate;
           this.pins = pins;
           this.prepaid = prepaid;
           this.status = status;
    }


    /**
     * Gets the alias value for this ContractModel.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this ContractModel.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the balance value for this ContractModel.
     * 
     * @return balance
     */
    public java.lang.String getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this ContractModel.
     * 
     * @param balance
     */
    public void setBalance(java.lang.String balance) {
        this.balance = balance;
    }


    /**
     * Gets the balanceControl value for this ContractModel.
     * 
     * @return balanceControl
     */
    public java.lang.String getBalanceControl() {
        return balanceControl;
    }


    /**
     * Sets the balanceControl value for this ContractModel.
     * 
     * @param balanceControl
     */
    public void setBalanceControl(java.lang.String balanceControl) {
        this.balanceControl = balanceControl;
    }


    /**
     * Gets the beginningDate value for this ContractModel.
     * 
     * @return beginningDate
     */
    public java.lang.String getBeginningDate() {
        return beginningDate;
    }


    /**
     * Sets the beginningDate value for this ContractModel.
     * 
     * @param beginningDate
     */
    public void setBeginningDate(java.lang.String beginningDate) {
        this.beginningDate = beginningDate;
    }


    /**
     * Gets the cd value for this ContractModel.
     * 
     * @return cd
     */
    public java.lang.String getCd() {
        return cd;
    }


    /**
     * Sets the cd value for this ContractModel.
     * 
     * @param cd
     */
    public void setCd(java.lang.String cd) {
        this.cd = cd;
    }


    /**
     * Gets the emissionDate value for this ContractModel.
     * 
     * @return emissionDate
     */
    public java.lang.String getEmissionDate() {
        return emissionDate;
    }


    /**
     * Sets the emissionDate value for this ContractModel.
     * 
     * @param emissionDate
     */
    public void setEmissionDate(java.lang.String emissionDate) {
        this.emissionDate = emissionDate;
    }


    /**
     * Gets the id value for this ContractModel.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ContractModel.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the lastBillingDate value for this ContractModel.
     * 
     * @return lastBillingDate
     */
    public java.lang.String getLastBillingDate() {
        return lastBillingDate;
    }


    /**
     * Sets the lastBillingDate value for this ContractModel.
     * 
     * @param lastBillingDate
     */
    public void setLastBillingDate(java.lang.String lastBillingDate) {
        this.lastBillingDate = lastBillingDate;
    }


    /**
     * Gets the pins value for this ContractModel.
     * 
     * @return pins
     */
    public com.icon.mw.ws.PinLineModel[] getPins() {
        return pins;
    }


    /**
     * Sets the pins value for this ContractModel.
     * 
     * @param pins
     */
    public void setPins(com.icon.mw.ws.PinLineModel[] pins) {
        this.pins = pins;
    }

    public com.icon.mw.ws.PinLineModel getPins(int i) {
        return this.pins[i];
    }

    public void setPins(int i, com.icon.mw.ws.PinLineModel _value) {
        this.pins[i] = _value;
    }


    /**
     * Gets the prepaid value for this ContractModel.
     * 
     * @return prepaid
     */
    public java.lang.String getPrepaid() {
        return prepaid;
    }


    /**
     * Sets the prepaid value for this ContractModel.
     * 
     * @param prepaid
     */
    public void setPrepaid(java.lang.String prepaid) {
        this.prepaid = prepaid;
    }


    /**
     * Gets the status value for this ContractModel.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ContractModel.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractModel)) return false;
        ContractModel other = (ContractModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.balanceControl==null && other.getBalanceControl()==null) || 
             (this.balanceControl!=null &&
              this.balanceControl.equals(other.getBalanceControl()))) &&
            ((this.beginningDate==null && other.getBeginningDate()==null) || 
             (this.beginningDate!=null &&
              this.beginningDate.equals(other.getBeginningDate()))) &&
            ((this.cd==null && other.getCd()==null) || 
             (this.cd!=null &&
              this.cd.equals(other.getCd()))) &&
            ((this.emissionDate==null && other.getEmissionDate()==null) || 
             (this.emissionDate!=null &&
              this.emissionDate.equals(other.getEmissionDate()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.lastBillingDate==null && other.getLastBillingDate()==null) || 
             (this.lastBillingDate!=null &&
              this.lastBillingDate.equals(other.getLastBillingDate()))) &&
            ((this.pins==null && other.getPins()==null) || 
             (this.pins!=null &&
              java.util.Arrays.equals(this.pins, other.getPins()))) &&
            ((this.prepaid==null && other.getPrepaid()==null) || 
             (this.prepaid!=null &&
              this.prepaid.equals(other.getPrepaid()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getBalanceControl() != null) {
            _hashCode += getBalanceControl().hashCode();
        }
        if (getBeginningDate() != null) {
            _hashCode += getBeginningDate().hashCode();
        }
        if (getCd() != null) {
            _hashCode += getCd().hashCode();
        }
        if (getEmissionDate() != null) {
            _hashCode += getEmissionDate().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLastBillingDate() != null) {
            _hashCode += getLastBillingDate().hashCode();
        }
        if (getPins() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPins());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPins(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrepaid() != null) {
            _hashCode += getPrepaid().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.mw.icon.com/", "contractModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceControl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginningDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beginningDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emissionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emissionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBillingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastBillingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pins");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.mw.icon.com/", "pinLineModel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prepaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
