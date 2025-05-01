/*
 * 예제 6-2 : Point 클래스에 toString() 작성
 * Point3 
 * ToStringEx
 */
class Point2 {
	private int x, y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Object클래스의 toString()메소드를 오버라이딩
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

}