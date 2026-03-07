package com.capg.springboot.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "books")
public class Books {

    @Id
    @Column(name = "bookid", length = 10)
    private int bookid;

    @Column(name = "bookname", length = 20)
    private String bookname;

    @Column(name = "author", length = 20)
    private String author;

    @Column(name = "price")
    private int price;

    // Getter for bookid
    public int getBookid() {
        return bookid;
    }

    // Setter for bookid
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    // Getter for bookname
    public String getBookname() {
        return bookname;
    }

    // Setter for bookname
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(int price) {
        this.price = price;
    }
}