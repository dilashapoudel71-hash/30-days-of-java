package Day6;
import java.util.*;
public class greaternumber {
static void greatest(int a , int b) {
	if(a>b) {
		System.out.println(a+" is greater "+" than "+b);
	}
	else {
		System.out.println(b+" is greater "+" than "+a);
		}
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number: ");
int a = sc.nextInt();
System.out.println("Enter the first number: ");
int b = sc.nextInt();
greatest( a , b);
}
}
