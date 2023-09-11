package abstract_factory;

public class ESPhoneNumber extends PhoneNumber {

	private static final String COUNTRY_CODE = "34";
	private static final int NUMBER_LENGTH = 9;

	@Override
	public String getCountryCode() {
		return COUNTRY_CODE;
	}

	public void setPhoneNumber(String newNumber) {
		if (newNumber.length() == NUMBER_LENGTH) {
			super.setPhoneNumber(COUNTRY_CODE + newNumber);
		} else {
			System.out.println("PhoneNumber -> length()!=9 Error!!");
		}
	}

}
