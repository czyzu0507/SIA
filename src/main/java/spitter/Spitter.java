package spitter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter {
    private Long id;
    @NotNull
    @Size(min = 2, max = 25)
    private String userName;
    @NotNull
    @Size(min = 2, max = 25)
    private String password;
    @NotNull
    @Size(min = 2, max = 25)
    private String firstName;
    @NotNull
    @Size(min = 2, max = 25)
    private String lastName;

    public Spitter () {

    }

    public Spitter (String userName, String password, String firstName, String lastName) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Spitter (Long id, String userName, String password, String firstName, String lastName) {

        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public void setUserName (String userName) {
        this.userName = userName;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public Long getId () {
        return id;
    }

    public String getUserName () {
        return userName;
    }

    public String getPassword () {
        return password;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spitter spitter = (Spitter) o;

        if (id != null ? !id.equals(spitter.id) : spitter.id != null) return false;
        if (userName != null ? !userName.equals(spitter.userName) : spitter.userName != null) return false;
        if (password != null ? !password.equals(spitter.password) : spitter.password != null) return false;
        if (firstName != null ? !firstName.equals(spitter.firstName) : spitter.firstName != null) return false;
        return lastName != null ? lastName.equals(spitter.lastName) : spitter.lastName == null;

    }

    @Override
    public int hashCode () {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
