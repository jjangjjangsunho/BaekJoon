import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0 ; i < t ; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println(num1 + num2);
        }
    }
}