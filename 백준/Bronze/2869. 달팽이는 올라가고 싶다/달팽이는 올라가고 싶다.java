import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 낮에 달팽이가 올라갈 수 있는 거리
        int B = sc.nextInt(); // 밤에 미끄러지는 거리
        int V = sc.nextInt(); // 나무 막대 높이

        // 하루에 실제로 올라가는 거리
        int dailyClimb = A - B;
        
        if (V <= A) {
            System.out.println(1);
        } else {
            int days = (V - A + dailyClimb - 1) / dailyClimb + 1;
            System.out.println(days);
        }
    }
}
