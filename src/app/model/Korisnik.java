package app.model;

public abstract class Korisnik {

    protected int id;
    protected String username;
    protected String password;
    protected String ime;
    protected String prezime;
    protected String email;
    protected Uloga uloga;
    protected boolean aktivan = true;

    public Korisnik() {

    }

    public Korisnik(int id, String username, String password, String ime, String prezime, String email, Uloga uloga) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.uloga = uloga;

    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Uloga getUloga() {
        return uloga;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }


}
