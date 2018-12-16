package com.ninja.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ninja.model.ExchangeData;
import com.ninja.service.ReportingSPI;

@Service
public class ReportingImpl implements ReportingSPI {

	private List<ExchangeData> readDataFromFile(String file) {
		List<ExchangeData> exchangeDataList = new ArrayList<ExchangeData>();
		try {
			// Create an object of filereader
			// class with CSV file as a parameter.
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine(); // Reading header, Ignoring while
											// ((line = br.readLine()) != null
											// && !line.isEmpty()) {
			// we are going to read data line by line
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				ExchangeData exchangeData = new ExchangeData();
				try {
					String[] fields = line.split(",");
					exchangeData.setSource(fields[0]);
					exchangeData.setStock(fields[1]);
					exchangeData.setHighPrice(fields[2]);
					exchangeData.setLowPrice(fields[3]);
					exchangeData.setNoOfShare(fields[4]);
					exchangeData.setCurrentPrice(fields[5]);
					exchangeData.setCostOfPurchase(fields[6]);
					exchangeData.setCurrentPortfolio(fields[7]);
					exchangeData.setPercentageGain(fields[7]);
				} catch (Exception e) {
				}
				exchangeDataList.add(exchangeData);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return exchangeDataList;
	}

	@Override
	public List<ExchangeData> downloadData(String filePath) {
		return readDataFromFile(filePath);
	}

}