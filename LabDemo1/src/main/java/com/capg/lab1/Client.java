package com.capg.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("employee.xml");
		Employee emp=(Employee) factory.getBean("employee");
		System.out.println("Employee details");
		System.out.println("---------------------------");
		System.out.println("Employee ID :" +emp.getEmployeeId());
		System.out.println("Employee Name :" +emp.getEmployeeName());
		System.out.println("Employee Salary :" +emp.getSalary());
		System.out.println("Employee BU : " +emp.getBusinessUnit());
		System.out.println("Employee Age : " +emp.getAge());
		
		
		

	}

}
