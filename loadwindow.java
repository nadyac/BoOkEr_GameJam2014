/**
*Create Game Window
*
*/ 
import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener.*;

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

		gamepanel= new JPanel(new GridBagLayout());
		gamepanel.setBackground(Color.BLACK);

		button= new JButton("Start Game");
		button.setPreferredSize(new Dimension(150,60)); //sets size of button
		
		GridBagConstraints c= new GridBagConstraints(); //allows us to arrange components on panel
		c.gridx=0;
		c.gridy=1;

		label= new JLabel("We don't see things as they are, we see them as we are");
		label.setForeground(Color.WHITE);

		gamepanel.add(button,c);

		//c.insets= new Insets(10,10,10,10); will give spacing between components (px)
		c.gridx=0;
		c.gridy=3;
		gamepanel.add(label,c);
		gameframe.add(gamepanel);


	}
}