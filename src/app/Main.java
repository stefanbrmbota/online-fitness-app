package app;


import app.model.Administrator;
import app.model.Klijent;
import app.model.Trener;

public class Main {
    public static void main(String[] args) {
        Administrator a = new Administrator();
        Trener t = new Trener();
        Klijent k = new Klijent();

        System.out.println(a.getUloga());
        System.out.println(t.getUloga());
        System.out.println(k.getUloga());
    }
}