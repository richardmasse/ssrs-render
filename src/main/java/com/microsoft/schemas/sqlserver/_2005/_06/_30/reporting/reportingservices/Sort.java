
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
 *         &lt;element name="SortItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direction" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}SortDirectionEnum"/&gt;
 *         &lt;element name="Clear" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "sortItem",
    "direction",
    "clear"
})
@XmlRootElement(name = "Sort")
public class Sort {

    @XmlElement(name = "SortItem")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String sortItem;
    @XmlElement(name = "Direction", required = true)
    @XmlSchemaType(name = "string")
    protected SortDirectionEnum direction;
    @XmlElement(name = "Clear")
    protected boolean clear;

    /**
     * Obtient la valeur de la propriété sortItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortItem() {
        return sortItem;
    }

    /**
     * Définit la valeur de la propriété sortItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortItem(String value) {
        this.sortItem = value;
    }

    /**
     * Obtient la valeur de la propriété direction.
     * 
     * @return
     *     possible object is
     *     {@link SortDirectionEnum }
     *     
     */
    public SortDirectionEnum getDirection() {
        return direction;
    }

    /**
     * Définit la valeur de la propriété direction.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirectionEnum }
     *     
     */
    public void setDirection(SortDirectionEnum value) {
        this.direction = value;
    }

    /**
     * Obtient la valeur de la propriété clear.
     * 
     */
    public boolean isClear() {
        return clear;
    }

    /**
     * Définit la valeur de la propriété clear.
     * 
     */
    public void setClear(boolean value) {
        this.clear = value;
    }

}
