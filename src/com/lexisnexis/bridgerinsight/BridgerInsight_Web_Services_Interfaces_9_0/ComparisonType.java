/**
 * ComparisonType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ComparisonType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ComparisonType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Is = "Is";
    public static final java.lang.String _IsGreaterThan = "IsGreaterThan";
    public static final java.lang.String _IsGreaterThanOrEqual = "IsGreaterThanOrEqual";
    public static final java.lang.String _IsLessThan = "IsLessThan";
    public static final java.lang.String _IsLessThanOrEqual = "IsLessThanOrEqual";
    public static final java.lang.String _IsNull = "IsNull";
    public static final ComparisonType None = new ComparisonType(_None);
    public static final ComparisonType Is = new ComparisonType(_Is);
    public static final ComparisonType IsGreaterThan = new ComparisonType(_IsGreaterThan);
    public static final ComparisonType IsGreaterThanOrEqual = new ComparisonType(_IsGreaterThanOrEqual);
    public static final ComparisonType IsLessThan = new ComparisonType(_IsLessThan);
    public static final ComparisonType IsLessThanOrEqual = new ComparisonType(_IsLessThanOrEqual);
    public static final ComparisonType IsNull = new ComparisonType(_IsNull);
    public java.lang.String getValue() { return _value_;}
    public static ComparisonType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ComparisonType enumeration = (ComparisonType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ComparisonType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ComparisonType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ComparisonType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
