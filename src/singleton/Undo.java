package singleton;

import java.util.ArrayList;
import java.util.List;

public class Undo {
	// final ---> no canvia un cop inicialitzat
	private static final Undo undo;

	// bloc static ---> s'executa un cop carregada la classe
	static {
		undo = new Undo();
	}

	// constructor privat ---> no s'instancia des de fora de la classe
	private Undo() {
		System.out.println("Instanciació");
	}

	// recuperar la instància
	public static Undo getInstance() {
		return undo;
	}

	// llista de comandes disponible para undo ////////////

	private List<String> comandes = new ArrayList<String>();

	public void afegirComanda(String comanda) {
		System.out.println("---- " + comanda + " afegit----");
		this.comandes.add(0, comanda);
	}

	public void eliminarComanda() {
		String comanda = this.comandes.get(0);
		System.out.println("---------- Undo " + comanda + "----------");
		this.comandes.remove(0);// remove(comanda)
	}

	public void llistar() {
		System.out.println("--- llista de les últimes (deu) comandes --");
		if (comandes.size() >= 10) {
			for (int i = 0; i < 10; i++) {
				System.out.println(comandes.get(i));
			}

		} else {
			comandes.forEach(System.out::println);
		}

	}

}
