/**
* Class make characters - this class creates the characters
*	
*/
import javax.imageio.*;
import java.awt.image.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Characters extends Component{

	private BufferedImage characterimg;
	private int x, y;
	public Characters(String filepath, int x, int y)
	{
		this.x=x;
		this.y=y;
		characterimg= null;
		try{
			characterimg = ImageIO.read(new File(filepath));
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "image could not be loaded");
		}	
	}
	
	public BufferedImage getImage()
	{
		return characterimg;
	}
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
}