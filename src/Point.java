
/**
 * 
 * @author jankulose, s0557320@htw-berlin.de
 *
 */

public class Point {
    private int x;
    private int y;
    
    /**
     * Creates a point-object with a given x and y coordinate
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public Point(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
    
    /**
     * Sets the x value of a point to the given value
     * @param x given value for x
     */
    public void setX (int x) {
        this.x = x;
    }
    
    /**
     * Sets the y value of a point to the given value
     * @param i given value for y
     */
    public void setY (int y) {
        this.y = y;
    }
    
    /**
     * Moves a Point by the given x and y value;
     * @param deltaX given x value
     * @param deltaY given y value
     */
    public void move(int deltaX, int deltaY){
        x += deltaX;
        y += deltaY;
    }

    /**
     * Returns x-coordinate of a point
     * @return x-coordinate of a point
     */
    public int getX(){
        return x;
    }

    /**
     * Returns y-coordinate of a point
     * @return y-coordinate of a point
     */
    public int getY(){
        return y;
    }
    
    /**
     * Prints x and y of point object in the Format "P(x, y)"
     */
    public void printPoint() {
		System.out.print("P(" + x + ", " + y + ")");
	}
    
    /**
     * Printlns x and y of point object in the Format "P(x, y)"
     */
    public void printPointln() {
		System.out.println("P(" + x + ", " + y + ")");
	}
    
    /**
     * Creates an Equation out of the point and the given point
     * @param parameterPunkt given point for the equation
     */
    public void createEquation(Point parameterPunkt) {
    	if (parameterPunkt.x == this.x) {
			System.err.println("Division by 0 -> x values are identical");
			return;
		} else {
			// y = m*x + n
			double m = (double)(parameterPunkt.y-y)/(double)(parameterPunkt.x-x);
			double n = (y-(((double)(parameterPunkt.y-y)/(double)(parameterPunkt.x-x))*x));
			System.out.printf("y=%.2fx%+.2f\n", m, n);
		}
    }
    
    /**
     * Mirrors the point along the x axis
     */
    public void mirrorX() {
    	y *= -1;
	}
    
    /**
     * Mirrors the point along the y axis
     */
    public void mirrorY() {
    	x *= -1;
	}
    
    /**
     * Mirrors the point along the x and y axis
     */
    public void mirrorXY() {
		this.mirrorX();
		this.mirrorY();
	}
}