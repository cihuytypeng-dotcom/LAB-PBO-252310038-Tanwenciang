package Tugas1;

import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Usia: ");
        String usia = input.nextLine();

        System.out.print("Firstname: ");
        String firstname = input.nextLine();

        System.out.print("Lastname: ");
        String lastname = input.nextLine();

        System.out.print("NPM: ");
        String npm = input.nextLine();

        String hasil = usia.concat(firstname)
                           .concat(lastname)
                           .concat(npm);

        System.out.println("Hasil: " + hasil);

        input.close();
    }
}
