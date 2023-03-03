
import java.util.Date;

public class Lanzamientos {
public String TituloDePubli;
public Date FechaDeLanza;
public int ContLikes;

    public Lanzamientos(String TituloDePubli, Date FechaDeLanza, int ContLikes) {
        this.TituloDePubli = TituloDePubli;
        this.FechaDeLanza = FechaDeLanza;
        this.ContLikes = ContLikes;
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
