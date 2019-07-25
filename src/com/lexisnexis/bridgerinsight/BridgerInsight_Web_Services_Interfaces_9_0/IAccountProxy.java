package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class IAccountProxy implements com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IAccount {
  private String _endpoint = null;
  private com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IAccount iAccount = null;
  
  public IAccountProxy() {
    _initIAccountProxy();
  }
  
  public IAccountProxy(String endpoint) {
    _endpoint = endpoint;
    _initIAccountProxy();
  }
  
  private void _initIAccountProxy() {
    try {
      iAccount = (new com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.XGServicesLocator()).getBasicHttpBinding_IAccount();
      if (iAccount != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iAccount)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iAccount)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iAccount != null)
      ((javax.xml.rpc.Stub)iAccount)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.IAccount getIAccount() {
    if (iAccount == null)
      _initIAccountProxy();
    return iAccount;
  }
  
  public boolean changePassword(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, java.lang.String newPassword) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iAccount == null)
      _initIAccountProxy();
    return iAccount.changePassword(context, newPassword);
  }
  
  public int getDaysUntilPasswordExpires(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault{
    if (iAccount == null)
      _initIAccountProxy();
    return iAccount.getDaysUntilPasswordExpires(context);
  }
  
  
}