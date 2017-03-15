
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
 *         &lt;element name="StartPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EndPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FindValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "startPage",
    "endPage",
    "findValue"
})
@XmlRootElement(name = "FindString")
public class FindString {

    @XmlElement(name = "StartPage")
    protected int startPage;
    @XmlElement(name = "EndPage")
    protected int endPage;
    @XmlElement(name = "FindValue")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String findValue;

    /**
     * Obtient la valeur de la propriété startPage.
     * 
     */
    public int getStartPage() {
        return startPage;
    }

    /**
     * Définit la valeur de la propriété startPage.
     * 
     */
    public void setStartPage(int value) {
        this.startPage = value;
    }

    /**
     * Obtient la valeur de la propriété endPage.
     * 
     */
    public int getEndPage() {
        return endPage;
    }

    /**
     * Définit la valeur de la propriété endPage.
     * 
     */
    public void setEndPage(int value) {
        this.endPage = value;
    }

    /**
     * Obtient la valeur de la propriété findValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindValue() {
        return findValue;
    }

    /**
     * Définit la valeur de la propriété findValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindValue(String value) {
        this.findValue = value;
    }

}
