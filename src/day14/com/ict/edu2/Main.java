package day14.com.ict.edu2;

public class Main {
	public static void main(String[] args) {
		MP3_Phone mp3 = new MP3_Phone();
		mp3.call();
		mp3.sms();
		mp3.sound();
		System.out.println();
		
		DCa_Phone dca = new DCa_Phone();
		dca.call();
		dca.sms();
		dca.picture();
	}
}
