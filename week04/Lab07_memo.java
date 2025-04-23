public class Lab07_memo {
	private String name; // 작성자 이름
	private String time; // 메모를 작성한 시간
	private String content; // 메모 내용

	public boolean isSameName(Lab07_memo b) { // 메모 내용 출력
		if(name.equals(b.getName())) return true;
		else return false;
	}

	public String getName() { // 메모 작성자 이름 리턴
		return name;
	}
	
	public int length() { // 메모 텍스트의 길이
		return content.length();
	}

	public void show() { // 메모 내용 출력
		System.out.println(name + ", " + time + " " + content);
	}
	
	public Lab07_memo(String name, String time, String content) { // 생성자. 멤버 필드 초기화
		this.name = name;
		this.time = time;
		this.content = content;
	}

	public static void main(String[] args) {
		Lab07_memo a = new Lab07_memo("손흥민", "09:00", "공부하기");
		Lab07_memo b = new Lab07_memo("황희찬", "13:00", "운동하기");
		Lab07_memo c = new Lab07_memo("박지성", "15:00", "낮잠자기");

		a.show();
		if(a.isSameName(b)) System.out.println("동일한 사람입니다.");
		else System.out.println("다른 사람입니다.");
		System.out.println(c.getName() + "가 작성한 메모의 길이는 " + c.length());
	}

}