package Tugas3;

import javax.swing.JOptionPane;

public class Latihan03 {

    public static String mintaInput(String pesan, String namaField) {

        while (true) {

            String nilai = JOptionPane.showInputDialog(
                    null,
                    pesan,
                    "Input Biodata",
                    JOptionPane.QUESTION_MESSAGE
            );

            // Jika Cancel atau Close
            if (nilai == null) {

                int pilihan = JOptionPane.showConfirmDialog(
                        null,
                        "Apakah anda ingin keluar?",
                        "Konfirmasi Keluar",
                        JOptionPane.YES_NO_OPTION
                );

                if (pilihan == JOptionPane.YES_OPTION
                        || pilihan == JOptionPane.CLOSED_OPTION) {
                    return null;
                }

                continue;
            }

            nilai = nilai.trim();

            // Validasi kosong
            if (nilai.isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Field " + namaField + " tidak boleh kosong",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );

                continue;
            }

            return nilai;
        }
    }

    public static void main(String[] args) {

        while (true) {

            // Input Fullname
            String fullname = mintaInput(
                    "Masukkan Fullname:", "fullname");

            if (fullname == null) {
                return;
            }

            // Input Usia
            int usia;

            while (true) {

                String usiaText = mintaInput(
                        "Masukkan Usia:", "usia");

                if (usiaText == null) {
                    return;
                }

                try {

                    usia = Integer.parseInt(usiaText);
                    break;

                } catch (NumberFormatException e) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Isian usia harus angka",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }

            // Input Alamat
            String alamat;

            while (true) {

                alamat = mintaInput(
                        "Masukkan Alamat:", "alamat");

                if (alamat == null) {
                    return;
                }

                // Validasi minimal 10 karakter
                if (alamat.length() >= 10) {
                    break;
                }

                JOptionPane.showMessageDialog(
                        null,
                        "Masukan alamat minimum 10 karakter",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );
            }

            // Menyimpan data
            Biodata data = new Biodata();

            data.simpanData(fullname, usia, alamat);

            // Menampilkan data
            JOptionPane.showMessageDialog(
                    null,
                    data.tampilkanData(),
                    "Informasi Biodata",
                    JOptionPane.INFORMATION_MESSAGE
            );

            // Konfirmasi keluar
            int pilihan = JOptionPane.showConfirmDialog(
                    null,
                    "Apakah anda ingin keluar?",
                    "Konfirmasi Keluar",
                    JOptionPane.YES_NO_OPTION
            );

            if (pilihan == JOptionPane.YES_OPTION
                    || pilihan == JOptionPane.CLOSED_OPTION) {

                return;

            }

            // Jika No, kembali ke input Fullname
        }
    }
}