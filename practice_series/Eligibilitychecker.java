package practice_series;
import java.util.*;

public class Eligibilitychecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age: ");
	int age = sc.nextInt();
	if(age>=18) {
		System.out.print("You can vote in election");
	}
	else {
		System.out.print("You cannot vote in election");
	}
}
}
