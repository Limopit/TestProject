package apiProject.elementProperties.POJO;

import java.io.Serializable;

public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String username;
    String firstname;
    String lastname;
    String email;
    String password;
    String phone;
    int userStatus;

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    private Users(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.email = builder.email;
        this.password = builder.password;
    }

    public static class Builder{
        int id;
        String username;
        String firstname;
        String lastname;
        String email;
        String password;
        String phone;
        int userStatus;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setUserStatus(int userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        public Users build(){
            return new Users(this);
        }
    }
}
