package network.com.ict.edu6;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	ServerSocket ss = null;
	ArrayList<CopyClient> list = null;
	
	public ChatServer() {
	    list = new ArrayList<>();
	    try {
	    	ss = new ServerSocket(7778);
	    	System.out.println("서버 대기중 ...");
	    	
	    	exec();
		} catch (Exception e) {
		}
	}
	private void exec() {
		while(true) {
			try {
				Socket s = ss.accept();
				CopyClient cc = new CopyClient(s, this);
				cc.start();
				list.add(cc);
			} catch (Exception e) {
			}
		}
	}
	public void sendMsg(Protocol p) {
		try {
			for (CopyClient k : list) {
				k.out.writeObject(p);
			}
		} catch (Exception e) {
		}
	}
	public void removeClient(CopyClient cc) {
		list.remove(cc);
	}
	public static void main(String[] args) {
		new ChatServer();
	}
}
