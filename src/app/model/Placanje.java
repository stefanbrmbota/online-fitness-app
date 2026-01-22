package app.model;

import java.time.LocalDate;

public class Placanje {

    private int id;
    private Klijent klient;
    private double iznos;
    private String period;
    private StatusUplate status;
    private LocalDate datumUplate;

    public Placanje(Klijent klient, double iznos, String period) {
        this.klient = klient;
        this.iznos = iznos;
        this.period = period;
        this.status = StatusUplate.CEKA;
        this.datumUplate = LocalDate.now();
    }

    public void oznaciKaoPlaceno(){
        this.status = StatusUplate.PLACENO;
    }

    public void refundiraj(){
        this.status = StatusUplate.REFUNDIRANO;
    }

    public StatusUplate getStatus() {
        return status;
    }
}
