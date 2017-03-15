
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PageSettings complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PageSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaperSize" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ReportPaperSize" minOccurs="0"/&gt;
 *         &lt;element name="Margins" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ReportMargins" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageSettings", propOrder = {
    "paperSize",
    "margins"
})
public class PageSettings {

    @XmlElement(name = "PaperSize")
    protected ReportPaperSize paperSize;
    @XmlElement(name = "Margins")
    protected ReportMargins margins;

    /**
     * Obtient la valeur de la propriété paperSize.
     * 
     * @return
     *     possible object is
     *     {@link ReportPaperSize }
     *     
     */
    public ReportPaperSize getPaperSize() {
        return paperSize;
    }

    /**
     * Définit la valeur de la propriété paperSize.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPaperSize }
     *     
     */
    public void setPaperSize(ReportPaperSize value) {
        this.paperSize = value;
    }

    /**
     * Obtient la valeur de la propriété margins.
     * 
     * @return
     *     possible object is
     *     {@link ReportMargins }
     *     
     */
    public ReportMargins getMargins() {
        return margins;
    }

    /**
     * Définit la valeur de la propriété margins.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportMargins }
     *     
     */
    public void setMargins(ReportMargins value) {
        this.margins = value;
    }

}
