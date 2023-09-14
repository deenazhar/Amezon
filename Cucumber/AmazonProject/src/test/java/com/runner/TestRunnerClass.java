package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@amazonLogin"),stepNotifications=true,dryRun=false,plugin= {"pretty", "json:target\\output.json"},monochrome=true,features= "src\\test\\resources",glue="com.stepdefinition")


public class TestRunnerClass
{
	
	@AfterClass

	public static void afterclass() {

		String path = System.getProperty("user.dir");
		 
		JvmReport.generatingJvmReport(path + "\\target\\output.json");
	
	
} 

}