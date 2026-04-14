import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] result = new int[26];

        // 초기값 -1로 설정
        for (int i = 0; i < 26; i++) {
            result[i] = -1;
        }

        // 문자열 순회
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            // 처음 등장한 경우만 기록
            if (result[index] == -1) {
                result[index] = i;
            }
        }

        // 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(result[i] + " ");
        }
    }
}