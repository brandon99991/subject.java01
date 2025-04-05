public class ForTest03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("=======================");
        	System.out.println("*** i변수의 값은: " + i);
            
            for (int j = 1; j <= 3; j++) {
                System.out.println("j변수의 값은: " + j);
            }
        }
    }
}