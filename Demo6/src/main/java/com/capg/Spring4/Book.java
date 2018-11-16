package com.capg.Spring4;
import javax.annotation.*;

public class Book {
	
	private String isbn;
	private String year;
	private Author author;
	
	
	
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	
	public void setUp()
	{
		System.out.println("This is setup method in book");
	}
	public void cleanUp()
	{
		System.out.println("This is cleanup method in book");
	}
	@PostConstruct
	public void customInit()
	{
		System.out.println("This is customInit method in book");
	}
	
	@PreDestroy
	public void customDestroy()
	{
		
		System.out.println("This is customDestroy method in book");
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", year=" + year + ", author=" + author
				+ "]";
	}
	
	
	
	

}
