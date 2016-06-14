
/**
 * 
 * @author jankulose, s0557320@htw-berlin.de
 *
 */

public class Line {
	private double gradient;
	private double intercept;
	
	/**
	 * Creates a line with the equation y=gradient*x+intercept
	 * @param gradient gradient
	 * @param intercept y-intercept
	 */
	public Line(double gradient, double intercept) {
		this.gradient = gradient;
		this.intercept = intercept;
	}
	
	/**
	 * Creates a line with the equation y=0*x+0
	 */
	public Line() {
		gradient = 0;
		intercept = 0;
	}
	
	/**
	 * Printlns the line equation
	 */
	public void printlnLine() {
		System.out.printf("y=%.2fx%+.2f\n", gradient, intercept);
	}
	
	/**
	 * Prints the line equation
	 */
	public void printLine() {
		System.out.printf("y=%.2fx%+.2f", gradient, intercept);
	}
	
	/**
	 * Sets the gradient of the equation of the line to the given value.
	 * @param gradient the gradient value
	 */
	public void setGradient(double gradient) {
		this.gradient = gradient;
	}
	
	/**
	 * Returns the gradient of the equation of the line.
	 * @return the gradient value
	 */
	public double getGradient() {
		return gradient;
	}
	
	/**
	 * Sets the y intercept of the equation of the line to the given value.
	 * @param intercept the y intercept value
	 */
	public void setIntercept(double intercept) {
		this.intercept = intercept;
	}
	
	/**
	 * Returns the y intercept value of the equation of a line
	 * @return the y intercept value
	 */
	public double getIntercept() {
		return intercept;
	}
	
	/**
	 * Sets the gradient and intercept values of the equation of a line. y = gradient*x +intercept
	 * @param gradient the gradient value
	 * @param intercept the y intercept value
	 */
	public void setValues(double gradient, double intercept) {
		this.gradient = gradient;
		this.intercept = intercept;
	}
	
	/**
	 * Moves the line so it crosses the point given. Does not change the gradient of the equation.
	 * @param p Point to cross
	 */
	public void moveTo(Point p) {
		intercept = -gradient*p.getX()+p.getY();
	}
	
	/**
	 * Moves the line so it crosses the coordinates given. Does not change the gradient of the equation.
	 * @param x x-Coordinate of the point that the line will cross
	 * @param y y-Coordinate of the point that the line will cross
	 */
	public void moveTo(double x, double y) {
		intercept = -gradient*x+y;
	}
	
	/**
	 * Mirrors the line across the x axis
	 */
	public void mirrorX() {
		gradient *= -1;
		intercept *= -1;
	}
	
	/**
	 * Mirrors the line across the y axis
	 */
	public void mirrorY() {
		gradient *= -1;
	}
	
	/**
	 * Checks if the line crosses a given point.
	 * @param p Point that will be checked for
	 * @return returns true if point lies on line
	 */
	public boolean liesOnLine(Point p) {
		return p.getY()==(gradient*p.getX()+intercept);
	}
	
	/**
	 * Checks if the line crosses a given x and y coordinates.
	 * @param x x coordinate for the given point
	 * @param y y coordinate for the given point
	 * @return returns true if point lies on line
	 */
	public boolean liesOnLine(double x, double y) {
		return y==(gradient*x+intercept);
	}
}
