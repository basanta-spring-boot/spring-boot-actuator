package com.spring.boot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.app.model.BookModel;
import com.spring.boot.app.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService service;

	@RequestMapping(value = "/getBooks", method = RequestMethod.GET)
	public List<BookModel> getBookStatus() {
		return service.getBooksInfo();

	}
}
