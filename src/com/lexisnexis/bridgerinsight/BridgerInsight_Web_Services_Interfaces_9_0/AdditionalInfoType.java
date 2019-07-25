/**
 * AdditionalInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class AdditionalInfoType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdditionalInfoType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Citizenship = "Citizenship";
    public static final java.lang.String _Complexion = "Complexion";
    public static final java.lang.String _DistinguishingMarks = "DistinguishingMarks";
    public static final java.lang.String _DOB = "DOB";
    public static final java.lang.String _EyeColor = "EyeColor";
    public static final java.lang.String _HairColor = "HairColor";
    public static final java.lang.String _Height = "Height";
    public static final java.lang.String _MothersName = "MothersName";
    public static final java.lang.String _Nationality = "Nationality";
    public static final java.lang.String _Occupation = "Occupation";
    public static final java.lang.String _PlaceOfBirth = "PlaceOfBirth";
    public static final java.lang.String _Position = "Position";
    public static final java.lang.String _Race = "Race";
    public static final java.lang.String _VesselCallSign = "VesselCallSign";
    public static final java.lang.String _VesselFlag = "VesselFlag";
    public static final java.lang.String _VesselGRT = "VesselGRT";
    public static final java.lang.String _VesselOwner = "VesselOwner";
    public static final java.lang.String _VesselTonnage = "VesselTonnage";
    public static final java.lang.String _VesselType = "VesselType";
    public static final java.lang.String _Weight = "Weight";
    public static final java.lang.String _Incident = "Incident";
    public static final java.lang.String _Other = "Other";
    public static final java.lang.String _IPAddress = "IPAddress";
    public static final AdditionalInfoType None = new AdditionalInfoType(_None);
    public static final AdditionalInfoType Citizenship = new AdditionalInfoType(_Citizenship);
    public static final AdditionalInfoType Complexion = new AdditionalInfoType(_Complexion);
    public static final AdditionalInfoType DistinguishingMarks = new AdditionalInfoType(_DistinguishingMarks);
    public static final AdditionalInfoType DOB = new AdditionalInfoType(_DOB);
    public static final AdditionalInfoType EyeColor = new AdditionalInfoType(_EyeColor);
    public static final AdditionalInfoType HairColor = new AdditionalInfoType(_HairColor);
    public static final AdditionalInfoType Height = new AdditionalInfoType(_Height);
    public static final AdditionalInfoType MothersName = new AdditionalInfoType(_MothersName);
    public static final AdditionalInfoType Nationality = new AdditionalInfoType(_Nationality);
    public static final AdditionalInfoType Occupation = new AdditionalInfoType(_Occupation);
    public static final AdditionalInfoType PlaceOfBirth = new AdditionalInfoType(_PlaceOfBirth);
    public static final AdditionalInfoType Position = new AdditionalInfoType(_Position);
    public static final AdditionalInfoType Race = new AdditionalInfoType(_Race);
    public static final AdditionalInfoType VesselCallSign = new AdditionalInfoType(_VesselCallSign);
    public static final AdditionalInfoType VesselFlag = new AdditionalInfoType(_VesselFlag);
    public static final AdditionalInfoType VesselGRT = new AdditionalInfoType(_VesselGRT);
    public static final AdditionalInfoType VesselOwner = new AdditionalInfoType(_VesselOwner);
    public static final AdditionalInfoType VesselTonnage = new AdditionalInfoType(_VesselTonnage);
    public static final AdditionalInfoType VesselType = new AdditionalInfoType(_VesselType);
    public static final AdditionalInfoType Weight = new AdditionalInfoType(_Weight);
    public static final AdditionalInfoType Incident = new AdditionalInfoType(_Incident);
    public static final AdditionalInfoType Other = new AdditionalInfoType(_Other);
    public static final AdditionalInfoType IPAddress = new AdditionalInfoType(_IPAddress);
    public java.lang.String getValue() { return _value_;}
    public static AdditionalInfoType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdditionalInfoType enumeration = (AdditionalInfoType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdditionalInfoType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdditionalInfoType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AdditionalInfoType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
