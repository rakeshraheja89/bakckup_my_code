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
	private String message = "version deployed is : 13.0.21";

	@Value("${filePath}")
	private String filePath;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "application version is 13.0.21");
		return "welcome";
	}

	@RequestMapping("/view")
	public Object displayData(Map<String, Object> model) {
		System.out.println("file path is : "+filePath);
		List<ExchangeData> data = reportingSPI.downloadData(filePath);
		model.put("ExchangeData", data);
		return "view" ;
	}

}
