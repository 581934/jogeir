package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class NedBoer {

	public static void main(String[] args) {
			String melding = "Nedboer i antall mm for dag";
			final int ANT_DAGER = 7;
			int sum = 0;
			int nedboer;
			
			for (int dagnr = 1; dagnr <= ANT_DAGER; dagnr++) {
				nedboer = parseInt(showInputDialog(melding + dagnr+ ":"));
				sum = sum + nedboer;
			}
			
			showMessageDialog(null, "Samlet nedboer: " + sum);
			
	}

}
