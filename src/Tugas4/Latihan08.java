package Tugas4;

import javax.swing.JOptionPane;

public class Latihan08 {
    public static void main(String[] args) {

        String[][] data = {
            {
                "Septian Cahyadi",
                "Dramaga cantik residence II, Bogor",
                "+62 899-9506-216"
            },
            {
                "Iman Mulia",
                "Jl. Manunggal, Bogor",
                "+62 819-3208-0875"
            },
            {
                "Edi Nurachman",
                "Taman Cimanggu Permai, Bogor",
                "+62 856-9380-0384"
            }
        };

        String hasil = "DATA MAHASISWA\n\n";

        for (int i = 0; i < data.length; i++) {

            hasil += "Data ke-" + (i + 1) + "\n";

            hasil += "Nama Lengkap: " + data[i][0] + "\n";
            hasil += "Alamat: " + data[i][1] + "\n";
            hasil += "No Telp: " + data[i][2] + "\n\n";
        }

        JOptionPane.showMessageDialog(null,
            hasil, "Data Array",
            JOptionPane.INFORMATION_MESSAGE);
    }
}