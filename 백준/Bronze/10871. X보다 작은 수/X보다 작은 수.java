import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //정수의 갯수
        int[] arr = new int[N];
        int X = scanner.nextInt(); //비교할 정수

        for(int i = 0 ; i < N ; i++){
            arr[i] = scanner.nextInt();
        }

       for (int i = 0 ; i < N ; i++){
           if(arr[i] < X){
               System.out.println(arr[i]);
           }
       }
    }
}
