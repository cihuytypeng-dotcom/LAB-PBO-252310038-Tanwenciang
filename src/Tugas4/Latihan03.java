package Tugas4;

import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {

        int jumlah;

        while (true) {
            String input = JOptionPane.showInputDialog(
                "Masukkan jumlah array:");

            if (input == null) return;

            try {
                jumlah = Integer.parseInt(input);

                if (jumlah > 0) break;

                JOptionPane.showMessageDialog(null,
                    "Jumlah harus lebih dari 0!");

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                    "Masukkan angka!");
            }
        }

        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            while (true) {
                String input = JOptionPane.showInputDialog(
                    "Masukkan angka index ke-" + i);

                if (input == null) return;

                try {
                    nilai[i] = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,
                        "Input harus angka!");
                }
            }
        }

        String hasil = "";

        for (int i = 0; i < nilai.length; i++) {
            hasil += "x[" + i + "] = "
                    + nilai[i] + "\n";
        }

        JOptionPane.showMessageDialog(null,
            hasil, "Output Array",
            JOptionPane.INFORMATION_MESSAGE);
    }
}