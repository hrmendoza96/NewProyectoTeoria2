
package main;

import java.util.ArrayList;

public class Torneo {
    ArrayList<Jornada> JornadasTorneo = new ArrayList();

    public Torneo() {
    }

    public ArrayList<Jornada> getJornadas() {
        return JornadasTorneo;
    }

    public void addJornada(Jornada j) {
        JornadasTorneo.add(j);
    }

}
