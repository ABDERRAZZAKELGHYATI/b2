package com.main.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		System.out.println("What's your name ?");
//		Scanner scanFirstName = new Scanner(System.in);
//		String firstName = scanFirstName.nextLine();
//		System.out.println("Hello, " + firstName);
//		scanFirstName.close();
//		
//		System.out.println("The price with ttc: " + priceWithTva(12, 1));
//		loop1();
//		loop2();
//		show1("Sofia", "Tancredy", 13);
//		show2("male", 18);
	}
	
	// TVA
	public static double priceWithTva(double priceHt, double tva){	 
		return ( 1 + tva / 100) * priceHt;
    }
	
	// Loops 1
	public static void loop1() {
		for (int i = 1; i <= 10; i++) {
			if (i == 10) {
				System.out.print(i);
			}else {
				System.out.print(i + ", ");
			}
		}
	}
	
	// Loops 2
	public static void loop2() {
		for (int i = 1, j = 100; i <= 10  && j > 0; i++, j--) {
			if(i < 10) {
				System.out.print(i + ", " + j + ", ");
			}else {
				System.out.print(i);
			}
		}
	}
	
	public static void show1(String firstName, String lastName, int age) {
		System.out.println("Hello, " + firstName + " " + lastName + ", you are " + age + " years old");
	}
	
	public static void show2(String gender, int age) {
		if (age < 18) {
			System.out.println("You are a " + gender + " and you are minor");
		}else {
			System.out.println("You are a " + gender + " and you are adult");
		}
	}
	
}
