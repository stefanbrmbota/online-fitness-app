package app;


import app.model.Admin;
import app.model.Client;
import app.model.Trainer;

public class Main {
    public static void main(String[] args) {
        Admin a = new Admin();
        Trainer t = new Trainer();
        Client k = new Client();

        System.out.println(a.getUloga());
        System.out.println(t.getUloga());
        System.out.println(k.getUloga());
    }
}