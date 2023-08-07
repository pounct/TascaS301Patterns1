package command;

public class Vaixell implements IReceptor {

	// Accions del receptor Cotxe
	// cada acció correspon a una ordre invocada per un client
	public void arrencar() {

		System.out.println("Acció arrencar del Vaixell");
	}

	public void accelerar() {

		System.out.println("Acció accelerar del Vaixell");
	}

	public void frenar() {

		System.out.println("Acció frenar del Vaixell");
	}
}
