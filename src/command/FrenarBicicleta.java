package command;

public class FrenarBicicleta implements IComanda {

	private Bicicleta receptor;

	public FrenarBicicleta(Bicicleta receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {

		receptor.frenar();
	}
}
