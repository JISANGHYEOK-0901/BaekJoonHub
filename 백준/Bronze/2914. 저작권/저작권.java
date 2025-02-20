import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 앨범에 수록된 곡의 개수
        int I = sc.nextInt(); // 평균값 (올림 처리된 값)

        // 저작권이 있는 멜로디의 최소 개수 계산
        int C = (I - 1) * A + 1;

        // 결과 출력
        System.out.println(C);
    }
}
