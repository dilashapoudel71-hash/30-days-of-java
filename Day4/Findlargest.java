package Day4;

public class Findlargest {
public static void main(String[]args) {
	int[] numbers = {12,13,14,15};
	int greatest = 0 ;
	for(int i = 0 ; i<numbers.length;i++) {
		if (numbers[i]>greatest) {
			greatest = numbers[i];
		}
	}
	System.out.println("The greatest element in array is " +greatest);


	int smallest = numbers[0] ;
	for(int i = 0 ; i<numbers.length;i++) {
		if (numbers[i]<smallest) {
			smallest = numbers[i];
		}
	}
	System.out.println("The greatest element in array is " +smallest);
	
	
	
}
}
