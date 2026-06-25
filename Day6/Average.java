package Day6;
import java.util.*;
public class Average {
	static int avg(int a , int b , int c) {
		int average = (a+b+c)/3;
		return average;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int a = sc.nextInt();
	System.out.println("Enter the second number: ");
	int b = sc.nextInt();
	System.out.println("Enter the third number: ");
	int c = sc.nextInt();
	int x = avg(a,b,c);
	System.out.println("The average of " + a+" , " + b +" and " + c + " is " + x);
}
}
