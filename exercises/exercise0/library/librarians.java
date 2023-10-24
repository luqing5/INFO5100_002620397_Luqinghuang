package exercises.exercise0.library;

import java.util.Date;
import java.util.List;
public class librarians{
    int id;
    String name;
    String gender;
    boolean isWorked;
    Date dateOfBirth;
    String workPosition;
    List<phones> phones;
    List<Laptop> laptop;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public boolean isWorked() {
        return isWorked;
    }
    public void setWorked(boolean isWorked) {
        this.isWorked = isWorked;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getWorkPosition() {
        return workPosition;
    }
    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
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
    public librarians(){
        this.id=(int)(Math.random()*100);
        System.out.println("Generating a librarian with id # "+this.id);
    }
    
}
