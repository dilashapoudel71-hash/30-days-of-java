package Day4;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[]args) {
	int[] arr = {1,2,3,5,7};
	int i = 0, j = arr.length-1,temp;
	while(i<j) {
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	System.out.print("The reversed array is" +Arrays.toString(arr));	
}
}
