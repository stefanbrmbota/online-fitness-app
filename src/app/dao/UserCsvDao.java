package app.dao;

import app.model.*;
import app.util.CsvUtil;

import java.util.ArrayList;
import java.util.List;

public class UserCsvDao implements UserDao {

    private static final String FILE_PATH = "users.csv";
    private static final String HEADER =
            "id,username,password,firstName,lastName,email,role,active";

    @Override
    public User findById(int id) {
        for (User u : findAll()) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    @Override
    public User findByUsername(String username) {
        for (User u : findAll()) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        List<String[]> rows = CsvUtil.read(FILE_PATH);
        List<User> users = new ArrayList<>();

        for (String[] r : rows) {
            users.add(mapRowToUser(r));
        }
        return users;
    }

    @Override
    public void save(User user) {
        List<User> users = findAll();
        user.setId(generateNextId(users));
        users.add(user);
        writeAll(users);
    }

    @Override
    public void update(User user) {
        List<User> users = findAll();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, user);
                break;
            }
        }
        writeAll(users);
    }

    /* ----------------- PRIVATE HELPERS ----------------- */

    private User mapRowToUser(String[] r) {
        int id = Integer.parseInt(r[0]);
        String username = r[1];
        String password = r[2];
        String firstName = r[3];
        String lastName = r[4];
        String email = r[5];
        Role role = Role.valueOf(r[6]);
        boolean active = Boolean.parseBoolean(r[7]);

        User user;

        switch (role) {
            case ADMIN ->
                    user = new Admin(id, username, password, firstName, lastName, email);
            case TRAINER ->
                    user = new Trainer(id, username, password, firstName, lastName, email);
            default ->
                    user = new Client(id, username, password, firstName, lastName, email);
        }

        user.setActive(active);
        return user;
    }

    private void writeAll(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User u : users) {
            lines.add(mapUserToLine(u));
        }
        CsvUtil.write(FILE_PATH, HEADER, lines);
    }

    private String mapUserToLine(User u) {
        return u.getId() + "," +
                u.getUsername() + "," +
                u.getPassword() + "," +
                u.getFirstName() + "," +
                u.getLastName() + "," +
                u.getEmail() + "," +
                u.getRole() + "," +
                u.isActive();
    }


    private int generateNextId(List<User> users) {
        int max = 0;
        for (User u : users) {
            if (u.getId() > max) {
                max = u.getId();
            }
        }
        return max + 1;
    }
}