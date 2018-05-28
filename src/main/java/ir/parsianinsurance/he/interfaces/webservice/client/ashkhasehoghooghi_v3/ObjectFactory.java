
package ir.parsianinsurance.he.interfaces.webservice.client.ashkhasehoghooghi_v3;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ir.parsianinsurance.he.interfaces.webservice.client.ashkhasehoghooghi_v3 package. 
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

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _LegalInqRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/LegalLogic", "LegalInqRes");
    private final static QName _Result_QNAME = new QName("http://tempuri.org/", "Result");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfResult_QNAME = new QName("http://tempuri.org/", "ArrayOfResult");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ExtensionDataObject_QNAME = new QName("http://tempuri.org/", "ExtensionDataObject");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _SubmitNationalIdInqPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _SubmitNationalIdInqNationalId_QNAME = new QName("http://tempuri.org/", "nationalId");
    private final static QName _SubmitNationalIdInqUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _SubmitNationalIdInqResponseSubmitNationalIdInqResult_QNAME = new QName("http://tempuri.org/", "SubmitNationalIdInqResult");
    private final static QName _LegalInqResLegalEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/LegalLogic", "LegalEntity");
    private final static QName _LegalInqResErrorNams_QNAME = new QName("http://schemas.datacontract.org/2004/07/LegalLogic", "ErrorNams");
    private final static QName _SubmitFullArchiveNameInqResponseSubmitFullArchiveNameInqResult_QNAME = new QName("http://tempuri.org/", "SubmitFullArchiveNameInqResult");
    private final static QName _SubmitFullNameInqFullName_QNAME = new QName("http://tempuri.org/", "fullName");
    private final static QName _SubmitFullArchiveNameInqArchiveName_QNAME = new QName("http://tempuri.org/", "archiveName");
    private final static QName _SubmitFullNameInqResponseSubmitFullNameInqResult_QNAME = new QName("http://tempuri.org/", "SubmitFullNameInqResult");
    private final static QName _ResultNationalCode_QNAME = new QName("http://tempuri.org/", "NationalCode");
    private final static QName _ResultUnitId_QNAME = new QName("http://tempuri.org/", "UnitId");
    private final static QName _ResultBankRuptcyDate_QNAME = new QName("http://tempuri.org/", "BankRuptcyDate");
    private final static QName _ResultSettleDate_QNAME = new QName("http://tempuri.org/", "SettleDate");
    private final static QName _ResultLicenseDate_QNAME = new QName("http://tempuri.org/", "LicenseDate");
    private final static QName _ResultLicenseNumber_QNAME = new QName("http://tempuri.org/", "LicenseNumber");
    private final static QName _ResultAddress_QNAME = new QName("http://tempuri.org/", "Address");
    private final static QName _ResultLegalPersonType_QNAME = new QName("http://tempuri.org/", "LegalPersonType");
    private final static QName _ResultMessage_QNAME = new QName("http://tempuri.org/", "Message");
    private final static QName _ResultTaxRestrictDate_QNAME = new QName("http://tempuri.org/", "TaxRestrictDate");
    private final static QName _ResultName_QNAME = new QName("http://tempuri.org/", "Name");
    private final static QName _ResultRegisterNumber_QNAME = new QName("http://tempuri.org/", "RegisterNumber");
    private final static QName _ResultLastChangeDate_QNAME = new QName("http://tempuri.org/", "LastChangeDate");
    private final static QName _ResultResidency_QNAME = new QName("http://tempuri.org/", "Residency");
    private final static QName _ResultState_QNAME = new QName("http://tempuri.org/", "State");
    private final static QName _ResultBranchList_QNAME = new QName("http://tempuri.org/", "BranchList");
    private final static QName _ResultParentLegalPerson_QNAME = new QName("http://tempuri.org/", "ParentLegalPerson");
    private final static QName _ResultJSONRseult_QNAME = new QName("http://tempuri.org/", "JSONRseult");
    private final static QName _ResultPostCode_QNAME = new QName("http://tempuri.org/", "PostCode");
    private final static QName _ResultEstablishmentDate_QNAME = new QName("http://tempuri.org/", "EstablishmentDate");
    private final static QName _ResultRegisterUnit_QNAME = new QName("http://tempuri.org/", "RegisterUnit");
    private final static QName _ResultBreakUpDate_QNAME = new QName("http://tempuri.org/", "BreakUpDate");
    private final static QName _ResultLegalPersonTypeId_QNAME = new QName("http://tempuri.org/", "LegalPersonTypeId");
    private final static QName _ResultRegisterDate_QNAME = new QName("http://tempuri.org/", "RegisterDate");
    private final static QName _ResultExtensionData_QNAME = new QName("http://tempuri.org/", "ExtensionData");
    private final static QName _ResultFollowUpNo_QNAME = new QName("http://tempuri.org/", "FollowUpNo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ir.parsianinsurance.he.interfaces.webservice.client.ashkhasehoghooghi_v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubmitFullNameInq }
     * 
     */
    public SubmitFullNameInq createSubmitFullNameInq() {
        return new SubmitFullNameInq();
    }

    /**
     * Create an instance of {@link ArrayOfResult }
     * 
     */
    public ArrayOfResult createArrayOfResult() {
        return new ArrayOfResult();
    }

    /**
     * Create an instance of {@link SubmitFullArchiveNameInq }
     * 
     */
    public SubmitFullArchiveNameInq createSubmitFullArchiveNameInq() {
        return new SubmitFullArchiveNameInq();
    }

    /**
     * Create an instance of {@link SubmitFullArchiveNameInqResponse }
     * 
     */
    public SubmitFullArchiveNameInqResponse createSubmitFullArchiveNameInqResponse() {
        return new SubmitFullArchiveNameInqResponse();
    }

    /**
     * Create an instance of {@link LegalInqRes }
     * 
     */
    public LegalInqRes createLegalInqRes() {
        return new LegalInqRes();
    }

    /**
     * Create an instance of {@link SubmitNationalIdInq }
     * 
     */
    public SubmitNationalIdInq createSubmitNationalIdInq() {
        return new SubmitNationalIdInq();
    }

    /**
     * Create an instance of {@link SubmitNationalIdInqResponse }
     * 
     */
    public SubmitNationalIdInqResponse createSubmitNationalIdInqResponse() {
        return new SubmitNationalIdInqResponse();
    }

    /**
     * Create an instance of {@link ExtensionDataObject }
     * 
     */
    public ExtensionDataObject createExtensionDataObject() {
        return new ExtensionDataObject();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link SubmitFullNameInqResponse }
     * 
     */
    public SubmitFullNameInqResponse createSubmitFullNameInqResponse() {
        return new SubmitFullNameInqResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalInqRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/LegalLogic", name = "LegalInqRes")
    public JAXBElement<LegalInqRes> createLegalInqRes(LegalInqRes value) {
        return new JAXBElement<LegalInqRes>(_LegalInqRes_QNAME, LegalInqRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Result")
    public JAXBElement<Result> createResult(Result value) {
        return new JAXBElement<Result>(_Result_QNAME, Result.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfResult")
    public JAXBElement<ArrayOfResult> createArrayOfResult(ArrayOfResult value) {
        return new JAXBElement<ArrayOfResult>(_ArrayOfResult_QNAME, ArrayOfResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionDataObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ExtensionDataObject")
    public JAXBElement<ExtensionDataObject> createExtensionDataObject(ExtensionDataObject value) {
        return new JAXBElement<ExtensionDataObject>(_ExtensionDataObject_QNAME, ExtensionDataObject.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = SubmitNationalIdInq.class)
    public JAXBElement<String> createSubmitNationalIdInqPassword(String value) {
        return new JAXBElement<String>(_SubmitNationalIdInqPassword_QNAME, String.class, SubmitNationalIdInq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nationalId", scope = SubmitNationalIdInq.class)
    public JAXBElement<String> createSubmitNationalIdInqNationalId(String value) {
        return new JAXBElement<String>(_SubmitNationalIdInqNationalId_QNAME, String.class, SubmitNationalIdInq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = SubmitNationalIdInq.class)
    public JAXBElement<String> createSubmitNationalIdInqUsername(String value) {
        return new JAXBElement<String>(_SubmitNationalIdInqUsername_QNAME, String.class, SubmitNationalIdInq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalInqRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SubmitNationalIdInqResult", scope = SubmitNationalIdInqResponse.class)
    public JAXBElement<LegalInqRes> createSubmitNationalIdInqResponseSubmitNationalIdInqResult(LegalInqRes value) {
        return new JAXBElement<LegalInqRes>(_SubmitNationalIdInqResponseSubmitNationalIdInqResult_QNAME, LegalInqRes.class, SubmitNationalIdInqResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/LegalLogic", name = "LegalEntity", scope = LegalInqRes.class)
    public JAXBElement<Result> createLegalInqResLegalEntity(Result value) {
        return new JAXBElement<Result>(_LegalInqResLegalEntity_QNAME, Result.class, LegalInqRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/LegalLogic", name = "ErrorNams", scope = LegalInqRes.class)
    public JAXBElement<String> createLegalInqResErrorNams(String value) {
        return new JAXBElement<String>(_LegalInqResErrorNams_QNAME, String.class, LegalInqRes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalInqRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SubmitFullArchiveNameInqResult", scope = SubmitFullArchiveNameInqResponse.class)
    public JAXBElement<LegalInqRes> createSubmitFullArchiveNameInqResponseSubmitFullArchiveNameInqResult(LegalInqRes value) {
        return new JAXBElement<LegalInqRes>(_SubmitFullArchiveNameInqResponseSubmitFullArchiveNameInqResult_QNAME, LegalInqRes.class, SubmitFullArchiveNameInqResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = SubmitFullNameInq.class)
    public JAXBElement<String> createSubmitFullNameInqPassword(String value) {
        return new JAXBElement<String>(_SubmitNationalIdInqPassword_QNAME, String.class, SubmitFullNameInq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fullName", scope = SubmitFullNameInq.class)
    public JAXBElement<String> createSubmitFullNameInqFullName(String value) {
        return new JAXBElement<String>(_SubmitFullNameInqFullName_QNAME, String.class, SubmitFullNameInq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = SubmitFullNameInq.class)
    public JAXBElement<String> createSubmitFullNameInqUsername(String value) {
        return new JAXBElement<String>(_SubmitNationalIdInqUsername_QNAME, String.class, SubmitFullNameInq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = SubmitFullArchiveNameInq.class)
    public JAXBElement<String> createSubmitFullArchiveNameInqPassword(String value) {
        return new JAXBElement<String>(_SubmitNationalIdInqPassword_QNAME, String.class, SubmitFullArchiveNameInq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "archiveName", scope = SubmitFullArchiveNameInq.class)
    public JAXBElement<String> createSubmitFullArchiveNameInqArchiveName(String value) {
        return new JAXBElement<String>(_SubmitFullArchiveNameInqArchiveName_QNAME, String.class, SubmitFullArchiveNameInq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = SubmitFullArchiveNameInq.class)
    public JAXBElement<String> createSubmitFullArchiveNameInqUsername(String value) {
        return new JAXBElement<String>(_SubmitNationalIdInqUsername_QNAME, String.class, SubmitFullArchiveNameInq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalInqRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SubmitFullNameInqResult", scope = SubmitFullNameInqResponse.class)
    public JAXBElement<LegalInqRes> createSubmitFullNameInqResponseSubmitFullNameInqResult(LegalInqRes value) {
        return new JAXBElement<LegalInqRes>(_SubmitFullNameInqResponseSubmitFullNameInqResult_QNAME, LegalInqRes.class, SubmitFullNameInqResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "NationalCode", scope = Result.class)
    public JAXBElement<String> createResultNationalCode(String value) {
        return new JAXBElement<String>(_ResultNationalCode_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UnitId", scope = Result.class)
    public JAXBElement<String> createResultUnitId(String value) {
        return new JAXBElement<String>(_ResultUnitId_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BankRuptcyDate", scope = Result.class)
    public JAXBElement<String> createResultBankRuptcyDate(String value) {
        return new JAXBElement<String>(_ResultBankRuptcyDate_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SettleDate", scope = Result.class)
    public JAXBElement<String> createResultSettleDate(String value) {
        return new JAXBElement<String>(_ResultSettleDate_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LicenseDate", scope = Result.class)
    public JAXBElement<String> createResultLicenseDate(String value) {
        return new JAXBElement<String>(_ResultLicenseDate_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LicenseNumber", scope = Result.class)
    public JAXBElement<String> createResultLicenseNumber(String value) {
        return new JAXBElement<String>(_ResultLicenseNumber_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Address", scope = Result.class)
    public JAXBElement<String> createResultAddress(String value) {
        return new JAXBElement<String>(_ResultAddress_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LegalPersonType", scope = Result.class)
    public JAXBElement<String> createResultLegalPersonType(String value) {
        return new JAXBElement<String>(_ResultLegalPersonType_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Message", scope = Result.class)
    public JAXBElement<String> createResultMessage(String value) {
        return new JAXBElement<String>(_ResultMessage_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TaxRestrictDate", scope = Result.class)
    public JAXBElement<String> createResultTaxRestrictDate(String value) {
        return new JAXBElement<String>(_ResultTaxRestrictDate_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = Result.class)
    public JAXBElement<String> createResultName(String value) {
        return new JAXBElement<String>(_ResultName_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterNumber", scope = Result.class)
    public JAXBElement<String> createResultRegisterNumber(String value) {
        return new JAXBElement<String>(_ResultRegisterNumber_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LastChangeDate", scope = Result.class)
    public JAXBElement<String> createResultLastChangeDate(String value) {
        return new JAXBElement<String>(_ResultLastChangeDate_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Residency", scope = Result.class)
    public JAXBElement<String> createResultResidency(String value) {
        return new JAXBElement<String>(_ResultResidency_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "State", scope = Result.class)
    public JAXBElement<String> createResultState(String value) {
        return new JAXBElement<String>(_ResultState_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BranchList", scope = Result.class)
    public JAXBElement<ArrayOfResult> createResultBranchList(ArrayOfResult value) {
        return new JAXBElement<ArrayOfResult>(_ResultBranchList_QNAME, ArrayOfResult.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ParentLegalPerson", scope = Result.class)
    public JAXBElement<Result> createResultParentLegalPerson(Result value) {
        return new JAXBElement<Result>(_ResultParentLegalPerson_QNAME, Result.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "JSONRseult", scope = Result.class)
    public JAXBElement<String> createResultJSONRseult(String value) {
        return new JAXBElement<String>(_ResultJSONRseult_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PostCode", scope = Result.class)
    public JAXBElement<String> createResultPostCode(String value) {
        return new JAXBElement<String>(_ResultPostCode_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EstablishmentDate", scope = Result.class)
    public JAXBElement<String> createResultEstablishmentDate(String value) {
        return new JAXBElement<String>(_ResultEstablishmentDate_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterUnit", scope = Result.class)
    public JAXBElement<String> createResultRegisterUnit(String value) {
        return new JAXBElement<String>(_ResultRegisterUnit_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BreakUpDate", scope = Result.class)
    public JAXBElement<String> createResultBreakUpDate(String value) {
        return new JAXBElement<String>(_ResultBreakUpDate_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LegalPersonTypeId", scope = Result.class)
    public JAXBElement<String> createResultLegalPersonTypeId(String value) {
        return new JAXBElement<String>(_ResultLegalPersonTypeId_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterDate", scope = Result.class)
    public JAXBElement<String> createResultRegisterDate(String value) {
        return new JAXBElement<String>(_ResultRegisterDate_QNAME, String.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionDataObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ExtensionData", scope = Result.class)
    public JAXBElement<ExtensionDataObject> createResultExtensionData(ExtensionDataObject value) {
        return new JAXBElement<ExtensionDataObject>(_ResultExtensionData_QNAME, ExtensionDataObject.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FollowUpNo", scope = Result.class)
    public JAXBElement<String> createResultFollowUpNo(String value) {
        return new JAXBElement<String>(_ResultFollowUpNo_QNAME, String.class, Result.class, value);
    }

}
