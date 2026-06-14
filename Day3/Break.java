package Day3;
import java.util.*;
public class Break {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int sum = 0;
	while(true) {
	System.out.print("Enter the number of your choice: ");
	int num = sc.nextInt();
	if(num==0) {
		break;
	}
	sum+=num;
	}
	System.out.print("Sum: " +sum);
	sc.close();
}
}
