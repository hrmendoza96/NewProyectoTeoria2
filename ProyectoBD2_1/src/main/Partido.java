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
public class Partido {
    Equipo A;
    Equipo B;
    ArrayList<Arbitro> Arbitros = new ArrayList();

    public Partido() {
    }

    public Partido(Equipo A, Equipo B) {
        this.A = A;
        this.B = B;
    }

    public Equipo getA() {
        return A;
    }

    public void setA(Equipo A) {
        this.A = A;
    }

    public Equipo getB() {
        return B;
    }

    public void setB(Equipo B) {
        this.B = B;
    }

    public ArrayList<Arbitro> getArbitros() {
        return Arbitros;
    }

    public void addArbitro(Arbitro arbitro) {
        Arbitros.add(arbitro);
    }
    
    
}
