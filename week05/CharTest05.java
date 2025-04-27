public class CharTest05 {
    public static void main(String[] args) {

    	// char형을 String으로 변환하기 (3가지 방법)
    	char a = 'A';
    	String s1 = a + "";
    	String s2 = String.valueOf(a);
    	String s3 = Character.toString(a);
    	System.out.println(s1); // A
    	System.out.println(s2); // A
    	System.out.println(s3); // A    
    	
    	// String형의 변수값에서 인덱스에 해당 하는 값을 char형으로 변환해서 가져오기
    	String b = "Hello";
    	char k1 = b.charAt(0); // 'H'
    	System.out.println(k1); // H   	
    }
}




