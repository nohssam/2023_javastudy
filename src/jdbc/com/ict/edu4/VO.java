package jdbc.com.ict.edu4;

 // VO(Values Object) : DB 정보를 받거나 전달하기 위해서 사용
 //                     컬럼명과 무조건 일치 시키자 
public class VO {
	private String 고객아이디, 고객이름, 나이, 등급, 직업, 적립금 ;

	public String get고객아이디() {
		return 고객아이디;
	}

	public void set고객아이디(String 고객아이디) {
		this.고객아이디 = 고객아이디;
	}

	public String get고객이름() {
		return 고객이름;
	}

	public void set고객이름(String 고객이름) {
		this.고객이름 = 고객이름;
	}

	public String get나이() {
		return 나이;
	}

	public void set나이(String 나이) {
		this.나이 = 나이;
	}

	public String get등급() {
		return 등급;
	}

	public void set등급(String 등급) {
		this.등급 = 등급;
	}

	public String get직업() {
		return 직업;
	}

	public void set직업(String 직업) {
		this.직업 = 직업;
	}

	public String get적립금() {
		return 적립금;
	}

	public void set적립금(String 적립금) {
		this.적립금 = 적립금;
	}
	
	
	
}
