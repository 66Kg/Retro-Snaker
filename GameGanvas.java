package game;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class GameGanvas extends JPanel{
	    private  Snake snake=new Snake();
			public GameGanvas(){
				Timer timer=new Timer();
				timer.schedule(new TimerTask(){
					public void run(){
						snake.move();
						repaint();
					}
				},1000,300);
				
		this.addKeyListener(new KeyAdapter(){
		public void keyPressed(KeyEvent e){
	if(e.getKeyCode()>40||e.getKeyCode()<37)
		return;
	String[]dirs={"left","up","right","down"};
	snake.turn(Enum.valueOf(Direction.class,dirs[e.getKeyCode()-37]));
	}
			
		});
		}
			@Override
			public void paint(Graphics g){
				super.paint(g);
				snake.draw(g);
			}
	}
	