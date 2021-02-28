/**
 * BasicHttpBinding_ISearchStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class BasicHttpBinding_ISearchStub extends org.apache.axis.client.Stub implements com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ISearch {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDataFileList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ClientContext"), com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfDataFileInfo"));
        oper.setReturnClass(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DataFileInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "GetDataFileListResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DataFileInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ServiceFault"),
                      "com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault",
                      new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ServiceFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ClientContext"), com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "config"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SearchConfiguration"), com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchConfiguration.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SearchInput"), com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchInput.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SearchResults"));
        oper.setReturnClass(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ServiceFault"),
                      "com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault",
                      new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ServiceFault"), 
                      true
                     ));
        _operations[1] = oper;

    }

    public BasicHttpBinding_ISearchStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_ISearchStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_ISearchStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AdditionalInfoType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AdditionalInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AddressType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AKACategoryType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AKACategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AKAType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AKAType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AlertStateType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AlertStateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfAuditItem");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AuditItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AuditItem");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AuditItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfDataFileInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DataFileInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DataFileInfo");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DataFileInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfEntityAdditionalInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAdditionalInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAdditionalInfo");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAdditionalInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfEntityAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAddress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAddress");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAddress");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfEntityAKA");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAKA[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAKA");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAKA");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfEntityID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityID");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfEntityPhone");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityPhone[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityPhone");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityPhone");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfFPRedFlag");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRedFlag[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRedFlag");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRedFlag");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfFPRiskIndicator");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRiskIndicator[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRiskIndicator");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRiskIndicator");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfIIDAddressHistory");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAddressHistory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDAddressHistory");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDAddressHistory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfIIDAlternateName");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAlternateName[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDAlternateName");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDAlternateName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfIIDFEINMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFEINMatch[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDFEINMatch");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDFEINMatch");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfIIDIDataSource");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDataSource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIDataSource");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIDataSource");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfIIDIDataSourceVerification");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDataSourceVerification[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIDataSourceVerification");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIDataSourceVerification");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfIIDIException");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIException[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIException");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIException");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfIIDIRiskIndicator");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIRiskIndicator[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIRiskIndicator");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIRiskIndicator");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfIIDIVerificationResult");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIVerificationResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIVerificationResult");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIVerificationResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfIIDRedFlag");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRedFlag[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRedFlag");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRedFlag");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfIIDRiskIndicator");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRiskIndicator");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRiskIndicator");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfInputAdditionalInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAdditionalInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputAdditionalInfo");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputAdditionalInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfInputAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAddress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputAddress");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputAddress");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfInputID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputID");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfInputPhone");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputPhone[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputPhone");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputPhone");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfInputRecord");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputRecord");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "int");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfLong");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "long");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfOFACInstitutionInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.OFACInstitutionInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "OFACInstitutionInfo");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "OFACInstitutionInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedACHAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHAddress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHAddress");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHAddress");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedACHID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHID");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedACHNote");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHNote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHNote");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHNote");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedACHParty");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHParty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHParty");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHParty");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedFedwireAdditionalInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAdditionalInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAdditionalInfo");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAdditionalInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedFedwireAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAddress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAddress");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAddress");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedFedwireAdjustment");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAdjustment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAdjustment");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAdjustment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedFedwireAmount");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedFedwireDocument");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireDocument[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireDocument");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireDocument");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedFedwireID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireID");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedFedwireNote");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireNote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireNote");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireNote");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedFedwireParty");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireParty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireParty");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireParty");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedFedwirePhone");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwirePhone[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwirePhone");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwirePhone");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedISO20022AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022AdditionalInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022AdditionalInfo");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022AdditionalInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedISO20022Address");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022Address[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Address");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Address");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedISO20022ID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022ID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022ID");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022ID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedISO20022Note");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022Note[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Note");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Note");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedISO20022Party");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022Party[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Party");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Party");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedISO20022Phone");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022Phone[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Phone");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Phone");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFT4XXData");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFT4XXData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFT4XXData");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFT4XXData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTAdditionalInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAdditionalInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAdditionalInfo");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAdditionalInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAddress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAddress");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAddress");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTAmount");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTChequeDetails");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTChequeDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTChequeDetails");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTChequeDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTCommodityContractInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCommodityContractInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCommodityContractInfo");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCommodityContractInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTCommodityInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCommodityInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCommodityInfo");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCommodityInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTCurrencyDetail");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCurrencyDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCurrencyDetail");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCurrencyDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTCurrencySequence");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCurrencySequence[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCurrencySequence");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCurrencySequence");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTDrawingInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTDrawingInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTDrawingInfo");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTDrawingInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTField");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTField[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTField");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTField");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTID");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTLinkage");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTLinkage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTLinkage");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTLinkage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTNote");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTNote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTNote");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTNote");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTParty");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTParty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTParty");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTParty");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTPurchaseAgreementDetails");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTPurchaseAgreementDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTPurchaseAgreementDetails");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTPurchaseAgreementDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTReportingPartyInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTReportingPartyInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTReportingPartyInfo");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTReportingPartyInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTSettlementDetails");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTSettlementDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTSettlementDetails");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTSettlementDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTStandingSettlementInstruction");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTStandingSettlementInstruction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTStandingSettlementInstruction");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTStandingSettlementInstruction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfParsedSWIFTUniqueTransactionIdentifier");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTUniqueTransactionIdentifier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTUniqueTransactionIdentifier");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTUniqueTransactionIdentifier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfResultError");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultError");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfResultRecord");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultRecord");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfWatchlistDataFile");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistDataFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistDataFile");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistDataFile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfWatchlistMatchState");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistMatchState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistMatchState");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistMatchState");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfWLAddressMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLAddressMatch[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLAddressMatch");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLAddressMatch");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfWLCitizenshipMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLCitizenshipMatch[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLCitizenshipMatch");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLCitizenshipMatch");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfWLDOBMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLDOBMatch[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLDOBMatch");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLDOBMatch");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfWLIDMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLIDMatch[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLIDMatch");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLIDMatch");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfWLMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLMatch[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLMatch");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLMatch");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfWLMatchSummaryItem");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLMatchSummaryItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLMatchSummaryItem");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLMatchSummaryItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ArrayOfWLPhoneMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLPhoneMatch[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLPhoneMatch");
            qName2 = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLPhoneMatch");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AssignmentInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AssignmentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AssignmentType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AssignmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "AuditItem");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AuditItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ClientContext");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "CountryPhraseType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DataFileInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DataFileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DataFileType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DataFileType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Date");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Date.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "DPPAChoiceType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DPPAChoiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EFTPartyType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTPartyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EFTType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EFTType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAdditionalInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityAKA");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityAKA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityName");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EntityPhone");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.EntityPhone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPInput");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRedFlag");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRedFlag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FPRiskIndicator");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FPRiskIndicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FraudPointConfiguration");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FraudPointConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "FraudPointResults");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.FraudPointResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "GenderType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.GenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IDType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IDType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDAddressHistory");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAddressHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDAlternateName");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDAlternateName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDFEINMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFEINMatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDFiling");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDFiling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIDataSource");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDataSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIDataSourceVerification");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDataSourceVerification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIDate");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIException");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIHeader");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIIdentification");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIInput");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDInput");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIPassport");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIPassport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIResult");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIRiskIndicator");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIRiskIndicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIVerificationIndex");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIVerificationIndex.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDIVerificationResult");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDIVerificationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRedFlag");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRedFlag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDReversePhone");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDReversePhone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDRiskIndicator");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDRiskIndicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDSSNInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDSSNInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDVerificationIndicators");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDVerificationIndicators.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "IIDWatchlist");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IIDWatchlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputAdditionalInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputEFT");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputEFT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputEntity");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputEntityType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputEntityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputName");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputPhone");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputPhone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputRecord");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InputText");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InputText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDBusinessResults");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDBusinessResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDConfiguration");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDIndividualResults");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDIndividualResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDIntlConfiguration");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDIntlConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "InstantIDIntlIndividualResults");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.InstantIDIntlIndividualResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ListEntityType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListEntityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "OFACInstitutionInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.OFACInstitutionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "OFACReportInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.OFACReportInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "OFACReportType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.OFACReportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACH");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHNote");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedACHParty");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedACHParty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwire");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwire.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAdditionalInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAdjustment");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireAmount");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireDocument");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireNote");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwireParty");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwireParty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedFedwirePhone");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedFedwirePhone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022AdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Address");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022ID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022ID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Note");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022Note.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Party");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022Party.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedISO20022Phone");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedISO20022Phone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFT");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFT4XXData");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFT4XXData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAdditionalInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAddress");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTAmount");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTChequeDetails");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTChequeDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCommodityContractInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCommodityContractInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCommodityInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCommodityInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCurrencyDetail");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCurrencyDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTCurrencySequence");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTCurrencySequence.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTDrawingInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTDrawingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTField");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTID");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTLinkage");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTLinkage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTNote");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTParty");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTParty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTPurchaseAgreementDetails");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTPurchaseAgreementDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTReportingPartyInfo");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTReportingPartyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTSettlementDetails");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTSettlementDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTStandingSettlementInstruction");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTStandingSettlementInstruction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ParsedSWIFTUniqueTransactionIdentifier");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ParsedSWIFTUniqueTransactionIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "PhoneType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.PhoneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "RecordState");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.RecordState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultEntityType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultEntityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultError");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultRecord");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ResultRecordDetails");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultRecordDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SearchConfiguration");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SearchInput");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "SearchResults");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ServiceFault");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "ServiceFaultType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistAutomaticFalsePositiveRules");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistAutomaticFalsePositiveRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistConfiguration");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistDataFile");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistDataFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistEFTMatchOptions");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistEFTMatchOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistGeneralOptions");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistGeneralOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistMatchDispositionRules");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistMatchDispositionRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistMatchOptions");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistMatchOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistMatchState");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistMatchState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistMatchStateType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistMatchStateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WatchlistResults");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WatchlistResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLAddressMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLAddressMatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLCitizenshipMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLCitizenshipMatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLCountryDetails");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLCountryDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLDOBMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLDOBMatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLEntityDetails");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLEntityDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLIDMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLIDMatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLMatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLMatchConflicts");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLMatchConflicts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLMatchFile");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLMatchFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLMatchSummary");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLMatchSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLMatchSummaryItem");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLMatchSummaryItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLPhoneMatch");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLPhoneMatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "WLSearchStatusType");
            cachedSerQNames.add(qName);
            cls = com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.WLSearchStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DataFileInfo[] getDataFileList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0/ISearch/GetDataFileList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "GetDataFileList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DataFileInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DataFileInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DataFileInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault) {
              throw (com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchResults search(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchConfiguration config, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchInput input) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0/ISearch/Search");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "Search"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, config, input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault) {
              throw (com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
