package exercises.exercise0.library;
import java.util.List;
import java.util.Date;
public class phones {
    int id;
    int SimCard;
    String screenSize;
    Date dateOfRelease;
    List<String> phonenumbers;
    String manufacturer;
    boolean hasBattery;
    boolean hasHeadphone;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSimCard() {
        return SimCard;
    }
    public void setSimCard(int simCard) {
        SimCard = simCard;
    }
    public Date getDateOfRelease() {
        return dateOfRelease;
    }
    public void setDateOfRelease(Date dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public boolean isHasBattery() {
        return hasBattery;
    }
    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }
    public boolean isHasHeadphone() {
        return hasHeadphone;
    }
    public void setHasHeadphone(boolean hasHeadphone) {
        this.hasHeadphone = hasHeadphone;
    }
    public phones(){
        this.id=(int)(Math.random()*100);
        System.out.println("Generating a phone with id # "+this.id);
    }
    
}
