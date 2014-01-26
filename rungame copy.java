/**
* Run Game
* The purpose of this class is to run the game once the user has clicked "Start Game"
*
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RunGame{

	private JPanel panel2;
	private JButton dialogbtn;

	public RunGame(){

		//Draw method to make panel


		/*frame2 = new JFrame("mainframe2");
		frame2.setVisible(true);
		frame2.setSize(900,600);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

		panel2 = new JPanel(new GridBagLayout());
		panel2.setBackground(Color.WHITE);

		JOptionPane.showMessageDialog(null, "Fucking fucks motherfuckers fucktards"); //testing 

		new Characters();		
	}

	public JPanel getPanel()
	{
		//do all the updating for a new panel first
		return panel2;
	}
	
}