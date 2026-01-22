package app.model;

public class Ocena {

    private int id;
    private int vrednost;
    private String komentar;
    private Klijent klient;

    public Ocena(int vrednost, String komentar, Klijent klient) {

        this.vrednost = vrednost;
        this.komentar = komentar;
        this.klient = klient;

    }

    public int getVrednost(){
        return vrednost;
    }

    public String getKomentar(){
        return komentar;
    }

    public Klijent getKlient(){
        return klient;
    }




}
