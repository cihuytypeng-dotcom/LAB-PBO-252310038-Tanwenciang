package Tugas2;


import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM: ");
        int npm = input.nextInt();

        boolean prima = npm >= 2;

        for (int i = 2; i <= Math.sqrt(npm); i++) {
            if (npm % i == 0) {
                prima = false;
                break;
            }
        }

        if (prima) {
            System.out.println("Termasuk bilangan PRIMA");
        } else {
            System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan 2");
        }

        input.close();
    }
}
