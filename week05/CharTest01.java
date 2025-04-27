public class CharTest01 {
    public static void main(String[] args) {
/*
 * char형은 문자 1개를 저장하는 기본형 데이터타입이다.
 * 2바이트(16bit) 크기, Unicode를 사용해 전 세계 모든 문자를 표현할 수 있어.
 * 
 * 
 */
    	char c1 = 'A';             // 문자 직접 저장
        char c2 = 65;              // 숫자로 저장  (A에 대응대는 숫자는 65)
        char c3 = '\uAC00';        // 유니코드로 저장 (한글 '가'의 유니코드는 \uAC00)
        System.out.println("c1변수의 값은 ? " + c1);    // 출력: A
        System.out.println("c2변수의 값은 ? " + c2);    // 출력: A
        System.out.println("c3변수의 값은 ? " + c3);    // 출력: 가
        System.out.println("------------------------------------------");                   
    }
}




