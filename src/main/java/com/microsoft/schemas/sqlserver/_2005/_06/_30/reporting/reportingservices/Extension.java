
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Classe Java pour Extension complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Extension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtensionType" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ExtensionTypeEnum"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalizedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsModelGenerationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extension", propOrder = {
    "extensionType",
    "name",
    "localizedName",
    "visible",
    "isModelGenerationSupported"
})
public class Extension {

    @XmlElement(name = "ExtensionType", required = true)
    @XmlSchemaType(name = "string")
    protected ExtensionTypeEnum extensionType;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String name;
    @XmlElement(name = "LocalizedName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String localizedName;
    @XmlElement(name = "Visible")
    protected boolean visible;
    @XmlElement(name = "IsModelGenerationSupported")
    protected boolean isModelGenerationSupported;

    /**
     * Obtient la valeur de la propriété extensionType.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionTypeEnum }
     *     
     */
    public ExtensionTypeEnum getExtensionType() {
        return extensionType;
    }

    /**
     * Définit la valeur de la propriété extensionType.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionTypeEnum }
     *     
     */
    public void setExtensionType(ExtensionTypeEnum value) {
        this.extensionType = value;
    }

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
     * Obtient la valeur de la propriété localizedName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizedName() {
        return localizedName;
    }

    /**
     * Définit la valeur de la propriété localizedName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizedName(String value) {
        this.localizedName = value;
    }

    /**
     * Obtient la valeur de la propriété visible.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Définit la valeur de la propriété visible.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

    /**
     * Obtient la valeur de la propriété isModelGenerationSupported.
     * 
     */
    public boolean isIsModelGenerationSupported() {
        return isModelGenerationSupported;
    }

    /**
     * Définit la valeur de la propriété isModelGenerationSupported.
     * 
     */
    public void setIsModelGenerationSupported(boolean value) {
        this.isModelGenerationSupported = value;
    }

}
