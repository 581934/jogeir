package no.hvl.no;

import javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.*;

public class SnittH�gde {

	public static void main(String[] args) {
		String melding = "H�gde i cm, avslutt med 0:";
		int sum = 0; // summen av h�gder
		int antall = 0; // antall h�gder
		//f�rste innlesning
		int hogde = parseInt( showInputDialog(melding) );
		
		while (hogde != 0) {
			sum = sum + hogde;
			antall++;
			hogde = parseInt( showInputDialog(melding) );
		}
		
		showMessageDialog(null,"Den gjennomsnittlige h�gda er " + (double)sum/antall);
	}

}
