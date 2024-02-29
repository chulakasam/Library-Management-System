package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    private String id;
    private String name;
    private String address;
    private int Tel;
    private String Regdate;


    public Person(String id, String name, String address, int tel, String regdate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.Tel = tel;
        this.Regdate = regdate;
    }
    public Person(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        Tel = tel;
    }

    public String getRegdate() {
        return Regdate;
    }

    public void setRegdate(String regdate) {
        Regdate = regdate;
    }

    @Override
    public String toString() {
        return id+name+address+Tel+Regdate;
    }
}
