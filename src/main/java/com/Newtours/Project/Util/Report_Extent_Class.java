package com.Newtours.Project.Util;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;


import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.Newtours.Project.Base.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report_Extent_Class extends BaseClass implements IReporter
{
	public ExtentReports rep;
	
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,String outputDirectory) 
	{
		rep=new ExtentReports(outputDirectory+File.separator+"newtours.html",true);
		for(ISuite suite: suites)
		{
			Map<String, ISuiteResult> res=suite.getResults();
			for(ISuiteResult result:res.values())
			{
				ITestContext context=result.getTestContext();
				
				
			}
		}
		
	}
	
	public Date getTime(long MilliSeconds)
	{
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(MilliSeconds);
			return cal.getTime();
		
	}
	
	public void builNodes(IResultMap tests,LogStatus status)
	{
		ExtentTest test;
		if(tests.size()>0)
		{
			for(ITestResult result:tests.getAllResults())
			{
				test=rep.startTest(result.getMethod().getMethodName());
				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));
				
				for(String group:result.getMethod().getGroups())
				{
					test.assignCategory(group);					
				}
				if(result.getThrowable()!=null)
				{
					test.log(status, result.getThrowable());
				}
				else
				{
					test.log(status, "Tests"+status.toString().toLowerCase()+"ed");
				}
				rep.endTest(test);
				
			}
		}
	}
	

}
