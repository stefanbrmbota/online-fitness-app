package app;


import app.dao.UserCsvDao;
import app.dao.UserDao;
import app.model.Client;
import app.model.User;
import app.util.CsvUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserDao dao = new UserCsvDao();

        User u = new Client(0, "marko", "pass",
                "Marko", "Markovic", "m@mail.com");

        dao.save(u);

        User found = dao.findByUsername("marko");
        System.out.println(found.getEmail());

    }
}