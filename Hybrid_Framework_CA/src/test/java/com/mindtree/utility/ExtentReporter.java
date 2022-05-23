package com.mindtree.utility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReporter {
	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator() 
	{
		String reportPath=System.getProperty("user.dir")+"\\ reports\\index.html";
		ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
		spark.config().setReportName("Selenium Testing Results");
		spark.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		return extent;
	}
}
//srinivas