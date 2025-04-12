public class ColorTV extends TV {
	private int colors;
	private String company;
	
	public ColorTV(int size, int colors, String company) {
		super(size);
		this.colors = colors;
		this.company = company;
	}
	
	protected int getColor() { return colors; }

	//@Override
	protected String getCompany() { return company; }

	
	public void printProperty() {
		System.out.println("사이즈 : " + getSize());
		System.out.println("색상 : " + getColor());
		System.out.println("제조사 : " + getCompany());
	}	
}
