package game;

import java.awt.Color;
import java.awt.Graphics;

public class Node{
	private int x;
	private int y;
	private int diameter;
	private Color skin;
	public Node(int x, int y, int diameter, Color skin) {
		super();
		this.setX(x);
		this.setY(y);
		this.diameter = diameter;
		this.skin = skin;
	}
	public void draw(Graphics g) {
	g.setColor(skin);
	g.fillOval(x, y, diameter, diameter);
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

	public int getDimaeter() {
		return diameter;
	}
	public void setDimaeter(int dimaeter){
		this.diameter=dimaeter;
	}
}
