package com.ninja.service;

import java.util.List;

import com.ninja.model.ExchangeData;

public interface ReportingSPI {

	public List<ExchangeData> downloadData(String filePath);

}
