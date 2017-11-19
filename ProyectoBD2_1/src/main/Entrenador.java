/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Cold
 */
public class Entrenador {
    String NombreEntrenador;
    double PesoEntrenador;
    Equipo equipo;

    public Entrenador() {
    }

    public Entrenador(String NombreEntrenador, double PesoEntrenador) {
        this.NombreEntrenador = NombreEntrenador;
        this.PesoEntrenador = PesoEntrenador;
        
    }

    public String getNombreEntrenador() {
        return NombreEntrenador;
    }

    public void setNombreEntrenador(String NombreEntrenador) {
        this.NombreEntrenador = NombreEntrenador;
    }

    public double getPesoEntrenador() {
        return PesoEntrenador;
    }

    public void setPesoEntrenador(double PesoEntrenador) {
        this.PesoEntrenador = PesoEntrenador;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    
}
