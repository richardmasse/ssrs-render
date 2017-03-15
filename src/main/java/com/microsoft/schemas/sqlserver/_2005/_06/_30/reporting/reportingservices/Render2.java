
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaginationMode" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}PageCountMode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "format",
    "deviceInfo",
    "paginationMode"
})
@XmlRootElement(name = "Render2")
public class Render2 {

    @XmlElement(name = "Format")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String format;
    @XmlElement(name = "DeviceInfo")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String deviceInfo;
    @XmlElement(name = "PaginationMode", required = true)
    @XmlSchemaType(name = "string")
    protected PageCountMode paginationMode;

    /**
     * Obtient la valeur de la propriété format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Définit la valeur de la propriété format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Obtient la valeur de la propriété deviceInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Définit la valeur de la propriété deviceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceInfo(String value) {
        this.deviceInfo = value;
    }

    /**
     * Obtient la valeur de la propriété paginationMode.
     * 
     * @return
     *     possible object is
     *     {@link PageCountMode }
     *     
     */
    public PageCountMode getPaginationMode() {
        return paginationMode;
    }

    /**
     * Définit la valeur de la propriété paginationMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PageCountMode }
     *     
     */
    public void setPaginationMode(PageCountMode value) {
        this.paginationMode = value;
    }

}
