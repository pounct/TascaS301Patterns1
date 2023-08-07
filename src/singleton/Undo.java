package singleton;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static final Undo undo;

    static {
        undo = new Undo();
    }

    private Undo() {
        System.out.println("Instanciació");
    }

    public static Undo getInstance(){
        return undo;
    }

    private List<String> comandes = new ArrayList<String>();

    public void afegirComanda(String comanda) {
        this.comandes.add(comanda);
    }

    public void eliminarComanda(String comanda) {
        this.comandes.remove(comanda);
    }

    public void llistar() {
        System.out.println("llistar les últimes comandes introduïdes:");
        for (int i = comandes.size() - 1; i >= 0; i--) {
            System.out.println(comandes.get(i));
        }
    }





}

