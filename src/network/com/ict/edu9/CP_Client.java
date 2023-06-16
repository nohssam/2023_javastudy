package network.com.ict.edu9;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import network.com.ict.edu9_db.DAO;
import network.com.ict.edu9_db.VO;

public class CP_Client extends Thread{
	Socket s;
	DB_Server server;
	ObjectInputStream in;
	ObjectOutputStream out;
	public CP_Client(Socket s,	DB_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		esc: while(true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					
					Protocol p = (Protocol)obj;
					switch (p.getCmd()) {
					    case 0: 
					    	out.writeObject(p);
							out.flush();
					    	break esc;
						case 1: 
							List<VO> list = DAO.getList();
							p.setList(list);
							out.writeObject(p);
							out.flush();
						break;
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		try {
			out.close();
			in.close();
			s.close();
		} catch (Exception e) {
		}
	}
}
