package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    // Add Book
    @PostMapping("/addbook")
    public int addBook(@RequestBody Books books) {
        booksService.addBook(books);
        return books.getBookid();
    }

    // Retrieve All Books
    @GetMapping("/allbooks")
    public List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }
}