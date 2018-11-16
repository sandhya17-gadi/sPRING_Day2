package com.cg.Spring2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext factory=new ClassPathXmlApplicationContext("currencyList.xml");
        CurrencyList curr=(CurrencyList) factory.getBean("currencyList");
        List<String> list=curr.getCurrList();
        System.out.println(list);
	}

}
