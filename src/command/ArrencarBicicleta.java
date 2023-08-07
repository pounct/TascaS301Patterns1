package command;

public class ArrencarBicicleta implements IComanda {

	private Bicicleta receptor;

	public ArrencarBicicleta(Bicicleta receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {
		receptor.arrencar();

	}

}
