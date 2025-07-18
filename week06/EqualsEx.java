/*
 * 예제 6-3 : Point 클래스에 equals() 작성
 * Point3 
 * EqualsEx
 */
public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(3, 4);
		if (a == b) // false  / a, b의 레퍼런스 비교
			System.out.println("a==b");
		if (a.equals(b)) // true
			System.out.println("a is equal to b");
		if (a.equals(c)) // false
			System.out.println("a is equal to c");
	}
}