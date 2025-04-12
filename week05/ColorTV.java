public class ColorTV extends TV {
	private int colors;
	public ColorTV(int size, int colors) {
		super(size);
		this.colors = colors;
	}
	
	public void printProperty() {
		System.out.println(getSize() + "인치 " + colors + "컬러");
		System.out.println("aaa변수 값 : " + aaa);
		System.out.println("bbb변수 값 : " + bbb);
	}	
}
