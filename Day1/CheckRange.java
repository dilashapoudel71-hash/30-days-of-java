package Day1;
import java.util.*;
public class CheckRange {
public static void  main(String[] args) {
Scanner sc =  new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
if(num<0) {
	System.out.print("Enter positive number");
}
else if (num>=10 && num<=50) {
	System.out.print("The number is between 10 and 50");
}
else {
	System.out.println("The number is out of range");
}
	
}
}
