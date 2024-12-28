package Advanced;
import javax.swing.*;
import java.awt.*;
public class BorderLayExample  {
	JFrame f;
	JButton b1,b2,b3,b4,b5;
	 BorderLayExample()
	 {
		 f=new JFrame();
		 b1=new JButton("sheik");
		 b2=new JButton("sharmi");
		 b3=new JButton("fathi");
		 b4=new JButton("amma");
		 b5=new JButton("thatha");
		 f.add(b1,BorderLayout.EAST);//using awt(abstract window toolkit)
		 f.add(b2,BorderLayout.NORTH);
		 f.add(b3,BorderLayout.WEST);
		 f.add(b4,BorderLayout.SOUTH);
		 f.add(b5,BorderLayout.CENTER);
		 f.setSize(500,500);
		 f.setVisible(true);
		 
		 
		 
	 }
	public static void main(String[] args) {
		new BorderLayExample();//we don't need to create object
		//so we only need to invoke constructor

	}

}
