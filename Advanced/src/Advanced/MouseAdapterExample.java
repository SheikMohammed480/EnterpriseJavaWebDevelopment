package Advanced;

import java.awt.*;    
import java.awt.event.*;    
  
public class MouseAdapterExample extends MouseAdapter {    

    Frame f;    
    MouseAdapterExample() {     
        f = new Frame ("Mouse Adapter");      
        f.addMouseListener(this);    
        f.setSize (300, 300);    
        f.setLayout (null);    
        f.setVisible (true);   
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				f.dispose();
				
			}
			
		});
    }    
    public void mouseClicked (MouseEvent e) {    
        Graphics g = f.getGraphics();    //note this line
        g.setColor (Color.red);    
        g.fillOval (e.getX(), e.getY(), 30, 60);    
        g.fillRect(e.getX(),e.getY(), 50, 50);
        
    }    
 
public static void main(String[] args) {    
    new MouseAdapterExample();    
}    

}