package Day5;
import java.util.*;
public class StudentNameSearch {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String[] name = new String[5];
	System.out.println("Enter student name you want to store: ");
	for(int i = 0 ; i<5;i++) {
		name[i]= sc.nextLine();
	}
	System.out.println("Enter student name you want to search: ");
	String search = sc.nextLine();
	
	boolean found = false;
	for(int i = 0 ; i<5;i++) {
        if(name[i].equals(search)) {
       found = true;
        }
	}
	if(found) {
		System.out.println("Student found");
	} 
	else {
		System.out.println("Student not found");
	}
	
}
}

