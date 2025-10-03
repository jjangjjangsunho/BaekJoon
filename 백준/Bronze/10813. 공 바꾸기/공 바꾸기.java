import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] basket = new int[N];

        for (int i = 0; i < N ; i++) {
            basket[i] = i + 1;
        }

        for (int k = 0; k < M; k++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            int idx1 = i - 1;
            int idx2 = j - 1;

            int temp = basket[idx1];
            basket[idx1] = basket[idx2];
            basket[idx2] = temp;
        }

        for(int p = 0 ; p < N ; p++){
            System.out.print(basket[p] + " ");
        }
    }
}
