package abstract_factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// List<String> contactes = new ArrayList<String>();
		Map<String, AddressPhoneFactory> contactes = new HashMap<String, AddressPhoneFactory>();

		boolean programOn = true;
		ArrayList<String> comandes = new ArrayList<>();
		ArrayList<String> nomContactes = new ArrayList<>();

		int comptador = 1;

		while (programOn) {
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println("-------- TascaS301Patterns1 ----------------------");
			System.out.println("--------- Abstract Factory -----------------------");
			System.out.println("--------------------------------------------------");
			System.out.println("1. nou contacte US.");
			System.out.println("2. nou contacte ES.");
			System.out.println("3. llistar les últimes comandes introduïdes:");
			System.out.println("0. fin");
		}

	}

	public void nouContacteUS() {
		System.out.println(" Nou contacte US.");
		System.out.println(" Nom Contacte :");
		AddressPhoneFactory addressPhoneFactory = new USAddressPhoneFactory();
		Address adress = addressPhoneFactory.createAddress();
		//getStreet 
		System.out.println(" Street :");
		//getCity 
		System.out.println(" City  :");
		//getRegion  
		System.out.println(" Region :");
		//getPostalCode  
		System.out.println(" PostalCode :");
		//getCOUNTRY 
		System.out.println(" COUNTRY : ");
		
		System.out.println(" Address complete");
		System.out.println(adress.getFullAddress());
		
		PhoneNumber phoneNumber = addressPhoneFactory.createPhoneNumber();
		// getPhoneNumber
		System.out.println(" Phone Number : ");
		phoneNumber.setPhoneNumber(null);

	}

//	public void entrarNombre() {
//
//	}
//
//	public void entrarAddress() {
//
//	}
//
//	public void entrarPhone() {
//
//	}

}
