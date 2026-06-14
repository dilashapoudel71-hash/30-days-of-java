package Day3;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	int r,s=0;
	int c = num;
	while(num>0) {
		r = num%10;
		s = (s*10)+r;
		num = num/10;
	}
	if(c==s) {
		System.out.println(c + " is Palindrome Number");
	}
	else {
		System.out.println(c + " is not Palindrome Number");
	}
	sc.close();
}
}
