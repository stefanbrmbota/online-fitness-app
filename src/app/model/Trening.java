package app.model;

import java.util.ArrayList;
import java.util.List;

public class Trening {

    private int id;
    private List<TreningVezba> vezbe = new ArrayList<TreningVezba>();
    private int predvidjenoTrajanje;

    public Trening() {

    }

    public void dodajVezbu (TreningVezba treningvezba) {
        vezbe.add(treningvezba);
    }

    public List<TreningVezba> getVezbe() {
        return vezbe;
    }

    public int getPredvidjenoTrajanje() {
        return predvidjenoTrajanje;
    }

    public void setPredvidjenoTrajanje(int predvidjenoTrajanje) {
        this.predvidjenoTrajanje = predvidjenoTrajanje;
    }

}
