package practice_series;
import java.util.*;
public class QuotientandRemainder {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of a: ");
	int a = sc.nextInt();
	System.out.print("Enter the value of b: ");
	int b = sc.nextInt();
	int quotient = a/b;
	int remainder = a%b;
	System.out.println("Quotient: "+quotient);
	System.out.println("Remainder: "+remainder);	
}
}
