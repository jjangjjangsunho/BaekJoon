import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //정수의 갯수
        int[] arr = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = scanner.nextInt();
        }

        int V = scanner.nextInt(); //찾으려는 정수
        int count = 0;

        for(int i = 0 ; i < N ; i++){
            if (arr[i] == V){
                count++;
            }
        }
        System.out.println(count);
    }
}