package exercises.exercise0.library;

import java.util.Date;

public class Book {
    int id;
    String name;
    String author;
    String publisher;
    int pages;
    boolean isDamaged;
    boolean isHardCover;
    Date publishDate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public Book(){
        this.id=(int)(Math.random()*100);
        System.out.println("-------------------------------");
        System.out.println("Generating a book with id # "+this.id);
    }
    
    
}

