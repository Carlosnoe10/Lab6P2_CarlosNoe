
import java.util.ArrayList;
import java.util.Date;

public class Albums extends Lanzamientos{
    public ArrayList<Canciones> CancionesPert;
    public int NumeroDeCanciones;

    public Albums(ArrayList<Canciones> CancionesPert, int NumeroDeCanciones, String TituloDePubli, Date FechaDeLanza, int ContLikes) {
        super(TituloDePubli, FechaDeLanza, ContLikes);
        this.CancionesPert = CancionesPert;
        this.NumeroDeCanciones = NumeroDeCanciones;
    }

    public ArrayList<Canciones> getCancionesPert() {
        return CancionesPert;
    }

    public void setCancionesPert(ArrayList<Canciones> CancionesPert) {
        this.CancionesPert = CancionesPert;
    }

    public int getNumeroDeCanciones() {
        return NumeroDeCanciones;
    }

    public void setNumeroDeCanciones(int NumeroDeCanciones) {
        this.NumeroDeCanciones = NumeroDeCanciones;
    }

    public String getTituloDePubli() {
        return TituloDePubli;
    }

    public void setTituloDePubli(String TituloDePubli) {
        this.TituloDePubli = TituloDePubli;
    }

    public Date getFechaDeLanza() {
        return FechaDeLanza;
    }

    public void setFechaDeLanza(Date FechaDeLanza) {
        this.FechaDeLanza = FechaDeLanza;
    }

    public int getContLikes() {
        return ContLikes;
    }

    public void setContLikes(int ContLikes) {
        this.ContLikes = ContLikes;
    }

    

    
    
}
