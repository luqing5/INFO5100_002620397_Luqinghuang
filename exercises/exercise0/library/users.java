package exercises.exercise0.library;
import java.util.Date;
import java.util.List;
public class users {
    int id;
    String userName;
    String gender;
    String age;
    Date dateOfBirth;
    List<phones> phones;
    List<Laptop> laptop;
    boolean hasRegistered;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<phones> getPhones() {
        return phones;
    }

    public void setPhones(List<phones> phones) {
        this.phones = phones;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public boolean isHasRegistered() {
        return hasRegistered;
    }

    public void setHasRegistered(boolean hasRegistered) {
        this.hasRegistered = hasRegistered;
    }

    public users(){
        this.id=(int)(Math.random()*100);
        System.out.println("Generating a user with id # "+this.id);
    }
    
}
