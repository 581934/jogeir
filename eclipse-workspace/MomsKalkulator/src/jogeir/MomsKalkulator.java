package jogeir;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class MomsKalkulator {

	public static void main(String[] args) {
		final double MOMS_PROSENT = 25.0;
		
		String s = showInputDialog(null, "Legg inn beløp utan moms");
		double belop = Double.parseDouble(s);
		
		double moms = (belop * MOMS_PROSENT)/100;
		double belopMedMoms = belop + moms;
		
		String ut = "Moms: " + moms + "\nMed moms: " + belopMedMoms;
		showMessageDialog(null, ut);

	}

}
