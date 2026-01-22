package app.model;

public class Vezba {

    private int id;
    private String naziv;
    private String opis;
    private String video;
    private String rekvizit;

    public Vezba() {

    }

    public Vezba(int id, String naziv, String opis, String video, String rekvizit) {
        this.id = id;
        this.naziv = naziv;
        this.opis = opis;
        this.video = video;
        this.rekvizit = rekvizit;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getOpis() {
        return opis;
    }

    public String getVideo() {
        return video;
    }

    public String getRekvizit() {
        return rekvizit;
    }

}
