package be.pxl.h5.exeoef7;

import java.util.Scanner;

public class Exeoef7switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int btwcode;
		double prijsinc;
		double btw;
		double prijsex;

		System.out.println("geef het bedrag met btw in");
		prijsinc = input.nextDouble();
		System.out.println("geef het btw cijfer in");
		btwcode = input.nextInt();
		switch (btwcode) {
		case 1:
			prijsex = prijsinc / 1.06;
			btw = prijsinc - prijsex;
			System.out
					.println("het btw percentage is 6 % de prijs execlusief btw is " + prijsex + "en de btw is " + btw);
		case 2:
			prijsex = prijsinc / 1.19;
			btw = prijsinc - prijsex;
			System.out.println(
					"het btw percentage is 19 % de prijs execlusief btw is " + prijsex + "en de btw is " + btw);
		case 3:
			prijsex = prijsinc / 1.25;
			btw = prijsinc - prijsex;
			System.out.println(
					"het btw percentage is 25 % de prijs execlusief btw is " + prijsex + "en de btw is " + btw);
		case 4:
			prijsex = prijsinc / 1.33;
			btw = prijsinc - prijsex;
			System.out.println(
					"het btw percentage is 33 % de prijs execlusief btw is " + prijsex + "en de btw is " + btw);
		case 5:
			prijsex = prijsinc / 1.21;
			btw = prijsinc - prijsex;
			System.out.println(
					"het btw percentage is 21 % de prijs execlusief btw is " + prijsex + "en de btw is " + btw);
		}
		input.close();
	}

}
