package exercises.exercise0.library;
import java.util.List;
public class room {
   int id;
   String name;  
   int numberOfPeople;
   List<table> tables;
   List<Chair> chairs;
   List<Laptop> laptops;
   double size;
   boolean isUsed;
   List<Book> books;

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
public int getNumberOfPeople() {
    return numberOfPeople;
}
public void setNumberOfPeople(int numberOfPeople) {
    this.numberOfPeople = numberOfPeople;
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
public List<Laptop> getLaptops() {
    return laptops;
}
public void setLaptops(List<Laptop> laptops) {
    this.laptops = laptops;
}
public double getSize() {
    return size;
}
public void setSize(double size) {
    this.size = size;
}
public boolean isUsed() {
    return isUsed;
}
public void setUsed(boolean isUsed) {
    this.isUsed = isUsed;
}
public List<Book> getBooks() {
    return books;
}
public void setBooks(List<Book> books) {
    this.books = books;
}
public room(){
    this.id=(int)(Math.random()*100);
    System.out.println("Generating a room with id # "+this.id);
   }
  
}
