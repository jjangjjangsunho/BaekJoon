import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] remainders = new int[42];
        int mod = 42;

        for (int i = 0 ; i < 10 ; i++) {
            int num = scanner.nextInt();
            int rem = num % 42;
            remainders[rem] = 1;
        }

        int count = 0;
        for(int j = 0 ; j < mod ; j++){
            count += remainders[j];
        }

        System.out.println(count);
    }
}