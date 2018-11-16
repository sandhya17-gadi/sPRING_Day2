package com.capg.Spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext factory=new AnnotationConfigApplicationContext(MyBookConfig.class);
		Book book=(Book) factory.getBean("book");
		System.out.println(book.hashCode());
		System.out.println(book);
		

	}

}
