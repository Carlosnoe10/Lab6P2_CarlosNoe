
import java.util.ArrayList;


public class Oyentes extends Usuarios{
public ArrayList<Canciones> ListaDeMeGustas;
public ArrayList<Canciones> ListaCreada;
public ArrayList<Albums> ListaDeAlbunesLike;


    public Oyentes(ArrayList<Canciones> ListaDeMeGustas, ArrayList<Canciones> ListaCreada, ArrayList<Albums> ListaDeAlbunesLike, String nombreUWU, String ContNYA) {
        super(nombreUWU, ContNYA);
        this.ListaDeMeGustas = ListaDeMeGustas;
        this.ListaCreada = ListaCreada;
        this.ListaDeAlbunesLike = ListaDeAlbunesLike;
    }

    public ArrayList<Canciones> getListaDeMeGustas() {
        return ListaDeMeGustas;
    }

    public void setListaDeMeGustas(ArrayList<Canciones> ListaDeMeGustas) {
        this.ListaDeMeGustas = ListaDeMeGustas;
    }

    public ArrayList<Canciones> getListaCreada() {
        return ListaCreada;
    }

    public void setListaCreada(ArrayList<Canciones> ListaCreada) {
        this.ListaCreada = ListaCreada;
    }

    public ArrayList<Albums> getListaDeAlbunesLike() {
        return ListaDeAlbunesLike;
    }

    public void setListaDeAlbunesLike(ArrayList<Albums> ListaDeAlbunesLike) {
        this.ListaDeAlbunesLike = ListaDeAlbunesLike;
    }

    public String getNombreUWU() {
        return nombreUWU;
    }

    public void setNombreUWU(String nombreUWU) {
        this.nombreUWU = nombreUWU;
    }

    public String getContNYA() {
        return ContNYA;
    }

    public void setContNYA(String ContNYA) {
        this.ContNYA = ContNYA;
    }

    @Override
    public String toString() {
        return super.toString() + ",ListaDeMeGustas," + ListaDeMeGustas + ",ListaCreada," + ListaCreada+ ",ListaDeAlbunesLike," +ListaDeAlbunesLike +",";
    }



}
