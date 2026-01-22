package app.model;

public class CiljTreniga {

    private int id;
    private String naziv;
    private String opis;

    public CiljTreniga(String naziv, String opis) {
        this.naziv = naziv;
        this.opis = opis;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getOpis() {
        return opis;
    }



}
