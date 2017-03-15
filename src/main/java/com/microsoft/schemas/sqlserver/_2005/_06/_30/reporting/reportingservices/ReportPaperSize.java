
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReportPaperSize complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReportPaperSize"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportPaperSize", propOrder = {
    "height",
    "width"
})
public class ReportPaperSize {

    @XmlElement(name = "Height")
    protected double height;
    @XmlElement(name = "Width")
    protected double width;

    /**
     * Obtient la valeur de la propriété height.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Définit la valeur de la propriété height.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Obtient la valeur de la propriété width.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * Définit la valeur de la propriété width.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

}
