package network.com.ict.edu2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) {
		Socket s = null;
		OutputStream out = null;
		InputStream in = null;
		try {
			s = new Socket("192.168.0.41",7777);
			System.out.println("클라이언트 연결 성공");
			
			// 입출력 스트림
			out = s.getOutputStream();
			in = s.getInputStream();
			
			// 메세지 전송
			String msg = "안녕하세요!! Hello!";
			out.write(msg.getBytes());
			out.flush();
			
			// 서버에서 전송된 데이터 수신
			byte[] buff = new byte[100];
			in.read(buff);
			String receive_msg = new String(buff).trim();
			
			System.out.println("에코메세지 : " + receive_msg);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				s.close();
				in.close();
				out.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
