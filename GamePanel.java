/*
panel used to draw the game screen
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel
{
	private Characters jodine;

	public GamePanel(GridBagLayout layout)
	{
		super(layout);
		jodine = new Characters("jodine1.png", 20, 20);
		this.setBackground(Color.BLUE);
	}
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(jodine.getImage(), jodine.getX(), jodine.getY(), null); // see javadoc for more info on the parameters            
    	//g.drawString("BLAH", 20, 20);
    }

}