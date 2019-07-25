/**
 * ServiceFaultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ServiceFaultType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServiceFaultType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Error = "Error";
    public static final java.lang.String _AccessDenied = "AccessDenied";
    public static final java.lang.String _FreeTrialLapsed = "FreeTrialLapsed";
    public static final java.lang.String _InvalidCredentials = "InvalidCredentials";
    public static final java.lang.String _MustChangePassword = "MustChangePassword";
    public static final java.lang.String _PasswordExpired = "PasswordExpired";
    public static final java.lang.String _UnsupportedVersion = "UnsupportedVersion";
    public static final java.lang.String _UserDisabled = "UserDisabled";
    public static final java.lang.String _UserLocked = "UserLocked";
    public static final java.lang.String _WatchlistsExpired = "WatchlistsExpired";
    public static final ServiceFaultType Error = new ServiceFaultType(_Error);
    public static final ServiceFaultType AccessDenied = new ServiceFaultType(_AccessDenied);
    public static final ServiceFaultType FreeTrialLapsed = new ServiceFaultType(_FreeTrialLapsed);
    public static final ServiceFaultType InvalidCredentials = new ServiceFaultType(_InvalidCredentials);
    public static final ServiceFaultType MustChangePassword = new ServiceFaultType(_MustChangePassword);
    public static final ServiceFaultType PasswordExpired = new ServiceFaultType(_PasswordExpired);
    public static final ServiceFaultType UnsupportedVersion = new ServiceFaultType(_UnsupportedVersion);
    public static final ServiceFaultType UserDisabled = new ServiceFaultType(_UserDisabled);
    public static final ServiceFaultType UserLocked = new ServiceFaultType(_UserLocked);
    public static final ServiceFaultType WatchlistsExpired = new ServiceFaultType(_WatchlistsExpired);
    public java.lang.String getValue() { return _value_;}
    public static ServiceFaultType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ServiceFaultType enumeration = (ServiceFaultType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ServiceFaultType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ServiceFaultType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ServiceFaultType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
