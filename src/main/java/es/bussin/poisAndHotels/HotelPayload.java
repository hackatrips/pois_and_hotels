package es.bussin.poisAndHotels;

public class HotelPayload {

    private long id;
    private String key;
    private String href;
    private String name;
    private String address;
    private double latitude;
    private double longitude;
    private long distance;
    private boolean isWithinBoundary;
    private int starRating;
    private boolean isSelfRated;
    private Double lowestRate;
    private Double highestRate;
    private boolean isGreatValue;
    private long numberOfProviders;
    private long numberOfRates;
	
	public HotelPayload() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public long getDistance() {
		return distance;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}

	public boolean isWithinBoundary() {
		return isWithinBoundary;
	}

	public void setWithinBoundary(boolean isWithinBoundary) {
		this.isWithinBoundary = isWithinBoundary;
	}

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	public boolean isSelfRated() {
		return isSelfRated;
	}

	public void setSelfRated(boolean isSelfRated) {
		this.isSelfRated = isSelfRated;
	}

	public Double getLowestRate() {
		return lowestRate;
	}

	public void setLowestRate(Double lowestRate) {
		this.lowestRate = lowestRate;
	}

	public Double getHighestRate() {
		return highestRate;
	}

	public void setHighestRate(Double highestRate) {
		this.highestRate = highestRate;
	}

	public boolean isGreatValue() {
		return isGreatValue;
	}

	public void setGreatValue(boolean isGreatValue) {
		this.isGreatValue = isGreatValue;
	}

	public long getNumberOfProviders() {
		return numberOfProviders;
	}

	public void setNumberOfProviders(long numberOfProviders) {
		this.numberOfProviders = numberOfProviders;
	}

	public long getNumberOfRates() {
		return numberOfRates;
	}

	public void setNumberOfRates(long numberOfRates) {
		this.numberOfRates = numberOfRates;
	}
	
}
