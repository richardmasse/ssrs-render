
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfDataSourcePrompt complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDataSourcePrompt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSourcePrompt" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}DataSourcePrompt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDataSourcePrompt", propOrder = {
    "dataSourcePrompt"
})
public class ArrayOfDataSourcePrompt {

    @XmlElement(name = "DataSourcePrompt", nillable = true)
    protected List<DataSourcePrompt> dataSourcePrompt;

    /**
     * Gets the value of the dataSourcePrompt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSourcePrompt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSourcePrompt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSourcePrompt }
     * 
     * 
     */
    public List<DataSourcePrompt> getDataSourcePrompt() {
        if (dataSourcePrompt == null) {
            dataSourcePrompt = new ArrayList<DataSourcePrompt>();
        }
        return this.dataSourcePrompt;
    }

}
