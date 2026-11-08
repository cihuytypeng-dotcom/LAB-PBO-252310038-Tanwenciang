package Pratikum4;

public class ArrayApp {
	
	public static void main(String[] args) {
		String[] nama = new String[4];
		nama[0] = "Tan"; // cara input
		System.out.println(nama[0]); // cara output
		System.out.println(nama[1]); // tes output
		
		Scannner scanner = new Scanner(System.in);
		System.out.print("Input nama: ");
		nama[1] = scanner.nextline();
		System.out.println("Nama yang dioutput: " + nama[1]);
		
		System.out.println("Nama-nama");
		for (int i = 0; i < 4; i++) {
			System.out.println(nama[i]);
		}
	}
}
