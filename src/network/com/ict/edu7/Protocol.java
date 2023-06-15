package network.com.ict.edu7;

import java.io.Serializable;

public class Protocol implements Serializable{
	// 0:종료, 1:메세지, 2 접속 및 갱신, 3, 방만들기, 4, 방참여, 5, 방나가기, 6. 쪽지보내기 
	int cmd;
	String msg;
	
	String[] names;  // 접속자 명단
	String[] rooms;  // 방 목록 
	
	int u_count, r_index, c_index ;

	public int getCmd() {
		return cmd;
	}

	public void setCmd(int cmd) {
		this.cmd = cmd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public String[] getRooms() {
		return rooms;
	}

	public void setRooms(String[] rooms) {
		this.rooms = rooms;
	}

	public int getU_count() {
		return u_count;
	}

	public void setU_count(int u_count) {
		this.u_count = u_count;
	}

	public int getR_index() {
		return r_index;
	}

	public void setR_index(int r_index) {
		this.r_index = r_index;
	}

	public int getC_index() {
		return c_index;
	}

	public void setC_index(int c_index) {
		this.c_index = c_index;
	}
}
