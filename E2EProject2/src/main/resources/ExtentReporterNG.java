package resources;

import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


@SuppressWarnings("unused")
public class ExtentReporterNG {
	
	static ExtentReports extent;

	public static ExtentReports getReportObject() {
		
		
		String path = System.getProperty("user.dir")+"/reports/index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Faruk Ayaz");
		return extent;
		
	}


}
