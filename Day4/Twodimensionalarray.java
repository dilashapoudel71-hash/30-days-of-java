package Day4;
import java.util.*;
public class Twodimensionalarray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number of rows: ");

	int rows = sc.nextInt();
	System.out.print("Enter a number of cols: ");
	int cols = sc.nextInt();

	int[][] marks = new int [rows][cols];
	System.out.print("Enter the numbers to be added in array: ");
	for(int i = 0 ; i<rows;i++) {
		for(int j = 0 ; j<cols ; j++) {
		marks[i][j] = sc.nextInt();
		}
	}
	for(int i = 0 ; i<rows;i++) {
		for(int j = 0 ; j<cols ; j++) {
		System.out.print(marks[i][j]+" ");
		}
		System.out.println();
	}
	sc.close();
			}

}
