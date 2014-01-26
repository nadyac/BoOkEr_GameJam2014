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

	private BufferedImage jodineimg, gesperimg, willyskyimg, bookerimg;
	
	public void displayjodine(){
		
		BufferedImage jodineimg= null;
		try{
			jodineimg = ImageIO.read(new File("jodine1.png"));
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "image could not be loaded");
		}
		
	}
}