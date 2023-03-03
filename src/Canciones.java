public class Canciones {
    public String Nombre;
    public double Duracion;
    public String NombreDelAlbum;

    public Canciones(String Nombre, double Duracion, String NombreDelAlbum) {
        this.Nombre = Nombre;
        this.Duracion = Duracion;
        this.NombreDelAlbum = NombreDelAlbum;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getDuracion() {
        return Duracion;
    }

    public void setDuracion(double Duracion) {
        this.Duracion = Duracion;
    }

    public String getNombreDelAlbum() {
        return NombreDelAlbum;
    }

    public void setNombreDelAlbum(String NombreDelAlbum) {
        this.NombreDelAlbum = NombreDelAlbum;
    }
    
}
//en le setter perdirle el nombre al album