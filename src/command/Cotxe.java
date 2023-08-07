package command;

public class Cotxe implements IReceptor {

	// Accions del receptor Cotxe
	// cada acció correspon a una ordre invocada per un client
	public void arrencar() {

		System.out.println("Acció arrencar del Cotxe");
	}

	public void accelerar() {

		System.out.println("Acció accelerar del Cotxe");
	}

	public void frenar() {

		System.out.println("Acció frenar del Cotxe");
	}
}
