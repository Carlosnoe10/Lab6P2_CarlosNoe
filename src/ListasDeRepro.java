
import java.util.ArrayList;

public class ListasDeRepro {
public ArrayList<Canciones> Implemenst;
public String Nombre;

    public ListasDeRepro(ArrayList<Canciones> Implemenst, String Nombre) {
        this.Implemenst = Implemenst;
        this.Nombre = Nombre;
    }

    public ArrayList<Canciones> getImplemenst() {
        return Implemenst;
    }

    public void setImplemenst(ArrayList<Canciones> Implemenst) {
        this.Implemenst = Implemenst;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


}
