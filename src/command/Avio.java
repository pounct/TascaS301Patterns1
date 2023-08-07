package command;

public class Avio implements IReceptor {

	// Accions del receptor Cotxe
	// cada acció correspon a una ordre invocada per un client
	public void arrencar() {

		System.out.println("Acció arrencar del Avio");
	}

	public void accelerar() {

		System.out.println("Acció accelerar del Avio");
	}

	public void frenar() {

		System.out.println("Acció frenar del Avio");
	}
}
