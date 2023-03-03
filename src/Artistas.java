
import java.util.ArrayList;

public class Artistas extends Usuarios{
public String nombreArtistico;
public ArrayList<Canciones> CancionesSubidas;
public ArrayList<Albums> AlbumsPublica2; 

    public Artistas(String nombreArtistico, ArrayList<Canciones> CancionesSubidas, ArrayList<Albums> AlbumsPublica2, String nombreUWU, String ContNYA) {
        super(nombreUWU, ContNYA);
        this.nombreArtistico = nombreArtistico;
        this.CancionesSubidas = CancionesSubidas;
        this.AlbumsPublica2 = AlbumsPublica2;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Canciones> getCancionesSubidas() {
        return CancionesSubidas;
    }

    public void setCancionesSubidas(ArrayList<Canciones> CancionesSubidas) {
        this.CancionesSubidas = CancionesSubidas;
    }

    public ArrayList<Albums> getAlbumsPublica2() {
        return AlbumsPublica2;
    }

    public void setAlbumsPublica2(ArrayList<Albums> AlbumsPublica2) {
        this.AlbumsPublica2 = AlbumsPublica2;
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

}
