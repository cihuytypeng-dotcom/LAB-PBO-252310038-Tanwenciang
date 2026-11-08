package Tugas1;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();

        System.out.println("Hasil: " + kalimat.toUpperCase());

        input.close();
    }
}
