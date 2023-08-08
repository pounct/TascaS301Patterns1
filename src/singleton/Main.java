package singleton;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Undo undo = Undo.getInstance();

		boolean programOn = true;

		int comptador = 1;

		while (programOn) {

			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println("TascaS301Patterns1");
			System.out.println("----Singleton-----");
			System.out.println("1. executar un comando -->afegir a comandes:");
			System.out.println("2. undo --> anular ultima entrada a comandes:");
			System.out.println("3. llistar les últimes comandes introduïdes:");
			System.out.println("0. fin");
			Byte opcio = sc.nextByte();

			switch (opcio) {
			case 0:
				System.out.println("------------------   fin   ---------------------");
				programOn = false;
				break;
			case 1:
				undo.afegirComanda("comanda" + comptador);
				comptador++;
				break;
			case 2:
				undo.eliminarComanda();
				break;
			case 3:
				undo.llistar();
				break;

			default:
				System.out.println("xifres entre 0 i 3 !!");
				break;
			}
		}
		sc.close();
	}

}
