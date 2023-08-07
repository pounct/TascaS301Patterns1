package command;

public class AccelerarCotxe implements IComanda {

	private Cotxe receptor;

	public AccelerarCotxe(Cotxe receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {

		receptor.accelerar();
	}

}
