/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Cold
 */
public class Equipo {
    String NombreEquipo;
    double peso;
    ArrayList<Jugador> Jugadores = new ArrayList();
    
    Entrenador Trainer;

    public Equipo() {
    }

    public Equipo(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    public void setNombreEquipo(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void addJugador(Jugador j) {
        Jugadores.add(j);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    

    public Entrenador getTrainer() {
        return Trainer;
    }

    public void setTrainer(Entrenador Trainer) {
        this.Trainer = Trainer;
    }
    
    
}
