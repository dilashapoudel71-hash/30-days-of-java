package Day1;
import java.util.*;
public class StudentInfo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your name: ");
	String name = sc.nextLine();
	System.out.print("Enter your age: ");
	int age = sc.nextInt();
	System.out.print("Enter your faculty: ");
	String faculty = sc.nextLine();
	System.out.print("Enter your gpa: ");
	double gpa = sc.nextDouble();
	
	
	System.out.println("----- Student Information -----");

	System.out.println("Name: " +name);
	System.out.println("Age: " +age);
	System.out.println("Faculty: " +faculty);
	System.out.println("GPA: " +gpa);
	sc.close();
}
}
