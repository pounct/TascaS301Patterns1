package command;

public class FrenarCotxe implements IComanda {

	private Cotxe receptor;

	public FrenarCotxe(Cotxe receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {

		receptor.frenar();
	}

}
