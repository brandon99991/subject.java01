/*
 * 예제 6-4 : Rect2클래스와 equals()만들기 연습
 * Rect2
 * EqualsEx2
 */
class Rect2 {
	private int width;
	private int height;

	public Rect2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// Object클래스의 toString()메소드를 오버라이딩
	@Override	
	public boolean equals(Object obj) {
		Rect2 p = (Rect2) obj;
		if (width * height == p.width * p.height)
			return true;
		else
			return false;
	}
}