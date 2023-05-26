package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Ex04_Canvas extends Canvas{
	Image image;
	@Override
	public void paint(Graphics g) {
		setBackground(Color.LIGHT_GRAY);
		g.drawImage(image, getWidth()/2-50, getHeight()/2-50, 100,100,this);
	}
	
}
