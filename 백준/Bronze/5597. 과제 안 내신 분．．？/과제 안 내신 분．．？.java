import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] submitted = new boolean[31];

        for(int i = 0 ; i < 28 ; i++){
            int studentNumber = scanner.nextInt();
            submitted[studentNumber] = true;
        }

        for(int student = 1 ; student <= 30 ; student++){
            if(!submitted[student]){
                System.out.println(student);
            }
        }
    }
}