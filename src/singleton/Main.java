package singleton;

public class Main {

	public static void main(String[] args) {


		System.out.println("TascaS301Patterns1");
        Undo undo = Undo.getInstance();
        for (int i = 0; i <20 ; i++) {
            undo.afegirComanda("comanda "+i);
        }
        undo.llistar();

	}

}
