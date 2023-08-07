package abstract_factory;

public interface AddressPhoneFactory {
	
	public Address createAddress();

	public PhoneNumber createPhoneNumber();

}
