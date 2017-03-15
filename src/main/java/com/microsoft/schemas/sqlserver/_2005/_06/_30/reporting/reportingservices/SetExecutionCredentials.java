
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Credentials" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ArrayOfDataSourceCredentials" minOccurs="0"/&gt;
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
    "credentials"
})
@XmlRootElement(name = "SetExecutionCredentials")
public class SetExecutionCredentials {

    @XmlElement(name = "Credentials")
    protected ArrayOfDataSourceCredentials credentials;

    /**
     * Obtient la valeur de la propriété credentials.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDataSourceCredentials }
     *     
     */
    public ArrayOfDataSourceCredentials getCredentials() {
        return credentials;
    }

    /**
     * Définit la valeur de la propriété credentials.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDataSourceCredentials }
     *     
     */
    public void setCredentials(ArrayOfDataSourceCredentials value) {
        this.credentials = value;
    }

}
