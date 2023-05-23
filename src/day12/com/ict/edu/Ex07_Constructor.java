package day12.com.ict.edu;

public class Ex07_Constructor {
	private String name = "홍길동";
	private int kor = 90 ;
	private int eng = 80 ;
	private int math = 80 ;
	private int sum = 0 ;
	private double avg = 0.0;
	private String hak = "";
	
	// 생성자 
	public Ex07_Constructor() {
		
	}
	
	public Ex07_Constructor(String name) {
	 // 생성자가 다른 생성자 호출 할 수 있다.
	 // 생성자이름 대신 this()	
		this(70,80,70);
		this.name = name ;
	}
	
	public Ex07_Constructor(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 총점 구하기 
	public void gSum(int kor, int eng, int math) {
		sum = kor + eng + math ;
	}
	public void gSum() {
		sum = kor + eng + math ;
	}
	
	
	
	// 평균 구하기
	public void gAvg() {
		avg = (int)(sum/3.0*10)/10.0;
	}
	// 학점 구하기 
	public void gHak() {
		if(avg>=90) {
			hak = "A";
		}else if(avg>=80) {
			hak = "B";
		}else if(avg>=70) {
			hak ="C";
		}else {
			hak = "F";
		}
	}
	
	// 출력하는 메서드
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	
	
	
	
}
