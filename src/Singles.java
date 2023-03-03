
import java.util.Date;

public class Singles extends Lanzamientos{
    public Canciones Rola;

    public Singles(Canciones Rola, String TituloDePubli, Date FechaDeLanza, int ContLikes) {
        super(TituloDePubli, FechaDeLanza, ContLikes);
        this.Rola = Rola;
    }

    public Canciones getRola() {
        return Rola;
    }

    public void setRola(Canciones Rola) {
        this.Rola = Rola;
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
