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
public class Jornada {
    ArrayList<Partido> Partidos = new ArrayList();

    public Jornada() {
    }

    public ArrayList<Partido> getPartidos() {
        return Partidos;
    }

    public void addPartido(Partido par) {
        Partidos.add(par);
    }
    
    
}
