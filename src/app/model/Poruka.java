package app.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Poruka {

    private int id;
    private Korisnik posiljalac;
    private Korisnik primalac;
    private String sadrzaj;
    private LocalDateTime vremeSlanja;

    public Poruka(Korisnik posiljalac, Korisnik primalac,String sadrzaj) {
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.sadrzaj = sadrzaj;
        this.vremeSlanja = LocalDateTime.now();
    }

    public Korisnik getPosiljalac() {
        return posiljalac;
    }
    public Korisnik getPrimalac() {
        return primalac;
    }
    public String getSadrzaj() {
        return sadrzaj;
    }
    public LocalDateTime getVremeSlanja() {
        return vremeSlanja;
    }



}
