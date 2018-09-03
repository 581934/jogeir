package no.hvl.no;

import javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.*;

public class SnittHøgde {

	public static void main(String[] args) {
		String melding = "Høgde i cm, avslutt med 0:";
		int sum = 0; // summen av høgder
		int antall = 0; // antall høgder
		//første innlesning
		int hogde = parseInt( showInputDialog(melding) );
		
		while (hogde != 0) {
			sum = sum + hogde;
			antall++;
			hogde = parseInt( showInputDialog(melding) );
		}
		
		showMessageDialog(null,"Den gjennomsnittlige høgda er " + (double)sum/antall);
	}

}
