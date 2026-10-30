package menu;

import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> buku = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("Menu Data Buku");
            System.out.println("1. Masukkan Judul Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Output Semua Data Buku");
            System.out.println("4. Keluar dari Program");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = input.nextLine();
                    buku.add(judul);
                    System.out.println("Buku berhasil disimpan.");
                    break;

                case 2:
                    System.out.print("Masukkan judul buku yang dihapus: ");
                    String hapus = input.nextLine();

                    if (buku.remove(hapus)) {
                        System.out.println("Buku berhasil dihapus.");
                    } else {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.println("Daftar Buku");

                    if (buku.isEmpty()) {
                        System.out.println("Belum ada data buku.");
                    } else {
                        for (int i = 0; i < buku.size(); i++) {
                            System.out.println(
                                (i + 1) + " . " + buku.get(i)
                            );
                        }
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);

        input.close();
    }
}
