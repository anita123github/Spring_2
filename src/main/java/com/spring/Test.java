package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		Student student= (Student) context.getBean("s");
		student.getmessage("hello everyone.....!");
	}

}
