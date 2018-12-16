package com.ninja.model;

public class ExchangeData {

	private String source;
	private String stock;
	private String highPrice;
	private String lowPrice;
	private String noOfShare;
	private String currentPrice;
	private String costOfPurchase;
	private String currentPortfolio;
	private String percentageGain;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(String highPrice) {
		this.highPrice = highPrice;
	}

	public String getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}

	public String getNoOfShare() {
		return noOfShare;
	}

	public void setNoOfShare(String noOfShare) {
		this.noOfShare = noOfShare;
	}

	public String getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getCostOfPurchase() {
		return costOfPurchase;
	}

	public void setCostOfPurchase(String costOfPurchase) {
		this.costOfPurchase = costOfPurchase;
	}

	public String getCurrentPortfolio() {
		return currentPortfolio;
	}

	public void setCurrentPortfolio(String currentPortfolio) {
		this.currentPortfolio = currentPortfolio;
	}

	public String getPercentageGain() {
		return percentageGain;
	}

	public void setPercentageGain(String percentageGain) {
		this.percentageGain = percentageGain;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((costOfPurchase == null) ? 0 : costOfPurchase.hashCode());
		result = prime * result + ((currentPortfolio == null) ? 0 : currentPortfolio.hashCode());
		result = prime * result + ((currentPrice == null) ? 0 : currentPrice.hashCode());
		result = prime * result + ((highPrice == null) ? 0 : highPrice.hashCode());
		result = prime * result + ((lowPrice == null) ? 0 : lowPrice.hashCode());
		result = prime * result + ((noOfShare == null) ? 0 : noOfShare.hashCode());
		result = prime * result + ((percentageGain == null) ? 0 : percentageGain.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((stock == null) ? 0 : stock.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExchangeData other = (ExchangeData) obj;
		if (costOfPurchase == null) {
			if (other.costOfPurchase != null)
				return false;
		} else if (!costOfPurchase.equals(other.costOfPurchase))
			return false;
		if (currentPortfolio == null) {
			if (other.currentPortfolio != null)
				return false;
		} else if (!currentPortfolio.equals(other.currentPortfolio))
			return false;
		if (currentPrice == null) {
			if (other.currentPrice != null)
				return false;
		} else if (!currentPrice.equals(other.currentPrice))
			return false;
		if (highPrice == null) {
			if (other.highPrice != null)
				return false;
		} else if (!highPrice.equals(other.highPrice))
			return false;
		if (lowPrice == null) {
			if (other.lowPrice != null)
				return false;
		} else if (!lowPrice.equals(other.lowPrice))
			return false;
		if (noOfShare == null) {
			if (other.noOfShare != null)
				return false;
		} else if (!noOfShare.equals(other.noOfShare))
			return false;
		if (percentageGain == null) {
			if (other.percentageGain != null)
				return false;
		} else if (!percentageGain.equals(other.percentageGain))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (stock == null) {
			if (other.stock != null)
				return false;
		} else if (!stock.equals(other.stock))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExchangeData [source=" + source + ", stock=" + stock + ", highPrice=" + highPrice + ", lowPrice="
				+ lowPrice + ", noOfShare=" + noOfShare + ", currentPrice=" + currentPrice + ", costOfPurchase="
				+ costOfPurchase + ", currentPortfolio=" + currentPortfolio + ", percentageGain=" + percentageGain
				+ "]";
	}

}
