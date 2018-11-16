package com.cg.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class CurrencyConverterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("CurrencyConvertor.xml");
		CurrencyConvertor curr=(CurrencyConvertor)factory.getBean("CurrencyConvertor");
        double rupees=curr.dollarsToRupees(50.0);
        System.out.println("50 $ is" +rupees+ "Rs");
	}

}
