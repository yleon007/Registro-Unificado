/**
 * IndexLevelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class IndexLevelType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IndexLevelType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Level0 = "Level0";
    public static final java.lang.String _Level10 = "Level10";
    public static final java.lang.String _Level20 = "Level20";
    public static final java.lang.String _Level30 = "Level30";
    public static final java.lang.String _Level40 = "Level40";
    public static final java.lang.String _Level50 = "Level50";
    public static final IndexLevelType None = new IndexLevelType(_None);
    public static final IndexLevelType Level0 = new IndexLevelType(_Level0);
    public static final IndexLevelType Level10 = new IndexLevelType(_Level10);
    public static final IndexLevelType Level20 = new IndexLevelType(_Level20);
    public static final IndexLevelType Level30 = new IndexLevelType(_Level30);
    public static final IndexLevelType Level40 = new IndexLevelType(_Level40);
    public static final IndexLevelType Level50 = new IndexLevelType(_Level50);
    public java.lang.String getValue() { return _value_;}
    public static IndexLevelType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IndexLevelType enumeration = (IndexLevelType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IndexLevelType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IndexLevelType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IndexLevelType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
