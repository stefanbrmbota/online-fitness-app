package app;


import app.util.CsvUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        lines.add("1,test,test123,Test,User,test@mail.com,CLIENT,true");

        CsvUtil.write("users.csv",
                "id,username,password,firstName,lastName,email,role,active",
                lines
        );

        System.out.println("CSV written");

    }
}