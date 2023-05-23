package day12.com.ict.edu;

public class Ex08_Contructor {
	private String name = "물";
	private int price = 500 ;
	
	public Ex08_Contructor(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
