package com.capg.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.book.dto.Book;



@RestController
@RequestMapping("/rating")
public class RatingController {
	//http://localhost:9092/rating/list	
	@RequestMapping("/list")
	public Book getAllData(){
		return new Book(101,4);			
	}
}
