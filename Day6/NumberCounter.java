package Day6;
import java.util.*;

public class NumberCounter{
	static int pos=0,neg = 0, zeroes=0;
	char choice;
	static void numcounter() {
		Scanner sc = new Scanner(System.in);	

		do {
			System.out.print("Enter the number: ");
			
			int n = sc.nextInt();
			if(n>0) {
				pos++;
			}
			else if (n<0) {
				neg++;
			}
			else {
				zeroes++;
			}
			System.out.println("Do you want to enter more number Y/N ? ");
			 choice = sc.next().charAt(0);
			
		}
		while(choice == 'Y'|| choice == 'y');
		System.out.println("Postive numbers:" +pos);
		System.out.println("Negative numbers:" +neg);
		System.out.println("Zeroes:" +zeroes);
		
	}
	
	
	public static void main(String[] args) {
     numcounter();
	}
} 