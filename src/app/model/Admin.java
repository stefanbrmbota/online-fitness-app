package app.model;

public class Admin extends User{

    public Admin() {
        this.role = Role.ADMIN;
    }

    public Admin(int id, String username, String password,
                 String firstName, String lastName,
                 String email) {
        super(id, username, password, firstName, lastName, email, Role.ADMIN);
    }
}
