
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReportPaperSize complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� height.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * D�finit la valeur de la propri�t� height.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Obtient la valeur de la propri�t� width.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * D�finit la valeur de la propri�t� width.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

}
