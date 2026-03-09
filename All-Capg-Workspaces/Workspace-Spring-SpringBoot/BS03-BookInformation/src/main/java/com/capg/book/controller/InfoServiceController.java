package com.capg.book.controller;

import java.util.List;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.book.dto.Book;
import com.capg.book.dto.Info;
import com.capg.book.dto.Rating;



@RestController
@RequestMapping("/info")
public class InfoServiceController {
//	@Autowired
	RestTemplate rest = new RestTemplate();
	//http://localhost:9091/info/list/1001
	@RequestMapping("/list/{bookid}")
	public List<Book> getAllData(@PathVariable("bookid") int  id){
		Rating rating=rest.getForObject("http://localhost:9092/rating/list", Rating.class);
		Info info=rest.getForObject("http://localhost:9091/cato/list", Info.class);
		
		return Collections.singletonList(new Book(101,info.getBookName(),rating.getBookRating()));
		
		
	}
}
