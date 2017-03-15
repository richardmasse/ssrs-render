
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
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReportItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "pageNumber",
    "reportItem",
    "numPages"
})
@XmlRootElement(name = "SortResponse")
public class SortResponse {

    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    @XmlElement(name = "ReportItem")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String reportItem;
    @XmlElement(name = "NumPages")
    protected int numPages;

    /**
     * Obtient la valeur de la propri�t� pageNumber.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * D�finit la valeur de la propri�t� pageNumber.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� reportItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportItem() {
        return reportItem;
    }

    /**
     * D�finit la valeur de la propri�t� reportItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportItem(String value) {
        this.reportItem = value;
    }

    /**
     * Obtient la valeur de la propri�t� numPages.
     * 
     */
    public int getNumPages() {
        return numPages;
    }

    /**
     * D�finit la valeur de la propri�t� numPages.
     * 
     */
    public void setNumPages(int value) {
        this.numPages = value;
    }

}
