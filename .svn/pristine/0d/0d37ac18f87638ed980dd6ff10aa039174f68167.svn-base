/**
 * ProcessingStateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ProcessingStateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProcessingStateType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Canceled = "Canceled";
    public static final java.lang.String _Completed = "Completed";
    public static final java.lang.String _Error = "Error";
    public static final java.lang.String _Incomplete = "Incomplete";
    public static final java.lang.String _Interrupted = "Interrupted";
    public static final java.lang.String _Processing = "Processing";
    public static final ProcessingStateType None = new ProcessingStateType(_None);
    public static final ProcessingStateType Canceled = new ProcessingStateType(_Canceled);
    public static final ProcessingStateType Completed = new ProcessingStateType(_Completed);
    public static final ProcessingStateType Error = new ProcessingStateType(_Error);
    public static final ProcessingStateType Incomplete = new ProcessingStateType(_Incomplete);
    public static final ProcessingStateType Interrupted = new ProcessingStateType(_Interrupted);
    public static final ProcessingStateType Processing = new ProcessingStateType(_Processing);
    public java.lang.String getValue() { return _value_;}
    public static ProcessingStateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProcessingStateType enumeration = (ProcessingStateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProcessingStateType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProcessingStateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ProcessingStateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
