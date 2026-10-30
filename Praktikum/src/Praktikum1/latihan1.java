package Praktikum1;

import java.util.Scanner;

public class latihan1 {
	public static void main(String[] args) {
		System.out.println("Program menghitung volume balok");
	    
		Balok balok = new Balok();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("masukkan panjang balok :");
		balok.panjang = scanner.nextDouble();
		
		System.out.print("masukkan lebar balok : ");
		balok.lebar = scanner.nextDouble();
		
		System.out.print("masukkan tinggi balok : ");
		balok.tinggi = scanner.nextDouble();
		
		System.out.println("Volume dari balok : " + balok.getVolume());
		
	}

}