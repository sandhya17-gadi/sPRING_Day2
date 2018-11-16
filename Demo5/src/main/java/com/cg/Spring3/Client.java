package com.cg.Spring3;


import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext factory=new ClassPathXmlApplicationContext("user.xml");
        MessageSource messageSource=(MessageSource) factory.getBean("messageSource");
        Locale localeObjectname = new Locale("en", "US");
		String msg=messageSource.getMessage("welcome.message",null,localeObjectname);
        System.out.println(msg);
        
        
        
       
	}

}
