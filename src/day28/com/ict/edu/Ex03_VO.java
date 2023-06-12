package day28.com.ict.edu;

import java.io.Serializable;

// VO(Value Object) : 순수 데이터만 가지고 있고, get/set로 구성 
//                   객체의 정보를 담을 수 있는 멤버 변수로 구성되어야 한다.

// 객체 직렬화 하기 
// 1. Serializable 인터페이스를 구현하는 방법 (추상메서드가 없다.)
//    멤버변수 모두가 객체 직렬화 대상이 된다.
//    직렬화 대상에서 제외하고 싶은 멤버는 멤버 앞에 transient 예약어 사용 
public class Ex03_VO implements Serializable{
	
	private String name ;
	transient private int age ;
	transient private String addr;
	transient private boolean gender;
	private double height;
	
	// 생성자
	public Ex03_VO() {}
	public Ex03_VO(String name, int age, String addr, boolean gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
