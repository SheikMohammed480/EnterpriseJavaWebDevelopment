package Advanced;
import java.awt.*;
import javax.swing.*;  
import javax.swing.JFrame;  
public class ImageInsertion extends Canvas{
	public void paint(Graphics g)
	{
	 Toolkit t = Toolkit.getDefaultToolkit();//ctrl+2 release and click l
	 Image i = t.getImage("C:\\Users\\sheik\\Pictures\\wallpaper\\1305185.jpg");
	 g.drawImage(i,0,0,this);
		
	}
	
	   public static void main(String[] args) {
		   JFrame f=new JFrame("ImageInsertion");
		   ImageInsertion m=new ImageInsertion();
		   f.add(m);
		   f.setSize(400,400);
		   //getLayout can't be used in picture,image(graphics) 
		   f.setVisible(true);
		   
	   }
	}  