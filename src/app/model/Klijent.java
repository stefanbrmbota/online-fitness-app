package app.model;

public class Klijent extends Korisnik {

    private double visina;
    private double tezina;

    public Klijent() {
        this.uloga = Uloga.KLIJENT;
    }

    public double getVisina() {
        return visina;
    }
    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double getTezina() {
        return tezina;
    }
    public void setTezina(double tezina) {
        this.tezina = tezina;
    }


}
