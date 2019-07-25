/**
 * EFTPartyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexisnexis.bridgerinsight.BridgerInsight_Web_Services_Interfaces_9_0;

public class EFTPartyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EFTPartyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _AccountCredited = "AccountCredited";
    public static final java.lang.String _AccountDebited = "AccountDebited";
    public static final java.lang.String _AccountIdentification = "AccountIdentification";
    public static final java.lang.String _AccountServicingFI = "AccountServicingFI";
    public static final java.lang.String _AccountWithInstitution = "AccountWithInstitution";
    public static final java.lang.String _AdviseThroughFI = "AdviseThroughFI";
    public static final java.lang.String _Applicant = "Applicant";
    public static final java.lang.String _ApplicantFI = "ApplicantFI";
    public static final java.lang.String _AvailableWithFI = "AvailableWithFI";
    public static final java.lang.String _Beneficiary = "Beneficiary";
    public static final java.lang.String _BeneficiaryFI = "BeneficiaryFI";
    public static final java.lang.String _ChargesAccount = "ChargesAccount";
    public static final java.lang.String _ChargesAccountAgent = "ChargesAccountAgent";
    public static final java.lang.String _ChequeDeliverTo = "ChequeDeliverTo";
    public static final java.lang.String _ChequeFrom = "ChequeFrom";
    public static final java.lang.String _Contact = "Contact";
    public static final java.lang.String _CorrespondentFI = "CorrespondentFI";
    public static final java.lang.String _CreditMandateSigner = "CreditMandateSigner";
    public static final java.lang.String _Creditor = "Creditor";
    public static final java.lang.String _CreditorAccount = "CreditorAccount";
    public static final java.lang.String _CreditorAgent = "CreditorAgent";
    public static final java.lang.String _CreditorAgentAccount = "CreditorAgentAccount";
    public static final java.lang.String _Debtor = "Debtor";
    public static final java.lang.String _DebtorAccount = "DebtorAccount";
    public static final java.lang.String _DebtorAgent = "DebtorAgent";
    public static final java.lang.String _DebtorAgentAccount = "DebtorAgentAccount";
    public static final java.lang.String _DocumentIssuer = "DocumentIssuer";
    public static final java.lang.String _Drawee = "Drawee";
    public static final java.lang.String _ForwardingAgent = "ForwardingAgent";
    public static final java.lang.String _InitiatingParty = "InitiatingParty";
    public static final java.lang.String _InstructingFI = "InstructingFI";
    public static final java.lang.String _InstructingParty = "InstructingParty";
    public static final java.lang.String _IntermediaryAgent = "IntermediaryAgent";
    public static final java.lang.String _IntermediaryAgentAccount = "IntermediaryAgentAccount";
    public static final java.lang.String _IntermediaryFI = "IntermediaryFI";
    public static final java.lang.String _Invoicee = "Invoicee";
    public static final java.lang.String _Invoicer = "Invoicer";
    public static final java.lang.String _Issuer = "Issuer";
    public static final java.lang.String _IssuingFI = "IssuingFI";
    public static final java.lang.String _NegotiatingFI = "NegotiatingFI";
    public static final java.lang.String _OrderingCustomer = "OrderingCustomer";
    public static final java.lang.String _OrderingFI = "OrderingFI";
    public static final java.lang.String _OriginalCreditMandateSigner = "OriginalCreditMandateSigner";
    public static final java.lang.String _OriginalCreditorAgent = "OriginalCreditorAgent";
    public static final java.lang.String _OriginalCreditorAgentAccount = "OriginalCreditorAgentAccount";
    public static final java.lang.String _OriginalDebtor = "OriginalDebtor";
    public static final java.lang.String _OriginalDebtorAccount = "OriginalDebtorAccount";
    public static final java.lang.String _OriginalDebtorAgent = "OriginalDebtorAgent";
    public static final java.lang.String _OriginalDebtorAgentAccount = "OriginalDebtorAgentAccount";
    public static final java.lang.String _OriginalReceivingFI = "OriginalReceivingFI";
    public static final java.lang.String _Originator = "Originator";
    public static final java.lang.String _OriginationFI = "OriginationFI";
    public static final java.lang.String _PrimaryDocumentIssuer = "PrimaryDocumentIssuer";
    public static final java.lang.String _Principal = "Principal";
    public static final java.lang.String _Receiver = "Receiver";
    public static final java.lang.String _ReceiversCorrespondent = "ReceiversCorrespondent";
    public static final java.lang.String _ReceivingFI = "ReceivingFI";
    public static final java.lang.String _ReimbursingFI = "ReimbursingFI";
    public static final java.lang.String _Remittance = "Remittance";
    public static final java.lang.String _SecondaryDocumentIssuer = "SecondaryDocumentIssuer";
    public static final java.lang.String _SenderOfCashLetter = "SenderOfCashLetter";
    public static final java.lang.String _SendersCorrespondent = "SendersCorrespondent";
    public static final java.lang.String _SendingFI = "SendingFI";
    public static final java.lang.String _ThirdReimbursementFI = "ThirdReimbursementFI";
    public static final java.lang.String _UltimateCreditor = "UltimateCreditor";
    public static final java.lang.String _UltimateDebtor = "UltimateDebtor";
    public static final java.lang.String _Broker = "Broker";
    public static final java.lang.String _CreditorsFI = "CreditorsFI";
    public static final java.lang.String _DealingBranchPartyA = "DealingBranchPartyA";
    public static final java.lang.String _DealingBranchPartyB = "DealingBranchPartyB";
    public static final java.lang.String _DebitInstitution = "DebitInstitution";
    public static final java.lang.String _DebtorsFI = "DebtorsFI";
    public static final java.lang.String _DeliveryAgent = "DeliveryAgent";
    public static final java.lang.String _DrawerFI = "DrawerFI";
    public static final java.lang.String _EnquiredParty = "EnquiredParty";
    public static final java.lang.String _FundOrBeneficiaryCustomer = "FundOrBeneficiaryCustomer";
    public static final java.lang.String _FundOrInstructingParty = "FundOrInstructingParty";
    public static final java.lang.String _InitiatingInstitution = "InitiatingInstitution";
    public static final java.lang.String _PartyA = "PartyA";
    public static final java.lang.String _PartyB = "PartyB";
    public static final java.lang.String _Payee = "Payee";
    public static final java.lang.String _ReceivingAgent = "ReceivingAgent";
    public static final java.lang.String _BeneficiaryOfCommodity = "BeneficiaryOfCommodity";
    public static final java.lang.String _Borrower = "Borrower";
    public static final java.lang.String _ClearingBroker = "ClearingBroker";
    public static final java.lang.String _ClearingExceptionParty = "ClearingExceptionParty";
    public static final java.lang.String _DelivererOfCommodity = "DelivererOfCommodity";
    public static final java.lang.String _ExecutionVenue = "ExecutionVenue";
    public static final java.lang.String _ReceiverOfCommodity = "ReceiverOfCommodity";
    public static final java.lang.String _RemittingAgent = "RemittingAgent";
    public static final java.lang.String _ReportingParty = "ReportingParty";
    public static final java.lang.String _SafekeepingAccount = "SafekeepingAccount";
    public static final java.lang.String _SellingAgent = "SellingAgent";
    public static final java.lang.String _SSIRecipient = "SSIRecipient";
    public static final java.lang.String _SubmittingParty = "SubmittingParty";
    public static final java.lang.String _TradeParty = "TradeParty";
    public static final java.lang.String _ApplicationHeaderBlockParty = "ApplicationHeaderBlockParty";
    public static final java.lang.String _BasicHeaderBlockParty = "BasicHeaderBlockParty";
    public static final java.lang.String _CalculationAgent = "CalculationAgent";
    public static final java.lang.String _CentralCounterpartyClearingHouse = "CentralCounterpartyClearingHouse";
    public static final java.lang.String _Counterparty = "Counterparty";
    public static final java.lang.String _ExecutingBroker = "ExecutingBroker";
    public static final java.lang.String _Fund = "Fund";
    public static final java.lang.String _FundManager = "FundManager";
    public static final java.lang.String _FXCounterparty = "FXCounterparty";
    public static final java.lang.String _Investor = "Investor";
    public static final java.lang.String _LoanDepositCounterparty = "LoanDepositCounterparty";
    public static final java.lang.String _MessageOriginator = "MessageOriginator";
    public static final EFTPartyType None = new EFTPartyType(_None);
    public static final EFTPartyType AccountCredited = new EFTPartyType(_AccountCredited);
    public static final EFTPartyType AccountDebited = new EFTPartyType(_AccountDebited);
    public static final EFTPartyType AccountIdentification = new EFTPartyType(_AccountIdentification);
    public static final EFTPartyType AccountServicingFI = new EFTPartyType(_AccountServicingFI);
    public static final EFTPartyType AccountWithInstitution = new EFTPartyType(_AccountWithInstitution);
    public static final EFTPartyType AdviseThroughFI = new EFTPartyType(_AdviseThroughFI);
    public static final EFTPartyType Applicant = new EFTPartyType(_Applicant);
    public static final EFTPartyType ApplicantFI = new EFTPartyType(_ApplicantFI);
    public static final EFTPartyType AvailableWithFI = new EFTPartyType(_AvailableWithFI);
    public static final EFTPartyType Beneficiary = new EFTPartyType(_Beneficiary);
    public static final EFTPartyType BeneficiaryFI = new EFTPartyType(_BeneficiaryFI);
    public static final EFTPartyType ChargesAccount = new EFTPartyType(_ChargesAccount);
    public static final EFTPartyType ChargesAccountAgent = new EFTPartyType(_ChargesAccountAgent);
    public static final EFTPartyType ChequeDeliverTo = new EFTPartyType(_ChequeDeliverTo);
    public static final EFTPartyType ChequeFrom = new EFTPartyType(_ChequeFrom);
    public static final EFTPartyType Contact = new EFTPartyType(_Contact);
    public static final EFTPartyType CorrespondentFI = new EFTPartyType(_CorrespondentFI);
    public static final EFTPartyType CreditMandateSigner = new EFTPartyType(_CreditMandateSigner);
    public static final EFTPartyType Creditor = new EFTPartyType(_Creditor);
    public static final EFTPartyType CreditorAccount = new EFTPartyType(_CreditorAccount);
    public static final EFTPartyType CreditorAgent = new EFTPartyType(_CreditorAgent);
    public static final EFTPartyType CreditorAgentAccount = new EFTPartyType(_CreditorAgentAccount);
    public static final EFTPartyType Debtor = new EFTPartyType(_Debtor);
    public static final EFTPartyType DebtorAccount = new EFTPartyType(_DebtorAccount);
    public static final EFTPartyType DebtorAgent = new EFTPartyType(_DebtorAgent);
    public static final EFTPartyType DebtorAgentAccount = new EFTPartyType(_DebtorAgentAccount);
    public static final EFTPartyType DocumentIssuer = new EFTPartyType(_DocumentIssuer);
    public static final EFTPartyType Drawee = new EFTPartyType(_Drawee);
    public static final EFTPartyType ForwardingAgent = new EFTPartyType(_ForwardingAgent);
    public static final EFTPartyType InitiatingParty = new EFTPartyType(_InitiatingParty);
    public static final EFTPartyType InstructingFI = new EFTPartyType(_InstructingFI);
    public static final EFTPartyType InstructingParty = new EFTPartyType(_InstructingParty);
    public static final EFTPartyType IntermediaryAgent = new EFTPartyType(_IntermediaryAgent);
    public static final EFTPartyType IntermediaryAgentAccount = new EFTPartyType(_IntermediaryAgentAccount);
    public static final EFTPartyType IntermediaryFI = new EFTPartyType(_IntermediaryFI);
    public static final EFTPartyType Invoicee = new EFTPartyType(_Invoicee);
    public static final EFTPartyType Invoicer = new EFTPartyType(_Invoicer);
    public static final EFTPartyType Issuer = new EFTPartyType(_Issuer);
    public static final EFTPartyType IssuingFI = new EFTPartyType(_IssuingFI);
    public static final EFTPartyType NegotiatingFI = new EFTPartyType(_NegotiatingFI);
    public static final EFTPartyType OrderingCustomer = new EFTPartyType(_OrderingCustomer);
    public static final EFTPartyType OrderingFI = new EFTPartyType(_OrderingFI);
    public static final EFTPartyType OriginalCreditMandateSigner = new EFTPartyType(_OriginalCreditMandateSigner);
    public static final EFTPartyType OriginalCreditorAgent = new EFTPartyType(_OriginalCreditorAgent);
    public static final EFTPartyType OriginalCreditorAgentAccount = new EFTPartyType(_OriginalCreditorAgentAccount);
    public static final EFTPartyType OriginalDebtor = new EFTPartyType(_OriginalDebtor);
    public static final EFTPartyType OriginalDebtorAccount = new EFTPartyType(_OriginalDebtorAccount);
    public static final EFTPartyType OriginalDebtorAgent = new EFTPartyType(_OriginalDebtorAgent);
    public static final EFTPartyType OriginalDebtorAgentAccount = new EFTPartyType(_OriginalDebtorAgentAccount);
    public static final EFTPartyType OriginalReceivingFI = new EFTPartyType(_OriginalReceivingFI);
    public static final EFTPartyType Originator = new EFTPartyType(_Originator);
    public static final EFTPartyType OriginationFI = new EFTPartyType(_OriginationFI);
    public static final EFTPartyType PrimaryDocumentIssuer = new EFTPartyType(_PrimaryDocumentIssuer);
    public static final EFTPartyType Principal = new EFTPartyType(_Principal);
    public static final EFTPartyType Receiver = new EFTPartyType(_Receiver);
    public static final EFTPartyType ReceiversCorrespondent = new EFTPartyType(_ReceiversCorrespondent);
    public static final EFTPartyType ReceivingFI = new EFTPartyType(_ReceivingFI);
    public static final EFTPartyType ReimbursingFI = new EFTPartyType(_ReimbursingFI);
    public static final EFTPartyType Remittance = new EFTPartyType(_Remittance);
    public static final EFTPartyType SecondaryDocumentIssuer = new EFTPartyType(_SecondaryDocumentIssuer);
    public static final EFTPartyType SenderOfCashLetter = new EFTPartyType(_SenderOfCashLetter);
    public static final EFTPartyType SendersCorrespondent = new EFTPartyType(_SendersCorrespondent);
    public static final EFTPartyType SendingFI = new EFTPartyType(_SendingFI);
    public static final EFTPartyType ThirdReimbursementFI = new EFTPartyType(_ThirdReimbursementFI);
    public static final EFTPartyType UltimateCreditor = new EFTPartyType(_UltimateCreditor);
    public static final EFTPartyType UltimateDebtor = new EFTPartyType(_UltimateDebtor);
    public static final EFTPartyType Broker = new EFTPartyType(_Broker);
    public static final EFTPartyType CreditorsFI = new EFTPartyType(_CreditorsFI);
    public static final EFTPartyType DealingBranchPartyA = new EFTPartyType(_DealingBranchPartyA);
    public static final EFTPartyType DealingBranchPartyB = new EFTPartyType(_DealingBranchPartyB);
    public static final EFTPartyType DebitInstitution = new EFTPartyType(_DebitInstitution);
    public static final EFTPartyType DebtorsFI = new EFTPartyType(_DebtorsFI);
    public static final EFTPartyType DeliveryAgent = new EFTPartyType(_DeliveryAgent);
    public static final EFTPartyType DrawerFI = new EFTPartyType(_DrawerFI);
    public static final EFTPartyType EnquiredParty = new EFTPartyType(_EnquiredParty);
    public static final EFTPartyType FundOrBeneficiaryCustomer = new EFTPartyType(_FundOrBeneficiaryCustomer);
    public static final EFTPartyType FundOrInstructingParty = new EFTPartyType(_FundOrInstructingParty);
    public static final EFTPartyType InitiatingInstitution = new EFTPartyType(_InitiatingInstitution);
    public static final EFTPartyType PartyA = new EFTPartyType(_PartyA);
    public static final EFTPartyType PartyB = new EFTPartyType(_PartyB);
    public static final EFTPartyType Payee = new EFTPartyType(_Payee);
    public static final EFTPartyType ReceivingAgent = new EFTPartyType(_ReceivingAgent);
    public static final EFTPartyType BeneficiaryOfCommodity = new EFTPartyType(_BeneficiaryOfCommodity);
    public static final EFTPartyType Borrower = new EFTPartyType(_Borrower);
    public static final EFTPartyType ClearingBroker = new EFTPartyType(_ClearingBroker);
    public static final EFTPartyType ClearingExceptionParty = new EFTPartyType(_ClearingExceptionParty);
    public static final EFTPartyType DelivererOfCommodity = new EFTPartyType(_DelivererOfCommodity);
    public static final EFTPartyType ExecutionVenue = new EFTPartyType(_ExecutionVenue);
    public static final EFTPartyType ReceiverOfCommodity = new EFTPartyType(_ReceiverOfCommodity);
    public static final EFTPartyType RemittingAgent = new EFTPartyType(_RemittingAgent);
    public static final EFTPartyType ReportingParty = new EFTPartyType(_ReportingParty);
    public static final EFTPartyType SafekeepingAccount = new EFTPartyType(_SafekeepingAccount);
    public static final EFTPartyType SellingAgent = new EFTPartyType(_SellingAgent);
    public static final EFTPartyType SSIRecipient = new EFTPartyType(_SSIRecipient);
    public static final EFTPartyType SubmittingParty = new EFTPartyType(_SubmittingParty);
    public static final EFTPartyType TradeParty = new EFTPartyType(_TradeParty);
    public static final EFTPartyType ApplicationHeaderBlockParty = new EFTPartyType(_ApplicationHeaderBlockParty);
    public static final EFTPartyType BasicHeaderBlockParty = new EFTPartyType(_BasicHeaderBlockParty);
    public static final EFTPartyType CalculationAgent = new EFTPartyType(_CalculationAgent);
    public static final EFTPartyType CentralCounterpartyClearingHouse = new EFTPartyType(_CentralCounterpartyClearingHouse);
    public static final EFTPartyType Counterparty = new EFTPartyType(_Counterparty);
    public static final EFTPartyType ExecutingBroker = new EFTPartyType(_ExecutingBroker);
    public static final EFTPartyType Fund = new EFTPartyType(_Fund);
    public static final EFTPartyType FundManager = new EFTPartyType(_FundManager);
    public static final EFTPartyType FXCounterparty = new EFTPartyType(_FXCounterparty);
    public static final EFTPartyType Investor = new EFTPartyType(_Investor);
    public static final EFTPartyType LoanDepositCounterparty = new EFTPartyType(_LoanDepositCounterparty);
    public static final EFTPartyType MessageOriginator = new EFTPartyType(_MessageOriginator);
    public java.lang.String getValue() { return _value_;}
    public static EFTPartyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EFTPartyType enumeration = (EFTPartyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EFTPartyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EFTPartyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://bridgerinsight.lexisnexis.com/BridgerInsight.Web.Services.Interfaces.9.0", "EFTPartyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
