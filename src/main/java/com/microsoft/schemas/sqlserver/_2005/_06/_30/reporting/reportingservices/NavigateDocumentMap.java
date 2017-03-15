
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
 *         &lt;element name="DocMapID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "docMapID"
})
@XmlRootElement(name = "NavigateDocumentMap")
public class NavigateDocumentMap {

    @XmlElement(name = "DocMapID")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String docMapID;

    /**
     * Obtient la valeur de la propri�t� docMapID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocMapID() {
        return docMapID;
    }

    /**
     * D�finit la valeur de la propri�t� docMapID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocMapID(String value) {
        this.docMapID = value;
    }

}
