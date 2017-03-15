package com.masse.ssrs;

import java.net.URL;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ArrayOfParameterValue;
import com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ArrayOfString;
import com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ArrayOfWarning;
import com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionHeader;
import com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo;
import com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterValue;
import com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionService;
import com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceSoap;
import com.sun.xml.ws.developer.WSBindingProvider;

public class ReportingServices {

	public static Holder<byte[]> getReport(
				String format, 
				String serverUrl, 
				String reportPath,
				String language,
				Map<String, String> parameters) throws Exception 
	{
	
        // Render arguments
		Holder<byte[]> result = new Holder<byte[]>();
        String historyID = null;
        String devInfo = "<DeviceInfo><OutputFormat>" + format + "</OutputFormat></DeviceInfo>";
        Holder<String> encoding = new Holder<String>();
        Holder<String> mimeType = new Holder<String>();
        Holder<String> extension = new Holder<String>();
        Holder<ArrayOfWarning> warnings = new Holder<ArrayOfWarning>();
        Holder<ArrayOfString> streamIDs = new Holder<ArrayOfString>();

        
        ReportExecutionService rs = new ReportExecutionService(new URL(serverUrl));
        ReportExecutionServiceSoap rss = rs.getReportExecutionServiceSoap();

        // Load report
        ExecutionInfo execInfo = rss.loadReport(reportPath, historyID);
        
        // get SesssionID
        String SessionId = execInfo.getExecutionID();
        ExecutionHeader executionHeader = new ExecutionHeader();
        executionHeader.setExecutionID(SessionId);

        // Set SessionID into Header
        BindingProvider bp = (BindingProvider)rss;        
        bp.getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
        ((WSBindingProvider)rss).setOutboundHeaders(executionHeader);
        
        // Creation parameters list
        ArrayOfParameterValue apv = new ArrayOfParameterValue();
        
        for (Map.Entry<String, String> entry : parameters.entrySet())
        {
        	
        	ParameterValue p = new ParameterValue();
        	p.setName(entry.getKey());
        	p.setValue(entry.getValue());
        	
        	apv.getParameterValue().add(p);
        }
        rss.setExecutionParameters(apv, language);

        // Render
        rss.render(format, devInfo, result, extension, mimeType, encoding, warnings, streamIDs);

        return result;
	}
}
