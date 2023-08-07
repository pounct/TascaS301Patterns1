package command;

public class AccelerarBicicleta implements IComanda {

	private Bicicleta receptor;

	public AccelerarBicicleta(Bicicleta receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {

		receptor.accelerar();
	}

}
