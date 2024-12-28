package Advanced;
import java.awt.*;


import javax.swing.*;

public class SmileyExample extends JPanel {
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillOval(10,10,200, 200);
		g.setColor(Color.BLACK);
        g.fillOval(55, 65, 20, 20);
        g.fillOval(135, 65, 20, 20);

        // draw Mouth
        g.fillOval(50, 110, 120, 60);

        // adding smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
	
	

	public static void main(String[] args) {
	 SmileyExample smile=new SmileyExample();
	 JFrame f=new JFrame();
	 f.add(smile);
	 f.setSize(300,400);
	 f.setVisible(true);
	 
	}

}
