package practice_series;
import java.util.*;
public class Swapnum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int fnum = sc.nextInt();
	System.out.println("Enter second number: ");
	int snum = sc.nextInt();
	fnum = fnum+snum;
	snum = fnum-snum;
	fnum= fnum-snum;
	System.out.println("The numbers after swapping :");
	System.out.println("fnum = " + fnum);
	System.out.println("snum = " + snum);
	sc.close();
}
}
