/*
 * Created by Carter Lee
 * Point - Create a Point data type and 
 * test functionality based on doubles
 * command line arguments
 */
import static java.lang.System.out;
public class Point {
	
	//error message class constant
	private static final String NOT_ENOUGH_ARGS = "Please enter 6 command line arguments";

	//variables for each instance
	private double x = 0;
	private double y = 0;
	private double z = 0;
	
	//Constructor for the Point Class
	public Point(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//This method calculates the Euclidean distance between the
	//current instance Point and another specified Point as an argument
	public double distanceTo(Point q) {
		//these three variables store the squared value of the difference between the point coordinates
		double x = (this.x-q.x) * (this.x-q.x);
		double y = (this.y-q.y) * (this.y-q.y);
		double z = (this.z-q.z) * (this.z-q.z);
		
		//distance will store the euclidean distance value.
		double distance = Math.sqrt(x + y + z);
		
		//these next two lines will round the result of the euclidean distance to two decimal places
		distance = Math.round(distance * 100);
		distance /= 100;
		
		//return the final result
		return distance;
	}
	
	//This method returns the point as a String value of "(x,y,z)"
	public String toString() {
		String string = "(" + this.x + "," + this.y + "," + this.z + ")";
		return string;
	}
	
	//test the newly created Point datatype
	public static void main(String[] args) {

		//Checks for correct number of arguments
		if (args.length != 6) {
			out.println(NOT_ENOUGH_ARGS);
			System.exit(1);
		}

		//Parse command line arguments into doubles
		double[] dargs = new double[args.length];
		for (int i = 0; i < dargs.length; i++) {
			dargs[i] = Double.parseDouble(args[i]);
		}	

		//create two Point objects
		Point point1 = new Point(dargs[0],dargs[1],dargs[2]);//Point(2.1, 3.0, 3.5);
		Point point2 = new Point(dargs[3],dargs[4],dargs[5]);//Point(4.0, 5.2, 3.5);
		
		//convert the Point objects to a string to print
		out.println("The first point is " + point1.toString());
		out.println("The second point is " + point2.toString());
		
		//calculate the Euclidean distance
		out.println("Their Euclidean distance is " + point1.distanceTo(point2));
	}
	
}