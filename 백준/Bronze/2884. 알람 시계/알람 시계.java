import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        if (minutes >= 45) {
            minutes -= 45;
        }  else if(hours == 0) {
            hours = 23;
            minutes = minutes + 15;
        } else {
            minutes = minutes + 15;
            hours = hours - 1;
        }
        System.out.println(hours + " " + minutes);
    }
}
