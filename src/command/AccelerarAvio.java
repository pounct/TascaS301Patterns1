package command;

public class AccelerarAvio implements IComanda {

	private Avio receptor;

	public AccelerarAvio(Avio receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {

		receptor.accelerar();
	}

}
