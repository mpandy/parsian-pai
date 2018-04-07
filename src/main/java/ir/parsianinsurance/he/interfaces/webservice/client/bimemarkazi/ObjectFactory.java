
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WbsV4CurrencyReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4CurrencyReq");
    private final static QName _WbsV4DocLosRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4DocLosRes");
    private final static QName _WbsV4DocLosReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4DocLosReq");
    private final static QName _WbsV4PlcyCvrRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PlcyCvrRes");
    private final static QName _WbsV4PlcyCvrReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PlcyCvrReq");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _WbsV4AgncReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4AgncReq");
    private final static QName _WbsV4CurrencyRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4CurrencyRes");
    private final static QName _WbsV4AgncRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4AgncRes");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _WbsV4IntroRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4IntroRes");
    private final static QName _WbsV4IntroReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4IntroReq");
    private final static QName _WbsV4PlcyMthRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PlcyMthRes");
    private final static QName _WbsV4PlcyMthReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PlcyMthReq");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _WbsV4PlcyReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PlcyReq");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _WbsV4PlcyRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PlcyRes");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfKeyValueOfstringstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _WbsV4BrokerRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4BrokerRes");
    private final static QName _WbsV4PersonTypeRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PersonTypeRes");
    private final static QName _WbsV4PlcyLifeBaseReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PlcyLifeBaseReq");
    private final static QName _WbsV4PersonTypeReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PersonTypeReq");
    private final static QName _WbsV4PlcyLifeBaseRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PlcyLifeBaseRes");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _WbsV4CompaniesFildDetailReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4CompaniesFildDetailReq");
    private final static QName _WbsV4CompaniesFildDetailRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4CompaniesFildDetailRes");
    private final static QName _WbsV4LifeLosReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4LifeLosReq");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _WbsV4LifeLosRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4LifeLosRes");
    private final static QName _WbsV4LosRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4LosRes");
    private final static QName _WbsV4EdrsRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4EdrsRes");
    private final static QName _WbsV4LosReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4LosReq");
    private final static QName _WbsV4EdrsReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4EdrsReq");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _WbsV4BranchRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4BranchRes");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _WbsV4BranchReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4BranchReq");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _WbsV4BrokerReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4BrokerReq");
    private final static QName _WbsV4PlcyLifeReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PlcyLifeReq");
    private final static QName _UpdWbsV4DocLosReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "UpdWbsV4DocLosReq");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _WbsV4PlcyLifeRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "WbsV4PlcyLifeRes");
    private final static QName _UpdWbsV4DocLosRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "UpdWbsV4DocLosRes");
    private final static QName _CiiRegAgencyPr_QNAME = new QName("http://tempuri.org/", "Pr");
    private final static QName _CiiRegAgencyUsername_QNAME = new QName("http://tempuri.org/", "Username");
    private final static QName _CiiRegAgencyPassWrod_QNAME = new QName("http://tempuri.org/", "PassWrod");
    private final static QName _CiiRegPlcyCvrResponseCiiRegPlcyCvrResult_QNAME = new QName("http://tempuri.org/", "CiiRegPlcyCvrResult");
    private final static QName _CiiUpdDocLosReq_QNAME = new QName("http://tempuri.org/", "req");
    private final static QName _WbsV4BrokerReqBrkrNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "BrkrNo");
    private final static QName _WbsV4BrokerReqMapBrkrCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MapBrkrCod");
    private final static QName _CiiRegBranchResponseCiiRegBranchResult_QNAME = new QName("http://tempuri.org/", "CiiRegBranchResult");
    private final static QName _WbsV4EdrsReqMapCorTypCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MapCorTypCod");
    private final static QName _WbsV4EdrsReqMapCurCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MapCurCod");
    private final static QName _WbsV4EdrsReqNtnlId_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "NtnlId");
    private final static QName _WbsV4EdrsReqEndDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "EndDte");
    private final static QName _WbsV4EdrsReqMapIntrCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MapIntrCod");
    private final static QName _WbsV4EdrsReqMapFldDtlCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MapFldDtlCod");
    private final static QName _WbsV4EdrsReqInsNam_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "InsNam");
    private final static QName _WbsV4EdrsReqMapBrnhCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MapBrnhCod");
    private final static QName _WbsV4EdrsReqZipCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ZipCod");
    private final static QName _WbsV4EdrsReqMapPrsnTypCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MapPrsnTypCod");
    private final static QName _WbsV4EdrsReqTel_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Tel");
    private final static QName _WbsV4EdrsReqMapAgncCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MapAgncCod");
    private final static QName _WbsV4EdrsReqDscr_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Dscr");
    private final static QName _WbsV4EdrsReqBgnDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "BgnDte");
    private final static QName _WbsV4EdrsReqCmpDocNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CmpDocNo");
    private final static QName _WbsV4EdrsReqIsuDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "IsuDte");
    private final static QName _WbsV4EdrsReqMbl_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Mbl");
    private final static QName _RegPlcyLifeBaseResponseRegPlcyLifeBaseResult_QNAME = new QName("http://tempuri.org/", "RegPlcyLifeBaseResult");
    private final static QName _WbsV4EdrsResErrors_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Errors");
    private final static QName _WbsV4DocLosReqAncDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "AncDte");
    private final static QName _WbsV4DocLosReqLosEvlNtnlId_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "LosEvlNtnlId");
    private final static QName _WbsV4DocLosReqLosEvl_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "LosEvl");
    private final static QName _WbsV4DocLosReqOcrDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "OcrDte");
    private final static QName _WbsV4DocLosReqFleDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "FleDte");
    private final static QName _CiiRegCurrencyResponseCiiRegCurrencyResult_QNAME = new QName("http://tempuri.org/", "CiiRegCurrencyResult");
    private final static QName _WbsV4IntroResCmpIntrCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CmpIntrCod");
    private final static QName _CiiRegPersonTypeResponseCiiRegPersonTypeResult_QNAME = new QName("http://tempuri.org/", "CiiRegPersonTypeResult");
    private final static QName _CiiRegEdrsResponseCiiRegEdrsResult_QNAME = new QName("http://tempuri.org/", "CiiRegEdrsResult");
    private final static QName _CiiUpdDocLosResponseCiiUpdDocLosResult_QNAME = new QName("http://tempuri.org/", "CiiUpdDocLosResult");
    private final static QName _CiiRegDocLosResponseCiiRegDocLosResult_QNAME = new QName("http://tempuri.org/", "CiiRegDocLosResult");
    private final static QName _WbsV4CompaniesFildDetailReqFldDtlCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "FldDtlCod");
    private final static QName _WbsV4CompaniesFildDetailReqGrpngCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "GrpngCod");
    private final static QName _WbsV4CompaniesFildDetailReqMapPrntFldDtlCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MapPrntFldDtlCod");
    private final static QName _WbsV4CompaniesFildDetailReqCmpPrntFldDtlNam_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CmpPrntFldDtlNam");
    private final static QName _WbsV4CompaniesFildDetailReqCmpFldDtlNam_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CmpFldDtlNam");
    private final static QName _WbsV4BrokerResCmpBrkrCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CmpBrkrCod");
    private final static QName _WbsV4PlcyMthReqCalcDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CalcDte");
    private final static QName _RegPlcyLifeResponseRegPlcyLifeResult_QNAME = new QName("http://tempuri.org/", "RegPlcyLifeResult");
    private final static QName _CiiRegBrokerResponseCiiRegBrokerResult_QNAME = new QName("http://tempuri.org/", "CiiRegBrokerResult");
    private final static QName _WbsV4CurrencyResCmpCurCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CmpCurCod");
    private final static QName _CiiRegChkPlcyResponseCiiRegChkPlcyResult_QNAME = new QName("http://tempuri.org/", "CiiRegChkPlcyResult");
    private final static QName _WbsV4PlcyReqPrntCmpDocNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "PrntCmpDocNo");
    private final static QName _WbsV4CompaniesFildDetailResCmpFldDtlCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CmpFldDtlCod");
    private final static QName _CiiRegIntroResponseCiiRegIntroResult_QNAME = new QName("http://tempuri.org/", "CiiRegIntroResult");
    private final static QName _WbsV4PlcyLifeReqMsMapFldDtlCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MsMapFldDtlCod");
    private final static QName _WbsV4PlcyLifeReqMdcCmpFldDtlCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MdcCmpFldDtlCod");
    private final static QName _WbsV4PlcyLifeReqPayDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "PayDte");
    private final static QName _WbsV4PlcyLifeReqMapMdcFldDtlCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MapMdcFldDtlCod");
    private final static QName _WbsV4PlcyLifeReqCstmNam_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CstmNam");
    private final static QName _WbsV4PlcyLifeReqMapOthFldDtlCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MapOthFldDtlCod");
    private final static QName _WbsV4PlcyLifeReqOthCmpFldDtlCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "OthCmpFldDtlCod");
    private final static QName _WbsV4PlcyLifeReqBrthDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "BrthDte");
    private final static QName _WbsV4PlcyLifeReqRcvDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "RcvDte");
    private final static QName _WbsV4PlcyLifeReqTamamMapFldDtlCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "TamamMapFldDtlCod");
    private final static QName _CiiRegCompaniesFildDetailResponseCiiRegCompaniesFildDetailResult_QNAME = new QName("http://tempuri.org/", "CiiRegCompaniesFildDetailResult");
    private final static QName _WbsV4PlcyLifeBaseReqScnNam_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ScnNam");
    private final static QName _WbsV4PlcyLifeBaseReqIsuYear_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "IsuYear");
    private final static QName _CiiRegAgencyResponseCiiRegAgencyResult_QNAME = new QName("http://tempuri.org/", "CiiRegAgencyResult");
    private final static QName _WbsV4PersonTypeReqPrsnTypCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "PrsnTypCod");
    private final static QName _WbsV4PersonTypeReqCmpPrsnTypNam_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CmpPrsnTypNam");
    private final static QName _WbsV4AgncReqSngDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "SngDte");
    private final static QName _WbsV4AgncReqFrstNam_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "FrstNam");
    private final static QName _WbsV4AgncReqGrntDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "GrntDte");
    private final static QName _WbsV4AgncReqSttDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "SttDte");
    private final static QName _WbsV4AgncReqAdrs_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Adrs");
    private final static QName _WbsV4AgncReqExpDte_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ExpDte");
    private final static QName _WbsV4AgncReqLstNam_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "LstNam");
    private final static QName _WbsV4AgncReqMngNam_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "MngNam");
    private final static QName _CiiRegPlcyMthResponseCiiRegPlcyMthResult_QNAME = new QName("http://tempuri.org/", "CiiRegPlcyMthResult");
    private final static QName _WbsV4LosReqLosRcv_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "LosRcv");
    private final static QName _WbsV4LosReqLosRcvNtnlId_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "LosRcvNtnlId");
    private final static QName _CiiRegLosResponseCiiRegLosResult_QNAME = new QName("http://tempuri.org/", "CiiRegLosResult");
    private final static QName _WbsV4CurrencyReqCmpCurNam_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CmpCurNam");
    private final static QName _WbsV4CurrencyReqCurCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CurCod");
    private final static QName _WbsV4BranchReqBrnhNam_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "BrnhNam");
    private final static QName _WbsV4PlcyCvrReqPrm_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Prm");
    private final static QName _WbsV4PlcyCvrReqCvr_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Cvr");
    private final static QName _WbsV4PlcyCvrReqCptl_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Cptl");
    private final static QName _WbsV4PlcyCvrReqPlcyUnqCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "PlcyUnqCod");
    private final static QName _WbsV4PlcyCvrReqEdrsUnqCod_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "EdrsUnqCod");
    private final static QName _RegLifeLosResponseRegLifeLosResult_QNAME = new QName("http://tempuri.org/", "RegLifeLosResult");
    private final static QName _CiiRegLosLosReq_QNAME = new QName("http://tempuri.org/", "losReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring createArrayOfKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link CiiRegLos }
     * 
     */
    public CiiRegLos createCiiRegLos() {
        return new CiiRegLos();
    }

    /**
     * Create an instance of {@link WbsV4LosReq }
     * 
     */
    public WbsV4LosReq createWbsV4LosReq() {
        return new WbsV4LosReq();
    }

    /**
     * Create an instance of {@link CiiRegPlcyCvrResponse }
     * 
     */
    public CiiRegPlcyCvrResponse createCiiRegPlcyCvrResponse() {
        return new CiiRegPlcyCvrResponse();
    }

    /**
     * Create an instance of {@link WbsV4PlcyCvrRes }
     * 
     */
    public WbsV4PlcyCvrRes createWbsV4PlcyCvrRes() {
        return new WbsV4PlcyCvrRes();
    }

    /**
     * Create an instance of {@link CiiRegAgency }
     * 
     */
    public CiiRegAgency createCiiRegAgency() {
        return new CiiRegAgency();
    }

    /**
     * Create an instance of {@link WbsV4AgncReq }
     * 
     */
    public WbsV4AgncReq createWbsV4AgncReq() {
        return new WbsV4AgncReq();
    }

    /**
     * Create an instance of {@link CiiRegBroker }
     * 
     */
    public CiiRegBroker createCiiRegBroker() {
        return new CiiRegBroker();
    }

    /**
     * Create an instance of {@link WbsV4BrokerReq }
     * 
     */
    public WbsV4BrokerReq createWbsV4BrokerReq() {
        return new WbsV4BrokerReq();
    }

    /**
     * Create an instance of {@link CiiRegIntro }
     * 
     */
    public CiiRegIntro createCiiRegIntro() {
        return new CiiRegIntro();
    }

    /**
     * Create an instance of {@link WbsV4IntroReq }
     * 
     */
    public WbsV4IntroReq createWbsV4IntroReq() {
        return new WbsV4IntroReq();
    }

    /**
     * Create an instance of {@link CiiUpdDocLosResponse }
     * 
     */
    public CiiUpdDocLosResponse createCiiUpdDocLosResponse() {
        return new CiiUpdDocLosResponse();
    }

    /**
     * Create an instance of {@link UpdWbsV4DocLosRes }
     * 
     */
    public UpdWbsV4DocLosRes createUpdWbsV4DocLosRes() {
        return new UpdWbsV4DocLosRes();
    }

    /**
     * Create an instance of {@link CiiRegLosResponse }
     * 
     */
    public CiiRegLosResponse createCiiRegLosResponse() {
        return new CiiRegLosResponse();
    }

    /**
     * Create an instance of {@link WbsV4LosRes }
     * 
     */
    public WbsV4LosRes createWbsV4LosRes() {
        return new WbsV4LosRes();
    }

    /**
     * Create an instance of {@link CiiRegCompaniesFildDetailResponse }
     * 
     */
    public CiiRegCompaniesFildDetailResponse createCiiRegCompaniesFildDetailResponse() {
        return new CiiRegCompaniesFildDetailResponse();
    }

    /**
     * Create an instance of {@link WbsV4CompaniesFildDetailRes }
     * 
     */
    public WbsV4CompaniesFildDetailRes createWbsV4CompaniesFildDetailRes() {
        return new WbsV4CompaniesFildDetailRes();
    }

    /**
     * Create an instance of {@link RegPlcyLifeBaseResponse }
     * 
     */
    public RegPlcyLifeBaseResponse createRegPlcyLifeBaseResponse() {
        return new RegPlcyLifeBaseResponse();
    }

    /**
     * Create an instance of {@link WbsV4PlcyLifeBaseRes }
     * 
     */
    public WbsV4PlcyLifeBaseRes createWbsV4PlcyLifeBaseRes() {
        return new WbsV4PlcyLifeBaseRes();
    }

    /**
     * Create an instance of {@link CiiRegPersonTypeResponse }
     * 
     */
    public CiiRegPersonTypeResponse createCiiRegPersonTypeResponse() {
        return new CiiRegPersonTypeResponse();
    }

    /**
     * Create an instance of {@link WbsV4PersonTypeRes }
     * 
     */
    public WbsV4PersonTypeRes createWbsV4PersonTypeRes() {
        return new WbsV4PersonTypeRes();
    }

    /**
     * Create an instance of {@link CiiRegBranch }
     * 
     */
    public CiiRegBranch createCiiRegBranch() {
        return new CiiRegBranch();
    }

    /**
     * Create an instance of {@link WbsV4BranchReq }
     * 
     */
    public WbsV4BranchReq createWbsV4BranchReq() {
        return new WbsV4BranchReq();
    }

    /**
     * Create an instance of {@link CiiRegChkPlcy }
     * 
     */
    public CiiRegChkPlcy createCiiRegChkPlcy() {
        return new CiiRegChkPlcy();
    }

    /**
     * Create an instance of {@link WbsV4PlcyReq }
     * 
     */
    public WbsV4PlcyReq createWbsV4PlcyReq() {
        return new WbsV4PlcyReq();
    }

    /**
     * Create an instance of {@link CiiRegPlcyMthResponse }
     * 
     */
    public CiiRegPlcyMthResponse createCiiRegPlcyMthResponse() {
        return new CiiRegPlcyMthResponse();
    }

    /**
     * Create an instance of {@link WbsV4PlcyMthRes }
     * 
     */
    public WbsV4PlcyMthRes createWbsV4PlcyMthRes() {
        return new WbsV4PlcyMthRes();
    }

    /**
     * Create an instance of {@link RegPlcyLifeBase }
     * 
     */
    public RegPlcyLifeBase createRegPlcyLifeBase() {
        return new RegPlcyLifeBase();
    }

    /**
     * Create an instance of {@link WbsV4PlcyLifeBaseReq }
     * 
     */
    public WbsV4PlcyLifeBaseReq createWbsV4PlcyLifeBaseReq() {
        return new WbsV4PlcyLifeBaseReq();
    }

    /**
     * Create an instance of {@link RegLifeLos }
     * 
     */
    public RegLifeLos createRegLifeLos() {
        return new RegLifeLos();
    }

    /**
     * Create an instance of {@link WbsV4LifeLosReq }
     * 
     */
    public WbsV4LifeLosReq createWbsV4LifeLosReq() {
        return new WbsV4LifeLosReq();
    }

    /**
     * Create an instance of {@link CiiRegCurrencyResponse }
     * 
     */
    public CiiRegCurrencyResponse createCiiRegCurrencyResponse() {
        return new CiiRegCurrencyResponse();
    }

    /**
     * Create an instance of {@link WbsV4CurrencyRes }
     * 
     */
    public WbsV4CurrencyRes createWbsV4CurrencyRes() {
        return new WbsV4CurrencyRes();
    }

    /**
     * Create an instance of {@link RegPlcyLife }
     * 
     */
    public RegPlcyLife createRegPlcyLife() {
        return new RegPlcyLife();
    }

    /**
     * Create an instance of {@link WbsV4PlcyLifeReq }
     * 
     */
    public WbsV4PlcyLifeReq createWbsV4PlcyLifeReq() {
        return new WbsV4PlcyLifeReq();
    }

    /**
     * Create an instance of {@link CiiRegPlcyCvr }
     * 
     */
    public CiiRegPlcyCvr createCiiRegPlcyCvr() {
        return new CiiRegPlcyCvr();
    }

    /**
     * Create an instance of {@link WbsV4PlcyCvrReq }
     * 
     */
    public WbsV4PlcyCvrReq createWbsV4PlcyCvrReq() {
        return new WbsV4PlcyCvrReq();
    }

    /**
     * Create an instance of {@link RegLifeLosResponse }
     * 
     */
    public RegLifeLosResponse createRegLifeLosResponse() {
        return new RegLifeLosResponse();
    }

    /**
     * Create an instance of {@link WbsV4LifeLosRes }
     * 
     */
    public WbsV4LifeLosRes createWbsV4LifeLosRes() {
        return new WbsV4LifeLosRes();
    }

    /**
     * Create an instance of {@link CiiRegDocLosResponse }
     * 
     */
    public CiiRegDocLosResponse createCiiRegDocLosResponse() {
        return new CiiRegDocLosResponse();
    }

    /**
     * Create an instance of {@link WbsV4DocLosRes }
     * 
     */
    public WbsV4DocLosRes createWbsV4DocLosRes() {
        return new WbsV4DocLosRes();
    }

    /**
     * Create an instance of {@link CiiRegPlcyMth }
     * 
     */
    public CiiRegPlcyMth createCiiRegPlcyMth() {
        return new CiiRegPlcyMth();
    }

    /**
     * Create an instance of {@link WbsV4PlcyMthReq }
     * 
     */
    public WbsV4PlcyMthReq createWbsV4PlcyMthReq() {
        return new WbsV4PlcyMthReq();
    }

    /**
     * Create an instance of {@link CiiRegBranchResponse }
     * 
     */
    public CiiRegBranchResponse createCiiRegBranchResponse() {
        return new CiiRegBranchResponse();
    }

    /**
     * Create an instance of {@link WbsV4BranchRes }
     * 
     */
    public WbsV4BranchRes createWbsV4BranchRes() {
        return new WbsV4BranchRes();
    }

    /**
     * Create an instance of {@link CiiRegDocLos }
     * 
     */
    public CiiRegDocLos createCiiRegDocLos() {
        return new CiiRegDocLos();
    }

    /**
     * Create an instance of {@link WbsV4DocLosReq }
     * 
     */
    public WbsV4DocLosReq createWbsV4DocLosReq() {
        return new WbsV4DocLosReq();
    }

    /**
     * Create an instance of {@link CiiRegBrokerResponse }
     * 
     */
    public CiiRegBrokerResponse createCiiRegBrokerResponse() {
        return new CiiRegBrokerResponse();
    }

    /**
     * Create an instance of {@link WbsV4BrokerRes }
     * 
     */
    public WbsV4BrokerRes createWbsV4BrokerRes() {
        return new WbsV4BrokerRes();
    }

    /**
     * Create an instance of {@link CiiRegCurrency }
     * 
     */
    public CiiRegCurrency createCiiRegCurrency() {
        return new CiiRegCurrency();
    }

    /**
     * Create an instance of {@link WbsV4CurrencyReq }
     * 
     */
    public WbsV4CurrencyReq createWbsV4CurrencyReq() {
        return new WbsV4CurrencyReq();
    }

    /**
     * Create an instance of {@link RegPlcyLifeResponse }
     * 
     */
    public RegPlcyLifeResponse createRegPlcyLifeResponse() {
        return new RegPlcyLifeResponse();
    }

    /**
     * Create an instance of {@link WbsV4PlcyLifeRes }
     * 
     */
    public WbsV4PlcyLifeRes createWbsV4PlcyLifeRes() {
        return new WbsV4PlcyLifeRes();
    }

    /**
     * Create an instance of {@link CiiRegAgencyResponse }
     * 
     */
    public CiiRegAgencyResponse createCiiRegAgencyResponse() {
        return new CiiRegAgencyResponse();
    }

    /**
     * Create an instance of {@link WbsV4AgncRes }
     * 
     */
    public WbsV4AgncRes createWbsV4AgncRes() {
        return new WbsV4AgncRes();
    }

    /**
     * Create an instance of {@link CiiUpdDocLos }
     * 
     */
    public CiiUpdDocLos createCiiUpdDocLos() {
        return new CiiUpdDocLos();
    }

    /**
     * Create an instance of {@link UpdWbsV4DocLosReq }
     * 
     */
    public UpdWbsV4DocLosReq createUpdWbsV4DocLosReq() {
        return new UpdWbsV4DocLosReq();
    }

    /**
     * Create an instance of {@link CiiRegIntroResponse }
     * 
     */
    public CiiRegIntroResponse createCiiRegIntroResponse() {
        return new CiiRegIntroResponse();
    }

    /**
     * Create an instance of {@link WbsV4IntroRes }
     * 
     */
    public WbsV4IntroRes createWbsV4IntroRes() {
        return new WbsV4IntroRes();
    }

    /**
     * Create an instance of {@link CiiRegCompaniesFildDetail }
     * 
     */
    public CiiRegCompaniesFildDetail createCiiRegCompaniesFildDetail() {
        return new CiiRegCompaniesFildDetail();
    }

    /**
     * Create an instance of {@link WbsV4CompaniesFildDetailReq }
     * 
     */
    public WbsV4CompaniesFildDetailReq createWbsV4CompaniesFildDetailReq() {
        return new WbsV4CompaniesFildDetailReq();
    }

    /**
     * Create an instance of {@link CiiRegPersonType }
     * 
     */
    public CiiRegPersonType createCiiRegPersonType() {
        return new CiiRegPersonType();
    }

    /**
     * Create an instance of {@link WbsV4PersonTypeReq }
     * 
     */
    public WbsV4PersonTypeReq createWbsV4PersonTypeReq() {
        return new WbsV4PersonTypeReq();
    }

    /**
     * Create an instance of {@link CiiRegEdrs }
     * 
     */
    public CiiRegEdrs createCiiRegEdrs() {
        return new CiiRegEdrs();
    }

    /**
     * Create an instance of {@link WbsV4EdrsReq }
     * 
     */
    public WbsV4EdrsReq createWbsV4EdrsReq() {
        return new WbsV4EdrsReq();
    }

    /**
     * Create an instance of {@link CiiRegEdrsResponse }
     * 
     */
    public CiiRegEdrsResponse createCiiRegEdrsResponse() {
        return new CiiRegEdrsResponse();
    }

    /**
     * Create an instance of {@link WbsV4EdrsRes }
     * 
     */
    public WbsV4EdrsRes createWbsV4EdrsRes() {
        return new WbsV4EdrsRes();
    }

    /**
     * Create an instance of {@link CiiRegChkPlcyResponse }
     * 
     */
    public CiiRegChkPlcyResponse createCiiRegChkPlcyResponse() {
        return new CiiRegChkPlcyResponse();
    }

    /**
     * Create an instance of {@link WbsV4PlcyRes }
     * 
     */
    public WbsV4PlcyRes createWbsV4PlcyRes() {
        return new WbsV4PlcyRes();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring.KeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring.KeyValueOfstringstring createArrayOfKeyValueOfstringstringKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring.KeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4CurrencyReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4CurrencyReq")
    public JAXBElement<WbsV4CurrencyReq> createWbsV4CurrencyReq(WbsV4CurrencyReq value) {
        return new JAXBElement<WbsV4CurrencyReq>(_WbsV4CurrencyReq_QNAME, WbsV4CurrencyReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4DocLosRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4DocLosRes")
    public JAXBElement<WbsV4DocLosRes> createWbsV4DocLosRes(WbsV4DocLosRes value) {
        return new JAXBElement<WbsV4DocLosRes>(_WbsV4DocLosRes_QNAME, WbsV4DocLosRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4DocLosReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4DocLosReq")
    public JAXBElement<WbsV4DocLosReq> createWbsV4DocLosReq(WbsV4DocLosReq value) {
        return new JAXBElement<WbsV4DocLosReq>(_WbsV4DocLosReq_QNAME, WbsV4DocLosReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyCvrRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PlcyCvrRes")
    public JAXBElement<WbsV4PlcyCvrRes> createWbsV4PlcyCvrRes(WbsV4PlcyCvrRes value) {
        return new JAXBElement<WbsV4PlcyCvrRes>(_WbsV4PlcyCvrRes_QNAME, WbsV4PlcyCvrRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyCvrReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PlcyCvrReq")
    public JAXBElement<WbsV4PlcyCvrReq> createWbsV4PlcyCvrReq(WbsV4PlcyCvrReq value) {
        return new JAXBElement<WbsV4PlcyCvrReq>(_WbsV4PlcyCvrReq_QNAME, WbsV4PlcyCvrReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4AgncReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4AgncReq")
    public JAXBElement<WbsV4AgncReq> createWbsV4AgncReq(WbsV4AgncReq value) {
        return new JAXBElement<WbsV4AgncReq>(_WbsV4AgncReq_QNAME, WbsV4AgncReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4CurrencyRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4CurrencyRes")
    public JAXBElement<WbsV4CurrencyRes> createWbsV4CurrencyRes(WbsV4CurrencyRes value) {
        return new JAXBElement<WbsV4CurrencyRes>(_WbsV4CurrencyRes_QNAME, WbsV4CurrencyRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4AgncRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4AgncRes")
    public JAXBElement<WbsV4AgncRes> createWbsV4AgncRes(WbsV4AgncRes value) {
        return new JAXBElement<WbsV4AgncRes>(_WbsV4AgncRes_QNAME, WbsV4AgncRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4IntroRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4IntroRes")
    public JAXBElement<WbsV4IntroRes> createWbsV4IntroRes(WbsV4IntroRes value) {
        return new JAXBElement<WbsV4IntroRes>(_WbsV4IntroRes_QNAME, WbsV4IntroRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4IntroReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4IntroReq")
    public JAXBElement<WbsV4IntroReq> createWbsV4IntroReq(WbsV4IntroReq value) {
        return new JAXBElement<WbsV4IntroReq>(_WbsV4IntroReq_QNAME, WbsV4IntroReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyMthRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PlcyMthRes")
    public JAXBElement<WbsV4PlcyMthRes> createWbsV4PlcyMthRes(WbsV4PlcyMthRes value) {
        return new JAXBElement<WbsV4PlcyMthRes>(_WbsV4PlcyMthRes_QNAME, WbsV4PlcyMthRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyMthReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PlcyMthReq")
    public JAXBElement<WbsV4PlcyMthReq> createWbsV4PlcyMthReq(WbsV4PlcyMthReq value) {
        return new JAXBElement<WbsV4PlcyMthReq>(_WbsV4PlcyMthReq_QNAME, WbsV4PlcyMthReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PlcyReq")
    public JAXBElement<WbsV4PlcyReq> createWbsV4PlcyReq(WbsV4PlcyReq value) {
        return new JAXBElement<WbsV4PlcyReq>(_WbsV4PlcyReq_QNAME, WbsV4PlcyReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PlcyRes")
    public JAXBElement<WbsV4PlcyRes> createWbsV4PlcyRes(WbsV4PlcyRes value) {
        return new JAXBElement<WbsV4PlcyRes>(_WbsV4PlcyRes_QNAME, WbsV4PlcyRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringstring")
    public JAXBElement<ArrayOfKeyValueOfstringstring> createArrayOfKeyValueOfstringstring(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_ArrayOfKeyValueOfstringstring_QNAME, ArrayOfKeyValueOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4BrokerRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4BrokerRes")
    public JAXBElement<WbsV4BrokerRes> createWbsV4BrokerRes(WbsV4BrokerRes value) {
        return new JAXBElement<WbsV4BrokerRes>(_WbsV4BrokerRes_QNAME, WbsV4BrokerRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PersonTypeRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PersonTypeRes")
    public JAXBElement<WbsV4PersonTypeRes> createWbsV4PersonTypeRes(WbsV4PersonTypeRes value) {
        return new JAXBElement<WbsV4PersonTypeRes>(_WbsV4PersonTypeRes_QNAME, WbsV4PersonTypeRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeBaseReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PlcyLifeBaseReq")
    public JAXBElement<WbsV4PlcyLifeBaseReq> createWbsV4PlcyLifeBaseReq(WbsV4PlcyLifeBaseReq value) {
        return new JAXBElement<WbsV4PlcyLifeBaseReq>(_WbsV4PlcyLifeBaseReq_QNAME, WbsV4PlcyLifeBaseReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PersonTypeReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PersonTypeReq")
    public JAXBElement<WbsV4PersonTypeReq> createWbsV4PersonTypeReq(WbsV4PersonTypeReq value) {
        return new JAXBElement<WbsV4PersonTypeReq>(_WbsV4PersonTypeReq_QNAME, WbsV4PersonTypeReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeBaseRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PlcyLifeBaseRes")
    public JAXBElement<WbsV4PlcyLifeBaseRes> createWbsV4PlcyLifeBaseRes(WbsV4PlcyLifeBaseRes value) {
        return new JAXBElement<WbsV4PlcyLifeBaseRes>(_WbsV4PlcyLifeBaseRes_QNAME, WbsV4PlcyLifeBaseRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4CompaniesFildDetailReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4CompaniesFildDetailReq")
    public JAXBElement<WbsV4CompaniesFildDetailReq> createWbsV4CompaniesFildDetailReq(WbsV4CompaniesFildDetailReq value) {
        return new JAXBElement<WbsV4CompaniesFildDetailReq>(_WbsV4CompaniesFildDetailReq_QNAME, WbsV4CompaniesFildDetailReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4CompaniesFildDetailRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4CompaniesFildDetailRes")
    public JAXBElement<WbsV4CompaniesFildDetailRes> createWbsV4CompaniesFildDetailRes(WbsV4CompaniesFildDetailRes value) {
        return new JAXBElement<WbsV4CompaniesFildDetailRes>(_WbsV4CompaniesFildDetailRes_QNAME, WbsV4CompaniesFildDetailRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4LifeLosReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4LifeLosReq")
    public JAXBElement<WbsV4LifeLosReq> createWbsV4LifeLosReq(WbsV4LifeLosReq value) {
        return new JAXBElement<WbsV4LifeLosReq>(_WbsV4LifeLosReq_QNAME, WbsV4LifeLosReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4LifeLosRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4LifeLosRes")
    public JAXBElement<WbsV4LifeLosRes> createWbsV4LifeLosRes(WbsV4LifeLosRes value) {
        return new JAXBElement<WbsV4LifeLosRes>(_WbsV4LifeLosRes_QNAME, WbsV4LifeLosRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4LosRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4LosRes")
    public JAXBElement<WbsV4LosRes> createWbsV4LosRes(WbsV4LosRes value) {
        return new JAXBElement<WbsV4LosRes>(_WbsV4LosRes_QNAME, WbsV4LosRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4EdrsRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4EdrsRes")
    public JAXBElement<WbsV4EdrsRes> createWbsV4EdrsRes(WbsV4EdrsRes value) {
        return new JAXBElement<WbsV4EdrsRes>(_WbsV4EdrsRes_QNAME, WbsV4EdrsRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4LosReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4LosReq")
    public JAXBElement<WbsV4LosReq> createWbsV4LosReq(WbsV4LosReq value) {
        return new JAXBElement<WbsV4LosReq>(_WbsV4LosReq_QNAME, WbsV4LosReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4EdrsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4EdrsReq")
    public JAXBElement<WbsV4EdrsReq> createWbsV4EdrsReq(WbsV4EdrsReq value) {
        return new JAXBElement<WbsV4EdrsReq>(_WbsV4EdrsReq_QNAME, WbsV4EdrsReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4BranchRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4BranchRes")
    public JAXBElement<WbsV4BranchRes> createWbsV4BranchRes(WbsV4BranchRes value) {
        return new JAXBElement<WbsV4BranchRes>(_WbsV4BranchRes_QNAME, WbsV4BranchRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4BranchReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4BranchReq")
    public JAXBElement<WbsV4BranchReq> createWbsV4BranchReq(WbsV4BranchReq value) {
        return new JAXBElement<WbsV4BranchReq>(_WbsV4BranchReq_QNAME, WbsV4BranchReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4BrokerReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4BrokerReq")
    public JAXBElement<WbsV4BrokerReq> createWbsV4BrokerReq(WbsV4BrokerReq value) {
        return new JAXBElement<WbsV4BrokerReq>(_WbsV4BrokerReq_QNAME, WbsV4BrokerReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PlcyLifeReq")
    public JAXBElement<WbsV4PlcyLifeReq> createWbsV4PlcyLifeReq(WbsV4PlcyLifeReq value) {
        return new JAXBElement<WbsV4PlcyLifeReq>(_WbsV4PlcyLifeReq_QNAME, WbsV4PlcyLifeReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdWbsV4DocLosReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "UpdWbsV4DocLosReq")
    public JAXBElement<UpdWbsV4DocLosReq> createUpdWbsV4DocLosReq(UpdWbsV4DocLosReq value) {
        return new JAXBElement<UpdWbsV4DocLosReq>(_UpdWbsV4DocLosReq_QNAME, UpdWbsV4DocLosReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "WbsV4PlcyLifeRes")
    public JAXBElement<WbsV4PlcyLifeRes> createWbsV4PlcyLifeRes(WbsV4PlcyLifeRes value) {
        return new JAXBElement<WbsV4PlcyLifeRes>(_WbsV4PlcyLifeRes_QNAME, WbsV4PlcyLifeRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdWbsV4DocLosRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "UpdWbsV4DocLosRes")
    public JAXBElement<UpdWbsV4DocLosRes> createUpdWbsV4DocLosRes(UpdWbsV4DocLosRes value) {
        return new JAXBElement<UpdWbsV4DocLosRes>(_UpdWbsV4DocLosRes_QNAME, UpdWbsV4DocLosRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4AgncReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pr", scope = CiiRegAgency.class)
    public JAXBElement<WbsV4AgncReq> createCiiRegAgencyPr(WbsV4AgncReq value) {
        return new JAXBElement<WbsV4AgncReq>(_CiiRegAgencyPr_QNAME, WbsV4AgncReq.class, CiiRegAgency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegAgency.class)
    public JAXBElement<String> createCiiRegAgencyUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegAgency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegAgency.class)
    public JAXBElement<String> createCiiRegAgencyPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegAgency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyCvrRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegPlcyCvrResult", scope = CiiRegPlcyCvrResponse.class)
    public JAXBElement<WbsV4PlcyCvrRes> createCiiRegPlcyCvrResponseCiiRegPlcyCvrResult(WbsV4PlcyCvrRes value) {
        return new JAXBElement<WbsV4PlcyCvrRes>(_CiiRegPlcyCvrResponseCiiRegPlcyCvrResult_QNAME, WbsV4PlcyCvrRes.class, CiiRegPlcyCvrResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyMthReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pr", scope = CiiRegPlcyMth.class)
    public JAXBElement<WbsV4PlcyMthReq> createCiiRegPlcyMthPr(WbsV4PlcyMthReq value) {
        return new JAXBElement<WbsV4PlcyMthReq>(_CiiRegAgencyPr_QNAME, WbsV4PlcyMthReq.class, CiiRegPlcyMth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegPlcyMth.class)
    public JAXBElement<String> createCiiRegPlcyMthUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegPlcyMth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegPlcyMth.class)
    public JAXBElement<String> createCiiRegPlcyMthPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegPlcyMth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PersonTypeReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pr", scope = CiiRegPersonType.class)
    public JAXBElement<WbsV4PersonTypeReq> createCiiRegPersonTypePr(WbsV4PersonTypeReq value) {
        return new JAXBElement<WbsV4PersonTypeReq>(_CiiRegAgencyPr_QNAME, WbsV4PersonTypeReq.class, CiiRegPersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegPersonType.class)
    public JAXBElement<String> createCiiRegPersonTypeUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegPersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegPersonType.class)
    public JAXBElement<String> createCiiRegPersonTypePassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegPersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiUpdDocLos.class)
    public JAXBElement<String> createCiiUpdDocLosUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiUpdDocLos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiUpdDocLos.class)
    public JAXBElement<String> createCiiUpdDocLosPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiUpdDocLos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdWbsV4DocLosReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = CiiUpdDocLos.class)
    public JAXBElement<UpdWbsV4DocLosReq> createCiiUpdDocLosReq(UpdWbsV4DocLosReq value) {
        return new JAXBElement<UpdWbsV4DocLosReq>(_CiiUpdDocLosReq_QNAME, UpdWbsV4DocLosReq.class, CiiUpdDocLos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegDocLos.class)
    public JAXBElement<String> createCiiRegDocLosUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegDocLos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegDocLos.class)
    public JAXBElement<String> createCiiRegDocLosPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegDocLos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4DocLosReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = CiiRegDocLos.class)
    public JAXBElement<WbsV4DocLosReq> createCiiRegDocLosReq(WbsV4DocLosReq value) {
        return new JAXBElement<WbsV4DocLosReq>(_CiiUpdDocLosReq_QNAME, WbsV4DocLosReq.class, CiiRegDocLos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "BrkrNo", scope = WbsV4BrokerReq.class)
    public JAXBElement<Integer> createWbsV4BrokerReqBrkrNo(Integer value) {
        return new JAXBElement<Integer>(_WbsV4BrokerReqBrkrNo_QNAME, Integer.class, WbsV4BrokerReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrkrCod", scope = WbsV4BrokerReq.class)
    public JAXBElement<String> createWbsV4BrokerReqMapBrkrCod(String value) {
        return new JAXBElement<String>(_WbsV4BrokerReqMapBrkrCod_QNAME, String.class, WbsV4BrokerReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4BranchRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegBranchResult", scope = CiiRegBranchResponse.class)
    public JAXBElement<WbsV4BranchRes> createCiiRegBranchResponseCiiRegBranchResult(WbsV4BranchRes value) {
        return new JAXBElement<WbsV4BranchRes>(_CiiRegBranchResponseCiiRegBranchResult_QNAME, WbsV4BranchRes.class, CiiRegBranchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapCorTypCod", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqMapCorTypCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapCorTypCod_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapCurCod", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqMapCurCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapCurCod_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "NtnlId", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqNtnlId(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqNtnlId_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "EndDte", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqEndDte(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqEndDte_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrkrCod", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqMapBrkrCod(String value) {
        return new JAXBElement<String>(_WbsV4BrokerReqMapBrkrCod_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapIntrCod", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqMapIntrCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapIntrCod_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapFldDtlCod", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapFldDtlCod_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "InsNam", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqInsNam(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqInsNam_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrnhCod", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqMapBrnhCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapBrnhCod_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ZipCod", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqZipCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqZipCod_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapPrsnTypCod", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqMapPrsnTypCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapPrsnTypCod_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Tel", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqTel(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqTel_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapAgncCod", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqMapAgncCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapAgncCod_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Dscr", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqDscr(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqDscr_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "BgnDte", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqBgnDte(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqBgnDte_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpDocNo", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqCmpDocNo(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqCmpDocNo_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "IsuDte", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqIsuDte(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqIsuDte_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Mbl", scope = WbsV4EdrsReq.class)
    public JAXBElement<String> createWbsV4EdrsReqMbl(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMbl_QNAME, String.class, WbsV4EdrsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeBaseRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegPlcyLifeBaseResult", scope = RegPlcyLifeBaseResponse.class)
    public JAXBElement<WbsV4PlcyLifeBaseRes> createRegPlcyLifeBaseResponseRegPlcyLifeBaseResult(WbsV4PlcyLifeBaseRes value) {
        return new JAXBElement<WbsV4PlcyLifeBaseRes>(_RegPlcyLifeBaseResponseRegPlcyLifeBaseResult_QNAME, WbsV4PlcyLifeBaseRes.class, RegPlcyLifeBaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4EdrsRes.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createWbsV4EdrsResErrors(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfKeyValueOfstringstring.class, WbsV4EdrsRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "AncDte", scope = WbsV4DocLosReq.class)
    public JAXBElement<String> createWbsV4DocLosReqAncDte(String value) {
        return new JAXBElement<String>(_WbsV4DocLosReqAncDte_QNAME, String.class, WbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "LosEvlNtnlId", scope = WbsV4DocLosReq.class)
    public JAXBElement<String> createWbsV4DocLosReqLosEvlNtnlId(String value) {
        return new JAXBElement<String>(_WbsV4DocLosReqLosEvlNtnlId_QNAME, String.class, WbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrnhCod", scope = WbsV4DocLosReq.class)
    public JAXBElement<String> createWbsV4DocLosReqMapBrnhCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapBrnhCod_QNAME, String.class, WbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "LosEvl", scope = WbsV4DocLosReq.class)
    public JAXBElement<String> createWbsV4DocLosReqLosEvl(String value) {
        return new JAXBElement<String>(_WbsV4DocLosReqLosEvl_QNAME, String.class, WbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapCorTypCod", scope = WbsV4DocLosReq.class)
    public JAXBElement<String> createWbsV4DocLosReqMapCorTypCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapCorTypCod_QNAME, String.class, WbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapAgncCod", scope = WbsV4DocLosReq.class)
    public JAXBElement<String> createWbsV4DocLosReqMapAgncCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapAgncCod_QNAME, String.class, WbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "OcrDte", scope = WbsV4DocLosReq.class)
    public JAXBElement<String> createWbsV4DocLosReqOcrDte(String value) {
        return new JAXBElement<String>(_WbsV4DocLosReqOcrDte_QNAME, String.class, WbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "FleDte", scope = WbsV4DocLosReq.class)
    public JAXBElement<String> createWbsV4DocLosReqFleDte(String value) {
        return new JAXBElement<String>(_WbsV4DocLosReqFleDte_QNAME, String.class, WbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpDocNo", scope = WbsV4DocLosReq.class)
    public JAXBElement<String> createWbsV4DocLosReqCmpDocNo(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqCmpDocNo_QNAME, String.class, WbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapFldDtlCod", scope = WbsV4DocLosReq.class)
    public JAXBElement<String> createWbsV4DocLosReqMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapFldDtlCod_QNAME, String.class, WbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyCvrReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pr", scope = CiiRegPlcyCvr.class)
    public JAXBElement<WbsV4PlcyCvrReq> createCiiRegPlcyCvrPr(WbsV4PlcyCvrReq value) {
        return new JAXBElement<WbsV4PlcyCvrReq>(_CiiRegAgencyPr_QNAME, WbsV4PlcyCvrReq.class, CiiRegPlcyCvr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegPlcyCvr.class)
    public JAXBElement<String> createCiiRegPlcyCvrUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegPlcyCvr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegPlcyCvr.class)
    public JAXBElement<String> createCiiRegPlcyCvrPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegPlcyCvr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4AgncRes.class)
    public JAXBElement<ArrayOfstring> createWbsV4AgncResErrors(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfstring.class, WbsV4AgncRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4CurrencyRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegCurrencyResult", scope = CiiRegCurrencyResponse.class)
    public JAXBElement<WbsV4CurrencyRes> createCiiRegCurrencyResponseCiiRegCurrencyResult(WbsV4CurrencyRes value) {
        return new JAXBElement<WbsV4CurrencyRes>(_CiiRegCurrencyResponseCiiRegCurrencyResult_QNAME, WbsV4CurrencyRes.class, CiiRegCurrencyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpIntrCod", scope = WbsV4IntroRes.class)
    public JAXBElement<String> createWbsV4IntroResCmpIntrCod(String value) {
        return new JAXBElement<String>(_WbsV4IntroResCmpIntrCod_QNAME, String.class, WbsV4IntroRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4IntroRes.class)
    public JAXBElement<ArrayOfstring> createWbsV4IntroResErrors(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfstring.class, WbsV4IntroRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PersonTypeRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegPersonTypeResult", scope = CiiRegPersonTypeResponse.class)
    public JAXBElement<WbsV4PersonTypeRes> createCiiRegPersonTypeResponseCiiRegPersonTypeResult(WbsV4PersonTypeRes value) {
        return new JAXBElement<WbsV4PersonTypeRes>(_CiiRegPersonTypeResponseCiiRegPersonTypeResult_QNAME, WbsV4PersonTypeRes.class, CiiRegPersonTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4PlcyLifeRes.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createWbsV4PlcyLifeResErrors(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfKeyValueOfstringstring.class, WbsV4PlcyLifeRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4PersonTypeRes.class)
    public JAXBElement<ArrayOfstring> createWbsV4PersonTypeResErrors(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfstring.class, WbsV4PersonTypeRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4EdrsRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegEdrsResult", scope = CiiRegEdrsResponse.class)
    public JAXBElement<WbsV4EdrsRes> createCiiRegEdrsResponseCiiRegEdrsResult(WbsV4EdrsRes value) {
        return new JAXBElement<WbsV4EdrsRes>(_CiiRegEdrsResponseCiiRegEdrsResult_QNAME, WbsV4EdrsRes.class, CiiRegEdrsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdWbsV4DocLosRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiUpdDocLosResult", scope = CiiUpdDocLosResponse.class)
    public JAXBElement<UpdWbsV4DocLosRes> createCiiUpdDocLosResponseCiiUpdDocLosResult(UpdWbsV4DocLosRes value) {
        return new JAXBElement<UpdWbsV4DocLosRes>(_CiiUpdDocLosResponseCiiUpdDocLosResult_QNAME, UpdWbsV4DocLosRes.class, CiiUpdDocLosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4DocLosRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegDocLosResult", scope = CiiRegDocLosResponse.class)
    public JAXBElement<WbsV4DocLosRes> createCiiRegDocLosResponseCiiRegDocLosResult(WbsV4DocLosRes value) {
        return new JAXBElement<WbsV4DocLosRes>(_CiiRegDocLosResponseCiiRegDocLosResult_QNAME, WbsV4DocLosRes.class, CiiRegDocLosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4BrokerReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pr", scope = CiiRegBroker.class)
    public JAXBElement<WbsV4BrokerReq> createCiiRegBrokerPr(WbsV4BrokerReq value) {
        return new JAXBElement<WbsV4BrokerReq>(_CiiRegAgencyPr_QNAME, WbsV4BrokerReq.class, CiiRegBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegBroker.class)
    public JAXBElement<String> createCiiRegBrokerUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegBroker.class)
    public JAXBElement<String> createCiiRegBrokerPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "FldDtlCod", scope = WbsV4CompaniesFildDetailReq.class)
    public JAXBElement<Integer> createWbsV4CompaniesFildDetailReqFldDtlCod(Integer value) {
        return new JAXBElement<Integer>(_WbsV4CompaniesFildDetailReqFldDtlCod_QNAME, Integer.class, WbsV4CompaniesFildDetailReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "GrpngCod", scope = WbsV4CompaniesFildDetailReq.class)
    public JAXBElement<Integer> createWbsV4CompaniesFildDetailReqGrpngCod(Integer value) {
        return new JAXBElement<Integer>(_WbsV4CompaniesFildDetailReqGrpngCod_QNAME, Integer.class, WbsV4CompaniesFildDetailReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapPrntFldDtlCod", scope = WbsV4CompaniesFildDetailReq.class)
    public JAXBElement<Integer> createWbsV4CompaniesFildDetailReqMapPrntFldDtlCod(Integer value) {
        return new JAXBElement<Integer>(_WbsV4CompaniesFildDetailReqMapPrntFldDtlCod_QNAME, Integer.class, WbsV4CompaniesFildDetailReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpPrntFldDtlNam", scope = WbsV4CompaniesFildDetailReq.class)
    public JAXBElement<String> createWbsV4CompaniesFildDetailReqCmpPrntFldDtlNam(String value) {
        return new JAXBElement<String>(_WbsV4CompaniesFildDetailReqCmpPrntFldDtlNam_QNAME, String.class, WbsV4CompaniesFildDetailReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpFldDtlNam", scope = WbsV4CompaniesFildDetailReq.class)
    public JAXBElement<String> createWbsV4CompaniesFildDetailReqCmpFldDtlNam(String value) {
        return new JAXBElement<String>(_WbsV4CompaniesFildDetailReqCmpFldDtlNam_QNAME, String.class, WbsV4CompaniesFildDetailReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapFldDtlCod", scope = WbsV4CompaniesFildDetailReq.class)
    public JAXBElement<String> createWbsV4CompaniesFildDetailReqMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapFldDtlCod_QNAME, String.class, WbsV4CompaniesFildDetailReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4BrokerRes.class)
    public JAXBElement<ArrayOfstring> createWbsV4BrokerResErrors(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfstring.class, WbsV4BrokerRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpBrkrCod", scope = WbsV4BrokerRes.class)
    public JAXBElement<String> createWbsV4BrokerResCmpBrkrCod(String value) {
        return new JAXBElement<String>(_WbsV4BrokerResCmpBrkrCod_QNAME, String.class, WbsV4BrokerRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4IntroReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pr", scope = CiiRegIntro.class)
    public JAXBElement<WbsV4IntroReq> createCiiRegIntroPr(WbsV4IntroReq value) {
        return new JAXBElement<WbsV4IntroReq>(_CiiRegAgencyPr_QNAME, WbsV4IntroReq.class, CiiRegIntro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegIntro.class)
    public JAXBElement<String> createCiiRegIntroUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegIntro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegIntro.class)
    public JAXBElement<String> createCiiRegIntroPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegIntro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4PlcyLifeBaseRes.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createWbsV4PlcyLifeBaseResErrors(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfKeyValueOfstringstring.class, WbsV4PlcyLifeBaseRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4BranchRes.class)
    public JAXBElement<ArrayOfstring> createWbsV4BranchResErrors(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfstring.class, WbsV4BranchRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapFldDtlCod", scope = WbsV4PlcyMthReq.class)
    public JAXBElement<String> createWbsV4PlcyMthReqMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapFldDtlCod_QNAME, String.class, WbsV4PlcyMthReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CalcDte", scope = WbsV4PlcyMthReq.class)
    public JAXBElement<String> createWbsV4PlcyMthReqCalcDte(String value) {
        return new JAXBElement<String>(_WbsV4PlcyMthReqCalcDte_QNAME, String.class, WbsV4PlcyMthReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegPlcyLifeResult", scope = RegPlcyLifeResponse.class)
    public JAXBElement<WbsV4PlcyLifeRes> createRegPlcyLifeResponseRegPlcyLifeResult(WbsV4PlcyLifeRes value) {
        return new JAXBElement<WbsV4PlcyLifeRes>(_RegPlcyLifeResponseRegPlcyLifeResult_QNAME, WbsV4PlcyLifeRes.class, RegPlcyLifeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4BrokerRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegBrokerResult", scope = CiiRegBrokerResponse.class)
    public JAXBElement<WbsV4BrokerRes> createCiiRegBrokerResponseCiiRegBrokerResult(WbsV4BrokerRes value) {
        return new JAXBElement<WbsV4BrokerRes>(_CiiRegBrokerResponseCiiRegBrokerResult_QNAME, WbsV4BrokerRes.class, CiiRegBrokerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4CurrencyRes.class)
    public JAXBElement<ArrayOfstring> createWbsV4CurrencyResErrors(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfstring.class, WbsV4CurrencyRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpCurCod", scope = WbsV4CurrencyRes.class)
    public JAXBElement<String> createWbsV4CurrencyResCmpCurCod(String value) {
        return new JAXBElement<String>(_WbsV4CurrencyResCmpCurCod_QNAME, String.class, WbsV4CurrencyRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = RegPlcyLife.class)
    public JAXBElement<String> createRegPlcyLifeUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, RegPlcyLife.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = RegPlcyLife.class)
    public JAXBElement<String> createRegPlcyLifePassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, RegPlcyLife.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = RegPlcyLife.class)
    public JAXBElement<WbsV4PlcyLifeReq> createRegPlcyLifeReq(WbsV4PlcyLifeReq value) {
        return new JAXBElement<WbsV4PlcyLifeReq>(_CiiUpdDocLosReq_QNAME, WbsV4PlcyLifeReq.class, RegPlcyLife.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegChkPlcyResult", scope = CiiRegChkPlcyResponse.class)
    public JAXBElement<WbsV4PlcyRes> createCiiRegChkPlcyResponseCiiRegChkPlcyResult(WbsV4PlcyRes value) {
        return new JAXBElement<WbsV4PlcyRes>(_CiiRegChkPlcyResponseCiiRegChkPlcyResult_QNAME, WbsV4PlcyRes.class, CiiRegChkPlcyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PrntCmpDocNo", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqPrntCmpDocNo(String value) {
        return new JAXBElement<String>(_WbsV4PlcyReqPrntCmpDocNo_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapCorTypCod", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqMapCorTypCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapCorTypCod_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapCurCod", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqMapCurCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapCurCod_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "NtnlId", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqNtnlId(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqNtnlId_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "EndDte", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqEndDte(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqEndDte_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrkrCod", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqMapBrkrCod(String value) {
        return new JAXBElement<String>(_WbsV4BrokerReqMapBrkrCod_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapIntrCod", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqMapIntrCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapIntrCod_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapFldDtlCod", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapFldDtlCod_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "InsNam", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqInsNam(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqInsNam_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrnhCod", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqMapBrnhCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapBrnhCod_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ZipCod", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqZipCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqZipCod_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapPrsnTypCod", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqMapPrsnTypCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapPrsnTypCod_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Tel", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqTel(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqTel_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapAgncCod", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqMapAgncCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapAgncCod_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "BgnDte", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqBgnDte(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqBgnDte_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpDocNo", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqCmpDocNo(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqCmpDocNo_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "IsuDte", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqIsuDte(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqIsuDte_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Mbl", scope = WbsV4PlcyReq.class)
    public JAXBElement<String> createWbsV4PlcyReqMbl(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMbl_QNAME, String.class, WbsV4PlcyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = UpdWbsV4DocLosRes.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createUpdWbsV4DocLosResErrors(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfKeyValueOfstringstring.class, UpdWbsV4DocLosRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrnhCod", scope = WbsV4IntroReq.class)
    public JAXBElement<String> createWbsV4IntroReqMapBrnhCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapBrnhCod_QNAME, String.class, WbsV4IntroReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapAgncCod", scope = WbsV4IntroReq.class)
    public JAXBElement<String> createWbsV4IntroReqMapAgncCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapAgncCod_QNAME, String.class, WbsV4IntroReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrkrCod", scope = WbsV4IntroReq.class)
    public JAXBElement<String> createWbsV4IntroReqMapBrkrCod(String value) {
        return new JAXBElement<String>(_WbsV4BrokerReqMapBrkrCod_QNAME, String.class, WbsV4IntroReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapIntrCod", scope = WbsV4IntroReq.class)
    public JAXBElement<String> createWbsV4IntroReqMapIntrCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapIntrCod_QNAME, String.class, WbsV4IntroReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4CompaniesFildDetailRes.class)
    public JAXBElement<ArrayOfstring> createWbsV4CompaniesFildDetailResErrors(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfstring.class, WbsV4CompaniesFildDetailRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpFldDtlCod", scope = WbsV4CompaniesFildDetailRes.class)
    public JAXBElement<String> createWbsV4CompaniesFildDetailResCmpFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4CompaniesFildDetailResCmpFldDtlCod_QNAME, String.class, WbsV4CompaniesFildDetailRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4PlcyRes.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createWbsV4PlcyResErrors(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfKeyValueOfstringstring.class, WbsV4PlcyRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4LosRes.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createWbsV4LosResErrors(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfKeyValueOfstringstring.class, WbsV4LosRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4IntroRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegIntroResult", scope = CiiRegIntroResponse.class)
    public JAXBElement<WbsV4IntroRes> createCiiRegIntroResponseCiiRegIntroResult(WbsV4IntroRes value) {
        return new JAXBElement<WbsV4IntroRes>(_CiiRegIntroResponseCiiRegIntroResult_QNAME, WbsV4IntroRes.class, CiiRegIntroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MsMapFldDtlCod", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqMsMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqMsMapFldDtlCod_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MdcCmpFldDtlCod", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqMdcCmpFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqMdcCmpFldDtlCod_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PayDte", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqPayDte(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqPayDte_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapMdcFldDtlCod", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqMapMdcFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqMapMdcFldDtlCod_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpDocNo", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqCmpDocNo(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqCmpDocNo_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CstmNam", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqCstmNam(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqCstmNam_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapOthFldDtlCod", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqMapOthFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqMapOthFldDtlCod_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "OthCmpFldDtlCod", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqOthCmpFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqOthCmpFldDtlCod_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapFldDtlCod", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapFldDtlCod_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "BrthDte", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqBrthDte(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqBrthDte_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "RcvDte", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqRcvDte(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqRcvDte_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "TamamMapFldDtlCod", scope = WbsV4PlcyLifeReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeReqTamamMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqTamamMapFldDtlCod_QNAME, String.class, WbsV4PlcyLifeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4PlcyMthRes.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createWbsV4PlcyMthResErrors(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfKeyValueOfstringstring.class, WbsV4PlcyMthRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4CompaniesFildDetailRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegCompaniesFildDetailResult", scope = CiiRegCompaniesFildDetailResponse.class)
    public JAXBElement<WbsV4CompaniesFildDetailRes> createCiiRegCompaniesFildDetailResponseCiiRegCompaniesFildDetailResult(WbsV4CompaniesFildDetailRes value) {
        return new JAXBElement<WbsV4CompaniesFildDetailRes>(_CiiRegCompaniesFildDetailResponseCiiRegCompaniesFildDetailResult_QNAME, WbsV4CompaniesFildDetailRes.class, CiiRegCompaniesFildDetailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpDocNo", scope = WbsV4PlcyLifeBaseReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeBaseReqCmpDocNo(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqCmpDocNo_QNAME, String.class, WbsV4PlcyLifeBaseReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CstmNam", scope = WbsV4PlcyLifeBaseReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeBaseReqCstmNam(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqCstmNam_QNAME, String.class, WbsV4PlcyLifeBaseReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapFldDtlCod", scope = WbsV4PlcyLifeBaseReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeBaseReqMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapFldDtlCod_QNAME, String.class, WbsV4PlcyLifeBaseReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ScnNam", scope = WbsV4PlcyLifeBaseReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeBaseReqScnNam(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeBaseReqScnNam_QNAME, String.class, WbsV4PlcyLifeBaseReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "BrthDte", scope = WbsV4PlcyLifeBaseReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeBaseReqBrthDte(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqBrthDte_QNAME, String.class, WbsV4PlcyLifeBaseReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "IsuYear", scope = WbsV4PlcyLifeBaseReq.class)
    public JAXBElement<String> createWbsV4PlcyLifeBaseReqIsuYear(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeBaseReqIsuYear_QNAME, String.class, WbsV4PlcyLifeBaseReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4AgncRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegAgencyResult", scope = CiiRegAgencyResponse.class)
    public JAXBElement<WbsV4AgncRes> createCiiRegAgencyResponseCiiRegAgencyResult(WbsV4AgncRes value) {
        return new JAXBElement<WbsV4AgncRes>(_CiiRegAgencyResponseCiiRegAgencyResult_QNAME, WbsV4AgncRes.class, CiiRegAgencyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PayDte", scope = WbsV4LifeLosReq.class)
    public JAXBElement<String> createWbsV4LifeLosReqPayDte(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqPayDte_QNAME, String.class, WbsV4LifeLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapMdcFldDtlCod", scope = WbsV4LifeLosReq.class)
    public JAXBElement<String> createWbsV4LifeLosReqMapMdcFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqMapMdcFldDtlCod_QNAME, String.class, WbsV4LifeLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpDocNo", scope = WbsV4LifeLosReq.class)
    public JAXBElement<String> createWbsV4LifeLosReqCmpDocNo(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqCmpDocNo_QNAME, String.class, WbsV4LifeLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapOthFldDtlCod", scope = WbsV4LifeLosReq.class)
    public JAXBElement<String> createWbsV4LifeLosReqMapOthFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqMapOthFldDtlCod_QNAME, String.class, WbsV4LifeLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapFldDtlCod", scope = WbsV4LifeLosReq.class)
    public JAXBElement<String> createWbsV4LifeLosReqMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapFldDtlCod_QNAME, String.class, WbsV4LifeLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapPrsnTypCod", scope = WbsV4PersonTypeReq.class)
    public JAXBElement<String> createWbsV4PersonTypeReqMapPrsnTypCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapPrsnTypCod_QNAME, String.class, WbsV4PersonTypeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PrsnTypCod", scope = WbsV4PersonTypeReq.class)
    public JAXBElement<Integer> createWbsV4PersonTypeReqPrsnTypCod(Integer value) {
        return new JAXBElement<Integer>(_WbsV4PersonTypeReqPrsnTypCod_QNAME, Integer.class, WbsV4PersonTypeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpPrsnTypNam", scope = WbsV4PersonTypeReq.class)
    public JAXBElement<String> createWbsV4PersonTypeReqCmpPrsnTypNam(String value) {
        return new JAXBElement<String>(_WbsV4PersonTypeReqCmpPrsnTypNam_QNAME, String.class, WbsV4PersonTypeReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4CurrencyReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pr", scope = CiiRegCurrency.class)
    public JAXBElement<WbsV4CurrencyReq> createCiiRegCurrencyPr(WbsV4CurrencyReq value) {
        return new JAXBElement<WbsV4CurrencyReq>(_CiiRegAgencyPr_QNAME, WbsV4CurrencyReq.class, CiiRegCurrency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegCurrency.class)
    public JAXBElement<String> createCiiRegCurrencyUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegCurrency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegCurrency.class)
    public JAXBElement<String> createCiiRegCurrencyPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegCurrency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "SngDte", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqSngDte(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqSngDte_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "FrstNam", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqFrstNam(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqFrstNam_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "NtnlId", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqNtnlId(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqNtnlId_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "GrntDte", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqGrntDte(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqGrntDte_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrnhCod", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqMapBrnhCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapBrnhCod_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "SttDte", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqSttDte(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqSttDte_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Adrs", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqAdrs(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqAdrs_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Tel", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqTel(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqTel_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapAgncCod", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqMapAgncCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapAgncCod_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "BgnDte", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqBgnDte(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqBgnDte_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ExpDte", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqExpDte(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqExpDte_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "LstNam", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqLstNam(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqLstNam_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MngNam", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqMngNam(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqMngNam_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Mbl", scope = WbsV4AgncReq.class)
    public JAXBElement<String> createWbsV4AgncReqMbl(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMbl_QNAME, String.class, WbsV4AgncReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = RegLifeLos.class)
    public JAXBElement<String> createRegLifeLosUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, RegLifeLos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = RegLifeLos.class)
    public JAXBElement<String> createRegLifeLosPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, RegLifeLos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4LifeLosReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = RegLifeLos.class)
    public JAXBElement<WbsV4LifeLosReq> createRegLifeLosReq(WbsV4LifeLosReq value) {
        return new JAXBElement<WbsV4LifeLosReq>(_CiiUpdDocLosReq_QNAME, WbsV4LifeLosReq.class, RegLifeLos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4LifeLosRes.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createWbsV4LifeLosResErrors(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfKeyValueOfstringstring.class, WbsV4LifeLosRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyMthRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegPlcyMthResult", scope = CiiRegPlcyMthResponse.class)
    public JAXBElement<WbsV4PlcyMthRes> createCiiRegPlcyMthResponseCiiRegPlcyMthResult(WbsV4PlcyMthRes value) {
        return new JAXBElement<WbsV4PlcyMthRes>(_CiiRegPlcyMthResponseCiiRegPlcyMthResult_QNAME, WbsV4PlcyMthRes.class, CiiRegPlcyMthResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4PlcyCvrRes.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createWbsV4PlcyCvrResErrors(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfKeyValueOfstringstring.class, WbsV4PlcyCvrRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = RegPlcyLifeBase.class)
    public JAXBElement<String> createRegPlcyLifeBaseUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, RegPlcyLifeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = RegPlcyLifeBase.class)
    public JAXBElement<String> createRegPlcyLifeBasePassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, RegPlcyLifeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeBaseReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = RegPlcyLifeBase.class)
    public JAXBElement<WbsV4PlcyLifeBaseReq> createRegPlcyLifeBaseReq(WbsV4PlcyLifeBaseReq value) {
        return new JAXBElement<WbsV4PlcyLifeBaseReq>(_CiiUpdDocLosReq_QNAME, WbsV4PlcyLifeBaseReq.class, RegPlcyLifeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "AncDte", scope = UpdWbsV4DocLosReq.class)
    public JAXBElement<String> createUpdWbsV4DocLosReqAncDte(String value) {
        return new JAXBElement<String>(_WbsV4DocLosReqAncDte_QNAME, String.class, UpdWbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "LosEvlNtnlId", scope = UpdWbsV4DocLosReq.class)
    public JAXBElement<String> createUpdWbsV4DocLosReqLosEvlNtnlId(String value) {
        return new JAXBElement<String>(_WbsV4DocLosReqLosEvlNtnlId_QNAME, String.class, UpdWbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrnhCod", scope = UpdWbsV4DocLosReq.class)
    public JAXBElement<String> createUpdWbsV4DocLosReqMapBrnhCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapBrnhCod_QNAME, String.class, UpdWbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "LosEvl", scope = UpdWbsV4DocLosReq.class)
    public JAXBElement<String> createUpdWbsV4DocLosReqLosEvl(String value) {
        return new JAXBElement<String>(_WbsV4DocLosReqLosEvl_QNAME, String.class, UpdWbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapCorTypCod", scope = UpdWbsV4DocLosReq.class)
    public JAXBElement<String> createUpdWbsV4DocLosReqMapCorTypCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapCorTypCod_QNAME, String.class, UpdWbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapAgncCod", scope = UpdWbsV4DocLosReq.class)
    public JAXBElement<String> createUpdWbsV4DocLosReqMapAgncCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapAgncCod_QNAME, String.class, UpdWbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "OcrDte", scope = UpdWbsV4DocLosReq.class)
    public JAXBElement<String> createUpdWbsV4DocLosReqOcrDte(String value) {
        return new JAXBElement<String>(_WbsV4DocLosReqOcrDte_QNAME, String.class, UpdWbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "FleDte", scope = UpdWbsV4DocLosReq.class)
    public JAXBElement<String> createUpdWbsV4DocLosReqFleDte(String value) {
        return new JAXBElement<String>(_WbsV4DocLosReqFleDte_QNAME, String.class, UpdWbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpDocNo", scope = UpdWbsV4DocLosReq.class)
    public JAXBElement<String> createUpdWbsV4DocLosReqCmpDocNo(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqCmpDocNo_QNAME, String.class, UpdWbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapFldDtlCod", scope = UpdWbsV4DocLosReq.class)
    public JAXBElement<String> createUpdWbsV4DocLosReqMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapFldDtlCod_QNAME, String.class, UpdWbsV4DocLosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4PlcyReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pr", scope = CiiRegChkPlcy.class)
    public JAXBElement<WbsV4PlcyReq> createCiiRegChkPlcyPr(WbsV4PlcyReq value) {
        return new JAXBElement<WbsV4PlcyReq>(_CiiRegAgencyPr_QNAME, WbsV4PlcyReq.class, CiiRegChkPlcy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegChkPlcy.class)
    public JAXBElement<String> createCiiRegChkPlcyUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegChkPlcy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegChkPlcy.class)
    public JAXBElement<String> createCiiRegChkPlcyPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegChkPlcy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrnhCod", scope = WbsV4LosReq.class)
    public JAXBElement<String> createWbsV4LosReqMapBrnhCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapBrnhCod_QNAME, String.class, WbsV4LosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapCorTypCod", scope = WbsV4LosReq.class)
    public JAXBElement<String> createWbsV4LosReqMapCorTypCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapCorTypCod_QNAME, String.class, WbsV4LosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapAgncCod", scope = WbsV4LosReq.class)
    public JAXBElement<String> createWbsV4LosReqMapAgncCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapAgncCod_QNAME, String.class, WbsV4LosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapCurCod", scope = WbsV4LosReq.class)
    public JAXBElement<String> createWbsV4LosReqMapCurCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapCurCod_QNAME, String.class, WbsV4LosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PayDte", scope = WbsV4LosReq.class)
    public JAXBElement<String> createWbsV4LosReqPayDte(String value) {
        return new JAXBElement<String>(_WbsV4PlcyLifeReqPayDte_QNAME, String.class, WbsV4LosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpDocNo", scope = WbsV4LosReq.class)
    public JAXBElement<String> createWbsV4LosReqCmpDocNo(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqCmpDocNo_QNAME, String.class, WbsV4LosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapFldDtlCod", scope = WbsV4LosReq.class)
    public JAXBElement<String> createWbsV4LosReqMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapFldDtlCod_QNAME, String.class, WbsV4LosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "LosRcv", scope = WbsV4LosReq.class)
    public JAXBElement<String> createWbsV4LosReqLosRcv(String value) {
        return new JAXBElement<String>(_WbsV4LosReqLosRcv_QNAME, String.class, WbsV4LosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "LosRcvNtnlId", scope = WbsV4LosReq.class)
    public JAXBElement<String> createWbsV4LosReqLosRcvNtnlId(String value) {
        return new JAXBElement<String>(_WbsV4LosReqLosRcvNtnlId_QNAME, String.class, WbsV4LosReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4LosRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CiiRegLosResult", scope = CiiRegLosResponse.class)
    public JAXBElement<WbsV4LosRes> createCiiRegLosResponseCiiRegLosResult(WbsV4LosRes value) {
        return new JAXBElement<WbsV4LosRes>(_CiiRegLosResponseCiiRegLosResult_QNAME, WbsV4LosRes.class, CiiRegLosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4BranchReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pr", scope = CiiRegBranch.class)
    public JAXBElement<WbsV4BranchReq> createCiiRegBranchPr(WbsV4BranchReq value) {
        return new JAXBElement<WbsV4BranchReq>(_CiiRegAgencyPr_QNAME, WbsV4BranchReq.class, CiiRegBranch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegBranch.class)
    public JAXBElement<String> createCiiRegBranchUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegBranch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegBranch.class)
    public JAXBElement<String> createCiiRegBranchPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegBranch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpCurNam", scope = WbsV4CurrencyReq.class)
    public JAXBElement<String> createWbsV4CurrencyReqCmpCurNam(String value) {
        return new JAXBElement<String>(_WbsV4CurrencyReqCmpCurNam_QNAME, String.class, WbsV4CurrencyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapCurCod", scope = WbsV4CurrencyReq.class)
    public JAXBElement<String> createWbsV4CurrencyReqMapCurCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapCurCod_QNAME, String.class, WbsV4CurrencyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CurCod", scope = WbsV4CurrencyReq.class)
    public JAXBElement<Integer> createWbsV4CurrencyReqCurCod(Integer value) {
        return new JAXBElement<Integer>(_WbsV4CurrencyReqCurCod_QNAME, Integer.class, WbsV4CurrencyReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapBrnhCod", scope = WbsV4BranchReq.class)
    public JAXBElement<String> createWbsV4BranchReqMapBrnhCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapBrnhCod_QNAME, String.class, WbsV4BranchReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "SttDte", scope = WbsV4BranchReq.class)
    public JAXBElement<String> createWbsV4BranchReqSttDte(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqSttDte_QNAME, String.class, WbsV4BranchReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Adrs", scope = WbsV4BranchReq.class)
    public JAXBElement<String> createWbsV4BranchReqAdrs(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqAdrs_QNAME, String.class, WbsV4BranchReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "FrstNam", scope = WbsV4BranchReq.class)
    public JAXBElement<String> createWbsV4BranchReqFrstNam(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqFrstNam_QNAME, String.class, WbsV4BranchReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Tel", scope = WbsV4BranchReq.class)
    public JAXBElement<String> createWbsV4BranchReqTel(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqTel_QNAME, String.class, WbsV4BranchReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "NtnlId", scope = WbsV4BranchReq.class)
    public JAXBElement<String> createWbsV4BranchReqNtnlId(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqNtnlId_QNAME, String.class, WbsV4BranchReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "BrnhNam", scope = WbsV4BranchReq.class)
    public JAXBElement<String> createWbsV4BranchReqBrnhNam(String value) {
        return new JAXBElement<String>(_WbsV4BranchReqBrnhNam_QNAME, String.class, WbsV4BranchReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "LstNam", scope = WbsV4BranchReq.class)
    public JAXBElement<String> createWbsV4BranchReqLstNam(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqLstNam_QNAME, String.class, WbsV4BranchReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MngNam", scope = WbsV4BranchReq.class)
    public JAXBElement<String> createWbsV4BranchReqMngNam(String value) {
        return new JAXBElement<String>(_WbsV4AgncReqMngNam_QNAME, String.class, WbsV4BranchReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Mbl", scope = WbsV4BranchReq.class)
    public JAXBElement<String> createWbsV4BranchReqMbl(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMbl_QNAME, String.class, WbsV4BranchReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegEdrs.class)
    public JAXBElement<String> createCiiRegEdrsUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegEdrs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegEdrs.class)
    public JAXBElement<String> createCiiRegEdrsPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegEdrs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4EdrsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = CiiRegEdrs.class)
    public JAXBElement<WbsV4EdrsReq> createCiiRegEdrsReq(WbsV4EdrsReq value) {
        return new JAXBElement<WbsV4EdrsReq>(_CiiUpdDocLosReq_QNAME, WbsV4EdrsReq.class, CiiRegEdrs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Errors", scope = WbsV4DocLosRes.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createWbsV4DocLosResErrors(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_WbsV4EdrsResErrors_QNAME, ArrayOfKeyValueOfstringstring.class, WbsV4DocLosRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Prm", scope = WbsV4PlcyCvrReq.class)
    public JAXBElement<BigDecimal> createWbsV4PlcyCvrReqPrm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WbsV4PlcyCvrReqPrm_QNAME, BigDecimal.class, WbsV4PlcyCvrReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapCurCod", scope = WbsV4PlcyCvrReq.class)
    public JAXBElement<String> createWbsV4PlcyCvrReqMapCurCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapCurCod_QNAME, String.class, WbsV4PlcyCvrReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Cvr", scope = WbsV4PlcyCvrReq.class)
    public JAXBElement<BigDecimal> createWbsV4PlcyCvrReqCvr(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WbsV4PlcyCvrReqCvr_QNAME, BigDecimal.class, WbsV4PlcyCvrReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CmpDocNo", scope = WbsV4PlcyCvrReq.class)
    public JAXBElement<String> createWbsV4PlcyCvrReqCmpDocNo(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqCmpDocNo_QNAME, String.class, WbsV4PlcyCvrReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Cptl", scope = WbsV4PlcyCvrReq.class)
    public JAXBElement<BigDecimal> createWbsV4PlcyCvrReqCptl(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WbsV4PlcyCvrReqCptl_QNAME, BigDecimal.class, WbsV4PlcyCvrReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "MapFldDtlCod", scope = WbsV4PlcyCvrReq.class)
    public JAXBElement<String> createWbsV4PlcyCvrReqMapFldDtlCod(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqMapFldDtlCod_QNAME, String.class, WbsV4PlcyCvrReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PlcyUnqCod", scope = WbsV4PlcyCvrReq.class)
    public JAXBElement<Long> createWbsV4PlcyCvrReqPlcyUnqCod(Long value) {
        return new JAXBElement<Long>(_WbsV4PlcyCvrReqPlcyUnqCod_QNAME, Long.class, WbsV4PlcyCvrReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "EdrsUnqCod", scope = WbsV4PlcyCvrReq.class)
    public JAXBElement<Long> createWbsV4PlcyCvrReqEdrsUnqCod(Long value) {
        return new JAXBElement<Long>(_WbsV4PlcyCvrReqEdrsUnqCod_QNAME, Long.class, WbsV4PlcyCvrReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "IsuDte", scope = WbsV4PlcyCvrReq.class)
    public JAXBElement<String> createWbsV4PlcyCvrReqIsuDte(String value) {
        return new JAXBElement<String>(_WbsV4EdrsReqIsuDte_QNAME, String.class, WbsV4PlcyCvrReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4LifeLosRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegLifeLosResult", scope = RegLifeLosResponse.class)
    public JAXBElement<WbsV4LifeLosRes> createRegLifeLosResponseRegLifeLosResult(WbsV4LifeLosRes value) {
        return new JAXBElement<WbsV4LifeLosRes>(_RegLifeLosResponseRegLifeLosResult_QNAME, WbsV4LifeLosRes.class, RegLifeLosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4CompaniesFildDetailReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pr", scope = CiiRegCompaniesFildDetail.class)
    public JAXBElement<WbsV4CompaniesFildDetailReq> createCiiRegCompaniesFildDetailPr(WbsV4CompaniesFildDetailReq value) {
        return new JAXBElement<WbsV4CompaniesFildDetailReq>(_CiiRegAgencyPr_QNAME, WbsV4CompaniesFildDetailReq.class, CiiRegCompaniesFildDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegCompaniesFildDetail.class)
    public JAXBElement<String> createCiiRegCompaniesFildDetailUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegCompaniesFildDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegCompaniesFildDetail.class)
    public JAXBElement<String> createCiiRegCompaniesFildDetailPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegCompaniesFildDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WbsV4LosReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "losReq", scope = CiiRegLos.class)
    public JAXBElement<WbsV4LosReq> createCiiRegLosLosReq(WbsV4LosReq value) {
        return new JAXBElement<WbsV4LosReq>(_CiiRegLosLosReq_QNAME, WbsV4LosReq.class, CiiRegLos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Username", scope = CiiRegLos.class)
    public JAXBElement<String> createCiiRegLosUsername(String value) {
        return new JAXBElement<String>(_CiiRegAgencyUsername_QNAME, String.class, CiiRegLos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PassWrod", scope = CiiRegLos.class)
    public JAXBElement<String> createCiiRegLosPassWrod(String value) {
        return new JAXBElement<String>(_CiiRegAgencyPassWrod_QNAME, String.class, CiiRegLos.class, value);
    }

}
