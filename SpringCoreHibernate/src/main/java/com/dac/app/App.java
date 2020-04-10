package com.dac.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dac.beans.Employee;
import com.dac.dao.DaoImpl;

public class App {
	public static void main(String[] args) {
		System.out.println("Applicatio Started...");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		DaoImpl daoImpl = ctx.getBean("daoImpl", DaoImpl.class);
		 List<Employee> list = daoImpl.getEmployee();
		
		System.out.println(list);
		
		System.out.println("succuss..!!!");
	}
}
