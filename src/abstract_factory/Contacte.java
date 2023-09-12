package abstract_factory;

public class Contacte {
	private String nom;
	private Address address;
	private PhoneNumber phoneNumber;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Contacte [nom=" + nom + ", address=" + address.getFullAddress() + ", phoneNumber=" + phoneNumber.getPhoneNumber() + "]";
	}
	

}
