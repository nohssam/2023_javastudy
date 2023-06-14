package network.com.ict.edu4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer implements Runnable{
	ServerSocket ss = null;
	Socket s = null;
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	
	public EchoServer() {
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 대기중 ...");
			
			new Thread(this).start();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@Override
	public void run() {
		while(true) {
			try {
				s = ss.accept();
				isr = new InputStreamReader(s.getInputStream());
				br = new BufferedReader(isr);
				
				String msg = br.readLine();
			
				
				osw = new OutputStreamWriter(s.getOutputStream());
				bw = new BufferedWriter(osw);
				
				// BufferedWriter 사용시 System.lineSeparator() 사용해야 된다.
				// Java에는 운영체제 별 개행문자에 대응하기 위해 필요한 메서드를 제공하고 있다. 
				// 그것은 바로 System.lineSeparator()이다.
				msg = msg + System.lineSeparator();
				bw.write(msg);
				bw.flush();
				
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				try {
					if(s != null) s.close();
					bw.close();
					osw.close();
					br.close();
					isr.close();
				} catch (Exception e2) {
					System.out.println(e2);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		new EchoServer();
	}
}
