package exercises.exercise0.library;
import java.util.Date;
public class Laptop {
    class CPU{
        int id;
        public CPU(){
            this.id=(int)(Math.random()*100);
            //System.out.println("Generating a CPU with id " +this.id);
        }
    }
    class GPU{
        int id;
        public GPU(){
            this.id=(int)(Math.random()*100);
            //System.out.println("Generating a GPU with id " +this.id);
        }
    }
    int id;
    CPU cu;
    GPU gu;
    String ScreenSize;
    int USB;
    Date manufactureDate;
    boolean isAssembled;
    boolean isWorked;
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public CPU getCu() {
        return cu;
    }
    public void setCu(CPU cu) {
        this.cu = cu;
    }
    public GPU getGu() {
        return gu;
    }
    public void setGu(GPU gu) {
        this.gu = gu;
    }
    public Date getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    public boolean isAssembled() {
        return isAssembled;
    }
    public void setAssembled(boolean isAssembled) {
        this.isAssembled = isAssembled;
    }
    public boolean isWorked() {
        return isWorked;
    }
    public void setWorked(boolean isWorked) {
        this.isWorked = isWorked;
    }
    public Laptop(){
        this.cu=new CPU();
        this.gu=new GPU();
        this.id=(int)(Math.random()*100);
        System.out.println("Generating a laptop with id # "+this.id);
    }
    public String getScreenSize(){
     return this.ScreenSize;
    }
    public int getUSB(){
        return this.USB;
    }
}
