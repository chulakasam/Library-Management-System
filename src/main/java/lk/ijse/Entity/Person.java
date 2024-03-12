package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    private String userName;
    private String nic;
    private String email;
    private String address;
    private String tel;
    private String password;

    public Person(String userName, String nic,String email, String address, String tel,String password) {
        this.userName = userName;
        this.nic = nic;
        this.email=email;
        this.address = address;
        this.tel = tel;
        this.password=password;
    }
    public Person(){

    }
    @Override
    public String toString() {
        return userName+nic+email+address+tel+password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNic() {
        return nic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
