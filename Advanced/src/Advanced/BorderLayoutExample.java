package Advanced;
import java.awt.*;    
import javax.swing.*;
public class BorderLayoutExample {
	        
	JFrame f;    
	BorderLayoutExample()  
	{    
	    f = new JFrame();    
	        
	     // creating buttons  
	    JButton b1 = new JButton("vallimayil");; // the button will be labeled as NORTH   
	    JButton b2 = new JButton("vinoth");; // the button will be labeled as SOUTH  
	    JButton b3 = new JButton("vani");; // the button will be labeled as EAST  
	    JButton b4 = new JButton("prema");; // the button will be labeled as WEST  
	    JButton b5 = new JButton("imtha");; // the button will be labeled as CENTER  
	        
	    f.add(b1, BorderLayout.EAST); // b1 will be placed in the North Direction    
	    f.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
	    f.add(b3, BorderLayout.NORTH);  // b2 will be placed in the East Direction    
	    f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
	     f.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center    
	        
	    f.setSize(300, 300);    
	    f.setVisible(true);    
	}    
	public static void main(String[] args) {    
	    new BorderLayoutExample();    
	 
	}    
}
