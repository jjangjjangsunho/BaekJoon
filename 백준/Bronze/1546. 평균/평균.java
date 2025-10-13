import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] subject = new int[n];

        for (int i = 0 ; i < n ; i++){
            subject[i] = scanner.nextInt();
        }

        int maxScore = subject[0]; // 임시 선언
        for (int j = 0 ; j < n ; j++){
            if(maxScore < subject[j]){
                maxScore = subject[j];
            }
        }

        double sum = 0.0;
        for(int k = 0 ; k < n ; k++) {
            sum += (float) subject[k] / maxScore * 100;
        }
        double average = sum / n;

        System.out.println(average);
    }
}
