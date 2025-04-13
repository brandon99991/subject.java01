public class StringToInt_Test {
    public static void main(String[] args) {
        String str = "123";
        
        // 형변환 (문자열을 숫자로)
        int num1 = Integer.parseInt(str);     // 문자열을 정수로
        int num2 = Integer.valueOf(str);      // 이것도 가능 (정수 객체 반환)

        System.out.println(num1 + 1); // 출력: 124
    }
}
