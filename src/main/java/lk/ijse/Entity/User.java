package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.ToString;

@Entity@ToString
public class User {
    @Id
    private String username;
    private String email;
    private String password;
    private String confirmPassword;

    public User(){

    }

    public User(String username,String email,String password,String confirmPassword) {
        this.username=username;
        this.email=email;
        this.password = password;
        this.confirmPassword=confirmPassword;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword=confirmPassword;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }


}
