package Tugas2;


import java.util.Scanner;

public class Resto {

    private long Harga;

    public void chooseMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nMenu Sarapan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");

        System.out.print("Pilih menu: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                Harga = 22000;
                System.out.println("Anda memesan Nasi Goreng");
                break;
            case 2:
                Harga = 15000;
                System.out.println("Anda memesan Bubur Ayam");
                break;
            case 3:
                Harga = 25000;
                System.out.println("Anda memesan Soto Ayam");
                break;
            default:
                Harga = 0;
                System.out.println("Maaf menu yang anda masukan salah.");
        }
    }

    public long getPrices() {
        return Harga;
    }
}
