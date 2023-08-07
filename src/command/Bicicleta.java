package command;

public class Bicicleta implements IReceptor {

	// Accions del receptor Cotxe
	// cada acció correspon a una ordre invocada per un client
	public void arrencar() {

		System.out.println("Acció arrencar de la Bicicleta");
	}

	public void accelerar() {

		System.out.println("Acció accelerar de la Bicicleta");
	}

	public void frenar() {

		System.out.println("Acció frenar de la Bicicleta");
	}
}
