package exercises.exercise0.library;
import java.util.Date;
public class Headphones{
    int id;
    String manufacturer;
    double volume;
    Date dateOfManufacture;
    boolean isConnected;
    boolean isMuted;
    String chargingPort;
    boolean hasBattery;

    
    public String getChargingPort() {
        return chargingPort;
    }
    public void setChargingPort(String chargingPort) {
        this.chargingPort = chargingPort;
    }
    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }
    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }
    public boolean isConnected() {
        return isConnected;
    }
    public void setConnected(boolean isConnected) {
        this.isConnected = isConnected;
    }
    public boolean isMuted() {
        return isMuted;
    }
    public void setMuted(boolean isMuted) {
        this.isMuted = isMuted;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
         this.volume = volume;
    }
    public Headphones(){
        this.id=(int)(Math.random()*100);
        System.out.println("Generating a headphone with id # "+this.id);
    }
   
}
