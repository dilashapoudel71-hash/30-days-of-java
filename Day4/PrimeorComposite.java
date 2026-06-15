package Day4;
import java.util.*;
public class PrimeorComposite {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int counter=0;
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	for(int i = 1;i<=num;i++) {
	if(num%i==0) {
		counter++;	
	}
	}
	
	if (counter==2){
		System.out.print(num+ " is prime number");
	}
	else {
		System.out.print(num+ " is composite number");
	}
}
	
}
