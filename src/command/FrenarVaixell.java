package command;

public class FrenarVaixell implements IComanda {

	private Vaixell receptor;

	public FrenarVaixell(Vaixell receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {
		receptor.frenar();
	}

}
