
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Warnings" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ArrayOfWarning" minOccurs="0"/&gt;
 *         &lt;element name="StreamIds" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ArrayOfString" minOccurs="0"/&gt;
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
    "result",
    "extension",
    "mimeType",
    "encoding",
    "warnings",
    "streamIds"
})
@XmlRootElement(name = "RenderResponse")
public class RenderResponse {

    @XmlElement(name = "Result")
    protected byte[] result;
    @XmlElement(name = "Extension")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String extension;
    @XmlElement(name = "MimeType")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String mimeType;
    @XmlElement(name = "Encoding")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String encoding;
    @XmlElement(name = "Warnings")
    protected ArrayOfWarning warnings;
    @XmlElement(name = "StreamIds")
    protected ArrayOfString streamIds;

    /**
     * Obtient la valeur de la propriété result.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getResult() {
        return result;
    }

    /**
     * Définit la valeur de la propriété result.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setResult(byte[] value) {
        this.result = value;
    }

    /**
     * Obtient la valeur de la propriété extension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Définit la valeur de la propriété extension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Obtient la valeur de la propriété mimeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Définit la valeur de la propriété mimeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Obtient la valeur de la propriété encoding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Définit la valeur de la propriété encoding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Obtient la valeur de la propriété warnings.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getWarnings() {
        return warnings;
    }

    /**
     * Définit la valeur de la propriété warnings.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setWarnings(ArrayOfWarning value) {
        this.warnings = value;
    }

    /**
     * Obtient la valeur de la propriété streamIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getStreamIds() {
        return streamIds;
    }

    /**
     * Définit la valeur de la propriété streamIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setStreamIds(ArrayOfString value) {
        this.streamIds = value;
    }

}
