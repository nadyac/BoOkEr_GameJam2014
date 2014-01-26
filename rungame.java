/**
* Run Game
* The purpose of this class is to run the game once the user has clicked "Start Game"
*
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RunGame{

	private GamePanel panel2;
	private JButton dialogbtn;
	public Loadwindow window;

	public RunGame(){

	//Create JPanel
		panel2 = new GamePanel(new GridBagLayout());
		panel2.setBackground(Color.WHITE);

		//JOptionPane.showMessageDialog(null, "Fucking fucks motherfuckers fucktards"); //testing 

		
			
	}

	//returns the second (intro) panel of the game 
	public GamePanel getPanel2()
	{
		//do all the updating for a new panel first
		return panel2;
	}
	
}