package network.com.ict.edu7;

import java.util.ArrayList;

public class ChatRoom {
	// 방 참여자들이 저장되어 있는 곳 - 방 나가기 또는 접속 해제 시 여기서 삭제되어야 한다.
	//                         마지막 사람이 나가면 방는 삭제 하자.
	ArrayList<CopyClient> j_list;
	String title ;  // 방 제목
	
	public ChatRoom(String title) {
		j_list = new ArrayList<>();
		this.title = title;
	}
	
	// 방 제목을 반환하는 기능(ChatServer 에서 호출)
	public String getTitle() {
		return title;
	}
	
	// 현재 방에 참여자들의 수를 반환 - 방 나갈때 마지막 사람일 경우 방을 삭제 
	public int getJoinCount() {
		return j_list.size();
	}
	// 방 참여
	public void join(CopyClient cc) {
		j_list.add(cc);
		
		// 방 참여자에게 메세지 전달 (대기실에 있는 사람에게는 전달 안됨)
		Protocol p = new Protocol();
		p.setCmd(4);
		p.setMsg(" ** " + cc.nickName + "님 입장 ** ");
		p.setNames(getJoinUsers());
		
		sendProtocol(p);
	}
	// 방 참여 명단 반환 (방 나가기 하면 명단 갱신 필요)
	 public String[] getJoinUsers() {
		 String[] arr = new String[j_list.size()];
		 int i = 0 ;
		 for (CopyClient k : j_list) {
			arr[i++] = k.nickName;
		}
		 return arr;
	 }
	
	// 방 안에 있는 사람들과 채팅 기능
	public void sendProtocol(Protocol p) {
		for (CopyClient k : j_list) {
			try {
				k.out.writeObject(p);
				k.out.flush();
			} catch (Exception e) {
			}
		}
	}
	// 방 나가기
	public void getOut(CopyClient cc) {
		j_list.remove(cc);
		
		Protocol p = new Protocol();
		p.setCmd(1);
		p.setMsg(" ** " + cc.nickName + "님 퇴장 ** ");
		p.setNames(getJoinUsers());
		
		sendProtocol(p);
	}
}













