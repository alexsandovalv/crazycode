//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 07:05:38 AM COT 
//


package edu.pe.zoocrazy.soap.gestionarInstitucion.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObtenerInstitucionRazonResult" type="{http://schemas.datacontract.org/2004/07/Proyecto.Dominio}Institucions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "obtenerInstitucionRazonResult"
})
@XmlRootElement(name = "ObtenerInstitucionRazonResponse")
public class ObtenerInstitucionRazonResponse {

    @XmlElementRef(name = "ObtenerInstitucionRazonResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Institucions> obtenerInstitucionRazonResult;

    /**
     * Gets the value of the obtenerInstitucionRazonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Institucions }{@code >}
     *     
     */
    public JAXBElement<Institucions> getObtenerInstitucionRazonResult() {
        return obtenerInstitucionRazonResult;
    }

    /**
     * Sets the value of the obtenerInstitucionRazonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Institucions }{@code >}
     *     
     */
    public void setObtenerInstitucionRazonResult(JAXBElement<Institucions> value) {
        this.obtenerInstitucionRazonResult = value;
    }

}