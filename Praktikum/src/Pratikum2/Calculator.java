package Pratikum2;

import java.util.Scanner;

public class Calculator {
	static double hitung(double x, double y, char operator) {
		switch (operator) {
		case '+' :
			return x + y;
		case '-' :
			return x - y;
		case '*' :
			return x * y;
		case '/' :
			if (y == 0) {
				throw new Error("Tidak boleh dibagi dengan nol");
			}
			return x / y;
		default:
			throw new Error("Operator invalid");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Calculator Sederhana");
		
		double x, y;
		char operator, again = 'Y';
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Input x: ");
			x = scanner.nextDouble();
			
			System.out.print("Input y: ");
			y = scanner.nextDouble();
			
			System.out.print("Input operator: ");
			operator = scanner.next().charAt(0);
			
			double hasil = hitung(x, y, operator);
			System.out.println("Hasil: " + hasil);
			
			System.out.print("Ulang (Y/N)? ");
			again = scanner.next().charAt(0);

		} while (Character.toUpperCase(again) == 'Y');
	}
}
