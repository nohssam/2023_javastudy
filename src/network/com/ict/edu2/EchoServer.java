package network.com.ict.edu2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		InputStream in = null;
		OutputStream out = null;
		Socket s = null;
		try {
			// 생성
			ss = new ServerSocket(7777);
			System.out.println("서버 대기중 ... ");
			
			// 무한 반복
			while (true) {
				// 클라이언트에게 요청이 올때까지 대기하다가 
				// 요청이 오면 클라이언트와 통신할 소켓을 만든다.
				s = ss.accept();
				
				// 입출력 스트림
				in = s.getInputStream();
				out = s.getOutputStream();
				
				// 데이터 수신
				byte[] buff = new byte[100];
				in.read(buff);
				
				String read_data = new String(buff).trim();
				String client_ip = s.getInetAddress().getHostAddress();
				System.out.println("서버에 수신된 데이터 : " + read_data+"("+client_ip+")");
				
				// 데이터 송신
				out.write(read_data.getBytes());
				out.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				s.close();
				out.close();
				in.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
