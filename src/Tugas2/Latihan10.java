package Tugas2;


import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pin = 252310038; // Ganti dengan NPM kamu
        int saldo = 500000;
        int pinInput;

        // Memasukkan PIN
        do {
            System.out.print("Masukkan PIN: ");
            pinInput = input.nextInt();

            if (pinInput != pin) {
                System.out.println("PIN salah, silakan coba lagi!");
            }

        } while (pinInput != pin);

        System.out.println("PIN benar!");

        int menu;
        char konfirmasi;

        do {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");

            System.out.print("Masukkan pilihan: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo Anda: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan nominal setor: Rp ");
                    int setor = input.nextInt();

                    if (setor > 0) {
                        saldo += setor;
                        System.out.println("Setor tunai berhasil!");
                    } else {
                        System.out.println("Nominal tidak valid!");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nominal tarik: Rp ");
                    int tarik = input.nextInt();

                    if (tarik > 0 && tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Tarik tunai berhasil!");
                    } else {
                        System.out.println("Saldo tidak cukup atau nominal salah!");
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Pilihan menu salah!");
            }

            if (menu >= 1 && menu <= 4) {
                System.out.print("Apakah anda ingin keluar aplikasi? (y/n): ");
                konfirmasi = input.next().charAt(0);
            } else {
                konfirmasi = 'n';
            }

        } while (konfirmasi != 'y' && konfirmasi != 'Y');

        System.out.println("Terimakasih telah menggunakan ATM.");

        input.close();
    }
}
