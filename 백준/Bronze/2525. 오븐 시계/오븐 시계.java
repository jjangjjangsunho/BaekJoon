import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int ovenTime = scanner.nextInt();

        if (minutes + ovenTime >= 60) {
            hours += (minutes + ovenTime) / 60;
            minutes =(minutes + ovenTime) % 60;
            if(hours >= 24){
                hours = hours - 24;
            }
        } else {
            minutes += ovenTime;
        }

        System.out.println(hours + " " + minutes);
    }
}