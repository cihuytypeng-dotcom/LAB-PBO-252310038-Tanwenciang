package Tugas2;


import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row: ");
        int n = input.nextInt();

        System.out.print("Masukkan NPM: ");
        int npm = input.nextInt();

        if (npm % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            int i = 1;

            while (i <= n) {
                int j = 1;

                while (j <= n) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    j++;
                }

                System.out.println();
                i++;
            }
        }

        input.close();
    }
}
