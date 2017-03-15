
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="executionInfo" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ExecutionInfo2" minOccurs="0"/&gt;
 *         &lt;element name="warnings" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ArrayOfWarning" minOccurs="0"/&gt;
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
    "executionInfo",
    "warnings"
})
@XmlRootElement(name = "LoadReportDefinition2Response")
public class LoadReportDefinition2Response {

    protected ExecutionInfo2 executionInfo;
    protected ArrayOfWarning warnings;

    /**
     * Obtient la valeur de la propriété executionInfo.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionInfo2 }
     *     
     */
    public ExecutionInfo2 getExecutionInfo() {
        return executionInfo;
    }

    /**
     * Définit la valeur de la propriété executionInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionInfo2 }
     *     
     */
    public void setExecutionInfo(ExecutionInfo2 value) {
        this.executionInfo = value;
    }

    /**
     * Obtient la valeur de la propriété warnings.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getWarnings() {
        return warnings;
    }

    /**
     * Définit la valeur de la propriété warnings.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setWarnings(ArrayOfWarning value) {
        this.warnings = value;
    }

}
