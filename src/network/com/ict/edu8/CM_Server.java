package network.com.ict.edu8;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class CM_Server implements Runnable{
	ServerSocket ss;
	ArrayList<CP_Client> list;
	
	public CM_Server() {
		try {
			list = new ArrayList<>();
			ss = new ServerSocket(7780);
			System.out.println("서버 대기중 ...");
			new Thread(this).start();
		} catch (Exception e) {
		}
	}
	@Override
	public void run() {
		while(true) {
			try {
				Socket s = ss.accept();
				CP_Client cc = new CP_Client(s, this);
				cc.start();
				list.add(cc);
			} catch (Exception e) {
			}
		}
	}
	
	// 메세지 전달
	public void sendMsg(VO vo) {
		try {
			for (CP_Client k : list) {
				k.out.writeObject(vo);
				k.out.flush();
			}
		} catch (Exception e) {
		}
	}
	
	// 그림 그리기 
	public void picture(VO vo) {
		try {
			for (CP_Client k : list) {
				k.out.writeObject(vo);
				k.out.flush();
			}
		} catch (Exception e) {
		}
	}
	
	// 삭제
	public void removeClient(CP_Client cc) {
		list.remove(cc);
	}
	
	public static void main(String[] args) {
		new CM_Server();
	}
}
