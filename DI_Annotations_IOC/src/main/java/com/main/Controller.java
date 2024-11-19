package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.entity.Employee;

public class Controller 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigureFile.class);
		Employee e = context.getBean(Employee.class);
		System.out.println(e);
	}
}
