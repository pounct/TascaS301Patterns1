package abstract_factory;

public class ESPhoneNumber extends PhoneNumber {

	private static final String COUNTRY_CODE = "01";
	private static final int NUMBER_LENGTH = 10;

	@Override
	public String getCountryCode() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPhoneNumber(String newNumber) {
		if (newNumber.length() == NUMBER_LENGTH) {
			super.setPhoneNumber(newNumber);
		}
	}

}
