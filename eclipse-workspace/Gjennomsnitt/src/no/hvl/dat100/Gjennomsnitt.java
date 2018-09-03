package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Gjennomsnitt {

	public static void main(String[] args) {
		
		showMessageDialog(null, "Finn gjennomsnittet av 3 heiltal");
		String s = showInputDialog(null, "Les inn første tal");
		int a = Integer.parseInt(s);
		
		s = showInputDialog(null, "Les inn andre tal");
		int b = Integer.parseInt(s);
		
		s = showInputDialog(null, "Les inn tredje tal");
		int c = Integer.parseInt(s);
		
		int sum = a + b + c;
		
		double snitt = sum / 3.0;
		double snitt2 = ((double)sum)/3;
		
		showMessageDialog(null, "Snitt: " + snitt + "\n" + "Snitt2: " + snitt2);
		
		
	}

}
