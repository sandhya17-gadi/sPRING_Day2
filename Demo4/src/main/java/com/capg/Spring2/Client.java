package com.capg.Spring2;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("user.xml");
        User user=(User) factory.getBean("User");
        String uname=user.getUserName();
        String pwd=user.getPassword();
        System.out.println(uname+" "+pwd);
       
	}

}
