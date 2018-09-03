package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Karakterer {

	public static void main(String[] args) {
		
		String poengTxt = "Skriv inn karakteren";
		int poeng = parseInt( showInputDialog(poengTxt) );
		char karakter = "";
		
		if (poeng > 100 || poeng < 100)
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
		

	}

}
