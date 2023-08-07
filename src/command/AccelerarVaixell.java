package command;

public class AccelerarVaixell implements IComanda {

	private Vaixell receptor;

	public AccelerarVaixell(Vaixell receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {

		receptor.accelerar();
	}

}
