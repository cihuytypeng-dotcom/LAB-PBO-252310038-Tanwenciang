package Tugas1;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Member {
    String nama;

    String getNama(String value) {
        nama = value;
        return nama;
    }
}

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Member member = new Member();

        System.out.print("Nama Member: ");
        member.getNama(input.nextLine());

        System.out.print("Nama Produk: ");
        String produk = input.nextLine();

        System.out.print("Jumlah: ");
        int jumlah = input.nextInt();

        System.out.print("Harga: ");
        double harga = input.nextDouble();

        double total = jumlah * harga;
        double diskon = total * 0.10;
        double subTotal = total - diskon;

        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter format =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Produk: " + produk);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Total: Rp " + total);
        System.out.println("Diskon 10%: Rp " + diskon);
        System.out.println("Sub Total: Rp " + subTotal);
        System.out.println("Member Name: " + member.nama);
        System.out.println("Waktu: " + waktu.format(format));

        input.close();
    }
}