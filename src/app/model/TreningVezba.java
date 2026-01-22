package app.model;

public class TreningVezba {

    private Vezba vezba;
    private int brojSerija;
    private int brojPonavljanja;
    private int trajanjeUMinutima;

    public TreningVezba(Vezba vezba, int brojSerija, int brojPonavljanja, int trajanjeUMinutima) {
        this.vezba = vezba;
        this.brojSerija = brojSerija;
        this.brojPonavljanja = brojPonavljanja;
        this.trajanjeUMinutima = trajanjeUMinutima;
    }

    public Vezba getVezba() {
        return vezba;
    }

    public int getBrojSerija() {
        return brojSerija;
    }

    public int getBrojPonavljanja() {
        return brojPonavljanja;
    }

    public int getTrajanjeUMinutima() {
        return trajanjeUMinutima;
    }


}
