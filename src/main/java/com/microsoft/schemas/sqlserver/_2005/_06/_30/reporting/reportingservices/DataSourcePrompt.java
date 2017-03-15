
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Classe Java pour DataSourcePrompt complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DataSourcePrompt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataSourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSourcePrompt", propOrder = {
    "name",
    "dataSourceID",
    "prompt"
})
public class DataSourcePrompt {

    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String name;
    @XmlElement(name = "DataSourceID")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String dataSourceID;
    @XmlElement(name = "Prompt")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String prompt;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété dataSourceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceID() {
        return dataSourceID;
    }

    /**
     * Définit la valeur de la propriété dataSourceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceID(String value) {
        this.dataSourceID = value;
    }

    /**
     * Obtient la valeur de la propriété prompt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Définit la valeur de la propriété prompt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

}
