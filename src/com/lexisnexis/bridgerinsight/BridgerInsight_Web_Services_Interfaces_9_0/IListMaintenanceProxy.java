package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class IListMaintenanceProxy implements com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IListMaintenance {
  private String _endpoint = null;
  private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IListMaintenance iListMaintenance = null;
  
  public IListMaintenanceProxy() {
    _initIListMaintenanceProxy();
  }
  
  public IListMaintenanceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIListMaintenanceProxy();
  }
  
  private void _initIListMaintenanceProxy() {
    try {
      iListMaintenance = (new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.XGServicesLocator()).getBasicHttpBinding_IListMaintenance();
      if (iListMaintenance != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iListMaintenance)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iListMaintenance)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iListMaintenance != null)
      ((javax.xml.rpc.Stub)iListMaintenance)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IListMaintenance getIListMaintenance() {
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance;
  }
  
  public long addList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListInfo list) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.addList(context, list);
  }
  
  public boolean deleteList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.deleteList(context, listID);
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListInfo getList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.getList(context, listID);
  }
  
  public boolean indexList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.indexList(context, listID);
  }
  
  public boolean mergeDuplicates(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.mergeDuplicates(context, listID);
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListInfo[] searchLists(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListCriteria criteria) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.searchLists(context, criteria);
  }
  
  public boolean updateList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListInfo list) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.updateList(context, list);
  }
  
  public long addResultRecord(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultInfo result) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.addResultRecord(context, listID, result);
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AddRecordResult[] addRecords(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListRecord[] records) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.addRecords(context, listID, records);
  }
  
  public long[] deleteRecords(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID, long[] recordIDs) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.deleteRecords(context, listID, recordIDs);
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListRecord[] getRecords(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID, long[] recordIDs) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.getRecords(context, listID, recordIDs);
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchRecordResults searchListRecords(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListRecordCriteria criteria, long position, int numberToReturn) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.searchListRecords(context, listID, criteria, position, numberToReturn);
  }
  
  public boolean updateRecord(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListRecord record) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iListMaintenance == null)
      _initIListMaintenanceProxy();
    return iListMaintenance.updateRecord(context, record);
  }
  
  
}