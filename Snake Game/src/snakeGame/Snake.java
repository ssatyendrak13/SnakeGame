package snakeGame;
import javax.swing.*;
public class Snake extends JFrame {
	
	Snake(){
		super("Snake Game");// super must be the first statement inside the constructor 
		add(new Board());
		pack();
		
		setLocationRelativeTo(null);
//		setTitle("Snake Game");
		setResizable(false);
		
	}
	public static void main(String args[]) {
		new Snake().setVisible(true); // we have to make frame so we will have to make setVisible true 
		// by default set visible is false and we have to extend JFrame class becouse this function is inside the jframe class
		//JFrame is inside the swing package so we have to import java javax.swing
	}

}
