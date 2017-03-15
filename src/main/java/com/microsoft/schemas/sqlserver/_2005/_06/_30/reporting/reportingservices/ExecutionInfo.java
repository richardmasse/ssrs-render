
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Classe Java pour ExecutionInfo complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ExecutionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HasSnapshot" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NeedsProcessing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AllowQueryExecution" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CredentialsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ParametersRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExpirationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ExecutionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="NumPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Parameters" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ArrayOfReportParameter" minOccurs="0"/&gt;
 *         &lt;element name="DataSourcePrompts" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ArrayOfDataSourcePrompt" minOccurs="0"/&gt;
 *         &lt;element name="HasDocumentMap" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExecutionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HistoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportPageSettings" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}PageSettings" minOccurs="0"/&gt;
 *         &lt;element name="AutoRefreshInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutionInfo", propOrder = {
    "hasSnapshot",
    "needsProcessing",
    "allowQueryExecution",
    "credentialsRequired",
    "parametersRequired",
    "expirationDateTime",
    "executionDateTime",
    "numPages",
    "parameters",
    "dataSourcePrompts",
    "hasDocumentMap",
    "executionID",
    "reportPath",
    "historyID",
    "reportPageSettings",
    "autoRefreshInterval"
})
@XmlSeeAlso({
    ExecutionInfo2 .class
})
public class ExecutionInfo {

