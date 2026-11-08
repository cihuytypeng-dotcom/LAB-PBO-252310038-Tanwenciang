package Tugas2;


import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Resto resto = new Resto();

        String ulang;

        do {
            resto.chooseMenu();

            long harga = resto.getPrices();

            if (harga > 0) {
                System.out.println("Harga pesanan: Rp " + harga);
            }

            System.out.print("Apakah anda akan memesan kembali? (y/n): ");
            ulang = input.next();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terimakasih telah memesan.");

        input.close();
    }
}
