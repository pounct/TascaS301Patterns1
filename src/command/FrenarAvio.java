package command;

public class FrenarAvio implements IComanda {

	private Avio receptor;

	public FrenarAvio(Avio receptor) {
		this.receptor = receptor;
	}

	@Override
	public void executar() {

		receptor.frenar();
	}

}
