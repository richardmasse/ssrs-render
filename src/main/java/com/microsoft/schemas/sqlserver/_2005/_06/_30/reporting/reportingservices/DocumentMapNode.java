
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Classe Java pour DocumentMapNode complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentMapNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Children" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ArrayOfDocumentMapNode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentMapNode", propOrder = {
    "label",
    "uniqueName",
    "children"
})
public class DocumentMapNode {

    @XmlElement(name = "Label")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String label;
    @XmlElement(name = "UniqueName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String uniqueName;
    @XmlElement(name = "Children")
    protected ArrayOfDocumentMapNode children;

    /**
     * Obtient la valeur de la propriété label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Définit la valeur de la propriété label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtient la valeur de la propriété uniqueName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueName() {
        return uniqueName;
    }

    /**
     * Définit la valeur de la propriété uniqueName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueName(String value) {
        this.uniqueName = value;
    }

    /**
     * Obtient la valeur de la propriété children.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentMapNode }
     *     
     */
    public ArrayOfDocumentMapNode getChildren() {
        return children;
    }

    /**
     * Définit la valeur de la propriété children.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentMapNode }
     *     
     */
    public void setChildren(ArrayOfDocumentMapNode value) {
        this.children = value;
    }

}
