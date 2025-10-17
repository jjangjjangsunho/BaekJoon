import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        char c = s.charAt(0);           
        int ascii = (int) c;
        System.out.println(ascii);
    }
}