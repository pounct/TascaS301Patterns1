package abstract_factory;

public class ESAddress extends Address {

	private static final String COUNTRY = "SPAIN";
	private static final String COMMA = ",";

	@Override
	public String getCountry() {
		return COUNTRY;
	}

	public String getFullAddress() {
		return getStreet() + EOL_STRING + getCity() + COMMA + SPACE + getRegion() + SPACE + getPostalCode() + EOL_STRING
				+ COUNTRY + EOL_STRING;
	}

}
