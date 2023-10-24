package exercises.exercise0.library;
import java.util.List;
public class Cafe {
    int id;
    int numberOfLight;
    int numberOfUtensil;
    int seats;
    List<table> tables;
    List<Chair> chairs;
    String material;
    String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumberOfLight() {
        return numberOfLight;
    }
    public void setNumberOfLight(int numberOfLight) {
        this.numberOfLight = numberOfLight;
    }
    public int getNumberOfUtensil() {
        return numberOfUtensil;
    }
    public void setNumberOfUtensil(int numberOfUtensil) {
        this.numberOfUtensil = numberOfUtensil;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public List<table> getTables() {
        return tables;
    }
    public void setTables(List<table> tables) {
        this.tables = tables;
    }
    public List<Chair> getChairs() {
        return chairs;
    }
    public void setChairs(List<Chair> chairs) {
        this.chairs = chairs;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Cafe(){
        this.id=(int)(Math.random()*100);
        System.out.println("Generating a cafe with id # "+this.id);
    }
    

}
