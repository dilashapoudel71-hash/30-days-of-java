package Day3;
public class BreakandContinue {
public static void main (String[] args) {
	for (int i = 1 ;i<=50;i++) {
		if(i%2==0) {
			continue;
		}
		if(i==35) {
			break;
		}
		System.out.print(i+" ");
	}
}
}
