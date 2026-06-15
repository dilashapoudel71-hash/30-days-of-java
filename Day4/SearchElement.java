package Day4;

public class SearchElement {
	public static void main(String[]args) {
		int[] arr = {1,2,3,5,7};
		int target = 5,index=-1;
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i]==target) {
			index = i;
			}
		}
		System.out.print("Element is found at index " +index);
		
		
		
		
}
}
