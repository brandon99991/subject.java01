/*
 * 예제 6-3 : Point 클래스에 equals() 작성
 * Point3 
 * EqualsEx
 */
class Point3 {
	private int x, y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Object클래스의 toString()메소드를 오버라이딩
	@Override
	public boolean equals(Object obj) {
		Point3 p = (Point3) obj;
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}