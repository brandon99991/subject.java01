/*
 * 예제 6-4 : Rect2클래스와 equals()만들기 연습
 * Rect2
 * EqualsEx2
 */
public class EqualsEx2 {
	public static void main(String[] args) {
		Rect2 a = new Rect2(2, 3);
		Rect2 b = new Rect2(3, 2);
		Rect2 c = new Rect2(3, 4);
		if (a.equals(b))
			System.out.println("a is equal to b");
		if (a.equals(c))
			System.out.println("a is equal to c");
		if (b.equals(c))
			System.out.println("b is equal to c");
	}
}