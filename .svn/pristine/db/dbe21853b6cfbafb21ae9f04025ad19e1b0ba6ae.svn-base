package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class ISearchProxy implements com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ISearch {
  private String _endpoint = null;
  private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ISearch iSearch = null;
  
  public ISearchProxy() {
    _initISearchProxy();
  }
  
  public ISearchProxy(String endpoint) {
    _endpoint = endpoint;
    _initISearchProxy();
  }
  
  private void _initISearchProxy() {
    try {
      iSearch = (new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.XGServicesLocator()).getBasicHttpBinding_ISearch();
      if (iSearch != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iSearch)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iSearch)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iSearch != null)
      ((javax.xml.rpc.Stub)iSearch)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ISearch getISearch() {
    if (iSearch == null)
      _initISearchProxy();
    return iSearch;
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.DataFileInfo[] getDataFileList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iSearch == null)
      _initISearchProxy();
    return iSearch.getDataFileList(context);
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchResults search(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchConfiguration config, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchInput input) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iSearch == null)
      _initISearchProxy();
    return iSearch.search(context, config, input);
  }
  
  
}