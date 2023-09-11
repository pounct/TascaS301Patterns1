package abstract_factory;

public class USAddressPhoneFactory implements AddressPhoneFactory{

	@Override
	public Address createAddress() {
		return new USAddress();
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		return new USPhoneNumber();

	}

}
