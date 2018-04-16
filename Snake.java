package game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class Snake {
	private ArrayList<Node> nodes = new ArrayList<>();
	private int head;//头结点
	private Direction direction=Direction.right;//方向
	private int tail;//尾节点
	
	public Snake(){
		nodes.add(new Node(0, 120, 30, Color.black));
		nodes.add(new Node(32, 120, 30, Color.black));
		nodes.add(new Node(64, 120, 30, Color.black));
		head=2;
		tail=0;
	}
	public void turn(Direction d){
		int x=d.ordinal()%2;
		int y=direction.ordinal()%2;
		if(x!=y)
			direction=d;
	}
	public void move() {
		int[][]offers={{-21,0},{0,-21},{21,0},{0,21}};
		nodes.get(tail).setX(nodes.get(head).getX()+offers[direction.ordinal()][0]);
		nodes.get(tail).setY(nodes.get(head).getY()+offers[direction.ordinal()][1]);
		head=tail;
		tail=(tail+1)%nodes.size();
	}
	
	public void draw(Graphics  g){
		for(Node n : nodes){
			n.draw(g);
		}
	}
}
