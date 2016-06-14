/**
 * Aufgabe 8 - Testklasse für 8.6 - Abgabe 15.06.2016
 * @author Jan Kulose, s0557320@htw-berlin.de
 *
 */
public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point(5, 7);
		
		// Ausgabe des Punktes
		p1.printPointln();
		
		// Spiegelung an der x-Achse und Ausgabe des Punktes
		p1.mirrorX();
		p1.printPointln();
		
		// Spiegelung an der y-Achse und Ausgabe des Punktes
		p1.mirrorY();
		p1.printPointln();
		
		// Spiegelung am Ursprung und Ausgabe des Punktes
		p1.mirrorXY();
		p1.printPointln();
	}
}
