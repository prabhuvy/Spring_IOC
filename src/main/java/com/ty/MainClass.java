package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Strated");
		ApplicationContext context=new ClassPathXmlApplicationContext("Config2.xml");
		College C=(College) context.getBean("mycollege1");
		System.out.println(C.getName());
		System.out.println(C.getBranch().getBranchname());
		System.out.println(C.getStudent().getName());
		System.out.println("Ended");
	}

}
