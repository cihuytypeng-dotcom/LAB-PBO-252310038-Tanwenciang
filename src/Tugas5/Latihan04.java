package Tugas5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Latihan04 {
    public static void main(String[] args) {
        String[] namaContoh = {
            "Septian Cahyadi",
            "Isnan Mulia",
            "Edi Nurachmand"
        };

        String[] alamatContoh = {
            "Dramaga cantik residence II, Bogor",
            "Jl. Manunggal, Bogor",
            "Taman Cimanggu Permai, Bogor"
        };

        String[] telpContoh = {
            "+62 899-9506-210",
            "+62 819-3208-0875",
            "+62 856-9380-0384"
        };

        ArrayList<ArrayList<String>> data = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ArrayList<String> baris = new ArrayList<>();

            String nama = inputTeks("Masukkan Nama Lengkap ke-" + (i + 1)
                    + ":", namaContoh[i]);
            if (nama == null) return;

            String alamat = inputTeks("Masukkan Alamat ke-" + (i + 1)
                    + ":", alamatContoh[i]);
            if (alamat == null) return;

            String telp = inputTeks("Masukkan No Telp ke-" + (i + 1)
                    + ":", telpContoh[i]);
            if (telp == null) return;

            baris.add(nama);
            baris.add(alamat);
            baris.add(telp);
            data.add(baris);
        }

        // Urutkan berdasarkan Nama Lengkap (kolom pertama), A-Z.
        Collections.sort(data, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> a, ArrayList<String> b) {
                return a.get(0).compareToIgnoreCase(b.get(0));
            }
        });

        JOptionPane.showMessageDialog(null, tampilkan(data),
                "Data Biodata Ascending",
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
        String hasil = "DATA BIODATA (ASCENDING A-Z)\n\n";

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
