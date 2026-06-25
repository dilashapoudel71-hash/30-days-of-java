package Day6;
import java.util.*;

public class Sumofoddnum {

static int sum(int num)	{

	
	int sum = 0;
	for(int i = 1 ; i<=num ; i++) {
		if(i%2!= 0) {
			sum+=i;
		}
	}
	return sum;
	
	
}
public static void main(String[] args) {
	System.out.println("Enter the number of terms you want to enter: ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int x = sum(num);
	System.out.println("The sum of " + num + " odd  numbers from 1 is : " +x);
	
	
}


}

