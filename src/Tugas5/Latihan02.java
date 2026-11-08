package Tugas5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();

        if (!isiMatriks(A, "A")) return;
        if (!isiMatriks(B, "B")) return;

        // Perkalian matriks C = A x B
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> barisC = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int jumlah = 0;

                for (int k = 0; k < 2; k++) {
                    jumlah += A.get(i).get(k) * B.get(k).get(j);
                }

                barisC.add(jumlah);
            }
            C.add(barisC);
        }

        String hasil = "Matriks A:\n" + tampilkan(A)
                + "\nMatriks B:\n" + tampilkan(B)
                + "\nMatriks C = A x B:\n" + tampilkan(C);

        JOptionPane.showMessageDialog(null, hasil,
                "Hasil Perkalian Matriks",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isiMatriks(
            ArrayList<ArrayList<Integer>> matriks, String nama) {

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                while (true) {
                    String input = JOptionPane.showInputDialog(
                            null, "Masukkan nilai matriks " + nama
                            + "[" + i + "][" + j + "]:",
                            "Input Matriks " + nama,
                            JOptionPane.QUESTION_MESSAGE);

                    if (input == null) return false;

                    try {
                        baris.add(Integer.parseInt(input.trim()));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null,
                                "Input harus berupa angka!",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            matriks.add(baris);
        }
        return true;
    }

    private static String tampilkan(
            ArrayList<ArrayList<Integer>> matriks) {
        String hasil = "";
        for (ArrayList<Integer> baris : matriks) {
            for (int nilai : baris) {
                hasil += nilai + "\t";
            }
            hasil += "\n";
        }
        return hasil;
    }
}