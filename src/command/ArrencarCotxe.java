package command;

public class ArrencarCotxe implements IComanda {

	private Cotxe receptor;

	public ArrencarCotxe(Cotxe receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {
		receptor.arrencar();

	}

}
