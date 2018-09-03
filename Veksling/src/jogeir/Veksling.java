package jogeir;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Veksling {

	public static void main(String[] args) {
		String s = showInputDialog(null, "Beløp i heile kroner");
		int belop = Integer.parseInt(s);
		
		int kr20 = belop / 20;
		int rest = belop % 20;
		int kr10 = rest / 10;
		rest = rest % 10;
		int kr5 = rest / 5;
		rest = rest % 5;
		int kr1 = rest / 1;
		
		String ut = "Du får tilbake: \n"
				+ kr20 + " 20-kronestykke\n"
				+ kr10 + " 10-kronestykke\n"
				+ kr5 + " 5-kronestykke\n"
				+ kr1 + " kronestykke\n";
		showMessageDialog(null, ut);

	}

}
