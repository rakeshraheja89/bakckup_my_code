package com.ninja.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ninja.model.ExchangeData;
import com.ninja.service.ReportingSPI;

@Controller
public class ReportingController {

	@Autowired
	ReportingSPI reportingSPI;

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello User ! application is running";
	
	@Value("${filePath}")
	private String filePath;

	@RequestMapping("/test")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/download")
	public Object displayData(Map<String, Object> model) {
		List<ExchangeData> data = reportingSPI.downloadData(filePath);
		model.put("data", data);
		return model;
	}

}