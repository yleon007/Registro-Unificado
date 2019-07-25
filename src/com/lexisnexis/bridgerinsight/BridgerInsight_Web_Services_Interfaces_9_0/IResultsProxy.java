package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class IResultsProxy implements com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IResults {
  private String _endpoint = null;
  private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IResults iResults = null;
  
  public IResultsProxy() {
    _initIResultsProxy();
  }
  
  public IResultsProxy(String endpoint) {
    _endpoint = endpoint;
    _initIResultsProxy();
  }
  
  private void _initIResultsProxy() {
    try {
      iResults = (new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.XGServicesLocator()).getBasicHttpBinding_IResults();
      if (iResults != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iResults)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iResults)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iResults != null)
      ((javax.xml.rpc.Stub)iResults)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IResults getIResults() {
    if (iResults == null)
      _initIResultsProxy();
    return iResults;
  }
  
  public long addAttachment(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Attachment attachment) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iResults == null)
      _initIResultsProxy();
    return iResults.addAttachment(context, attachment);
  }
  
  public boolean deleteAttachment(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long attachmentID, long resultID) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iResults == null)
      _initIResultsProxy();
    return iResults.deleteAttachment(context, attachmentID, resultID);
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.Attachment getAttachment(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long attachmentID, long resultID) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iResults == null)
      _initIResultsProxy();
    return iResults.getAttachment(context, attachmentID, resultID);
  }
  
  public long[] deleteResultRecords(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long[] resultIDs) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iResults == null)
      _initIResultsProxy();
    return iResults.deleteResultRecords(context, resultIDs);
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultRecord[] getResultRecords(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long[] resultIDs) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iResults == null)
      _initIResultsProxy();
    return iResults.getResultRecords(context, resultIDs);
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchRecordResults searchResultRecords(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultsCriteria criteria, long position, int numberToReturn) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iResults == null)
      _initIResultsProxy();
    return iResults.searchResultRecords(context, criteria, position, numberToReturn);
  }
  
  public boolean setRecordState(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long resultID, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.RecordState state) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iResults == null)
      _initIResultsProxy();
    return iResults.setRecordState(context, resultID, state);
  }
  
  public long[] deleteRuns(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long[] runIDs) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iResults == null)
      _initIResultsProxy();
    return iResults.deleteRuns(context, runIDs);
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.RunInfo getRunInfo(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long runID) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iResults == null)
      _initIResultsProxy();
    return iResults.getRunInfo(context, runID);
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.RunInfo[] searchRuns(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.RunsCriteria criteria) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iResults == null)
      _initIResultsProxy();
    return iResults.searchRuns(context, criteria);
  }
  
  
}