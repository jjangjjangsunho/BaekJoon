import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bytes = scanner.nextInt();

        for(int i = 0 ; i < (bytes / 4) ; i++){
            System.out.println("long");
        }
        System.out.println("int");
    }
}