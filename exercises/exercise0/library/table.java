package exercises.exercise0.library;
import java.util.Date;
public class table {
    int id;
    int tablelegs;
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
    public int getTablelegs() {
        return tablelegs;
    }
    public void setTablelegs(int tablelegs) {
        this.tablelegs = tablelegs;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
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
    public table(){
        this.id=(int)(Math.random()*100);
        System.out.println("Generating a table with id #"+this.id);
    }
    
}
