
public class Usuarios {

    public String nombreUWU, ContNYA;

    public Usuarios(String nombreUWU, String ContNYA) {
        this.nombreUWU = nombreUWU;
        this.ContNYA = ContNYA;
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

    public void VerificarContrasenya(String ContNYA) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void VerificarUsuario(String nombreUWU) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Usuarios," + ",nombreUWU," + nombreUWU + ", ContNYA," + ContNYA + ",";
    }

}
