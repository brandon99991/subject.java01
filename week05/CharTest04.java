public class CharTest04 {
    public static void main(String[] args) {


    	
        // ch1 변수의 값이 숫자형이면 true, 아니면 false 
    	char ch1 = 'a';
        System.out.println(Character.isDigit(ch1));    
                
        // ch2 변수의 값이 문자형이면 true, 아니면 false
    	int a = 10;
        char ch2 = (char)a;        
        System.out.println(Character.isLetter(ch2));  
        
        // ch3 변수의 값을 대문자로 변환        
    	char ch3 = 'd';        
        System.out.println(Character.toUpperCase(ch3));

        // ch4 변수의 값을 소문자로 변환        
    	char ch4 = 'H';        
        System.out.println(Character.toLowerCase(ch4));

        // ch4 변수의 값이 공백이면 true, 아니면 false        
        char ch5 = ' ';
        System.out.println(Character.isWhitespace(ch5));     
    }
}




