package app.model;

public class Trener extends Korisnik {

    private String biografija;
    private String specijalnost;

    public Trener() {
        this.uloga = Uloga.TRENER;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public String getSpecijalnost() {
        return specijalnost;
    }

    public void setSpecijalnost(String specijalnost) {
        this.specijalnost = specijalnost;
    }

}
