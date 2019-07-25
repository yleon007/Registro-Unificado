/**
 * DPPAChoiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class DPPAChoiceType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DPPAChoiceType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NA = "NA";
    public static final java.lang.String _Choice0 = "Choice0";
    public static final java.lang.String _Choice1 = "Choice1";
    public static final java.lang.String _Choice2 = "Choice2";
    public static final java.lang.String _Choice3 = "Choice3";
    public static final java.lang.String _Choice4 = "Choice4";
    public static final java.lang.String _Choice6 = "Choice6";
    public static final DPPAChoiceType NA = new DPPAChoiceType(_NA);
    public static final DPPAChoiceType Choice0 = new DPPAChoiceType(_Choice0);
    public static final DPPAChoiceType Choice1 = new DPPAChoiceType(_Choice1);
    public static final DPPAChoiceType Choice2 = new DPPAChoiceType(_Choice2);
    public static final DPPAChoiceType Choice3 = new DPPAChoiceType(_Choice3);
    public static final DPPAChoiceType Choice4 = new DPPAChoiceType(_Choice4);
    public static final DPPAChoiceType Choice6 = new DPPAChoiceType(_Choice6);
    public java.lang.String getValue() { return _value_;}
    public static DPPAChoiceType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DPPAChoiceType enumeration = (DPPAChoiceType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DPPAChoiceType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DPPAChoiceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DPPAChoiceType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
