package abstract_factory;

public class ESAddressPhoneFactory implements AddressPhoneFactory{

	@Override
	public Address createAddress() {
		return new ESAddress();
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		return new ESPhoneNumber();

	}

}
