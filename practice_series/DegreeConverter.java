package practice_series;
import java.util.*;
public class DegreeConverter {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the temperature in celsius: ");
	double celsius = sc.nextDouble();
	double fahrenheit = (celsius * 9/5) + 32;
	
	System.out.print("The temperature in fahrenheit is "+ fahrenheit);
	sc.close();
}
}
