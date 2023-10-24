package exercises.exercise0.library;

public class Main {
   public static void main(String[] args) {
      // first object each class
    Book book1=new Book();
    book1.setName("1984");
    book1.setAuthor("George Orwell");

    Cafe cafe1=new Cafe();
    cafe1.setName("Starbucks");
    cafe1.setMaterial("Latte");

    Chair chair1=new Chair();
    chair1.setManufactureDate(null);

    Headphones headphones1=new Headphones();
    headphones1.setManufacturer("Airpod");

    Laptop laptop1=new Laptop();
    laptop1.setId(1);

    librarians librarians1=new librarians();
    librarians1.setName("John");
    librarians1.setWorkPosition("Technician");

    phones phones1=new phones();
    phones1.setHasHeadphone(false);

    room room1=new room();
    room1.setName("restroom");
    room1.setUsed(false);

    table table1=new table();
    table1.setAssembled(false);
    table1.setIsdamaged(false);

    users users1=new users();
    users1.setUserName("Lucy");
    users1.setId(1231);
    users1.setGender("girl");


    //second object each class
    Book book2=new Book();
    book2.setName("Harry Potter");
    book2.setAuthor("J.K.Rowling");

    Cafe cafe2=new Cafe();
    cafe2.setName("TP Tea");
    cafe2.setMaterial("hot chocolate");

    Chair chair2=new Chair();
    chair2.setAssembled(false);

    Headphones headphones2=new Headphones();
    headphones2.setManufacturer("Samsung");

    Laptop laptop2=new Laptop();
    laptop2.setId(2);

    librarians librarians2=new librarians();
    librarians2.setName("Joy");
    librarians2.setWorkPosition("Director");

    phones phones2=new phones();
    phones2.setHasBattery(true);

    room room2=new room();
    room2.setName("Quite Zone");
    room2.setNumberOfPeople(20);

    table table2=new table();
    table2.setSeats(4);
    table2.setAssembled(true);

    users users2=new users();
    users2.setUserName("Max");
    users2.setId(29009);
    users2.setGender("Boy");


    // third object each class
    Book book3=new Book();
    book3.setName("The Hunger Game");
    book3.setAuthor("Suzanne Collins");
    book3.setPages(800);

    Cafe cafe3=new Cafe();
    cafe3.setName("zero coffee");
    cafe3.setMaterial("Americano");

    Chair chair3=new Chair();
    chair3.setChairlegs(2);

    Headphones headphones3=new Headphones();
    headphones3.setManufacturer("Sony");

    Laptop laptop3=new Laptop();
    laptop3.setId(3);

    librarians librarians3=new librarians();
    librarians3.setName("Helen");
    librarians3.setWorkPosition("Cataloger");

    phones phones3=new phones();
    phones3.setHasBattery(false);

    room room3=new room();
    room3.setName("Print Room");
    room3.setNumberOfPeople(5);

    table table3=new table();
    table3.setSeats(2);
    table3.setAssembled(false);

    users users3=new users();
    users3.setUserName("Lisa");
    users3.setId(58900);
    users3.setGender("Girl");

    System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("1. New user "+users1.getUserName()+" with id #"+users1.getId()+" to borrow a book name is "+book1.getName()+". And she is sitting in "+cafe1.getName()+" to drink a "+ cafe1.getMaterial()+".");
    System.out.println("2. User "+users2.getUserName()+" with id #"+users2.getId()+" is reading a book is "+book2.getName()+" in "+room2.getName()+". He wears his "+headphones2.getManufacturer()+" headphone, and drink a "+cafe2.getMaterial()+" bought from "+cafe2.getName()+".");
    System.out.println("3. New user "+users3.getUserName()+" with id # "+users3.getId()+" is in "+room3.getName()+" to print the book "+book3.getName()+" with pages number "+book3.getPages()+". The "+librarians3.getWorkPosition()+" "+librarians3.getName()+" is assisting with her.");
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
   }
   
   
}
