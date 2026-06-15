package Day2;
import java.util.*;
public class Minitask {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		double total = 0;
		for(int i = 1;i<=5;i++) {
			System.out.println("Enter marks of subject " + i +":"  );
			double marks = sc.nextDouble();
			total = total + marks;
		}
		double percentage = (total/500)*100;
		System.out.println("----- RESULT -----");
		System.out.println("Name: " +name);
		System.out.println("Age: "+age);
		System.out.println("Total Marks: "+total);
		System.out.println("Total Percentage: "+percentage);
		
		
		
		if(percentage >= 80 ) {
			System.out.println("Grade : A");
			System.out.println("Status : Pass");
		}
		else if  (percentage >= 70 ) {
			System.out.println("Grade : B");
			System.out.println("Status : Pass");
	}
		else if  (percentage >= 60 ) {
			System.out.println("Grade : C");
			System.out.println("Status : Pass");
	}
		else if  (percentage >= 50 ) {
			System.out.println("Grade : D");
			System.out.println("Status : Pass");
	}
		else {
			
			System.out.println("Sorry you failed");
			System.out.println("Status : Fail");
		}
		System.out.print("Do you want to calculate another student's result? (Y/N): "  );
		char choice = sc.next().charAt(0);
		if(choice == 'N' || choice == 'n') {
	        break;
	    }
		sc.nextLine();
}
}
}
