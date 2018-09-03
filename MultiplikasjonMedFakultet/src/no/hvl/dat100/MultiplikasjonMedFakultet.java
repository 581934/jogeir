package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class MultiplikasjonMedFakultet {

	public static void main(String[] args) {
		
		String melding = "Skriv inn eit tall";
		int sum = 1;
		int n = parseInt( showInputDialog(melding) );
		
		for (int currentNumber = 1; currentNumber <= n; currentNumber++) { //Setter currentnumber til 1, skjekker om current number er mindre enn n
			// og øker currentNumber med 1 for kvar gjennomgang og utfører neste setning. Dersom current number er større eller lik n så slutter den syklusen.
			sum = sum*currentNumber;
		}
		showMessageDialog(null, "Fakulteten til " + n + " er " + sum); // skriver ut
	}

}
