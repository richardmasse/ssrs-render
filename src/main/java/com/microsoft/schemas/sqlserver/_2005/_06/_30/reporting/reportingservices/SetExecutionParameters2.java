
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
 *         &lt;element name="Parameters" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ArrayOfParameterValue" minOccurs="0"/&gt;
 *         &lt;element name="ParameterLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "parameters",
    "parameterLanguage"
})
@XmlRootElement(name = "SetExecutionParameters2")
public class SetExecutionParameters2 {

    @XmlElement(name = "Parameters")
    protected ArrayOfParameterValue parameters;
    @XmlElement(name = "ParameterLanguage")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String parameterLanguage;

    /**
     * Obtient la valeur de la propriété parameters.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParameterValue }
     *     
     */
    public ArrayOfParameterValue getParameters() {
        return parameters;
    }

    /**
     * Définit la valeur de la propriété parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParameterValue }
     *     
     */
    public void setParameters(ArrayOfParameterValue value) {
        this.parameters = value;
    }

    /**
     * Obtient la valeur de la propriété parameterLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterLanguage() {
        return parameterLanguage;
    }

    /**
     * Définit la valeur de la propriété parameterLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterLanguage(String value) {
        this.parameterLanguage = value;
    }

}
