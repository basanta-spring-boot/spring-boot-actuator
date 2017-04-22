package com.spring.boot.app.model;

public class BookModel {

	private int bookId;
	private String bookName;
	private String Author;
	private String[] version;

	public BookModel() {
	}

	public BookModel(int bookId, String bookName, String author,
			String[] version) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		Author = author;
		this.version = version;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String[] getVersion() {
		return version;
	}

	public void setVersion(String[] version) {
		this.version = version;
	}

}
