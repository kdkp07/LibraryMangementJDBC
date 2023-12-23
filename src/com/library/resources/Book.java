package com.library.resources;

public class Book {
    private int isbn;
    private String book_name;
    private String author;

    public Book() {
    }

    public Book(int isbn, String book_name, String author) {
        this.isbn = isbn;
        this.book_name = book_name;
        this.author = author;
    }

    public Book(String book_name, String author) {
        this.book_name = book_name;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", book_name='" + book_name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
