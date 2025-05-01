/*
 * 예제 6-1 : Object클래스로 객체 속성 알아내기
 * Point2 
 * OjbectPropertyEx
 */
public class ObjectPropertyEx {
	public static void print(Object obj) {
	//public static void print(Point2 obj) {		
		System.out.println(obj.getClass().getName()); // 클래스 이름
		System.out.println(obj.hashCode()); // 해시 코드 값(객체의 메모리 주소기반으로 생성됨)
		System.out.println(obj.toString()); // 객체를 문자열로 만들어 출력
		System.out.println(obj); // 객체 출력
	}

	public static void main(String[] args) {
		Point1 p = new Point1(2, 3);
		print(p);
		System.out.println("=========================");
		Point1 p2 = new Point1(2, 3);
		print(p2);

	}
}