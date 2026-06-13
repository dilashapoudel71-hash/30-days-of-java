package Day2;
import java.util.*;
public class Multiplicationtable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number to  calculate multiplication table: ");
	int num = sc.nextInt();
	for(int i = 1;i<=10;i++) {
		System.out.println(num+ " * " + i + " = " + num*i);
	}
}
}
