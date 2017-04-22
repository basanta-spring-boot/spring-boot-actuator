package com.spring.boot.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.spring.boot.app.model.BookModel;

@Service
public class BookService {

	public List<BookModel> getBooksInfo() {
		List<BookModel> books = new ArrayList<>();
		BookModel model;
		for (int i = 1; i < 5; i++) {
			model=new BookModel(new Random().nextInt(3476), "Book" + i, "Author" + i,
					new String[] { "Version:" + i + ".x" });
			books.add(model);
		}
		return books;

	}
}
