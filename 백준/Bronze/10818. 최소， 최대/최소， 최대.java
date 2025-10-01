import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int j = 0 ; j < N ; j++){
            if(arr[j] > max){
                max = arr[j];
            }
        }

        for(int k = 0 ; k < N ; k++){
            if(arr[k] < min){
                min = arr[k];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
