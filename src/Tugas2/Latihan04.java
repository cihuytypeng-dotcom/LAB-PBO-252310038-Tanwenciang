package Tugas2;


import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int angka = input.nextInt();

        if (angka < 0) {
            System.out.println("Nilai tidak boleh kurang dari 0");
        } else {
            System.out.print("Masukkan NPM: ");
            int npm = input.nextInt();

            if (npm % 2 == 0) {
                System.out.print("ASC: Faktor " + angka + " adalah ");
                for (int i = 1; i <= angka; i++) {
                    if (angka % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            } else {
                System.out.print("DESC: Faktor " + angka + " adalah ");
                for (int i = angka; i >= 1; i--) {
                    if (angka % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        }

        input.close();
    }
}
