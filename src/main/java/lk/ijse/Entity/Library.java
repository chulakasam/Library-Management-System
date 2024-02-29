package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.ToString;

@Entity@ToString
public class Library {
    @Id
    private String Id;
    private String Name;
    private String Address;
    private String Tel;


    public Library(){

    }
    public Library(String Id,String Name, String Address, String Tel) {
        this.Id=Id;
        this.Name = Name;
        this.Address = Address;
        this.Tel = Tel;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getTel() {
        return Tel;
    }
    public void setTel(String Tel) {
        this.Tel = Tel;
    }
}
