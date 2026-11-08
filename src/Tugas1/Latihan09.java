package Tugas1;

import java.util.Scanner;

class Students {
    Integer NPM;
    String Fullname;
    String ClassName;
    Integer Semester;
    Float GPA;

    Integer getNPM(Integer value) {
        NPM = value;
        return NPM;
    }

    String getFullname(String value) {
        Fullname = value;
        return Fullname;
    }

    String getClassName(String value) {
        ClassName = value;
        return ClassName;
    }

    Integer getSemester(Integer value) {
        Semester = value;
        return Semester;
    }

    Float getGPA(Float value) {
        GPA = value;
        return GPA;
    }
}

public class Latihan09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Students myBio = new Students();

        System.out.print("Masukkan NPM: ");
        myBio.getNPM(input.nextInt());
        input.nextLine();

        System.out.print("Nama Lengkap: ");
        myBio.getFullname(input.nextLine());

        System.out.print("Nama Kelas: ");
        myBio.getClassName(input.nextLine());

        System.out.print("Semester: ");
        myBio.getSemester(input.nextInt());

        System.out.print("IPK: ");
        myBio.getGPA(input.nextFloat());

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NPM: " + myBio.NPM);
        System.out.println("Nama: " + myBio.Fullname);
        System.out.println("Kelas: " + myBio.ClassName);
        System.out.println("Semester: " + myBio.Semester);
        System.out.println("IPK: " + myBio.GPA);

        input.close();
    }
}