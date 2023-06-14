package network.com.ict.edu3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 스레드 처리
public class EchoServer implements Runnable{
	ServerSocket ss = null;
	Socket s = null;
	
	InputStream in = null;
	BufferedInputStream bis = null;
	
	OutputStream out = null;
	BufferedOutputStream bos = null;
	
	public EchoServer() {
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 대기중 ...");
			new Thread(this).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				
				in = s.getInputStream();
				bis = new BufferedInputStream(in);
				byte[] b = new byte[1024];
				bis.read(b);
				
				String msg = new String(b).trim();
				
				out = s.getOutputStream();
				bos = new BufferedOutputStream(out);
				bos.write(msg.getBytes());
				bos.flush();
				
			} catch (Exception e) {
			} finally {
				try {
					s.close();
					bos.close();
					out.close();
					bis.close();
					in.close();
				} catch (Exception e2) {
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}


}
