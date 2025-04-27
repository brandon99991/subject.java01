public class CharTest02 {
    public static void main(String[] args) {
        
        // char형을 int형으로 변환 (자동변환)
        char ch = 'A';
        int num1 = ch;       // char → int (65)
        System.out.println("num1변수의 값은 ? " + num1);    // 출력: A
        System.out.println("------------------------------------------");   

        // int형을 char형으로 변환 (명시적 캐스팅[형변환] 필요)
        int num2 = 66;
        char ch2 = (char) num2; // int → char ('B')
        System.out.println("num2변수의 값은 ? " + num2);    // 출력: A
        System.out.println("------------------------------------------");   
    }
}




