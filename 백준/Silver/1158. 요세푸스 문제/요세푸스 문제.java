import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> josephus(int N, int K) {
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i); // 1부터 N까지의 사람들을 리스트에 추가
        }
        
        List<Integer> result = new ArrayList<>();
        int index = 0; // 현재 인덱스 초기화
        
        while (!people.isEmpty()) {
            index = (index + K - 1) % people.size(); // K번째 사람의 인덱스 계산
            result.add(people.remove(index)); // K번째 사람 제거 및 결과에 추가
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        List<Integer> josephusSequence = josephus(N, K);
        
        // 결과 출력 형식 조정
        System.out.print("<");
        for (int i = 0; i < josephusSequence.size(); i++) {
            System.out.print(josephusSequence.get(i));
            if (i < josephusSequence.size() - 1) {
                System.out.print(", "); // 마지막 원소가 아닐 경우 ',' 추가
            }
        }
        System.out.println(">"); // 닫는 괄호 출력
        
        scanner.close();
    }
}
