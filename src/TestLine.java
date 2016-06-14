/**
 * Aufgabe 8 - Testklasse für 8.7 - Abgabe 15.06.2016
 * @author Jan Kulose, s0557320@htw-berlin.de
 *
 */

public class TestLine {
	public static void main(String[] args) {
		Line l1 = new Line(5, 4);
		Point p1 = new Point(1, 10);
		Point p2 = new Point(2, 14);
		Point p3 = new Point(2, 10);
		
		// Ausgabe der Gleichung und der Punkte zum Testen
		l1.printlnLine();
		p1.printPointln();
		p2.printPointln();
		p3.printPointln();
		System.out.println();
		
		/* Verschieben von Geraden auf Punkt p1, dann Ausgabe der neuen Geradengleichung.
		 * moveTo(x, y) ist auch verfügbar! War nicht ersichtlich, was von der Aufgabe verlangt wird.
		 */
		l1.moveTo(p1);
		l1.printlnLine();
		System.out.println();
		
		// Reset der Geradengleichung, dann Spiegelung der X-Achse und Ausgabe der neuen Geradengleichung
		l1.setValues(5, 4);
		l1.mirrorX();
		l1.printlnLine();
		System.out.println();
		
		// Reset der Geradengleichung, dann Überprüfung und Ausgabe ob p2 und/oder p3 auf der Geraden liegen
		l1.setValues(5, 4);
		System.out.println(l1.liesOnLine(p2) ? "Punkt p2 liegt auf der Geraden" : "Punkt p2 liegt nicht auf der Geraden");
		System.out.println(l1.liesOnLine(p3) ? "Punkt p3 liegt auf der Geraden" : "Punkt p3 liegt nicht auf der Geraden");
	}
}
