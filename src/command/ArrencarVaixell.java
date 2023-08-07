package command;

public class ArrencarVaixell implements IComanda {

	private Vaixell receptor;

	public ArrencarVaixell(Vaixell receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {
		receptor.arrencar();

	}

}
