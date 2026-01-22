package app.model;

public class ZahtevZaSaradnju {

    private int id;
    private Klijent klient;
    private Trener trener;
    private StatusZahteva status;

    public ZahtevZaSaradnju(Klijent klient, Trener trener) {
        this.klient = klient;
        this.trener = trener;
        this.status = StatusZahteva.POSLAT;
    }

    public void prihvati(){
        status = StatusZahteva.PRIHVACEN;
    }

    public void odbij(){
        status = StatusZahteva.ODBIJEN;
    }

    public void aktiviraj(){
        status = StatusZahteva.AKTIVAN;
    }

    public void zavrsi(){
        status = StatusZahteva.ZAVRSEN;
    }
    public StatusZahteva getStatus() {
        return status;
    }
}
