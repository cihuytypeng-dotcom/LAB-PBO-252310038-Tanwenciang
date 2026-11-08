package Tugas5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        String[] nama = {
            "Septian Cahyadi",
            "Isnan Mulia",
            "Edi Nurachmand"
        };

        String[] alamat = {
            "Dramaga cantik residence II, Bogor",
            "Jl. Manunggal, Bogor",
            "Taman Cimanggu Permai, Bogor"
        };

        String[] noTelp = {
            "+62 899-9506-210",
            "+62 819-3208-0875",
            "+62 856-9380-0384"
        };

        ArrayList<ArrayList<String>> data = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ArrayList<String> baris = new ArrayList<>();

            String namaInput = inputTeks("Masukkan Nama Lengkap ke-" + (i + 1)
                    + ":", nama[i]);
            if (namaInput == null) return;

            String alamatInput = inputTeks("Masukkan Alamat ke-" + (i + 1)
                    + ":", alamat[i]);
            if (alamatInput == null) return;

            String telpInput = inputTeks("Masukkan No Telp ke-" + (i + 1)
                    + ":", noTelp[i]);
            if (telpInput == null) return;

            baris.add(namaInput);
            baris.add(alamatInput);
            baris.add(telpInput);
            data.add(baris);
        }

        JOptionPane.showMessageDialog(null, tampilkan(data),
                "Data ArrayList Multidimensi",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static String inputTeks(String pesan, String contoh) {
        while (true) {
            String input = JOptionPane.showInputDialog(
                    null, pesan, contoh);

            if (input == null) return null;

            if (!input.trim().isEmpty()) return input.trim();

            JOptionPane.showMessageDialog(null,
                    "Data tidak boleh kosong!");
        }
    }

    private static String tampilkan(
            ArrayList<ArrayList<String>> data) {
        String hasil = "DATA BIODATA\n\n";

        for (int i = 0; i < data.size(); i++) {
            hasil += "Data ke-" + (i + 1)
                    + "\nNama Lengkap: " + data.get(i).get(0)
                    + "\nAlamat: " + data.get(i).get(1)
                    + "\nNo Telp: " + data.get(i).get(2)
                    + "\n\n";
        }
        return hasil;
    }
}
