package Day1;
import java.util.*;
public class Sum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a first number: ");
	int a = sc.nextInt();
	System.out.println("Enter a second number: ");
	int b = sc.nextInt();
	int sum = a+b;
	System.out.println("The sum of " + a + " and " + b + " is " + sum);
	
	sc.close();
	
}
}
