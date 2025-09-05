package org.example;

public class Book {
    private String name;
    private String author;
    private String isbn;
    private int pageCount;

    public Book(String name, String author, String isbn, int pageCount) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.pageCount = pageCount;
    }

    public String toString(){
        return name + " by " + author + " (ISBN: " + isbn + ", Pages: " + pageCount + ")";
    }

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
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
