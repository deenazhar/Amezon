package com.reports;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generatingJvmReport(String JsonFile) {
		
		String path = System.getProperty("user.dir");
		
		File file = new File(path + "\\target");
		
		Configuration configuration = new Configuration(file, "AmazonAutomation");
		
		configuration.addClassifications("Browser","Chrome");
		configuration.addClassifications("Amazon","File");
		configuration.addClassifications("10","User");
		configuration.addClassifications("project","10");
		
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(JsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		builder.generateReports();
		
		
		
		
		
		
		
		
		
	}

}
