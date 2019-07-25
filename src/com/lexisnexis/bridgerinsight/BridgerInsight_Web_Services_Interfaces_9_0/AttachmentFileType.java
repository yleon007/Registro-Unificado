/**
 * AttachmentFileType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class AttachmentFileType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AttachmentFileType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _BMP = "BMP";
    public static final java.lang.String _CSV = "CSV";
    public static final java.lang.String _DOC = "DOC";
    public static final java.lang.String _DOCX = "DOCX";
    public static final java.lang.String _GIF = "GIF";
    public static final java.lang.String _HTM = "HTM";
    public static final java.lang.String _HTML = "HTML";
    public static final java.lang.String _JPEG = "JPEG";
    public static final java.lang.String _JPG = "JPG";
    public static final java.lang.String _JPE = "JPE";
    public static final java.lang.String _JFIF = "JFIF";
    public static final java.lang.String _MHT = "MHT";
    public static final java.lang.String _PDF = "PDF";
    public static final java.lang.String _PNG = "PNG";
    public static final java.lang.String _TXT = "TXT";
    public static final java.lang.String _XLS = "XLS";
    public static final java.lang.String _XLSX = "XLSX";
    public static final java.lang.String _TIFF = "TIFF";
    public static final java.lang.String _TIF = "TIF";
    public static final AttachmentFileType None = new AttachmentFileType(_None);
    public static final AttachmentFileType BMP = new AttachmentFileType(_BMP);
    public static final AttachmentFileType CSV = new AttachmentFileType(_CSV);
    public static final AttachmentFileType DOC = new AttachmentFileType(_DOC);
    public static final AttachmentFileType DOCX = new AttachmentFileType(_DOCX);
    public static final AttachmentFileType GIF = new AttachmentFileType(_GIF);
    public static final AttachmentFileType HTM = new AttachmentFileType(_HTM);
    public static final AttachmentFileType HTML = new AttachmentFileType(_HTML);
    public static final AttachmentFileType JPEG = new AttachmentFileType(_JPEG);
    public static final AttachmentFileType JPG = new AttachmentFileType(_JPG);
    public static final AttachmentFileType JPE = new AttachmentFileType(_JPE);
    public static final AttachmentFileType JFIF = new AttachmentFileType(_JFIF);
    public static final AttachmentFileType MHT = new AttachmentFileType(_MHT);
    public static final AttachmentFileType PDF = new AttachmentFileType(_PDF);
    public static final AttachmentFileType PNG = new AttachmentFileType(_PNG);
    public static final AttachmentFileType TXT = new AttachmentFileType(_TXT);
    public static final AttachmentFileType XLS = new AttachmentFileType(_XLS);
    public static final AttachmentFileType XLSX = new AttachmentFileType(_XLSX);
    public static final AttachmentFileType TIFF = new AttachmentFileType(_TIFF);
    public static final AttachmentFileType TIF = new AttachmentFileType(_TIF);
    public java.lang.String getValue() { return _value_;}
    public static AttachmentFileType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AttachmentFileType enumeration = (AttachmentFileType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AttachmentFileType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AttachmentFileType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AttachmentFileType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
