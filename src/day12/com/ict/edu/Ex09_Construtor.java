package day12.com.ict.edu;

public class Ex09_Construtor {
	private String name = "";
	private int kor = 0 ;
	private int eng = 0 ;
	private int math = 0 ;
	private int sum = 0 ;
	private double avg = 0.0;
	private String hak = "";
	private int rank = 0 ;
	
	// 임시때문에 기본생성자
	public Ex09_Construtor() {}
	
	public Ex09_Construtor(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.rank = 1 ;
		
		process();
	}
	
	// 총점, 평균, 학점을 한번에 처리하는 메서드 
	public void process() {
		sum = kor + eng + math ;
		avg = (int)(sum / 3.0 * 10) / 10.0 ;
		if(avg >=90) {
			hak = "A학점";
		}else if(avg>=80) {
			hak = "B학점";
		}else if(avg>=70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
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
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
