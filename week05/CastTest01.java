public class CastTest01 {
    public static void main(String[] args) {
        /*
         * 
         Wrapper 클래스란? 기본형 타입을 "객체"처럼 다루기 위해 사용한다. 
         즉, 기본형 타입의 단순한 값(int, char 등)을 객체(Object)처럼 포장해서
         더 많은 기능을 제공하거나 기본형의 Wrapper 클래스
         
         1) 정수형 (기본형 - Wrapper클래스)
	        byte ↔ Byte
	        short ↔ Short
	        int ↔ Integer
	        long ↔ Long
         2) 실수형 (기본형 - Wrapper클래스)
           float ↔ Float
           double ↔ Double
		3) 문자형 (기본형 - Wrapper클래스)
		    char ↔ Character
		4) 논리형 (기본형 - Wrapper클래스)
			boolean ↔ Boolean

    	오토박싱(Auto-Boxing)은 기본형(primitive type)을 객체형(Wrapper Class)으로 자동 변환하는 것.  .. .. 	
    	*/
    	
    	// int형을 Integer형으로 오트박싱(자동 변환하는 것)
    	int a = 10;
    	Integer b = a;  // 오토박싱
    	System.out.println("변수 b의 값은 ? " + b);
    	System.out.println("변수 b의 클래스는 ? " + b.getClass());
    	System.out.println(b instanceof Integer);  // b변수가 Integer형인가?
    	System.out.println(b instanceof Object);  //  b변수가 Object형인가?
    	// 변수 a는 기본형이다. 객체형(wrapper class)가 아니므로 아래와 같이 사용할 수 없다.
    	// System.out.println("변수 a의 클래스는 ? " + a.getClass()); 
        System.out.println("------------------------------------------");   
           	
    	// char형을 Charactor형으로 오트박싱(자동 변환하는 것)
        char c = 'A';           // 기본형 char
        Character ch = c;       // 오토박싱 발생
    	System.out.println("변수 ch의 값은 ? " + ch);
        System.out.println("변수 ch의 클래스는 ? " + ch.getClass());         
    	System.out.println(ch instanceof Character);  // b변수가 Integer형인가?
    	System.out.println(ch instanceof Object);  //  b변수가 Object형인가?
        System.out.println("------------------------------------------");   
    }
}
