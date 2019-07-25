package com.ericsson.alodiga.utils;

import com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0.XGServices;

public class SearchLexisNexis {

	// /////////////////////////////////////////////////////////////////////////////
	// Function: Search
	// /////////////////////////////////////////////////////////////////////////////
	// Create a client.

	public static void search(){
	/*
XGServices.SearchClient SearchClient = new XgServices.SearchClient();
//Set the endpoint for the client. It will have a different value for production and test.
SearchClient.Endpoint.Address = new System.ServiceModel.EndpointAddress
("https://bridgerinsight.lexisnexis.com/LN.WebService.V9/xgservices.svc/Search");
//Set up context, configuration, and input information.
XgServices.SearchInput Input = new XgServices.SearchInput();
//Set up the context.
XgServices.ClientContext Context = new XgServices.ClientContext();
Context.ClientID = "ClientID";
Context.UserID = "UserID";
Context.Password = "Password";
Context.ClientReference = "GUID here Please";
Context.GLB = 5;
Context.DPPA = XgServices.DPPAChoiceType.Choice3;
//Set up the configuration.
XgServices.SearchConfiguration Config = new XgServices.SearchConfiguration();
Config.PredefinedSearchName = "Watch List";
//Set the alert assignment.
Config.AssignResultTo = new XgServices.AssignmentInfo();
Config.AssignResultTo.RolesOrUsers = new XgServices.ArrayOfString();
Config.AssignResultTo.Type = XgServices.AssignmentType.Role;
Config.AssignResultTo.RolesOrUsers.Add("Administrator");
Config.WriteResultsToDatabase = true;
//Set up the input information.
Input.Records = new XgServices.InputRecord[1];
Input.Records[0] = new XgServices.InputRecord();
Input.Records[0].Entity = new XgServices.InputEntity();
Input.Records[0].Entity.EntityType = XgServices.InputEntityType.Individual;
Input.Records[0].Entity.Name = new XgServices.InputName();
Input.Records[0].Entity.Name.First = "Charles";
Input.Records[0].Entity.Name.Last = "Taylor";
//Provide the input information.

Input.Records[0].Entity.IDs = new XgServices.InputID[1];
Input.Records[0].Entity.IDs[0] = new XgServices.InputID();
Input.Records[0].Entity.IDs[0].Type = XgServices.IDType.SSN;
Input.Records[0].Entity.IDs[0].Number = "1234";
Input.Records[0].Entity.AdditionalInfo = new XgServices.InputAdditionalInfo[1];
Input.Records[0].Entity.AdditionalInfo[0] = new XgServices.InputAdditionalInfo();
Input.Records[0].Entity.AdditionalInfo[0].Type = XgServices.AdditionalInfoType.Incident;
Input.Records[0].Entity.AdditionalInfo[0].Value = "Rejected";
//Call the search.
XgServices.SearchResults Result = SearchClient.Search(Context, Config, Input);
///////////////////////////////////////////////////////////////////////////////
//END Function: Search
///////////////////////////////////////////////////////////////////////////////

*/
	}}
