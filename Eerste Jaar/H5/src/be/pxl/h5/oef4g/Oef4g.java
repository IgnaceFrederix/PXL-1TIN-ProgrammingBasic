package be.pxl.h5.oef4g;

import java.util.Scanner;

public class Oef4g {
	 private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int number1;
		int number2;
		char aChar = 'a';
		System.out.println("geef een getal in");
		number1= input.nextInt();
		System.out.println("geef een tweede getal in");
		number2 = input.nextInt();
		
		System.out.println("de som is " + (number1 + number2));
		System.out.println("het verschil is " + (number1 - number2));
		System.out.println("het product is " + (number1* number2));
		System.out.println("de deling is " + ((double)number1/number2));
		System.out.println("de rest is " + number1 % number2);
		System.out.println("de letter a word" + (aChar +2));// je krijgt de waarde in de ascii tabel hier 97 = a en a +2 = 99 dus je krijgt als je a +2 doet niet c maar 99
		
	}
	

}
