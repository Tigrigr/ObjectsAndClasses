package Homework_1_12;

public class Book {
    private String title;
    private Author author;
    private int bookYear;


    public Book(String title, Author author, int bookYear) {
        this.title = title;
        this.author = author;
        this.bookYear = bookYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
}




