package Advanced;
import java.awt.*;//javax.swing.*->JFrame,JButton  
//java.awt.*->Frame,Button
public class ButtonExample2 {

	Frame f;//JFrame f in swing
	Button b1,b2,b3;
	
	ButtonExample2()
	{
		f=new Frame("sheik");
		b1=new Button();
		b1.setBounds(130,100,100,30);
		b2=new Button("click me");
		b2.setBounds(300,100,100,30);
		b3=new Button();
		b3.setLabel("click here");
		b3.setBounds(450,100,100,30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setSize(450,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		ButtonExample2 bu=new ButtonExample2(); 

	}

}
