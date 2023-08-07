package command;

public class Main {

	public static void main(String[] args) {

		// receptors de comandes
		Cotxe cotxe = new Cotxe();
		Bicicleta bicicleta = new Bicicleta();
		Avio avio = new Avio();
		Vaixell vaixell = new Vaixell();

		// Comandes disponibles
		IComanda arrencarCotxe = new ArrencarCotxe(cotxe);
		IComanda arrencarAvio = new ArrencarAvio(avio);
		IComanda arrencarBicicleta = new ArrencarBicicleta(bicicleta);
		IComanda arrencarVaixell = new ArrencarVaixell(vaixell);

		IComanda accelerarCotxe = new AccelerarCotxe(cotxe);
		IComanda accelerarAvio = new AccelerarAvio(avio);
		IComanda accelerarBicicleta = new AccelerarBicicleta(bicicleta);
		IComanda accelerarVaixell = new AccelerarVaixell(vaixell);

		IComanda frenarCotxe = new FrenarCotxe(cotxe);
		IComanda frenarAvio = new FrenarAvio(avio);
		IComanda frenarBicicleta = new FrenarBicicleta(bicicleta);
		IComanda frenarVaixell = new FrenarVaixell(vaixell);

		// Invocador
		Invocador invocador = new Invocador();

		// afeigi comandes a la colleccio del invocador
		invocador.addComanda("arrencarCotxe", arrencarCotxe);
		invocador.addComanda("arrencarAvio", arrencarAvio);
		invocador.addComanda("arrencarBicicleta", arrencarBicicleta);
		invocador.addComanda("arrencarVaixell", arrencarVaixell);

		invocador.addComanda("accelerarCotxe", accelerarCotxe);
		invocador.addComanda("accelerarAvio", accelerarAvio);
		invocador.addComanda("accelerarBicicleta", accelerarBicicleta);
		invocador.addComanda("accelerarVaixell", accelerarVaixell);

		invocador.addComanda("frenarCotxe", frenarCotxe);
		invocador.addComanda("frenarAvio", frenarAvio);
		invocador.addComanda("frenarBicicleta", frenarBicicleta);
		invocador.addComanda("frenarVaixell", frenarVaixell);

		// invocar comandes por el receptor cotxe
		invocador.invocarComanda("arrencarCotxe");
		invocador.invocarComanda("accelerarCotxe");
		invocador.invocarComanda("frenarCotxe");

		// invocar comandes por el receptor avio
		invocador.invocarComanda("arrencarAvio");
		invocador.invocarComanda("accelerarAvio");
		invocador.invocarComanda("frenarAvio");

		// invocar comandes por el receptor cotxe
		invocador.invocarComanda("arrencarBicicleta");
		invocador.invocarComanda("accelerarBicicleta");
		invocador.invocarComanda("frenarBicicleta");

		// invocar comandes por el receptor arrencarVaixell
		invocador.invocarComanda("arrencarVaixell");
		invocador.invocarComanda("accelerarVaixell");
		invocador.invocarComanda("frenarVaixell");

	}

}
