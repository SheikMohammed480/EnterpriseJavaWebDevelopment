package Advanced;
import javax.swing.*;
public class Swing12 {

	public static void main(String[] args) {
		JFrame f=new JFrame("sheik");
		JButton b=new JButton("click me");
		b.setBounds(130,100,100,40);
		JButton b1=new JButton("click here");
		b1.setBounds(300,100,100,40);
		f.add(b);
		f.add(b1);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}

}
