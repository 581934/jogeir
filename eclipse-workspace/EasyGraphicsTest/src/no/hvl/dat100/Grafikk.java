package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Grafikk", 350, 150);
		drawCircle(150, 50, 30);
		drawCircle(150, 110, 30);
	}
}