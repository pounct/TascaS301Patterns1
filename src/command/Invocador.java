package command;

import java.util.HashMap;
import java.util.Map;

public class Invocador {

	// un client pot invocar una comanda

	// colleccio de comandas
	private Map<String, IComanda> comandas = new HashMap<String, IComanda>();

	public void addComanda(String nom, IComanda cmd) {
		comandas.put(nom, cmd);
	}

	public void invocarComanda(String nom) {
		IComanda cmd = comandas.get(nom);
		if (cmd != null)
			cmd.executar();
	}

}
