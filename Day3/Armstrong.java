package Day3;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int r,arm=0;
		int c = num;
		while(num>0) {
			r = num%10;
			arm = (r*r*r)+ arm;
			num = num/10;
		}
		if(c==arm) {
			System.out.println(c + " is an  Armstrong Number");
		}
		else {
			System.out.println(c + " is not an Armstrong Number");
		}
		sc.close();
	}
	}
