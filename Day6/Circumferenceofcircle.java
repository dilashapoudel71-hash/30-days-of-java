package Day6;
import java.util.*;

public class Circumferenceofcircle {
static double circumference(double radius) {
	
	return (2*3.14*radius);
}
	
	
public static void main(String[] args)	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of radius: ");
	double r = sc.nextDouble();
	double x = circumference(r);
	System.out.println("The circumference of circle with radius " +r+ " is : " +x);
}	
}
