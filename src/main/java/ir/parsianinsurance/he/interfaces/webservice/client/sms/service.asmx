<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.SMS.parsianInsurance.ir/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://www.SMS.parsianInsurance.ir/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.SMS.parsianInsurance.ir/">
      <s:element name="InsertSMS">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UserName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Passwrd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="FirstName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="LastName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="CellPhone" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="SMSText" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="PolicyID" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="AppName" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InsertSMSResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InsertSMSResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Insert_Saiboon">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UserName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Passwrd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="FirstName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="LastName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="CellPhone" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="SMSText" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Description" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="PolicyID" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="AppName" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="ReservedField3" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Insert_SaiboonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Insert_SaiboonResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="string" nillable="true" type="s:string" />
    </s:schema>
  </wsdl:types>
  <wsdl:message name="InsertSMSSoapIn">
    <wsdl:part name="parameters" element="tns:InsertSMS" />
  </wsdl:message>
  <wsdl:message name="InsertSMSSoapOut">
    <wsdl:part name="parameters" element="tns:InsertSMSResponse" />
  </wsdl:message>
  <wsdl:message name="Insert_SaiboonSoapIn">
    <wsdl:part name="parameters" element="tns:Insert_Saiboon" />
  </wsdl:message>
  <wsdl:message name="Insert_SaiboonSoapOut">
    <wsdl:part name="parameters" element="tns:Insert_SaiboonResponse" />
  </wsdl:message>
  <wsdl:message name="InsertSMSHttpGetIn">
    <wsdl:part name="UserName" type="s:string" />
    <wsdl:part name="Passwrd" type="s:string" />
    <wsdl:part name="FirstName" type="s:string" />
    <wsdl:part name="LastName" type="s:string" />
    <wsdl:part name="CellPhone" type="s:string" />
    <wsdl:part name="SMSText" type="s:string" />
    <wsdl:part name="Description" type="s:string" />
    <wsdl:part name="PolicyID" type="s:string" />
    <wsdl:part name="AppName" type="s:string" />
  </wsdl:message>
  <wsdl:message name="InsertSMSHttpGetOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:message name="Insert_SaiboonHttpGetIn">
    <wsdl:part name="UserName" type="s:string" />
    <wsdl:part name="Passwrd" type="s:string" />
    <wsdl:part name="FirstName" type="s:string" />
    <wsdl:part name="LastName" type="s:string" />
    <wsdl:part name="CellPhone" type="s:string" />
    <wsdl:part name="SMSText" type="s:string" />
    <wsdl:part name="Description" type="s:string" />
    <wsdl:part name="PolicyID" type="s:string" />
    <wsdl:part name="AppName" type="s:string" />
    <wsdl:part name="ReservedField3" type="s:string" />
  </wsdl:message>
  <wsdl:message name="Insert_SaiboonHttpGetOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:message name="InsertSMSHttpPostIn">
    <wsdl:part name="UserName" type="s:string" />
    <wsdl:part name="Passwrd" type="s:string" />
    <wsdl:part name="FirstName" type="s:string" />
    <wsdl:part name="LastName" type="s:string" />
    <wsdl:part name="CellPhone" type="s:string" />
    <wsdl:part name="SMSText" type="s:string" />
    <wsdl:part name="Description" type="s:string" />
    <wsdl:part name="PolicyID" type="s:string" />
    <wsdl:part name="AppName" type="s:string" />
  </wsdl:message>
  <wsdl:message name="InsertSMSHttpPostOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:message name="Insert_SaiboonHttpPostIn">
    <wsdl:part name="UserName" type="s:string" />
    <wsdl:part name="Passwrd" type="s:string" />
    <wsdl:part name="FirstName" type="s:string" />
    <wsdl:part name="LastName" type="s:string" />
    <wsdl:part name="CellPhone" type="s:string" />
    <wsdl:part name="SMSText" type="s:string" />
    <wsdl:part name="Description" type="s:string" />
    <wsdl:part name="PolicyID" type="s:string" />
    <wsdl:part name="AppName" type="s:string" />
    <wsdl:part name="ReservedField3" type="s:string" />
  </wsdl:message>
  <wsdl:message name="Insert_SaiboonHttpPostOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:portType name="ServiceSoap">
    <wsdl:operation name="InsertSMS">
      <wsdl:input message="tns:InsertSMSSoapIn" />
      <wsdl:output message="tns:InsertSMSSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Insert_Saiboon">
      <wsdl:input message="tns:Insert_SaiboonSoapIn" />
      <wsdl:output message="tns:Insert_SaiboonSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="ServiceHttpGet">
    <wsdl:operation name="InsertSMS">
      <wsdl:input message="tns:InsertSMSHttpGetIn" />
      <wsdl:output message="tns:InsertSMSHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="Insert_Saiboon">
      <wsdl:input message="tns:Insert_SaiboonHttpGetIn" />
      <wsdl:output message="tns:Insert_SaiboonHttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="ServiceHttpPost">
    <wsdl:operation name="InsertSMS">
      <wsdl:input message="tns:InsertSMSHttpPostIn" />
      <wsdl:output message="tns:InsertSMSHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="Insert_Saiboon">
      <wsdl:input message="tns:Insert_SaiboonHttpPostIn" />
      <wsdl:output message="tns:Insert_SaiboonHttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="ServiceSoap" type="tns:ServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="InsertSMS">
      <soap:operation soapAction="http://www.SMS.parsianInsurance.ir/InsertSMS" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Insert_Saiboon">
      <soap:operation soapAction="http://www.SMS.parsianInsurance.ir/Insert_Saiboon" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="ServiceSoap12" type="tns:ServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="InsertSMS">
      <soap12:operation soapAction="http://www.SMS.parsianInsurance.ir/InsertSMS" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Insert_Saiboon">
      <soap12:operation soapAction="http://www.SMS.parsianInsurance.ir/Insert_Saiboon" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="ServiceHttpGet" type="tns:ServiceHttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="InsertSMS">
      <http:operation location="/InsertSMS" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Insert_Saiboon">
      <http:operation location="/Insert_Saiboon" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="ServiceHttpPost" type="tns:ServiceHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="InsertSMS">
      <http:operation location="/InsertSMS" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Insert_Saiboon">
      <http:operation location="/Insert_Saiboon" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="Service">
    <wsdl:port name="ServiceSoap" binding="tns:ServiceSoap">
      <soap:address location="http://172.16.0.166/smswebservice/service.asmx" />
    </wsdl:port>
    <wsdl:port name="ServiceSoap12" binding="tns:ServiceSoap12">
      <soap12:address location="http://172.16.0.166/smswebservice/service.asmx" />
    </wsdl:port>
    <wsdl:port name="ServiceHttpGet" binding="tns:ServiceHttpGet">
      <http:address location="http://172.16.0.166/smswebservice/service.asmx" />
    </wsdl:port>
    <wsdl:port name="ServiceHttpPost" binding="tns:ServiceHttpPost">
      <http:address location="http://172.16.0.166/smswebservice/service.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>