import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int intArray[] = new int[n];
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			intArray[i] = a;
			
		}
		Arrays.sort(intArray);
		
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

}
