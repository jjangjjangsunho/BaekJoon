import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basketCount = scanner.nextInt();   // 바구니 갯수 (N)
        int operationCount = scanner.nextInt(); // 뒤집기 연산 수 (M)

        int[] baskets = new int[basketCount + 1];
        for (int idx = 1 ; idx <= basketCount ; idx++) {
            baskets[idx] = idx;
        }

        for (int op = 0 ; op < operationCount; op++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            int segmentLength = end - start + 1;
            // 시작부터 끝까지의 구간을 뒤집기
            for (int offset = 0 ; offset < segmentLength / 2; offset++) {
                int temp = baskets[start + offset];
                baskets[start + offset] = baskets[end - offset];
                baskets[end - offset] = temp;
            }
        }

        // 출력
        for (int idx = 1; idx <= basketCount; idx++) {
            System.out.print(baskets[idx]);
            if (idx < basketCount) {
                System.out.print(" ");
            }
        }
        System.out.println();
        scanner.close();
    }
}

