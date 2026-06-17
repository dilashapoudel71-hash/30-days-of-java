package Day5;
import java.util.*;

public class StudentMarksAnalyzer {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int marks[] = new int[5];
	int max = 0 ,sum=0, min=0,passcount=0,failcount = 0;
	for(int i = 0 ;i<marks.length;i++) {
		System.out.print("Enter the marks of student " +i + " : ");
		marks[i] = sc.nextInt();
		if(i == 0) {
		    min = marks[i];
		}
		
		sum+=marks[i];
		if(marks[i]>max) {
			max = marks[i];
		}
		if(marks[i]<min) {
		min = marks[i];

		}
		if(marks[i]>=40) {
			passcount++;
		}
		else {
			failcount++;
		}
	}
	float average=(float)sum/marks.length;
	System.out.println("Highest Marks: " +max);
	System.out.println("Lowest Marks: " +min);
	System.out.println("Average marks : " +average);
	System.out.println(passcount+ " students passed the exam");
	System.out.println(failcount+ " students failed the exam");
}
}
