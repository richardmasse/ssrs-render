
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Classe Java pour ServerInfoHeader complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ServerInfoHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportServerVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportServerEdition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportServerVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportServerDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerInfoHeader", propOrder = {
    "reportServerVersionNumber",
    "reportServerEdition",
    "reportServerVersion",
    "reportServerDateTime"
})
public class ServerInfoHeader {

    @XmlElement(name = "ReportServerVersionNumber")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String reportServerVersionNumber;
    @XmlElement(name = "ReportServerEdition")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String reportServerEdition;
    @XmlElement(name = "ReportServerVersion")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String reportServerVersion;
    @XmlElement(name = "ReportServerDateTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String reportServerDateTime;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtient la valeur de la propriété reportServerVersionNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportServerVersionNumber() {
        return reportServerVersionNumber;
    }

    /**
     * Définit la valeur de la propriété reportServerVersionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportServerVersionNumber(String value) {
        this.reportServerVersionNumber = value;
    }

    /**
     * Obtient la valeur de la propriété reportServerEdition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportServerEdition() {
        return reportServerEdition;
    }

    /**
     * Définit la valeur de la propriété reportServerEdition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportServerEdition(String value) {
        this.reportServerEdition = value;
    }

    /**
     * Obtient la valeur de la propriété reportServerVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportServerVersion() {
        return reportServerVersion;
    }

    /**
     * Définit la valeur de la propriété reportServerVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportServerVersion(String value) {
        this.reportServerVersion = value;
    }

    /**
     * Obtient la valeur de la propriété reportServerDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportServerDateTime() {
        return reportServerDateTime;
    }

    /**
     * Définit la valeur de la propriété reportServerDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportServerDateTime(String value) {
        this.reportServerDateTime = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
