/*
panel used to draw the game screen
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel
{
	private Characters jodine, booker;

	//creates new character objects to put on panel
	public GamePanel(GridBagLayout layout)
	{
		super(layout);
		booker = new Characters("booker1.png",80, 80);
		jodine = new Characters("jodine1.png", 20, 20);
		this.setBackground(Color.BLUE);
	}

	//draws character objects on new panel
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
		g.drawImage(booker.getImage(), booker.getX(), booker.getY(), null);             
        g.drawImage(jodine.getImage(), jodine.getX(), jodine.getY(), null);            
    	//g.drawString("BLAH", 20, 20);
    }

}