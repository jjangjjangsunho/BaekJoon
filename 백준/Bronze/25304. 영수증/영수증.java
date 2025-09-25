import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = scanner.nextInt();
        int totalQuantity = scanner.nextInt();
        int totalSum = 0; //전체 가격이 맞는지 확인하는 변수

        for(int i = 0 ; i < totalQuantity ; i++){
            int productPrice = scanner.nextInt();
            int productQuantity = scanner.nextInt();

            totalSum += productPrice * productQuantity;
        }

        if(totalPrice == totalSum){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}