import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.ws.Holder;

import com.masse.ssrs.ReportingServices;

public class RenderTest {

	public static void main(String[] args) throws IOException {
		
		Map<String, String> parameters = new HashMap<String, String>();
		
		parameters.put("P1", "1");
		parameters.put("P1", "1");
		parameters.put("P1", "1");
		
		try {
			Holder<byte[]> ret = ReportingServices.getReport(
					"EXCEL",
					"http://..../ReportServer/ReportExecution2005.asmx",
					"/xxxx/yyyyy",
					"fr-fr",
					parameters);
			
			FileOutputStream fos = new FileOutputStream(new File("C:\\temp\\excel.xls"));

			fos.write(ret.value);
			
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
