import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력 받기
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // 입력받은 문자열 출력
        System.out.println("You entered: " + input);

        // Scanner 객체 닫기
        scanner.close();
    }
}