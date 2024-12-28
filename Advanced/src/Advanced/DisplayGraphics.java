package Advanced;
import java.awt.*; 
import javax.swing.*; 
 public class DisplayGraphics extends Canvas{  
	      
	    public void paint(Graphics g) {  
	    	// To write a text in window
	        g.drawString("DeadPool",70,70);  
	        setBackground(Color.red);  
	        g.drawRect(130, 30,100, 80);  
	        g.drawOval(30,130,50, 60);  
	        setForeground(Color.green);  
	        g.fillOval(130,130,50, 60);  
	        g.drawArc(30, 200, 40,50,90,60);  
	        g.fillArc(30, 130, 40,50,180,40); 
	          
	    }  
	        public static void main(String[] args) {  
	        DisplayGraphics m=new DisplayGraphics();  
	        JFrame f=new JFrame();  
	        f.add(m);  
	        f.setSize(400,400);  
	        //f.setLayout(null);  
	        f.setVisible(true);  
	    }  
}
//public class DisplayGraphics extends JPanel{
//	public void paintComponent(Graphics g)
//	{
//		 
//        g.drawString("DeadPool",70,70);  
//        setBackground(Color.RED);  //canvas difference
//        g.drawRect(130, 30,100, 80);  
//        g.drawOval(30,130,50, 60);  
//        setForeground(Color.YELLOW);  
//        g.fillOval(130,130,50, 60);  
//        g.drawArc(30, 200, 40,50,90,60);  
//        g.fillArc(30, 130, 40,50,180,40); 
//		
//		
//	}
//    public static void main(String[] args) {
//    	 DisplayGraphics m=new DisplayGraphics();  
//	        JFrame f=new JFrame();  
//	        f.add(m);  
//	        f.setSize(400,400);  
//	        //f.setLayout(null);  
//	        f.setVisible(true);  
//    }
//}