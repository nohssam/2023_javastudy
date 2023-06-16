package network.com.ict.edu8;

import java.awt.Color;
import java.io.Serializable;

public class VO implements Serializable{
	// 0:종료, 1:채팅, 2:그림그리기
	private int cmd;
	private String msg;
	private int x, y, wh;
	private Color color;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWh() {
		return wh;
	}
	public void setWh(int wh) {
		this.wh = wh;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
