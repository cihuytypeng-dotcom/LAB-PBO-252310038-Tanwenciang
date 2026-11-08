package Tugas1;
 
import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Lengkap: ");
        String nama = input.nextLine();

        String hasil = nama.replaceAll(
            "(?i)[aiueo]", "X"
        );

        System.out.println("Hasil: " + hasil);

        input.close();
    }
}