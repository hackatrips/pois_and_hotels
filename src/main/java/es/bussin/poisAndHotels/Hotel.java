package es.bussin.poisAndHotels;

import java.util.List;

public class Hotel {
	  private boolean isComplete;
	  private int searchTime;
	  private int totalResults;
	  private int totalAvailableResults;
	  private int totalFilteredResults;
	  private String currencyCode;
	  private String languageCode;
	  private Double lowestTotalRate;
	  private Double highestTotalRate;
	  private Double postFilterLowestTotalRate;
	  private Double postFilterHighestTotalRate;
	  private List<HotelPayload> results;
	  
	  public Hotel() {}
	  
	  public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public int getSearchTime() {
		return searchTime;
	}

	public void setSearchTime(int searchTime) {
		this.searchTime = searchTime;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}

	public int getTotalAvailableResults() {
		return totalAvailableResults;
	}

	public void setTotalAvailableResults(int totalAvailableResults) {
		this.totalAvailableResults = totalAvailableResults;
	}

	public int getTotalFilteredResults() {
		return totalFilteredResults;
	}

	public void setTotalFilteredResults(int totalFilteredResults) {
		this.totalFilteredResults = totalFilteredResults;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public Double getLowestTotalRate() {
		return lowestTotalRate;
	}

	public void setLowestTotalRate(Double lowestTotalRate) {
		this.lowestTotalRate = lowestTotalRate;
	}

	public Double getHighestTotalRate() {
		return highestTotalRate;
	}

	public void setHighestTotalRate(Double highestTotalRate) {
		this.highestTotalRate = highestTotalRate;
	}

	public Double getPostFilterLowestTotalRate() {
		return postFilterLowestTotalRate;
	}

	public void setPostFilterLowestTotalRate(Double postFilterLowestTotalRate) {
		this.postFilterLowestTotalRate = postFilterLowestTotalRate;
	}

	public Double getPostFilterHighestTotalRate() {
		return postFilterHighestTotalRate;
	}

	public void setPostFilterHighestTotalRate(Double postFilterHighestTotalRate) {
		this.postFilterHighestTotalRate = postFilterHighestTotalRate;
	}

	public List<HotelPayload> getResults() {
		return results;
	}

	public void setResults(List<HotelPayload> results) {
		this.results = results;
	}
	
	
}
