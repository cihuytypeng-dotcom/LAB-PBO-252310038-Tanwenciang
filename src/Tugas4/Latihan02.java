package Tugas4;

import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {

        int jumlah = 5;
        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            String input = JOptionPane.showInputDialog(
                "Masukkan nilai index ke-" + i);

            if (input == null) return;

            try {
                nilai[i] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                    "Input harus angka!");
                i--;
            }
        }

        String hasil = "Hasil Array:\n";

        for (int i = 0; i < nilai.length; i++) {
            hasil += "x[" + i + "] = " + nilai[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}