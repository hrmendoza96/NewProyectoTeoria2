
package main;

public class Arbitro {
    String Tipo; //principal, auxiliar, reserva
    String NombreArbitro;
    double PesoArbitro;
    Partido partido;

    public Arbitro() {
    }

    public Arbitro(String Tipo, String NombreArbitro, double PesoArbitro) {
        this.Tipo = Tipo;
        this.NombreArbitro = NombreArbitro;
        this.PesoArbitro = PesoArbitro;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombreArbitro() {
        return NombreArbitro;
    }

    public void setNombreArbitro(String NombreArbitro) {
        this.NombreArbitro = NombreArbitro;
    }

    public double getPesoArbitro() {
        return PesoArbitro;
    }

    public void setPesoArbitro(double PesoArbitro) {
        this.PesoArbitro = PesoArbitro;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    
    
}
