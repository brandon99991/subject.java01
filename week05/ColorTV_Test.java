public class ColorTV_Test {	

	public static void main(String[] args) {
		// ColorTV객체 생성 (ColorTV생성자 호출됨.)
		ColorTV myTv = new ColorTV(65);
		
		// ColorTV 전역변수에 저장
		myTv.setColor("blue");
		myTv.setCompany("samsung");
		
		// myTv객체의 정보 출력하기
		myTv.printProperty();		
	}
}
