package abstract_factory;

public class USAddress extends Address {

	private static final String COUNTRY = "UNITED STATES";
	private static final String COMMA = ",";

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFullAddress() {
		return getStreet() + EOL_STRING + getCity() + COMMA + SPACE + getRegion() + SPACE + getPostalCode() + EOL_STRING
				+ COUNTRY + EOL_STRING;
	}

}
