import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[9];
        int order = 0;
        int max = arr[0];

        for(int i = 0 ; i < 9 ; i++){
            arr[i] = scanner.nextInt();
            if(arr[i] > max){
                max = arr[i];
                order = i + 1;
            }
        }


        System.out.println(max);
        System.out.println(order);
    }
}