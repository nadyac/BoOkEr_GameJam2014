/**
*Create Game Window
*
*/ 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loadwindow{

	public JFrame gameframe;
	public JPanel gamepanel;
	private JButton button;
	private JLabel label;
	public RunGame game;
	public Loadwindow(){

		gui();
	}

	public void gui(){
		//instantiate a JFrame object
		gameframe= new JFrame("mainframe");
		gameframe.setVisible(true); 
		gameframe.setSize(900,600); 
		gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows close on "x"

		gamepanel= new JPanel(new GridBagLayout());
		gamepanel.setBackground(Color.BLACK);

		button= new JButton("Start Game");
		button.setPreferredSize(new Dimension(150,60)); //sets size of button
		button.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				//JOptionPane.showMessageDialog(null, "Fucking fucks motherfuckers fucktards");
				game=new RunGame(); //creates new rungame object which runs the game
				//startGame();
			}
		});
		
		GridBagConstraints c= new GridBagConstraints(); //allows us to arrange components on panel
		c.gridx=0; //x-coord pos. of button
		c.gridy=1; //y-coord pos. of button

		label= new JLabel("\"We don't see things as they are, we see them as we are\"");
		label.setForeground(Color.WHITE);

		gamepanel.add(button,c);

		//c.insets= new Insets(10,10,10,10); will give spacing between components (px)
		c.gridx=0;
		c.gridy=3;
		gamepanel.add(label,c);
		gameframe.add(gamepanel);

	}
	/**public void startGame()
	{
		while(true) //real control loop
		{
			gamepanel=game.getPanel();
			
			gameframe.add(gamepanel);
		}
	}*/
}