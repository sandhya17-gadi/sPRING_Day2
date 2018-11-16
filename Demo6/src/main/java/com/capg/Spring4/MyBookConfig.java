package com.capg.Spring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBookConfig {
	
	
	@Bean
	public Author author()
	{   
		return new Author("SudhaMurty", "Karnataka");
	}
	
	@Bean(initMethod="setUp", destroyMethod="cleanUp")
	public Book book()
	{
		Book book=new Book();
		book.setIsbn("ABCD");
		book.setYear("1997");
		book.setAuthor(author());
		return book;
	}
	
	

}
