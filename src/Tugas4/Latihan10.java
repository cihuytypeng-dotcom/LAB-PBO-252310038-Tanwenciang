package Tugas4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan10 {
    public static void main(String[] args) {

        String[] field = {
            "Nama Lengkap",
            "Alamat",
            "No Telp"
        };

        ArrayList<String> biodata = new ArrayList<>();

        for (String namaField : field) {

            while (true) {
                String input = JOptionPane.showInputDialog(
                    "Masukkan " + namaField + ":");

                if (input == null) return;

                if (input.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                        namaField + " tidak boleh kosong!");
                    continue;
                }

                biodata.add(input.trim());
                break;
            }
        }

        String hasil =
            "Nama Lengkap: " + biodata.get(0) +
            "\nAlamat: " + biodata.get(1) +
            "\nNo Telp: " + biodata.get(2);

        JOptionPane.showMessageDialog(null,
            hasil, "Message",
            JOptionPane.INFORMATION_MESSAGE);
    }
}