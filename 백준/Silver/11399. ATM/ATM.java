import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalTime = 0;
        int minTime = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            totalTime += arr[i];
            minTime += totalTime;
        }
        System.out.println(minTime);
    }
}
