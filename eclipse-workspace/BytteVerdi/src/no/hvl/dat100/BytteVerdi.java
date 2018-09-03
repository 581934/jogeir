package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class BytteVerdi {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;

		int gammalA = a;
		a = b;
		b = gammalA;

		String ut = "Verdi a: " + a + "\nVerdi b: " + b;

		showMessageDialog(null, ut);

	}

}
