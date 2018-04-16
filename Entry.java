package game;

public class Entry {


	public static void main(String[] args) {
	FrameGame game=new FrameGame();
	game.setVisible(true);
	//客户区Panel默认不会获得焦点，所以必须主动申请
	game.getContentPane().requestFocus();

	}

}
