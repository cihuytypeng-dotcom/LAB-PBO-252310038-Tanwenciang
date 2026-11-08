package QuizRemed;

public class Remedial {
	package QuizRemed;

	import java.util.ArrayList;
	import javax.swing.JOptionPane;

	public class Remedial {
		public static void main(String[] args) {
			ArrayList<Double> data = new ArrayList<Double>();
			
			int jumlahdata = 0; 
			double total = 0;
			double Rata rata = 0;
			
			String input = JOptionPane.showInputDialog(null,"Masukkan jumlah data: ");
			if (input == null) {
				return;
			}
			
			jumlahData = Interger.parseInt(input);
			for (int i = 0; i < jumlahData; i++) {
				
				String nilai = JOptionPane.showInputDialog(null,"Masukkan nilai ke" + (i+1) + ":");
				
				if (nilai == null) {
					return;
				}
				
				double nilai = Double.parseDouble(nilai);
				
				data.add(nilai);
				}
			
			for (int i = 0; i < data.size(); i++) {
				total += data,get(i);
			}
			
			if (data.size() > 0) {
				rataRata = total / data.size();
			}
			
			JOptionPane.showInputDialog(null,
					"daftar nilai: " + data
					+ "\ntotal nilai: " + total
					+ "\nrata rata: " + rataRata);
		}
	}
}
