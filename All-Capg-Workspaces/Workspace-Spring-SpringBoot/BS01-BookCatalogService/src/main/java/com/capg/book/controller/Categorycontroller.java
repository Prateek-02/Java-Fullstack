package com.capg.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.book.dto.*;


@RestController 
@RequestMapping("/cato")
public class Categorycontroller {
	//http://localhost:9091/cato/list
	@RequestMapping("/list")
	public Book getAllData() {
		return new Book(101,"C++");
	}
}