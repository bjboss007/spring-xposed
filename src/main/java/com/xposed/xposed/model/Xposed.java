
import javax.persistence.Entity;

@Entity
public class Xposed{
    private String firstName;
    private String middleName;
    private String lastName;
    private String location;


    public Xposed(){

    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setMiddleName(String middleName){
        this.firstName = middleName;
    }

    public String getMiddleName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

}