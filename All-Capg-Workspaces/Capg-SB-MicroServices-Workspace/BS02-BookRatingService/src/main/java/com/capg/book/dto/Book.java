package com.capg.book.dto;

public class Book {
	private int bookId;
	private int bookRating;
	public Book(int bookId, int bookRating) {
		super();
		this.bookId = bookId;
		this.bookRating = bookRating;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getBookRating() {
		return bookRating;
	}
	public void setBookRating(int bookRating) {
		this.bookRating = bookRating;
	}
	
	
}
