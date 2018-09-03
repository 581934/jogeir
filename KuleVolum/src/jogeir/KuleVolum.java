package jogeir;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;
public class KuleVolum {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius;
		double volume;
		
		String tallTxt = showInputDialog(null, "Skriv inn radius til kulen.");
		radius = parseDouble(tallTxt);
		volume = (4 * PI * radius * radius * radius)/3;
		
		String utTxt = "Kulevolum " + volume + "\n" +
	            "Radius " + radius;		
		showMessageDialog(null, utTxt);
			
		showMessageDialog(null, "Kulevolum " + volume + "\n" +
	            "Radius " + radius);
		

	}

}
