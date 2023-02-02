package com.nec.serviceimpl;

public class HelloServiceImpl {

	private static void sayHello() {
		System.out.println("Hey, Ashvini here..");
	}
	
	private static void sayHelloInHindi() {
		System.out.println("Namste..!!");
	}
	
	public static void main(String[] args) {
		System.out.println("Hey Hello..");
		sayHello();
		sayHelloInHindi();
	}
}
