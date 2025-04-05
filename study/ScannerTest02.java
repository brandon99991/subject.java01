import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        // Scanner 객체 생성.....
        Scanner scanner = new Scanner(System.in);

        // 정수 입력 받기
        System.out.print("Enter a Int : ");
        int input = scanner.nextInt();
        
        // 입력받은 정수 출력
        System.out.println("You entered: " + input);

        // Scanner 객체 닫기
        scanner.close();
    }
}