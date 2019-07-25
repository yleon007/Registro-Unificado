/**
 * IListMaintenance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public interface IListMaintenance extends java.rmi.Remote {
    public long addList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListInfo list) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public boolean deleteList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListInfo getList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public boolean indexList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public boolean mergeDuplicates(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListInfo[] searchLists(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListCriteria criteria) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public boolean updateList(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListInfo list) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public long addResultRecord(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ResultInfo result) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.AddRecordResult[] addRecords(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListRecord[] records) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public long[] deleteRecords(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID, long[] recordIDs) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListRecord[] getRecords(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID, long[] recordIDs) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.SearchRecordResults searchListRecords(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, long listID, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListRecordCriteria criteria, long position, int numberToReturn) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
    public boolean updateRecord(com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ClientContext context, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ListRecord record) throws java.rmi.RemoteException, com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.ServiceFault;
}
