package app.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlanTreninga {

    private int id;
    private Trener trener;
    private Klijent klient;
    private LocalDate datumKreiranja;
    private List<Trening>treninzi = new ArrayList<>();

    public PlanTreninga(Trener trener, Klijent klient) {
        this.trener = trener;
        this.klient = klient;
        this.datumKreiranja = LocalDate.now();
    }

    public void dodajTrening(Trening trening) {
        treninzi.add(trening);
    }

    public List<Trening> getTreninzi() {
        return treninzi;
    }

    public Trener getTrener() {
        return trener;
    }

    public Klijent getKlient() {
        return klient;
    }

    public LocalDate getDatumKreiranja() {
        return datumKreiranja;
    }



}
