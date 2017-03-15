
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="executionInfo" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ExecutionInfo" minOccurs="0"/&gt;
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
    "executionInfo"
})
@XmlRootElement(name = "SetExecutionParametersResponse")
public class SetExecutionParametersResponse {

    protected ExecutionInfo executionInfo;

    /**
     * Obtient la valeur de la propri�t� executionInfo.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionInfo }
     *     
     */
    public ExecutionInfo getExecutionInfo() {
        return executionInfo;
    }

    /**
     * D�finit la valeur de la propri�t� executionInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionInfo }
     *     
     */
    public void setExecutionInfo(ExecutionInfo value) {
        this.executionInfo = value;
    }

}
