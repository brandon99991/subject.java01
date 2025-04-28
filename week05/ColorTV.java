public class ColorTV extends TV {
	private String colors;
	private String company;

	// ColorTV생성자
	public ColorTV(int size) {
		// 부모 클래스에 매개변수가 포함된 생성자가 있을 경우에 
		// 반드시 super키워드를 이용해서 부모 생성자를 호출해야 함.
		super(size);  
	}

	// 전역변수에 저장
	protected void setColor(String color) {
		this.colors = color;
	}

	// 전역변수에 저장
	protected void setCompany(String company) {
		this.company = company;
	}
	
	// 오버라이딩 - ( 메소드명 동일해야 함, 매개변수 같아야함, 반환타입도 같아야 함. 메소드안의 내용을 추가하는 건 상관 없음 )  
	@Override  // @Override 어노테이션을 사용하면, 컴파일러가 메소드의 유효성을 체크해 준다.
	protected String getColor() {
		//System.out.println("getColor 메소드 호출");
		return colors;
	}

	// 오버라이딩 - ( 메소드명 동일해야 함, 매개변수 같아야함, 반환타입도 같아야 함. 메소드안의 내용을 추가하는 건 상관 없음 )  
	@Override  // @Override 어노테이션을 사용하면, 컴파일러가 메소드의 유효성을 체크해 준다.
	protected String getCompany() {
		return company;
	}	
	
	// 오버로딩 - (메소드명은 동일해야 함, 매개변수는 타입이 다르거나, 개수가 다르면 된다. 반환타입은 상관 없음. )
	protected String getCompany(String company) {
		return company;
	}

	// 오버로딩 - (메소드명은 동일해야 함, 매개변수는 타입이 다르거나, 개수가 다르면 된다. 반환타입은 상관 없음. )
	protected int getCompany(int company) {
		return company;
	}

	// 오버로딩 - (메소드명은 동일해야 함, 매개변수는 타입이 다르거나, 개수가 다르면 된다. 반환타입은 상관 없음. )
	protected String getCompany(String company, int country) {
		return company+country;
	}

	// 아래의 경우에는 오버로딩이 않된다. 오버로딩의 경우에는 매개변수만 체크하고, 
	// 반환타입 만으로는 구별하지 못한다.
	/*
	protected int getCompany() {
		return 111;
	}
	*/	
	
	public void printProperty() {
		System.out.println("사이즈 : " + getSize());
		System.out.println("색상 : " + getColor());
		System.out.println("제조사(부모클래스) : " + super.getCompany());		
		System.out.println("제조사(자식클래스) : " + getCompany());
	}
}
