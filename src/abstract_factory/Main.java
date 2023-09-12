package abstract_factory;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	static ArrayList<Contacte> contactes = new ArrayList<Contacte>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean programOn = true;
		Byte opcio;
		while (programOn) {
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println("-------- TascaS301Patterns1 ----------------------");
			System.out.println("--------- Abstract Factory -----------------------");
			System.out.println("--------------------------------------------------");
			System.out.println("1. nou contacte US.");
			System.out.println("2. nou contacte ES.");
			System.out.println("3. lista contactes.");
			System.out.println("0. fin");
			opcio = sc.nextByte();
			sc.nextLine();

			switch (opcio) {
			case 1:
				nouContacteUS();
				break;
			case 2:
				nouContacteES();
				break;
			case 3:
				listaContactes();
				break;
			case 0:
				programOn = false;
				System.out.println("      Fin de programe.");
				break;

			default:
				break;
			}
		}
		sc.close();
	}

	public static void listaContactes() {
		contactes.forEach(System.out::println);
	}

	public static void nouContacteUS() {
		System.out.println(" Nou contacte US.");
		System.out.println(" Nom Contacte :");
		String nomContacte = sc.nextLine();
		AddressPhoneFactory addressPhoneFactory = new USAddressPhoneFactory();
		Address adress = addressPhoneFactory.createAddress();
		// getStreet
		System.out.println(" Street :");
		adress.setStreet(sc.nextLine());
		// getCity
		System.out.println(" City  :");
		adress.setCity(sc.nextLine());
		// getRegion
		System.out.println(" Region :");
		adress.setRegion(sc.nextLine());
		// getPostalCode
		System.out.println(" PostalCode :");
		adress.setPostalCode(sc.nextLine());
		// getCOUNTRY
		System.out.println(" COUNTRY : " + adress.getCountry());

		System.out.println(" Address complete");
		System.out.println(adress.getFullAddress());

		PhoneNumber phoneNumber = addressPhoneFactory.createPhoneNumber();
		// getPhoneNumber
		System.out.println(" Phone Number : ");
		phoneNumber.setPhoneNumber(sc.nextLine());
		Contacte contacte = new Contacte();
		contacte.setNom(nomContacte);
		contacte.setAddress(adress);
		contacte.setPhoneNumber(phoneNumber);

		contactes.add(contacte);

	}

	public static void nouContacteES() {
		System.out.println(" Nou contacte ES.");
		System.out.println(" Nom Contacte :");
		String nomContacte = sc.nextLine();
		AddressPhoneFactory addressPhoneFactory = new ESAddressPhoneFactory();
		Address adress = addressPhoneFactory.createAddress();
		// getStreet
		System.out.println(" Street :");
		adress.setStreet(sc.nextLine());
		// getCity
		System.out.println(" City  :");
		adress.setCity(sc.nextLine());
		// getRegion
		System.out.println(" Region :");
		adress.setRegion(sc.nextLine());
		// getPostalCode
		System.out.println(" PostalCode :");
		adress.setPostalCode(sc.nextLine());
		// getCOUNTRY
		System.out.println(" COUNTRY : " + adress.getCountry());

		System.out.println(" Address complete");
		System.out.println(adress.getFullAddress());

		PhoneNumber phoneNumber = addressPhoneFactory.createPhoneNumber();
		// getPhoneNumber
		System.out.println(" Phone Number : ");
		phoneNumber.setPhoneNumber(sc.nextLine());

		Contacte contacte = new Contacte();
		contacte.setNom(nomContacte);
		contacte.setAddress(adress);
		contacte.setPhoneNumber(phoneNumber);
		contactes.add(contacte);
	}

}
