package game;


import java.awt.Graphics;

import javax.swing.JFrame;

public class FrameGame extends JFrame{
	public FrameGame(){
		initializeComponents();
}
public void paint(Graphics g){
	super.paint(g);
	}
	private void initializeComponents() {
		//���ͻ�����Ϊ�Լ������Panel
		this.setContentPane(new GameGanvas());
		this.setTitle("snake");
		this.setSize(400,300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

}
