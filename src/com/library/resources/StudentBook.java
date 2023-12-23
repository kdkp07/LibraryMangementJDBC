package com.library.resources;

public class StudentBook {
    private int sid;
    private int isbn;
    private String book_name;

    public StudentBook(int sid, int isbn, String book_name) {
        this.sid = sid;
        this.isbn = isbn;
        this.book_name = book_name;
    }

    public StudentBook() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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

    @Override
    public String toString() {
        return "StudentBook{" +
                "sid=" + sid +
                ", isbn=" + isbn +
                ", book_name='" + book_name + '\'' +
                '}';
    }
}
