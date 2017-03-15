
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Classe Java pour ReportParameter complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReportParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ParameterTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="Nullable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowBlank" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MultiValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QueryParameter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PromptUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Dependencies" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ArrayOfString1" minOccurs="0"/&gt;
 *         &lt;element name="ValidValuesQueryBased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ValidValues" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ArrayOfValidValue" minOccurs="0"/&gt;
 *         &lt;element name="DefaultValuesQueryBased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultValues" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ArrayOfString2" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ParameterStateEnum" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportParameter", propOrder = {
    "name",
    "type",
    "nullable",
    "allowBlank",
    "multiValue",
    "queryParameter",
    "prompt",
    "promptUser",
    "dependencies",
    "validValuesQueryBased",
    "validValues",
    "defaultValuesQueryBased",
    "defaultValues",
    "state",
    "errorMessage"
})
public class ReportParameter {

    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String name;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected ParameterTypeEnum type;
    @XmlElement(name = "Nullable")
    protected Boolean nullable;
    @XmlElement(name = "AllowBlank")
    protected Boolean allowBlank;
    @XmlElement(name = "MultiValue")
    protected Boolean multiValue;
    @XmlElement(name = "QueryParameter")
    protected Boolean queryParameter;
    @XmlElement(name = "Prompt")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String prompt;
    @XmlElement(name = "PromptUser")
    protected Boolean promptUser;
    @XmlElement(name = "Dependencies")
    protected ArrayOfString1 dependencies;
    @XmlElement(name = "ValidValuesQueryBased")
    protected Boolean validValuesQueryBased;
    @XmlElement(name = "ValidValues")
    protected ArrayOfValidValue validValues;
    @XmlElement(name = "DefaultValuesQueryBased")
    protected Boolean defaultValuesQueryBased;
    @XmlElement(name = "DefaultValues")
    protected ArrayOfString2 defaultValues;
    @XmlElement(name = "State")
    @XmlSchemaType(name = "string")
    protected ParameterStateEnum state;
    @XmlElement(name = "ErrorMessage")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String errorMessage;

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
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link ParameterTypeEnum }
     *     
     */
    public ParameterTypeEnum getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterTypeEnum }
     *     
     */
    public void setType(ParameterTypeEnum value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété nullable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNullable() {
        return nullable;
    }

    /**
     * Définit la valeur de la propriété nullable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNullable(Boolean value) {
        this.nullable = value;
    }

    /**
     * Obtient la valeur de la propriété allowBlank.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowBlank() {
        return allowBlank;
    }

    /**
     * Définit la valeur de la propriété allowBlank.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowBlank(Boolean value) {
        this.allowBlank = value;
    }

    /**
     * Obtient la valeur de la propriété multiValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiValue() {
        return multiValue;
    }

    /**
     * Définit la valeur de la propriété multiValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiValue(Boolean value) {
        this.multiValue = value;
    }

    /**
     * Obtient la valeur de la propriété queryParameter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryParameter() {
        return queryParameter;
    }

    /**
     * Définit la valeur de la propriété queryParameter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryParameter(Boolean value) {
        this.queryParameter = value;
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

    /**
     * Obtient la valeur de la propriété promptUser.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptUser() {
        return promptUser;
    }

    /**
     * Définit la valeur de la propriété promptUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptUser(Boolean value) {
        this.promptUser = value;
    }

    /**
     * Obtient la valeur de la propriété dependencies.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getDependencies() {
        return dependencies;
    }

    /**
     * Définit la valeur de la propriété dependencies.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setDependencies(ArrayOfString1 value) {
        this.dependencies = value;
    }

    /**
     * Obtient la valeur de la propriété validValuesQueryBased.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidValuesQueryBased() {
        return validValuesQueryBased;
    }

    /**
     * Définit la valeur de la propriété validValuesQueryBased.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidValuesQueryBased(Boolean value) {
        this.validValuesQueryBased = value;
    }

    /**
     * Obtient la valeur de la propriété validValues.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidValue }
     *     
     */
    public ArrayOfValidValue getValidValues() {
        return validValues;
    }

    /**
     * Définit la valeur de la propriété validValues.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidValue }
     *     
     */
    public void setValidValues(ArrayOfValidValue value) {
        this.validValues = value;
    }

    /**
     * Obtient la valeur de la propriété defaultValuesQueryBased.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultValuesQueryBased() {
        return defaultValuesQueryBased;
    }

    /**
     * Définit la valeur de la propriété defaultValuesQueryBased.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultValuesQueryBased(Boolean value) {
        this.defaultValuesQueryBased = value;
    }

    /**
     * Obtient la valeur de la propriété defaultValues.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getDefaultValues() {
        return defaultValues;
    }

    /**
     * Définit la valeur de la propriété defaultValues.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setDefaultValues(ArrayOfString2 value) {
        this.defaultValues = value;
    }

    /**
     * Obtient la valeur de la propriété state.
     * 
     * @return
     *     possible object is
     *     {@link ParameterStateEnum }
     *     
     */
    public ParameterStateEnum getState() {
        return state;
    }

    /**
     * Définit la valeur de la propriété state.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterStateEnum }
     *     
     */
    public void setState(ParameterStateEnum value) {
        this.state = value;
    }

    /**
     * Obtient la valeur de la propriété errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Définit la valeur de la propriété errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
