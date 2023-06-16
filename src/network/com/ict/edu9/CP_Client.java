package network.com.ict.edu9;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import network.com.ict.edu9_db.DAO;
import network.com.ict.edu9_db.VO;

public class CP_Client extends Thread {
	Socket s;
	DB_Server server;
	ObjectInputStream in;
	ObjectOutputStream out;

	public CP_Client(Socket s, DB_Server server) {
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
		while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {

					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0:
						out.writeObject(p);
						out.flush();
						break;
					case 1:
						List<VO> list = DAO.getList();
						p.setList(list);
						out.writeObject(p);
						out.flush();
						break;
					case 2 :
						VO vo = p.getVo();
						int result = DAO.getInsert(vo);
						if(result>0) {
							Protocol p2 = new Protocol();
							List<VO> list2 = DAO.getList();
							p2.setCmd(1);
							p2.setList(list2);
							out.writeObject(p2);
							out.flush();
						}
						break;
					}
				}
			} catch (Exception e) {
			}
		}

	}
}
