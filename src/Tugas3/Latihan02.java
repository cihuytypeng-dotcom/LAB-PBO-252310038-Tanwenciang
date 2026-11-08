package Tugas3;

import javax.swing.JOptionPane;

public class Latihan02 {

    public static void main(String[] args) {

        Biodata data = new Biodata();

        String fullname = JOptionPane.showInputDialog(
                "Masukkan Fullname:");

        String usiaText = JOptionPane.showInputDialog(
                "Masukkan Usia:");

        String alamat = JOptionPane.showInputDialog(
                "Masukkan Alamat:");

        try {
            int usia = Integer.parseInt(usiaText);

            data.simpanData(fullname, usia, alamat);

            JOptionPane.showMessageDialog(
                    null,
                    data.tampilkanData(),
                    "Data Biodata",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Usia harus berupa angka!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}