    @XmlElement(name = "HasSnapshot")
    protected boolean hasSnapshot;
    @XmlElement(name = "NeedsProcessing")
    protected boolean needsProcessing;
    @XmlElement(name = "AllowQueryExecution")
    protected boolean allowQueryExecution;
    @XmlElement(name = "CredentialsRequired")
    protected boolean credentialsRequired;
    @XmlElement(name = "ParametersRequired")
    protected boolean parametersRequired;
    @XmlElement(name = "ExpirationDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date expirationDateTime;
    @XmlElement(name = "ExecutionDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date executionDateTime;
    @XmlElement(name = "NumPages")
    protected int numPages;
    @XmlElement(name = "Parameters")
    protected ArrayOfReportParameter parameters;
    @XmlElement(name = "DataSourcePrompts")
    protected ArrayOfDataSourcePrompt dataSourcePrompts;
    @XmlElement(name = "HasDocumentMap")
    protected boolean hasDocumentMap;
    @XmlElement(name = "ExecutionID")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String executionID;
    @XmlElement(name = "ReportPath")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String reportPath;
    @XmlElement(name = "HistoryID")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String historyID;
    @XmlElement(name = "ReportPageSettings")
    protected PageSettings reportPageSettings;
    @XmlElement(name = "AutoRefreshInterval")
    protected int autoRefreshInterval;

    /**
     * Obtient la valeur de la propri�t� hasSnapshot.
     * 
     */
    public boolean isHasSnapshot() {
        return hasSnapshot;
    }

    /**
     * D�finit la valeur de la propri�t� hasSnapshot.
     * 
     */
    public void setHasSnapshot(boolean value) {
        this.hasSnapshot = value;
    }

    /**
     * Obtient la valeur de la propri�t� needsProcessing.
     * 
     */
    public boolean isNeedsProcessing() {
        return needsProcessing;
    }

    /**
     * D�finit la valeur de la propri�t� needsProcessing.
     * 
     */
    public void setNeedsProcessing(boolean value) {
        this.needsProcessing = value;
    }

    /**
     * Obtient la valeur de la propri�t� allowQueryExecution.
     * 
     */
    public boolean isAllowQueryExecution() {
        return allowQueryExecution;
    }

    /**
     * D�finit la valeur de la propri�t� allowQueryExecution.
     * 
     */
    public void setAllowQueryExecution(boolean value) {
        this.allowQueryExecution = value;
    }

    /**
     * Obtient la valeur de la propri�t� credentialsRequired.
     * 
     */
    public boolean isCredentialsRequired() {
        return credentialsRequired;
    }

    /**
     * D�finit la valeur de la propri�t� credentialsRequired.
     * 
     */
    public void setCredentialsRequired(boolean value) {
        this.credentialsRequired = value;
    }

    /**
     * Obtient la valeur de la propri�t� parametersRequired.
     * 
     */
    public boolean isParametersRequired() {
        return parametersRequired;
    }

    /**
     * D�finit la valeur de la propri�t� parametersRequired.
     * 
     */
    public void setParametersRequired(boolean value) {
        this.parametersRequired = value;
    }

    /**
     * Obtient la valeur de la propri�t� expirationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * D�finit la valeur de la propri�t� expirationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDateTime(Date value) {
        this.expirationDateTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� executionDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExecutionDateTime() {
        return executionDateTime;
    }

    /**
     * D�finit la valeur de la propri�t� executionDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionDateTime(Date value) {
        this.executionDateTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� numPages.
     * 
     */
    public int getNumPages() {
        return numPages;
    }

    /**
     * D�finit la valeur de la propri�t� numPages.
     * 
     */
    public void setNumPages(int value) {
        this.numPages = value;
    }

    /**
     * Obtient la valeur de la propri�t� parameters.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReportParameter }
     *     
     */
    public ArrayOfReportParameter getParameters() {
        return parameters;
    }

    /**
     * D�finit la valeur de la propri�t� parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReportParameter }
     *     
     */
    public void setParameters(ArrayOfReportParameter value) {
        this.parameters = value;
    }

    /**
     * Obtient la valeur de la propri�t� dataSourcePrompts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDataSourcePrompt }
     *     
     */
    public ArrayOfDataSourcePrompt getDataSourcePrompts() {
        return dataSourcePrompts;
    }

    /**
     * D�finit la valeur de la propri�t� dataSourcePrompts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDataSourcePrompt }
     *     
     */
    public void setDataSourcePrompts(ArrayOfDataSourcePrompt value) {
        this.dataSourcePrompts = value;
    }

    /**
     * Obtient la valeur de la propri�t� hasDocumentMap.
     * 
     */
    public boolean isHasDocumentMap() {
        return hasDocumentMap;
    }

    /**
     * D�finit la valeur de la propri�t� hasDocumentMap.
     * 
     */
    public void setHasDocumentMap(boolean value) {
        this.hasDocumentMap = value;
    }

    /**
     * Obtient la valeur de la propri�t� executionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionID() {
        return executionID;
    }

    /**
     * D�finit la valeur de la propri�t� executionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionID(String value) {
        this.executionID = value;
    }

    /**
     * Obtient la valeur de la propri�t� reportPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportPath() {
        return reportPath;
    }

    /**
     * D�finit la valeur de la propri�t� reportPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportPath(String value) {
        this.reportPath = value;
    }

    /**
     * Obtient la valeur de la propri�t� historyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryID() {
        return historyID;
    }

    /**
     * D�finit la valeur de la propri�t� historyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryID(String value) {
        this.historyID = value;
    }

    /**
     * Obtient la valeur de la propri�t� reportPageSettings.
     * 
     * @return
     *     possible object is
     *     {@link PageSettings }
     *     
     */
    public PageSettings getReportPageSettings() {
        return reportPageSettings;
    }

    /**
     * D�finit la valeur de la propri�t� reportPageSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link PageSettings }
     *     
     */
    public void setReportPageSettings(PageSettings value) {
        this.reportPageSettings = value;
    }

    /**
     * Obtient la valeur de la propri�t� autoRefreshInterval.
     * 
     */
    public int getAutoRefreshInterval() {
        return autoRefreshInterval;
    }

    /**
     * D�finit la valeur de la propri�t� autoRefreshInterval.
     * 
     */
    public void setAutoRefreshInterval(int value) {
        this.autoRefreshInterval = value;
    }

}
