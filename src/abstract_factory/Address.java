package abstract_factory;

public abstract class Address {
	private String street;
	private String city;
	private String region;
	private String postalCode;

	public static final String EOL_STRING = System.getProperty("line.separator");
	public static final String SPACE = " ";

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getRegion() {
		return region;
	}

	public abstract String getCountry();
	
	public void setStreet(String newStreet) {
		street = newStreet;
	}

	public void setCity(String newCity) {
		city = newCity;
	}

	public void setRegion(String newRegion) {
		region = newRegion;
	}

	public void setPostalCode(String newPostalCode) {
		postalCode = newPostalCode;
	}
	
	public abstract String getFullAddress();

}
