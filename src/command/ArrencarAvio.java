package command;

public class ArrencarAvio implements IComanda {

	private Avio receptor;

	public ArrencarAvio(Avio receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {
		receptor.arrencar();

	}

}
