package exercises.exercise0.library;
import java.util.Date;
public class Chair {
    int id;
    int chairlegs;
    int seats;
    String materials;
    String colors;
    boolean isdamaged;
    boolean isAssembled;
    Date manufactureDate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getChairlegs() {
        return chairlegs;
    }
    public void setChairlegs(int chairlegs) {
        this.chairlegs = chairlegs;
    }
    public boolean isIsdamaged() {
        return isdamaged;
    }
    public void setIsdamaged(boolean isdamaged) {
        this.isdamaged = isdamaged;
    }
    public boolean isAssembled() {
        return isAssembled;
    }
    public void setAssembled(boolean isAssembled) {
        this.isAssembled = isAssembled;
    }
    public Date getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    public Chair(){
        this.id=(int)(Math.random()*100);
        System.out.println("Generating a chair with id # "+this.id);
    }
    
}
