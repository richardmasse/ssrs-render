
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReportMargins complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReportMargins"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Top" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Bottom" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Left" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Right" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportMargins", propOrder = {
    "top",
    "bottom",
    "left",
    "right"
})
public class ReportMargins {

    @XmlElement(name = "Top")
    protected double top;
    @XmlElement(name = "Bottom")
    protected double bottom;
    @XmlElement(name = "Left")
    protected double left;
    @XmlElement(name = "Right")
    protected double right;

    /**
     * Obtient la valeur de la propriété top.
     * 
     */
    public double getTop() {
        return top;
    }

    /**
     * Définit la valeur de la propriété top.
     * 
     */
    public void setTop(double value) {
        this.top = value;
    }

    /**
     * Obtient la valeur de la propriété bottom.
     * 
     */
    public double getBottom() {
        return bottom;
    }

    /**
     * Définit la valeur de la propriété bottom.
     * 
     */
    public void setBottom(double value) {
        this.bottom = value;
    }

    /**
     * Obtient la valeur de la propriété left.
     * 
     */
    public double getLeft() {
        return left;
    }

    /**
     * Définit la valeur de la propriété left.
     * 
     */
    public void setLeft(double value) {
        this.left = value;
    }

    /**
     * Obtient la valeur de la propriété right.
     * 
     */
    public double getRight() {
        return right;
    }

    /**
     * Définit la valeur de la propriété right.
     * 
     */
    public void setRight(double value) {
        this.right = value;
    }

}
