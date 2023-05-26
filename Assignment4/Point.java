// Online Java Compiler
// Use this online editor to compile and run Java code online
import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
public class Point {
	
	public double x = 0;
	public double y = 0;
	public double z = 0;
	
	public Point(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double distanceTo(Point q) {
		double x = (this.x-q.x) * (this.x-q.x);
		double y = (this.y-q.y) * (this.y-q.y);
		double z = (this.z-q.z) * (this.z-q.z);
		
		double distance = Math.sqrt(x + y + z);
		
		distance = Math.round(distance * 100);
		distance = distance/100;
		
		return distance;
	}
	
	public String toString() {
		String string = "(" + this.x + "," + this.y + "," + this.z + ")";
		return string;
	}
	
	
	public static void main(String[] args) {
		//if (args.length != 6) {
			//out.println("Sorry the correct args weren't detected");
		//}
		
		Point point1 = new Point(2.1, 3.0, 3.5);
		Point point2 = new Point(4, 5.2, 3.5);
		
		out.println("The first point is " + point1.toString());
		out.println("The second point is " + point2.toString());
		out.println("Their Euclidean distance is " + point1.distanceTo(point2));
	}
	
}