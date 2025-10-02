import java.util.Scanner;

public class Main {
    static int[] baskets;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        
        baskets = new int[N + 1];
        
        for (int t = 0 ; t < M ; t++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            doOperation(i, j, k);
        }
        
        printBaskets(N);
    }
    
    static void doOperation(int i, int j, int k) {
        for (int pos = i; pos <= j; pos++) {
            baskets[pos] = k;
        }
    }


    static void printBaskets(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.print(baskets[i]);
            if (i < N) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}