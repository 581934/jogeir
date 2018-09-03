package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Trinnsats {

	public static void main(String[] args) {
		
		String inntekt = "Kor mykje tjener du i året?";
		double sats = 0.0;
		double bruttoInntekt = parseInt( showInputDialog(inntekt) );
		double skatt = 0.0;
		
		if (bruttoInntekt <= 164100)
		{
		}
		else if ( bruttoInntekt <= 230950)
		{
			sats = 0.93;
		}
		else if ( bruttoInntekt <= 580650)
		{
			sats = 2.41;
		}
		else if ( bruttoInntekt <= 934050)
		{
			sats = 11.52;
		}
		else
		{
			sats = 14.52;
		}
		skatt = (sats*bruttoInntekt)/100;
		showMessageDialog(null, "Du tjener " + bruttoInntekt + " kr i året.\n"
				+ "Du må skatte for " + sats + "%\n"
				+ "Du må betale " + skatt + "kr i skatt.\n"
				+ "Lønn etter sats er " + (bruttoInntekt - skatt) + "kr");
	}

}
