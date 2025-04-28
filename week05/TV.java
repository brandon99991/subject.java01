class TV {
	private int size;
	public String color = "default color";
	public String company = "default compnay";	

	// 생성자
	public TV(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
	
	protected String getColor() {
		return color;
	}
	
	protected String getCompany() {
		return company;
	}

}