/**
*Create Game Window
*
*/ 
import javax.swing.*;
import java.awt.*;

public class loadwindow{

	private JFrame gameframe;
	private JPanel gamepanel;
	private JButton button;
	private JLabel label;

	public loadwindow(){

		gui();
	}

	public void gui(){
		//instantiate a JFrame object
		gameframe= new JFrame("mainframe");
		gameframe.setVisible(true); 
		gameframe.setSize(900,600); 
		gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows close on "x"

		gamepanel= new JPanel();
		gamepanel.setBackground(Color.BLACK);

		button= new JButton("Start Game");
		button.setPreferredSize(new Dimension(150,60)); //sets size of button
		label= new JLabel("Click to play");
		label.setForeground(Color.WHITE);

		gamepanel.add(button);
		gamepanel.add(label);
		gameframe.add(gamepanel);
	}

	public static void main(String[] args){

		new loadwindow();
	}
}