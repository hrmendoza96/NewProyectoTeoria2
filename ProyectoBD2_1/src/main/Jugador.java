
package main;

import java.util.ArrayList;
import java.util.Date;

public class Jugador {
    
    String NombreJugador;
    String TipoJugador; //titular, reserva
    double PesoJugador;
    Date FechaNac;
    int Edad;
    Equipo eq;
    ArrayList<Jornada> JornadasJugador;

    public Jugador() {
    }

    public Jugador(String NombreJugador, double PesoJugador, Date FechaNac, int Edad) {
        this.NombreJugador = NombreJugador;
        this.PesoJugador = PesoJugador;
        this.FechaNac = FechaNac;
        this.Edad = Edad;
    }
    
    public String getTipoJugador() {
        return TipoJugador;
    }

    public void setTipoJugador(String TipoJugador) {
        this.TipoJugador = TipoJugador;
    }

    

    public String getNombreJugador() {
        return NombreJugador;
    }

    public void setNombreJugador(String NombreJugador) {
        this.NombreJugador = NombreJugador;
    }

    public double getPesoJugador() {
        return PesoJugador;
    }

    public void setPesoJugador(double PesoJugador) {
        this.PesoJugador = PesoJugador;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Equipo getEq() {
        return eq;
    }

    public void setEq(Equipo eq) {
        this.eq = eq;
    }

    public ArrayList<Jornada> getJornadasJugador() {
        return JornadasJugador;
    }

    public void addJornadaJugador(Jornada j) {
        JornadasJugador.add(j);
    }
    
    
}
