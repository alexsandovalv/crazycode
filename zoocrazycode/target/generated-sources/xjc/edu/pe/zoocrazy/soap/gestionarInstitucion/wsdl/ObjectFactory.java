//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 07:05:38 AM COT 
//


package edu.pe.zoocrazy.soap.gestionarInstitucion.wsdl;

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
 * generated in the edu.pe.zoocrazy.soap.gestionarInstitucion.wsdl package. 
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

    private final static QName _InstitucionsNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/Proyecto.Dominio", "Nombre");
    private final static QName _InstitucionsRUC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Proyecto.Dominio", "RUC");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Institucions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Proyecto.Dominio", "Institucions");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfInstitucions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Proyecto.Dominio", "ArrayOfInstitucions");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _DataException_QNAME = new QName("http://schemas.datacontract.org/2004/07/Proyecto.Dominio", "DataException");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ObtenerInstitucionRUCResponseObtenerInstitucionRUCResult_QNAME = new QName("http://tempuri.org/", "ObtenerInstitucionRUCResult");
    private final static QName _ObtenerInstitucionRazonResponseObtenerInstitucionRazonResult_QNAME = new QName("http://tempuri.org/", "ObtenerInstitucionRazonResult");
    private final static QName _ListaInstitucionResponseListaInstitucionResult_QNAME = new QName("http://tempuri.org/", "ListaInstitucionResult");
    private final static QName _ObtenerInstitucionRazonRazon_QNAME = new QName("http://tempuri.org/", "razon");
    private final static QName _ObtenerInstitucionRUCRuc_QNAME = new QName("http://tempuri.org/", "ruc");
    private final static QName _DataExceptionDataError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Proyecto.Dominio", "DataError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.pe.zoocrazy.soap.gestionarInstitucion.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerInstitucionRUC }
     * 
     */
    public ObtenerInstitucionRUC createObtenerInstitucionRUC() {
        return new ObtenerInstitucionRUC();
    }

    /**
     * Create an instance of {@link ListaInstitucion }
     * 
     */
    public ListaInstitucion createListaInstitucion() {
        return new ListaInstitucion();
    }

    /**
     * Create an instance of {@link ListaInstitucionResponse }
     * 
     */
    public ListaInstitucionResponse createListaInstitucionResponse() {
        return new ListaInstitucionResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInstitucions }
     * 
     */
    public ArrayOfInstitucions createArrayOfInstitucions() {
        return new ArrayOfInstitucions();
    }

    /**
     * Create an instance of {@link ObtenerInstitucionRUCResponse }
     * 
     */
    public ObtenerInstitucionRUCResponse createObtenerInstitucionRUCResponse() {
        return new ObtenerInstitucionRUCResponse();
    }

    /**
     * Create an instance of {@link Institucions }
     * 
     */
    public Institucions createInstitucions() {
        return new Institucions();
    }

    /**
     * Create an instance of {@link ObtenerInstitucionRazonResponse }
     * 
     */
    public ObtenerInstitucionRazonResponse createObtenerInstitucionRazonResponse() {
        return new ObtenerInstitucionRazonResponse();
    }

    /**
     * Create an instance of {@link ObtenerInstitucionRazon }
     * 
     */
    public ObtenerInstitucionRazon createObtenerInstitucionRazon() {
        return new ObtenerInstitucionRazon();
    }

    /**
     * Create an instance of {@link DataException }
     * 
     */
    public DataException createDataException() {
        return new DataException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Proyecto.Dominio", name = "Nombre", scope = Institucions.class)
    public JAXBElement<String> createInstitucionsNombre(String value) {
        return new JAXBElement<String>(_InstitucionsNombre_QNAME, String.class, Institucions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Proyecto.Dominio", name = "RUC", scope = Institucions.class)
    public JAXBElement<String> createInstitucionsRUC(String value) {
        return new JAXBElement<String>(_InstitucionsRUC_QNAME, String.class, Institucions.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Institucions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Proyecto.Dominio", name = "Institucions")
    public JAXBElement<Institucions> createInstitucions(Institucions value) {
        return new JAXBElement<Institucions>(_Institucions_QNAME, Institucions.class, null, value);
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
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInstitucions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Proyecto.Dominio", name = "ArrayOfInstitucions")
    public JAXBElement<ArrayOfInstitucions> createArrayOfInstitucions(ArrayOfInstitucions value) {
        return new JAXBElement<ArrayOfInstitucions>(_ArrayOfInstitucions_QNAME, ArrayOfInstitucions.class, null, value);
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
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DataException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Proyecto.Dominio", name = "DataException")
    public JAXBElement<DataException> createDataException(DataException value) {
        return new JAXBElement<DataException>(_DataException_QNAME, DataException.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Institucions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerInstitucionRUCResult", scope = ObtenerInstitucionRUCResponse.class)
    public JAXBElement<Institucions> createObtenerInstitucionRUCResponseObtenerInstitucionRUCResult(Institucions value) {
        return new JAXBElement<Institucions>(_ObtenerInstitucionRUCResponseObtenerInstitucionRUCResult_QNAME, Institucions.class, ObtenerInstitucionRUCResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Institucions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerInstitucionRazonResult", scope = ObtenerInstitucionRazonResponse.class)
    public JAXBElement<Institucions> createObtenerInstitucionRazonResponseObtenerInstitucionRazonResult(Institucions value) {
        return new JAXBElement<Institucions>(_ObtenerInstitucionRazonResponseObtenerInstitucionRazonResult_QNAME, Institucions.class, ObtenerInstitucionRazonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInstitucions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListaInstitucionResult", scope = ListaInstitucionResponse.class)
    public JAXBElement<ArrayOfInstitucions> createListaInstitucionResponseListaInstitucionResult(ArrayOfInstitucions value) {
        return new JAXBElement<ArrayOfInstitucions>(_ListaInstitucionResponseListaInstitucionResult_QNAME, ArrayOfInstitucions.class, ListaInstitucionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "razon", scope = ObtenerInstitucionRazon.class)
    public JAXBElement<String> createObtenerInstitucionRazonRazon(String value) {
        return new JAXBElement<String>(_ObtenerInstitucionRazonRazon_QNAME, String.class, ObtenerInstitucionRazon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ruc", scope = ObtenerInstitucionRUC.class)
    public JAXBElement<String> createObtenerInstitucionRUCRuc(String value) {
        return new JAXBElement<String>(_ObtenerInstitucionRUCRuc_QNAME, String.class, ObtenerInstitucionRUC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Proyecto.Dominio", name = "DataError", scope = DataException.class)
    public JAXBElement<String> createDataExceptionDataError(String value) {
        return new JAXBElement<String>(_DataExceptionDataError_QNAME, String.class, DataException.class, value);
    }

}