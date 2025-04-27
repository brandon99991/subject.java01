public class IntToString_Test {
    public static void main(String[] args) {
        int num = 456;
                  
        // 형변환 (숫자를 문자열로)        
        String str1 = String.valueOf(num);  // 정수를 문자열로
        String str2 = num + "";             // 간단한 방식

        System.out.println("str1변수 값은 ? " + str1); 
        System.out.println("str2변수 값은 ? " + str2); 

    }
}
