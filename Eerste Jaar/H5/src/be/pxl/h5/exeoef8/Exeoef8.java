package be.pxl.h5.exeoef8;

import java.util.Scanner;

public class Exeoef8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal1, getal2, getal3;
		System.out.println("geef een eerste getal in");
		getal1 = input.nextInt();
		System.out.println("geef een tweede getal in");
		getal2 = input.nextInt();
		System.out.println("geef een derde getal in");
		getal3 = input.nextInt();
		if (getal1 > getal2 && getal1 > getal3)
		{
			System.out.println("de getallen zijn " + getal3+" " + getal2+" " + getal1);
		} else {
			if (getal1 > getal2 && getal3 < getal1) {
				System.out.println("de getallen zijn " + getal2+" " + getal3+" " + getal1);
			} else {
				if (getal2 > getal1 && getal1 > getal3) {
					System.out.println("de getallen zijn " + getal3+" " + getal1+" " + getal2);
				} else {
					if (getal2 > getal1 && getal3 < getal2) {
						System.out.println("de getallen zijn " + getal1+" " + getal3+" " + getal2);
					} else {
						if (getal3 > getal2 && getal2 > getal1) {
							System.out.println("de getallen zijn " + getal1+" " + getal2+" " + getal3);
						} else {
							System.out.println("de getallen zijn " + getal2+" " + getal1+" " + getal3);
						}
					}
				}
			}
		}
		input.close();
	}

}
