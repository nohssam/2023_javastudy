package day16.com.ict.edu;

enum Type2{
	WALK("워킹화",270,"남성"),
	RUN("러닝화", 275,"남성"),
	TRACK("트래킹화",250,"여성"),
	HIK("하이킹화",260,"남성");
	
	final private String name ;
	final private int size ;
	final private String gender;
	
	// get만 생성
	public String getName() { 	return name;	}
	public int getSize() {		return size;	}
	public String getGender() {		return gender;	}
	
	// 생성자 역할을 하는 넘
	private Type2(String name, int size, String gender) {
		this.name = name;
		this.size = size;
		this.gender = gender;
	}
}
public class Ex03_enum {
	public static void main(String[] args) {
		Type2[] items = Type2.values();
		
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i].getName()+":"+items[i].getSize()+":"+ items[i].getGender());
		}
	}
}
