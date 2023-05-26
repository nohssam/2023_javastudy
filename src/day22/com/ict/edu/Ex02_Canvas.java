package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

// Canvas를 내부 클래스로 만들기
public class Ex02_Canvas extends JFrame{
	public Ex02_Canvas() {
		super("canvars");
		
		add(new CanvasTest());
		
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	// 내부클래스 : Canvas도 컨테이너
	private class CanvasTest extends Canvas{
		@Override
		public void paint(Graphics g) {
		  // cavas => 도화지,  g => 붓
			setBackground(Color.GRAY);
			
			// 붓의 색깔 지정
			g.setColor(Color.YELLOW);
			
			// 선그리기 : drawLine(시작위치, 끝위치)
			g.drawLine(10, 10, 110, 10);
			g.drawLine(10, 10, 10, 110);
			g.drawLine(110, 10, 110, 110);
			g.drawLine(10, 110, 110, 110);

			g.setColor(Color.MAGENTA);
			g.drawLine(10, 10, 110, 110);
			g.drawLine(10, 110, 110, 10);
			
			// 사각형 : drawRect(시작위치, 넓이, 높이 )
			g.drawRect(120, 10, 100, 100);
			g.drawRect(130, 20, 80, 80);
			g.drawRect(140, 30, 60, 60);
			g.drawRect(150, 40, 40, 40);
			g.drawRect(160, 50, 20, 20);
			
			// 채워진 사각형 : fillRect(시작위치, 넓이, 높이)
			g.setColor(Color.YELLOW);
			g.fillRect(230, 10, 100, 100);
			g.setColor(Color.RED);
			g.fillRect(240, 20, 80, 80);
			g.setColor(Color.BLUE);
			g.fillRect(250, 30, 60, 60);
			
			// 둥근모서리 사각형 :  drawRoundRect(시작위치, 높이,넓이,호넓이, 호높이)
			// 둥근모서리 채워진 사각형 : fillRoundRect(시작위치, 높이,넓이,호넓이, 호높이)  
			g.drawRoundRect(340, 10, 100, 100, 0, 0);
			g.setColor(Color.RED);
			g.fillRoundRect(350, 20, 80, 80, 30, 30);
			g.setColor(Color.YELLOW);
			g.drawRoundRect(360, 30, 60, 60, 30, 30);
			g.setColor(Color.GREEN);
			g.fillRoundRect(370, 40, 40, 40, 100, 100);
			
			// 원       : drawOval(시작위치, 넓이 , 높이)
			// 채워진 원 : fillOval (시작위치, 넓이 , 높이)
			// 색 지정 : Coler(0~255(R), 0~255(G), 0~255(B)), 
			g.setColor(new Color(0,0,0));
			g.drawOval(10, 120, 100, 100);
			g.setColor(new Color(255,255,255));
			g.fillOval(20, 130, 80, 80);
			
			// 글자 : drawString("글자", 시작위치(글자 및 부분))
			g.drawString("대한민국",120, 170);
			
			g.setColor(new Color(0,0,0));
			g.drawLine(0, 170, 600, 170);
			g.drawLine(120, 0, 120, 600);
			
			g.setColor(new Color(255,255,0));

			// new Font("글꼴", style, size);
			// style : bold, italic, plain
			g.setFont(new Font("궁서", Font.PLAIN, 100));
			g.drawString("KOREA",230, 190);
			
			// 이미지
			Image image = Toolkit.getDefaultToolkit().getImage("src/images/java1.png");
			g.drawImage(image, 10, 230, this );  // 원래 크기 
			g.drawImage(image, 120, 230, 100,100, this ); // 크기 조절
			try {
				BufferedImage image2 = ImageIO.read(new File("src/images/java2.png"));
				g.drawImage(image2, 240, 230, 100,100, this ); // 크기 조절
				g.drawImage(image2, 350, 230, 100,100,new Color(255,255,0, 170) ,this ); // 배경색
			} catch (Exception e) {
			}
			Image image3 = new ImageIcon("src/images/java3.png").getImage();
			g.drawImage(image3, 460, 230, 100,100,new Color(0,100,0, 255) ,this ); // 크기 조절
		}
	}
	public static void main(String[] args) {
		new Ex02_Canvas();
	}
}










